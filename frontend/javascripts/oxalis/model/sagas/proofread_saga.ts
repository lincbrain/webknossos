import type { Saga } from "oxalis/model/sagas/effect-generators";
import { takeEvery, put, call, all, spawn } from "typed-redux-saga";
import { select, take } from "oxalis/model/sagas/effect-generators";
import { AnnotationToolEnum, MappingStatusEnum, TreeTypeEnum, Vector3 } from "oxalis/constants";
import Toast from "libs/toast";
import {
  type CreateNodeAction,
  type DeleteNodeAction,
  deleteEdgeAction,
  setTreeNameAction,
  type SetNodePositionAction,
} from "oxalis/model/actions/skeletontracing_actions";
import {
  initializeEditableMappingAction,
  removeSegmentAction,
  setMappingIsEditableAction,
} from "oxalis/model/actions/volumetracing_actions";
import type { ProofreadAtPositionAction } from "oxalis/model/actions/proofread_actions";
import {
  enforceSkeletonTracing,
  findTreeByNodeId,
  getNodeAndTree,
  getTreeNameForAgglomerateSkeleton,
  isSkeletonLayerTransformed,
} from "oxalis/model/accessors/skeletontracing_accessor";
import {
  pushSaveQueueTransaction,
  setVersionNumberAction,
} from "oxalis/model/actions/save_actions";
import {
  splitAgglomerate,
  mergeAgglomerate,
  UpdateAction,
} from "oxalis/model/sagas/update_actions";
import { Model, api, Store } from "oxalis/singletons";
import {
  getActiveSegmentationTracingLayer,
  getActiveSegmentationTracing,
  getSegmentsForLayer,
  getMeshInfoForSegment,
  getEditableMappingForVolumeTracingId,
} from "oxalis/model/accessors/volumetracing_accessor";
import {
  getLayerByName,
  getMappingInfo,
  getResolutionInfo,
} from "oxalis/model/accessors/dataset_accessor";
import {
  NeighborInfo,
  getAgglomerateIdForSegmentId,
  getEdgesForAgglomerateMinCut,
  getNeighborsForAgglomerateNode,
  getPositionForSegmentInAgglomerate,
  makeMappingEditable,
} from "admin/admin_rest_api";
import { setMappingNameAction } from "oxalis/model/actions/settings_actions";
import { getSegmentIdForPositionAsync } from "oxalis/controller/combinations/volume_handlers";
import {
  loadAdHocMeshAction,
  loadPrecomputedMeshAction,
} from "oxalis/model/actions/segmentation_actions";
import { V3 } from "libs/mjs";
import {
  dispatchMaybeFetchMeshFilesAsync,
  refreshMeshAction,
  removeMeshAction,
} from "oxalis/model/actions/annotation_actions";
import { getConstructorForElementClass } from "oxalis/model/bucket_data_handling/bucket";
import { Tree, VolumeTracing } from "oxalis/store";
import _ from "lodash";
import { type AdditionalCoordinate } from "types/api_flow_types";
import { takeEveryUnlessBusy } from "./saga_helpers";
import { Action } from "../actions/actions";

export default function* proofreadRootSaga(): Saga<void> {
  yield* take("INITIALIZE_SKELETONTRACING");
  yield* take("WK_READY");
  yield* takeEveryUnlessBusy(
    ["DELETE_EDGE", "MERGE_TREES", "MIN_CUT_AGGLOMERATE"],
    handleSkeletonProofreadingAction,
    "Proofreading in progress",
  );
  yield* takeEvery(["PROOFREAD_AT_POSITION"], proofreadAtPosition);
  yield* takeEvery(["CLEAR_PROOFREADING_BY_PRODUCTS"], clearProofreadingByproducts);
  yield* takeEveryUnlessBusy(
    ["PROOFREAD_MERGE", "MIN_CUT_AGGLOMERATE_WITH_POSITION"],
    handleProofreadMergeOrMinCut,
    "Proofreading in progress",
  );
  yield* takeEveryUnlessBusy(
    ["CUT_AGGLOMERATE_FROM_NEIGHBORS"],
    handleProofreadCutNeighbors,
    "Proofreading in progress",
  );

  yield* takeEvery(
    ["CREATE_NODE", "DELETE_NODE", "SET_NODE_POSITION"],
    checkForAgglomerateSkeletonModification,
  );
}

function proofreadCoarseResolutionIndex(): number {
  // @ts-ignore
  return window.__proofreadCoarseResolutionIndex != null
    ? // @ts-ignore
      window.__proofreadCoarseResolutionIndex
    : 3;
}
function proofreadUsingMeshes(): boolean {
  // @ts-ignore
  return window.__proofreadUsingMeshes != null ? window.__proofreadUsingMeshes : true;
}

let coarselyLoadedSegmentIds: number[] = [];

