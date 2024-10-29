# Changelog (Unreleased)

All notable (yet unreleased) user-facing changes to WEBKNOSSOS are documented in this file.
See `CHANGELOG.released.md` for the changes which are part of official releases.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Calendar Versioning](http://calver.org/) `0Y.0M.MICRO`.
For upgrade instructions, please check the [migration guide](MIGRATIONS.released.md).

## Unreleased
[Commits](https://github.com/scalableminds/webknossos/compare/24.10.0...HEAD)

### Added
<<<<<<< HEAD
- Added the option for the owner to lock explorative annotations. Locked annotations cannot be modified by any user. An annotation can be locked in the annotations table and when viewing the annotation via the navbar dropdown menu. [#7801](https://github.com/scalableminds/webknossos/pull/7801)
- Added the option to set a default mapping for a dataset in the dataset view configuration. The default mapping is loaded when the dataset is opened and the user / url does not configure something else. [#7858](https://github.com/scalableminds/webknossos/pull/7858)
- Uploading an annotation into a dataset that it was not created for now also works if the dataset is in a different organization. [#7816](https://github.com/scalableminds/webknossos/pull/7816)
- When downloading + reuploading an annotation that is based on a segmentation layer with active mapping, that mapping is now still be selected after the reupload. [#7822](https://github.com/scalableminds/webknossos/pull/7822)
- In the Voxelytics workflow list, the name of the WEBKNOSSOS user who started the job is displayed. [#7794](https://github.com/scalableminds/webknossos/pull/7795)
- Start an alignment job (aligns the section in a dataset) via the "AI Analysis" button. [#7820](https://github.com/scalableminds/webknossos/pull/7820)
- Added additional validation for the animation job modal. Bounding boxes must be larger then zero. [#7883](https://github.com/scalableminds/webknossos/pull/7883)

### Changed
- The "WEBKNOSSOS Changelog" modal now lazily loads its content potentially speeding up the initial loading time of WEBKNOSSOS and thus improving the UX. [#7843](https://github.com/scalableminds/webknossos/pull/7843)
- Updated the min max settings for the histogram to allow floating point color layers to have negative min / max values. [#7873](https://github.com/scalableminds/webknossos/pull/7873)
- Made the login, registration, forgot password and dataset dashboard pages more mobile friendly. [#7876](https://github.com/scalableminds/webknossos/pull/7876)
- From now on only project owner get a notification email upon project overtime. The organization specific email list `overTimeMailingList` was removed. [#7842](https://github.com/scalableminds/webknossos/pull/7842)
- Replaced skeleton comment tab component with antd's `<Tree />`component. [#7802](https://github.com/scalableminds/webknossos/pull/7802)

### Fixed
- Fixed a bug where the warning to zoom in to see the agglomerate mapping was shown to the user even when the 3D viewport was maximized and no volume data was shown. [#7865](https://github.com/scalableminds/webknossos/issues/7865) 
- Fixed a bug where brushing on a fallback segmentation with active mapping and with segment index file would lead to failed saves. [#7833](https://github.com/scalableminds/webknossos/pull/7833)
- Fixed a bug where sometimes old mismatching javascript code would be served after upgrades. [#7854](https://github.com/scalableminds/webknossos/pull/7854)
- Fixed a bug where dataset uploads of zipped tiff data via the UI would be rejected. [#7856](https://github.com/scalableminds/webknossos/pull/7856)
- Fixed a bug with incorrect valiation of layer names in the animation modal. [#7882](https://github.com/scalableminds/webknossos/pull/7882)
=======
- It is now possible to add metadata in annotations to Trees and Segments. [#7875](https://github.com/scalableminds/webknossos/pull/7875)
- Added a summary row to the time tracking overview, where times and annotations/tasks are summed. [#8092](https://github.com/scalableminds/webknossos/pull/8092)
- Most sliders have been improved: Wheeling above a slider now changes its value and double-clicking its knob resets it to its default value. [#8095](https://github.com/scalableminds/webknossos/pull/8095)
- It is now possible to search for unnamed segments with the full default name instead of only their id. [#8133](https://github.com/scalableminds/webknossos/pull/8133)
- Increased loading speed for precomputed meshes. [#8110](https://github.com/scalableminds/webknossos/pull/8110)
- Added a button to the search popover in the skeleton and segment tab to select all matching non-group results. [#8123](https://github.com/scalableminds/webknossos/pull/8123)
- Unified wording in UI and code: “Magnification”/“mag” is now used in place of “Resolution“ most of the time, compare [https://docs.webknossos.org/webknossos/terminology.html](terminology document). [#8111](https://github.com/scalableminds/webknossos/pull/8111)
- Added support for adding remote OME-Zarr NGFF version 0.5 datasets. [#8122](https://github.com/scalableminds/webknossos/pull/8122)

### Changed
- Some mesh-related actions were disabled in proofreading-mode when using meshfiles that were created for a mapping rather than an oversegmentation. [#8091](https://github.com/scalableminds/webknossos/pull/8091)
- Admins can now see and cancel all jobs. The owner of the job is shown in the job list. [#8112](https://github.com/scalableminds/webknossos/pull/8112)
- Migrated nightly screenshot tests from CircleCI to GitHub actions. [#8134](https://github.com/scalableminds/webknossos/pull/8134)
- Migrated nightly screenshot tests for wk.org from CircleCI to GitHub actions. [#8135](https://github.com/scalableminds/webknossos/pull/8135)

### Fixed
- Fixed a bug during dataset upload in case the configured `datastore.baseFolder` is an absolute path. [#8098](https://github.com/scalableminds/webknossos/pull/8098) [#8103](https://github.com/scalableminds/webknossos/pull/8103)
- Fixed bbox export menu item [#8152](https://github.com/scalableminds/webknossos/pull/8152)
- When trying to save an annotation opened via a link including a sharing token, the token is automatically discarded in case it is insufficient for update actions but the users token is. [#8139](https://github.com/scalableminds/webknossos/pull/8139)
- Fixed that the skeleton search did not automatically expand groups that contained the selected tree [#8129](https://github.com/scalableminds/webknossos/pull/8129)
- Fixed a bug that zarr streaming version 3 returned the shape of mag (1, 1, 1) / the finest mag for all mags. [#8116](https://github.com/scalableminds/webknossos/pull/8116)
- Fixed sorting of mags in outbound zarr streaming. [#8125](https://github.com/scalableminds/webknossos/pull/8125)
- Fixed a bug where you could not create annotations for public datasets of other organizations. [#8107](https://github.com/scalableminds/webknossos/pull/8107)
- Users without edit permissions to a dataset can no longer delete sharing tokens via the API. [#8083](https://github.com/scalableminds/webknossos/issues/8083)
>>>>>>> upstream/master

### Removed

### Breaking Changes