function* loadCoarseMesh(
  layerName: string,
  segmentId: number,
  position: Vector3,
  additionalCoordinates: AdditionalCoordinate[] | undefined,
): Saga<void> {
  if ((yield* select((state) => state.userConfiguration.autoRenderMeshInProofreading)) === false) {
    return;
  }
  const dataset = yield* select((state) => state.dataset);
  const layer = getLayerByName(dataset, layerName);

  // Ensure that potential mesh files are already available. Otherwise, the following
  // code would default to ad-hoc meshing.
  yield* call(dispatchMaybeFetchMeshFilesAsync, Store.dispatch, layer, dataset, false);

  const currentMeshFile = yield* select(
    (state) => state.localSegmentationData[layerName].currentMeshFile,
  );

  const meshInfo = yield* select((state) =>
    getMeshInfoForSegment(state, additionalCoordinates || null, layerName, segmentId),
  );

  if (meshInfo != null) {
    if (meshInfo.isPrecomputed && meshInfo.areChunksMerged) {
      console.log(
        `Reloading mesh for segment ${segmentId} because its chunks should not be merged for proofreading.`,
      );
      yield* put(refreshMeshAction(layerName, segmentId));
    } else {
      console.log(`Don't load mesh for segment ${segmentId} because it already exists.`);
    }
    return;
  }

  if (
    currentMeshFile != null &&
    currentMeshFile.formatVersion >= 3 &&
    currentMeshFile.mappingName == null
  ) {
    // If a mesh file is active which was computed without a mapping, use that instead of computing
    // meshes ad-hoc.
    yield* put(
      loadPrecomputedMeshAction(
        segmentId,
        position,
        additionalCoordinates,
        currentMeshFile.meshFileName,
        undefined,
        false,
      ),
    );
  } else {
    const mappingInfo = yield* select((state) =>
      getMappingInfo(state.temporaryConfiguration.activeMappingByLayer, layerName),
    );
    const { mappingName, mappingType } = mappingInfo;

    // Load the whole agglomerate mesh in a coarse resolution for performance reasons
    const preferredQuality = proofreadCoarseResolutionIndex();
    yield* put(
      loadAdHocMeshAction(segmentId, position, additionalCoordinates, {
        mappingName,
        mappingType,
        preferredQuality,
      }),
    );
  }

  coarselyLoadedSegmentIds.push(segmentId);
}

function* checkForAgglomerateSkeletonModification(
  action: CreateNodeAction | DeleteNodeAction | SetNodePositionAction,
): Saga<void> {
  let nodeId, treeId;

  if (action.type === "CREATE_NODE") {
    ({ treeId } = action);
  } else {
    ({ nodeId, treeId } = action);
  }

  const skeletonTracing = yield* select((state) => enforceSkeletonTracing(state.tracing));

  getNodeAndTree(skeletonTracing, nodeId, treeId, TreeTypeEnum.AGGLOMERATE).map((_) => {
    Toast.warning(
      "Agglomerate skeletons can only be modified when using the proofreading tool to add or delete edges. Consider switching to the proofreading tool or converting the skeleton to a normal tree via right-click in the Skeleton tab.",
      { timeout: 10000 },
    );
  });
}

function* proofreadAtPosition(action: ProofreadAtPositionAction): Saga<void> {
  const { position, additionalCoordinates } = action;

  const volumeTracingLayer = yield* select((state) => getActiveSegmentationTracingLayer(state));
  if (volumeTracingLayer == null || volumeTracingLayer.tracingId == null) return;
  const volumeTracing = yield* select((state) => getActiveSegmentationTracing(state));
  if (volumeTracing == null) return;

  const layerName = volumeTracingLayer.tracingId;
  const isHdf5MappingEnabled = yield* call(ensureHdf5MappingIsEnabled, layerName);
  if (!isHdf5MappingEnabled || volumeTracing.mappingName == null) return;

  const segmentId = yield* call(getSegmentIdForPositionAsync, position);

  if (!proofreadUsingMeshes()) return;

  /* Load a coarse ad hoc mesh of the agglomerate at the click position */
  yield* call(loadCoarseMesh, layerName, segmentId, position, additionalCoordinates);
}

function* createEditableMapping(): Saga<string> {
  /*
   * Returns the name of the editable mapping. This is not identical to the
   * name of the HDF5 mapping for which the editable mapping is about to be created.
   */
  const tracingStoreUrl = yield* select((state) => state.tracing.tracingStore.url);
  // Save before making the mapping editable to make sure the correct mapping is activated in the backend
  yield* call([Model, Model.ensureSavedState]);
  // Get volume tracing again to make sure the version is up to date
  const upToDateVolumeTracing = yield* select((state) => getActiveSegmentationTracing(state));
  if (upToDateVolumeTracing == null) {
    throw new Error("No active segmentation tracing layer. Cannot create editble mapping.");
  }

  const volumeTracingId = upToDateVolumeTracing.tracingId;
  const layerName = volumeTracingId;
  const serverEditableMapping = yield* call(makeMappingEditable, tracingStoreUrl, volumeTracingId);
  // The server increments the volume tracing's version by 1 when switching the mapping to an editable one
  yield* put(setVersionNumberAction(upToDateVolumeTracing.version + 1, "volume", volumeTracingId));
  yield* put(setMappingNameAction(layerName, serverEditableMapping.mappingName, "HDF5"));
  yield* put(setMappingIsEditableAction());
  yield* put(initializeEditableMappingAction(serverEditableMapping));
  return serverEditableMapping.mappingName;
}

function* ensureHdf5MappingIsEnabled(layerName: string): Saga<boolean> {
  const mappingInfo = yield* select((state) =>
    getMappingInfo(state.temporaryConfiguration.activeMappingByLayer, layerName),
  );
  const { mappingName, mappingType, mappingStatus } = mappingInfo;
  if (
    mappingName == null ||
    mappingType !== "HDF5" ||
    mappingStatus === MappingStatusEnum.DISABLED
  ) {
    Toast.error("An HDF5 mapping needs to be enabled to use the proofreading tool.");
    return false;
  }

  return true;
}

function* handleSkeletonProofreadingAction(action: Action): Saga<void> {
  // Actually, action is MergeTreesAction | DeleteEdgeAction | MinCutAgglomerateAction,
  // but the takeEveryUnlessBusy wrapper does not understand this.
  // Handles split, merge and min-cut actions on agglomerates.
  // Note that the skeletontracing reducer already mutated the skeletons according to the
  // received action.
  if (
    action.type !== "MERGE_TREES" &&
    action.type !== "DELETE_EDGE" &&
    action.type !== "MIN_CUT_AGGLOMERATE"
  ) {
    return;
  }
  if (action.type === "DELETE_EDGE" && action.initiator === "PROOFREADING") {
    // Ignore DeleteEdge actions that were dispatched by the proofreading saga itself
    return;
  }

  const allowUpdate = yield* select((state) => state.tracing.restrictions.allowUpdate);
  if (!allowUpdate) return;

  const { sourceNodeId, targetNodeId } = action;
  const skeletonTracing = yield* select((state) => enforceSkeletonTracing(state.tracing));
  const { trees } = skeletonTracing;
  const sourceTree = findTreeByNodeId(trees, sourceNodeId);
  const targetTree = findTreeByNodeId(trees, targetNodeId);

  if (sourceTree == null || targetTree == null) {
    return;
  }

  const isModifyingOnlyAgglomerateSkeletons =
    sourceTree.type === TreeTypeEnum.AGGLOMERATE && targetTree.type === TreeTypeEnum.AGGLOMERATE;
  const isModifyingAnyAgglomerateSkeletons =
    sourceTree.type === TreeTypeEnum.AGGLOMERATE || targetTree.type === TreeTypeEnum.AGGLOMERATE;
  const isProofreadingToolActive = yield* select(
    (state) => state.uiInformation.activeTool === AnnotationToolEnum.PROOFREAD,
  );

  if (isProofreadingToolActive && !isModifyingOnlyAgglomerateSkeletons) {
    Toast.warning(
      "Only agglomerate skeletons can be modified using the proofreading tool to edit the active mapping.",
      { timeout: 12000 },
    );
    return;
  } else if (!isProofreadingToolActive && isModifyingAnyAgglomerateSkeletons) {
    Toast.warning(
      "In order to edit the active mapping by deleting or adding edges of agglomerate skeletons, the proofreading tool needs to be active." +
        " If you want to edit the active mapping, activate the proofreading tool and then redo the action.",
      { timeout: 12000 },
    );
    return;
  }

  if (!isProofreadingToolActive) {
    return;
  }

  const preparation = yield* call(prepareSplitOrMerge);
  if (!preparation) {
    return;
  }
  const { agglomerateFileMag, getDataValue, volumeTracing } = preparation;
  const { tracingId: volumeTracingId } = volumeTracing;

  // Use untransformedPosition because agglomerate trees should not have
  // any transforms, anyway.
  if (yield* select((state) => isSkeletonLayerTransformed(state))) {
    Toast.error("Proofreading is currently not supported when the skeleton layer is transformed.");
    return;
  }
  const sourceNodePosition = sourceTree.nodes.getOrThrow(sourceNodeId).untransformedPosition;
  const targetNodePosition = targetTree.nodes.getOrThrow(targetNodeId).untransformedPosition;

  const idInfos = yield* call(getAgglomerateInfos, preparation.getMappedAndUnmapped, [
    sourceNodePosition,
    targetNodePosition,
  ]);
  if (!idInfos) {
    return;
  }
  const [sourceInfo, targetInfo] = idInfos;
  const sourceAgglomerateId = sourceInfo.agglomerateId;
  const targetAgglomerateId = targetInfo.agglomerateId;

  const editableMappingId = volumeTracing.mappingName;

  /* Send the respective split/merge update action to the backend (by pushing to the save queue
     and saving immediately) */

  const items: UpdateAction[] = [];
  if (action.type === "MERGE_TREES") {
    if (sourceAgglomerateId === targetAgglomerateId) {
      Toast.error("Segments that should be merged need to be in different agglomerates.");
      return;
    }
    items.push(
      mergeAgglomerate(
        sourceAgglomerateId,
        targetAgglomerateId,
        sourceInfo.unmappedId,
        targetInfo.unmappedId,
        agglomerateFileMag,
      ),
    );
  } else if (action.type === "DELETE_EDGE") {
    if (sourceAgglomerateId !== targetAgglomerateId) {
      Toast.error("Segments that should be split need to be in the same agglomerate.");
      return;
    }
    items.push(
      splitAgglomerate(
        sourceAgglomerateId,
        sourceInfo.unmappedId,
        targetInfo.unmappedId,
        agglomerateFileMag,
      ),
    );
  } else if (action.type === "MIN_CUT_AGGLOMERATE") {
    const hasErrored = yield* call(
      performMinCut,
      sourceAgglomerateId,
      targetAgglomerateId,
      sourceInfo.unmappedId,
      targetInfo.unmappedId,
      agglomerateFileMag,
      editableMappingId,
      volumeTracingId,
      sourceTree,
      items,
    );
    if (hasErrored) {
      return;
    }
  }

  if (items.length === 0) {
    return;
  }

  yield* put(pushSaveQueueTransaction(items, "mapping", volumeTracingId));
  yield* call([Model, Model.ensureSavedState]);

  /* Reload the segmentation */
  yield* call([api.data, api.data.reloadBuckets], volumeTracingId, (bucket) =>
    bucket.containsValue(targetAgglomerateId),
  );

  const [newSourceAgglomerateId, newTargetAgglomerateId] = yield* all([
    call(getDataValue, sourceNodePosition),
    call(getDataValue, targetNodePosition),
  ]);

  /* Rename agglomerate skeleton(s) according to their new id and mapping name */

  yield* put(
    setTreeNameAction(
      getTreeNameForAgglomerateSkeleton(newSourceAgglomerateId, volumeTracing.mappingName),
      sourceTree.treeId,
    ),
  );
  if (sourceTree !== targetTree) {
    // A split happened, because the new trees are not identical.
    yield* put(
      setTreeNameAction(
        getTreeNameForAgglomerateSkeleton(newTargetAgglomerateId, volumeTracing.mappingName),
        targetTree.treeId,
      ),
    );
  } else {
    // A merge happened. Remove the segment that doesn't exist anymore.
    yield* put(removeSegmentAction(targetAgglomerateId, volumeTracing.tracingId));
  }

  const pack = (agglomerateId: number, newAgglomerateId: number, nodePosition: Vector3) => ({
    agglomerateId,
    newAgglomerateId,
    nodePosition,
  });

  yield* spawn(refreshAffectedMeshes, volumeTracingId, [
    pack(sourceAgglomerateId, newSourceAgglomerateId, sourceNodePosition),
    pack(targetAgglomerateId, newTargetAgglomerateId, targetNodePosition),
  ]);
}

function* performMinCut(
  sourceAgglomerateId: number,
  targetAgglomerateId: number,
  sourceSegmentId: number,
  targetSegmentId: number,
  agglomerateFileMag: Vector3,
  editableMappingId: string,
  volumeTracingId: string,
  sourceTree: Tree | null,
  items: UpdateAction[],
): Saga<boolean> {
  if (sourceAgglomerateId !== targetAgglomerateId) {
    Toast.error(
      "Segments need to be in the same agglomerate to perform a min-cut splitting operation.",
    );
    return true;
  }

  const tracingStoreUrl = yield* select((state) => state.tracing.tracingStore.url);
  const segmentsInfo = {
    segmentId1: sourceSegmentId,
    segmentId2: targetSegmentId,
    mag: agglomerateFileMag,
    agglomerateId: sourceAgglomerateId,
    editableMappingId,
  };

  const edgesToRemove = yield* call(
    getEdgesForAgglomerateMinCut,
    tracingStoreUrl,
    volumeTracingId,
    segmentsInfo,
  );

  // Use untransformedPosition below because agglomerate trees should not have
  // any transforms, anyway.
  if (yield* select((state) => isSkeletonLayerTransformed(state))) {
    Toast.error("Proofreading is currently not supported when the skeleton layer is transformed.");
    return true;
  }

  for (const edge of edgesToRemove) {
    if (sourceTree) {
      const result = getDeleteEdgeActionForEdgePositions(sourceTree, edge);
      if (result == null) {
        return true;
      }
      const { firstNodeId, secondNodeId } = result;
      yield* put(deleteEdgeAction(firstNodeId, secondNodeId, Date.now(), "PROOFREADING"));
    }

    items.push(
      splitAgglomerate(sourceAgglomerateId, edge.segmentId1, edge.segmentId2, agglomerateFileMag),
    );
  }

  return false;
}

function* performCutFromNeighbors(
  agglomerateId: number,
  segmentId: number,
  segmentPosition: Vector3 | null,
  agglomerateFileMag: Vector3,
  editableMappingId: string,
  volumeTracingId: string,
  sourceTree: Tree | null | undefined,
  items: UpdateAction[],
): Saga<
  { didCancel: false; neighborInfo: NeighborInfo } | { didCancel: true; neighborInfo?: null }
> {
  const tracingStoreUrl = yield* select((state) => state.tracing.tracingStore.url);
  const segmentsInfo = {
    segmentId,
    mag: agglomerateFileMag,
    agglomerateId,
    editableMappingId,
  };

  const neighborInfo = yield* call(
    getNeighborsForAgglomerateNode,
    tracingStoreUrl,
    volumeTracingId,
    segmentsInfo,
  );

  const edgesToRemove: Array<
    | {
        position1: Vector3;
        position2: Vector3;
        segmentId1: number;
        segmentId2: number;
      }
    | {
        position1: null;
        position2: Vector3;
        segmentId1: number;
        segmentId2: number;
      }
  > = neighborInfo.neighbors.map(
    (neighbor) =>
      ({
        position1: segmentPosition,
        position2: neighbor.position,
        segmentId1: segmentId,
        segmentId2: neighbor.segmentId,
      }) as const,
  );

  if (edgesToRemove.length === 0) {
    Toast.info("No neighbors found.");
    return { didCancel: true };
  }

  for (const edge of edgesToRemove) {
    if (sourceTree) {
      if (edge.position1 == null) {
        // Satisfy TypeScript. Should not happen because segmentPosition should not be null
        // when a sourceTree was passed.
        Toast.warning("Could not perform cut from neighbors. See console for more details.");
        console.warn(
          "segmentPosition is not available even though a tree was passed to performCutFromNeighbors.",
        );
        return { didCancel: true };
      }
      const result = getDeleteEdgeActionForEdgePositions(sourceTree, edge);
      if (result == null) {
        return { didCancel: true };
      }
      const { firstNodeId, secondNodeId } = result;
      yield* put(deleteEdgeAction(firstNodeId, secondNodeId, Date.now(), "PROOFREADING"));
    }

    items.push(
      splitAgglomerate(agglomerateId, edge.segmentId1, edge.segmentId2, agglomerateFileMag),
    );
  }

  return { didCancel: false, neighborInfo };
}

function* clearProofreadingByproducts() {
  const volumeTracingLayer = yield* select((state) => getActiveSegmentationTracingLayer(state));
  if (volumeTracingLayer == null || volumeTracingLayer.tracingId == null) return;
  const layerName = volumeTracingLayer.tracingId;

  for (const segmentId of coarselyLoadedSegmentIds) {
    yield* put(removeMeshAction(layerName, segmentId));
  }
  coarselyLoadedSegmentIds = [];
}

const MISSING_INFORMATION_WARNING =
  "Please use either the data viewports OR the 3D viewport (but not both) for selecting the partners of a proofreading operation.";

function* handleProofreadMergeOrMinCut(action: Action) {
  // Actually, action is ProofreadMergeAction | MinCutAgglomerateWithPositionAction
  // but the takeEveryUnlessBusy wrapper does not understand this.
  if (action.type !== "PROOFREAD_MERGE" && action.type !== "MIN_CUT_AGGLOMERATE_WITH_POSITION") {
    return;
  }

  const allowUpdate = yield* select((state) => state.tracing.restrictions.allowUpdate);
  if (!allowUpdate) return;

  const preparation = yield* call(prepareSplitOrMerge);
  if (!preparation) {
    return;
  }
  const { agglomerateFileMag, volumeTracing } = preparation;
  const { tracingId: volumeTracingId, activeCellId, activeUnmappedSegmentId } = volumeTracing;
  if (activeCellId === 0) return;

  const segments = yield* select((store) => getSegmentsForLayer(store, volumeTracingId));
  const activeSegment = segments.getNullable(activeCellId);
  if (activeSegment == null) return;
  const activeSegmentPositionFloat = activeSegment.somePosition;
  if (activeSegmentPositionFloat == null) return;

  const activeSegmentPosition = V3.floor(activeSegmentPositionFloat);
  let sourcePosition;

  let targetPosition: Vector3 | undefined;
  let idInfos;
  if (action.position) {
    if (activeUnmappedSegmentId != null) {
      // The user has selected a super-voxel in the 3D viewport and then clicked
      // in a data viewport to select the second merge partner. However, this mix
      // is currently not supported.
      Toast.warning(MISSING_INFORMATION_WARNING);
      return;
    }
    // The action was triggered via a data viewport (not 3D). In this case,
    // the active segment's position can be used as a source.
    sourcePosition = activeSegmentPosition;
    targetPosition = V3.floor(action.position);
    idInfos = yield* call(getAgglomerateInfos, preparation.getMappedAndUnmapped, [
      sourcePosition,
      targetPosition,
    ]);
  } else {
    // The action was triggered in the 3D viewport. In this case, we don't have
    // a mouse position and also the active segment position isn't necessarily
    // a position of the clicked super-voxel.
    if (
      action.agglomerateId == null ||
      activeCellId == null ||
      activeUnmappedSegmentId == null ||
      action.segmentId == null
    ) {
      Toast.warning(MISSING_INFORMATION_WARNING);
      console.log("Some fields were null:", {
        agglomerateId: action.agglomerateId,
        activeCellId,
        activeUnmappedSegmentId,
        segmentId: action.segmentId,
      });
      return;
    }
    const targetSegmentId = action.segmentId;
    if (targetSegmentId == null) {
      Toast.warning(MISSING_INFORMATION_WARNING);
      console.log(`No position is known for agglomerate ${action.agglomerateId}`);
      return;
    }
    if (action.type === "PROOFREAD_MERGE") {
      // When merging two segments, they can share the same seed position afterwards.
      // Also, using the active segment position is fine because it's definitely
      // matching the active agglomerate.
      // Therefore, we do so to avoid another roundtrip to the server.
      sourcePosition = activeSegmentPosition;
      targetPosition = activeSegmentPosition;
    } else {
      // When splitting two segments, we don't really have reliable positions at hand.
      // For the source position, we cannot rely on the active segment position, because
      // the active super-voxel doesn't necessarily match the last click position within
      // the data viewports.
      // For the target position, we also don't have reliable information available.
      [sourcePosition, targetPosition] = yield* all([
        call(getPositionForSegmentId, volumeTracing, activeUnmappedSegmentId),
        call(getPositionForSegmentId, volumeTracing, targetSegmentId),
      ]);
    }

    idInfos = [
      { agglomerateId: activeCellId, unmappedId: activeUnmappedSegmentId },
      { agglomerateId: action.agglomerateId, unmappedId: action.segmentId },
    ];
  }

  if (idInfos == null) {
    return;
  }
  const [sourceInfo, targetInfo] = idInfos;
  const sourceAgglomerateId = sourceInfo.agglomerateId;
  const targetAgglomerateId = targetInfo.agglomerateId;

  /* Send the respective split/merge update action to the backend (by pushing to the save queue
     and saving immediately) */

  const items: UpdateAction[] = [];

  if (action.type === "PROOFREAD_MERGE") {
    if (sourceAgglomerateId === targetAgglomerateId) {
      Toast.error("Segments that should be merged need to be in different agglomerates.");
      return;
    }
    items.push(
      mergeAgglomerate(
        sourceAgglomerateId,
        targetAgglomerateId,
        sourceInfo.unmappedId,
        targetInfo.unmappedId,
        agglomerateFileMag,
      ),
    );
  } else if (action.type === "MIN_CUT_AGGLOMERATE_WITH_POSITION") {
    if (sourceInfo.unmappedId === targetInfo.unmappedId) {
      Toast.error(
        "The selected positions are both part of the same base segment and cannot be split. Please select another position or use the nodes of the agglomerate skeleton to perform the split.",
      );
      return;
    }
    const hasErrored = yield* call(
      performMinCut,
      sourceAgglomerateId,
      targetAgglomerateId,
      sourceInfo.unmappedId,
      targetInfo.unmappedId,
      agglomerateFileMag,
      volumeTracing.mappingName,
      volumeTracingId,
      null,
      items,
    );
    if (hasErrored) {
      return;
    }
  }

  if (items.length === 0) {
    return;
  }

  yield* put(pushSaveQueueTransaction(items, "mapping", volumeTracingId));
  yield* call([Model, Model.ensureSavedState]);

  /* Reload the segmentation */
  yield* call([api.data, api.data.reloadBuckets], volumeTracingId, (bucket) =>
    bucket.containsValue(targetAgglomerateId),
  );

  if (action.type === "PROOFREAD_MERGE") {
    // Remove the segment that doesn't exist anymore.
    yield* put(removeSegmentAction(targetAgglomerateId, volumeTracing.tracingId));
  }

  /* Reload meshes */
  const tracingStoreUrl = yield* select((state) => state.tracing.tracingStore.url);
  const newSourceAgglomerateId = yield* call(
    getAgglomerateIdForSegmentId,
    tracingStoreUrl,
    volumeTracing.tracingId,
    sourceInfo.unmappedId,
  );
  const newTargetAgglomerateId = yield* call(
    getAgglomerateIdForSegmentId,
    tracingStoreUrl,
    volumeTracing.tracingId,
    targetInfo.unmappedId,
  );

  yield* spawn(refreshAffectedMeshes, volumeTracingId, [
    {
      agglomerateId: sourceAgglomerateId,
      newAgglomerateId: newSourceAgglomerateId,
      nodePosition: sourcePosition,
    },
    {
      agglomerateId: targetAgglomerateId,
      newAgglomerateId: newTargetAgglomerateId,
      nodePosition: targetPosition,
    },
  ]);
}

function* handleProofreadCutNeighbors(action: Action) {
  // Actually, action is CutAgglomerateFromNeighborsAction but the
  // takeEveryUnlessBusy wrapper does not understand this.
  if (action.type !== "CUT_AGGLOMERATE_FROM_NEIGHBORS") {
    return;
  }

  // This action does not depend on the active agglomerate. Instead, it
  // only depends on the rightclicked agglomerate.

  const allowUpdate = yield* select((state) => state.tracing.restrictions.allowUpdate);
  if (!allowUpdate) return;

  const preparation = yield* call(prepareSplitOrMerge);
  if (!preparation) {
    return;
  }
  const { agglomerateFileMag, getDataValue, volumeTracing } = preparation;
  const { tracingId: volumeTracingId } = volumeTracing;

  let idInfos;
  let targetPosition = null;
  if (action.position != null) {
    targetPosition = V3.floor(action.position);
    idInfos = yield* call(getAgglomerateInfos, preparation.getMappedAndUnmapped, [targetPosition]);
  } else {
    if (action.agglomerateId == null || action.segmentId == null) {
      Toast.warning(MISSING_INFORMATION_WARNING);
      console.log("Some fields were null:", {
        agglomerateId: action.agglomerateId,
        segmentId: action.segmentId,
      });
      return;
    }
    idInfos = [{ agglomerateId: action.agglomerateId, unmappedId: action.segmentId }];

    targetPosition = yield* call(getPositionForSegmentId, volumeTracing, action.segmentId);
  }
  if (!idInfos) {
    return;
  }
  const targetAgglomerateId = idInfos[0].agglomerateId;
  const targetSegmentId = idInfos[0].unmappedId;

  const editableMappingId = volumeTracing.mappingName;

  /* Send the respective split/merge update action to the backend (by pushing to the save queue
     and saving immediately) */

  const items: UpdateAction[] = [];

  const { didCancel, neighborInfo } = yield* call(
    performCutFromNeighbors,
    targetAgglomerateId,
    targetSegmentId,
    targetPosition,
    agglomerateFileMag,
    editableMappingId,
    volumeTracingId,
    action.tree,
    items,
  );
  if (didCancel) {
    return;
  }

  if (items.length === 0) {
    return;
  }

  yield* put(pushSaveQueueTransaction(items, "mapping", volumeTracingId));
  yield* call([Model, Model.ensureSavedState]);

  /* Reload the segmentation */
  yield* call([api.data, api.data.reloadBuckets], volumeTracingId, (bucket) =>
    bucket.containsValue(targetAgglomerateId),
  );

  const [newTargetAgglomerateId, ...newNeighborAgglomerateIds] = yield* all([
    call(getDataValue, targetPosition),
    ...neighborInfo.neighbors.map((neighbor) => call(getDataValue, neighbor.position)),
  ]);

  /* Reload meshes */
  yield* spawn(refreshAffectedMeshes, volumeTracingId, [
    {
      agglomerateId: targetAgglomerateId,
      newAgglomerateId: newTargetAgglomerateId,
      nodePosition: targetPosition,
    },
    ...neighborInfo.neighbors.map((neighbor, idx) => ({
      agglomerateId: targetAgglomerateId,
      newAgglomerateId: newNeighborAgglomerateIds[idx],
      nodePosition: neighbor.position,
    })),
  ]);
}

// Helper functions

function* prepareSplitOrMerge(): Saga<{
  agglomerateFileMag: Vector3;
  getDataValue: (position: Vector3) => Promise<number>;
  getMappedAndUnmapped: (
    position: Vector3,
  ) => Promise<{ agglomerateId: number; unmappedId: number }>;
  volumeTracing: VolumeTracing & { mappingName: string };
} | null> {
  const volumeTracingLayer = yield* select((state) => getActiveSegmentationTracingLayer(state));
  const volumeTracing = yield* select((state) => getActiveSegmentationTracing(state));
  if (volumeTracingLayer == null || volumeTracing == null) {
    return null;
  }
  let { mappingName } = volumeTracing;
  if (mappingName == null) {
    return null;
  }

  const isHdf5MappingEnabled = yield* call(ensureHdf5MappingIsEnabled, volumeTracing.tracingId);
  if (!isHdf5MappingEnabled) {
    return null;
  }

  if (!volumeTracing.mappingIsEditable) {
    try {
      mappingName = yield* call(createEditableMapping);
    } catch (e) {
      console.error(e);
      return null;
    }
  }

  const resolutionInfo = getResolutionInfo(volumeTracingLayer.resolutions);
  // The mag the agglomerate skeleton corresponds to should be the finest available mag of the volume tracing layer
  const agglomerateFileMag = resolutionInfo.getFinestResolution();
  const agglomerateFileZoomstep = resolutionInfo.getFinestResolutionIndex();

  const getDataValue = (position: Vector3) => {
    const { additionalCoordinates } = Store.getState().flycam;
    return api.data.getDataValue(
      volumeTracing.tracingId,
      position,
      agglomerateFileZoomstep,
      additionalCoordinates,
    );
  };

  const getUnmappedDataValue = yield* call(createGetUnmappedDataValueFn, volumeTracing);

  const getMappedAndUnmapped = async (position: Vector3) => {
    const [agglomerateId, unmappedId] = await Promise.all([
      getDataValue(position),
      getUnmappedDataValue(position),
    ]);
    return { agglomerateId, unmappedId };
  };

  return {
    agglomerateFileMag,
    getDataValue,
    getMappedAndUnmapped,
    volumeTracing: { ...volumeTracing, mappingName },
  };
}

function* getAgglomerateInfos(
  getMappedAndUnmapped: (
    position: Vector3,
  ) => Promise<{ agglomerateId: number; unmappedId: number }>,
  positions: Vector3[],
): Saga<Array<{
  agglomerateId: number;
  unmappedId: number;
}> | null> {
  const idInfos = yield* all(positions.map((pos) => call(getMappedAndUnmapped, pos)));
  if (idInfos.find((idInfo) => idInfo.agglomerateId === 0 || idInfo.unmappedId === 0) != null) {
    Toast.warning(
      "One of the selected segments has the id 0 which is the background. Cannot merge/split.",
    );
    console.warn("At least one id was zero:", idInfos);
    return null;
  }
  return idInfos;
}

function* refreshAffectedMeshes(
  layerName: string,
  items: Array<{
    agglomerateId: number;
    newAgglomerateId: number;
    nodePosition: Vector3;
  }>,
) {
  // ATTENTION: This saga should usually be called with `spawn` to avoid that the user
  // is blocked (via takeEveryUnlessBusy) while the meshes are refreshed.
  if (!proofreadUsingMeshes()) {
    return;
  }
  // Segmentations with more than 3 dimensions are currently not compatible
  // with proofreading. Once such datasets appear, this parameter needs to be
  // adapted.
  const additionalCoordinates = undefined;

  // Remember which meshes were removed in this saga
  // and which were fetched again to avoid doing redundant work.
  const removedIds = new Set();
  const newlyLoadedIds = new Set();
  for (const item of items) {
    // Remove old agglomerate mesh(es) and load updated agglomerate mesh(es)
    if (!removedIds.has(item.agglomerateId)) {
      yield* put(removeMeshAction(layerName, item.agglomerateId));
      removedIds.add(item.agglomerateId);
    }
    if (!newlyLoadedIds.has(item.newAgglomerateId)) {
      yield* call(
        loadCoarseMesh,
        layerName,
        item.newAgglomerateId,
        item.nodePosition,
        additionalCoordinates,
      );
      newlyLoadedIds.add(item.newAgglomerateId);
    }
  }
}

function* createGetUnmappedDataValueFn(
  volumeTracing: VolumeTracing,
): Saga<(nodePosition: Vector3) => Promise<number>> {
  const layerName = volumeTracing.tracingId;
  const layer = yield* select((state) => getLayerByName(state.dataset, layerName));

  const resolutionInfo = getResolutionInfo(layer.resolutions);
  const mag = resolutionInfo.getFinestResolution();

  const fallbackLayerName = volumeTracing.fallbackLayer;
  if (fallbackLayerName == null) {
    // Proofreading is done on editable mappings which only exist when there is
    // an agglomerate file (which is only possible when there is a segmentation layer
    // in the dataset).
    throw new Error("No fallback layer exists for volume tracing during proofreading.");
  }

  const TypedArrayClass = getConstructorForElementClass(layer.elementClass)[0];

  return async (nodePosition: Vector3) => {
    const buffer = await api.data.getRawDataCuboid(
      fallbackLayerName,
      nodePosition,
      V3.add(nodePosition, mag),
      mag,
    );

    return Number(new TypedArrayClass(buffer)[0]);
  };
}

function getDeleteEdgeActionForEdgePositions(
  sourceTree: Tree,
  edge: { position1: Vector3; position2: Vector3; segmentId1: number; segmentId2: number },
) {
  let firstNodeId;
  let secondNodeId;
  for (const node of sourceTree.nodes.values()) {
    if (_.isEqual(node.untransformedPosition, edge.position1)) {
      firstNodeId = node.id;
    } else if (_.isEqual(node.untransformedPosition, edge.position2)) {
      secondNodeId = node.id;
    }
    if (firstNodeId && secondNodeId) {
      break;
    }
  }

  if (!firstNodeId || !secondNodeId) {
    Toast.warning(
      `Unable to find all nodes for positions ${!firstNodeId ? edge.position1 : null}${
        !secondNodeId ? [", ", edge.position2] : null
      } in ${sourceTree.name}.`,
    );
    return null;
  }
  return { firstNodeId, secondNodeId };
}

function* getPositionForSegmentId(volumeTracing: VolumeTracing, segmentId: number): Saga<Vector3> {
  const dataset = yield* select((state) => state.dataset);
  const dataStoreUrl = yield* select((state) => state.dataset.dataStore.url);
  const editableMapping = yield* select((state) =>
    getEditableMappingForVolumeTracingId(state, volumeTracing.tracingId),
  );
  if (volumeTracing.fallbackLayer == null || editableMapping == null) {
    // Should not happen in proofreading.
    throw new Error("Could not find fallback layer or editable mapping.");
  }
  const position = yield* call(
    getPositionForSegmentInAgglomerate,
    dataStoreUrl,
    dataset,
    volumeTracing.fallbackLayer,
    editableMapping.baseMappingName,
    segmentId,
  );
  return position;
}
