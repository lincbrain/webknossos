// @GENERATOR:play-routes-compiler
// @SOURCE:conf/webknossos.latest.routes

package webknossos.latest

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  Application_20: controllers.Application,
  // @LINE:7
  AnalyticsController_12: controllers.AnalyticsController,
  // @LINE:10
  InitialDataController_21: controllers.InitialDataController,
  // @LINE:13
  MaintenanceController_11: controllers.MaintenanceController,
  // @LINE:23
  AuthenticationController_1: controllers.AuthenticationController,
  // @LINE:44
  ConfigurationController_3: controllers.ConfigurationController,
  // @LINE:52
  TaskController_32: controllers.TaskController,
  // @LINE:55
  UserController_24: controllers.UserController,
  // @LINE:66
  TimeController_23: controllers.TimeController,
  // @LINE:69
  TeamController_31: controllers.TeamController,
  // @LINE:72
  ReportController_14: controllers.ReportController,
  // @LINE:76
  AnnotationController_26: controllers.AnnotationController,
  // @LINE:78
  DatasetController_22: controllers.DatasetController,
  // @LINE:97
  FolderController_4: controllers.FolderController,
  // @LINE:106
  DataStoreController_2: controllers.DataStoreController,
  // @LINE:107
  WKRemoteDataStoreController_7: controllers.WKRemoteDataStoreController,
  // @LINE:115
  UserTokenController_9: controllers.UserTokenController,
  // @LINE:121
  TracingStoreController_25: controllers.TracingStoreController,
  // @LINE:122
  WKRemoteTracingStoreController_28: controllers.WKRemoteTracingStoreController,
  // @LINE:133
  AnnotationIOController_19: controllers.AnnotationIOController,
  // @LINE:165
  AnnotationPrivateLinkController_0: controllers.AnnotationPrivateLinkController,
  // @LINE:181
  MeshController_15: controllers.MeshController,
  // @LINE:200
  TaskTypeController_10: controllers.TaskTypeController,
  // @LINE:205
  ProjectController_13: controllers.ProjectController,
  // @LINE:210
  ScriptController_27: controllers.ScriptController,
  // @LINE:232
  OrganizationController_6: controllers.OrganizationController,
  // @LINE:258
  WKRemoteWorkerController_5: controllers.WKRemoteWorkerController,
  // @LINE:259
  JobsController_29: controllers.JobsController,
  // @LINE:277
  PublicationController_8: controllers.PublicationController,
  // @LINE:281
  ShortLinkController_30: controllers.ShortLinkController,
  // @LINE:285
  CredentialController_17: controllers.CredentialController,
  // @LINE:290
  EmailVerificationController_18: controllers.EmailVerificationController,
  // @LINE:294
  VoxelyticsController_16: controllers.VoxelyticsController,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    Application_20: controllers.Application,
    // @LINE:7
    AnalyticsController_12: controllers.AnalyticsController,
    // @LINE:10
    InitialDataController_21: controllers.InitialDataController,
    // @LINE:13
    MaintenanceController_11: controllers.MaintenanceController,
    // @LINE:23
    AuthenticationController_1: controllers.AuthenticationController,
    // @LINE:44
    ConfigurationController_3: controllers.ConfigurationController,
    // @LINE:52
    TaskController_32: controllers.TaskController,
    // @LINE:55
    UserController_24: controllers.UserController,
    // @LINE:66
    TimeController_23: controllers.TimeController,
    // @LINE:69
    TeamController_31: controllers.TeamController,
    // @LINE:72
    ReportController_14: controllers.ReportController,
    // @LINE:76
    AnnotationController_26: controllers.AnnotationController,
    // @LINE:78
    DatasetController_22: controllers.DatasetController,
    // @LINE:97
    FolderController_4: controllers.FolderController,
    // @LINE:106
    DataStoreController_2: controllers.DataStoreController,
    // @LINE:107
    WKRemoteDataStoreController_7: controllers.WKRemoteDataStoreController,
    // @LINE:115
    UserTokenController_9: controllers.UserTokenController,
    // @LINE:121
    TracingStoreController_25: controllers.TracingStoreController,
    // @LINE:122
    WKRemoteTracingStoreController_28: controllers.WKRemoteTracingStoreController,
    // @LINE:133
    AnnotationIOController_19: controllers.AnnotationIOController,
    // @LINE:165
    AnnotationPrivateLinkController_0: controllers.AnnotationPrivateLinkController,
    // @LINE:181
    MeshController_15: controllers.MeshController,
    // @LINE:200
    TaskTypeController_10: controllers.TaskTypeController,
    // @LINE:205
    ProjectController_13: controllers.ProjectController,
    // @LINE:210
    ScriptController_27: controllers.ScriptController,
    // @LINE:232
    OrganizationController_6: controllers.OrganizationController,
    // @LINE:258
    WKRemoteWorkerController_5: controllers.WKRemoteWorkerController,
    // @LINE:259
    JobsController_29: controllers.JobsController,
    // @LINE:277
    PublicationController_8: controllers.PublicationController,
    // @LINE:281
    ShortLinkController_30: controllers.ShortLinkController,
    // @LINE:285
    CredentialController_17: controllers.CredentialController,
    // @LINE:290
    EmailVerificationController_18: controllers.EmailVerificationController,
    // @LINE:294
    VoxelyticsController_16: controllers.VoxelyticsController
  ) = this(errorHandler, Application_20, AnalyticsController_12, InitialDataController_21, MaintenanceController_11, AuthenticationController_1, ConfigurationController_3, TaskController_32, UserController_24, TimeController_23, TeamController_31, ReportController_14, AnnotationController_26, DatasetController_22, FolderController_4, DataStoreController_2, WKRemoteDataStoreController_7, UserTokenController_9, TracingStoreController_25, WKRemoteTracingStoreController_28, AnnotationIOController_19, AnnotationPrivateLinkController_0, MeshController_15, TaskTypeController_10, ProjectController_13, ScriptController_27, OrganizationController_6, WKRemoteWorkerController_5, JobsController_29, PublicationController_8, ShortLinkController_30, CredentialController_17, EmailVerificationController_18, VoxelyticsController_16, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    webknossos.latest.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_20, AnalyticsController_12, InitialDataController_21, MaintenanceController_11, AuthenticationController_1, ConfigurationController_3, TaskController_32, UserController_24, TimeController_23, TeamController_31, ReportController_14, AnnotationController_26, DatasetController_22, FolderController_4, DataStoreController_2, WKRemoteDataStoreController_7, UserTokenController_9, TracingStoreController_25, WKRemoteTracingStoreController_28, AnnotationIOController_19, AnnotationPrivateLinkController_0, MeshController_15, TaskTypeController_10, ProjectController_13, ScriptController_27, OrganizationController_6, WKRemoteWorkerController_5, JobsController_29, PublicationController_8, ShortLinkController_30, CredentialController_17, EmailVerificationController_18, VoxelyticsController_16, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buildinfo""", """controllers.Application.buildInfo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """features""", """controllers.Application.features()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """health""", """controllers.Application.health()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """analytics/ingest""", """controllers.AnalyticsController.ingestAnalyticsEvents"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """analytics/""" + "$" + """eventType<[^/]+>""", """controllers.AnalyticsController.trackAnalyticsEvent(eventType:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helpEmail""", """controllers.Application.helpEmail(message:String, currentUrl:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """triggers/initialData""", """controllers.InitialDataController.triggerInsert()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances/listCurrentAndUpcoming""", """controllers.MaintenanceController.listCurrentAndUpcoming()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances/listAll""", """controllers.MaintenanceController.listAll()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances""", """controllers.MaintenanceController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances/""" + "$" + """id<[^/]+>""", """controllers.MaintenanceController.readOne(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances/""" + "$" + """id<[^/]+>""", """controllers.MaintenanceController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances/""" + "$" + """id<[^/]+>""", """controllers.MaintenanceController.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances""", """controllers.MaintenanceController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenances/adHoc""", """controllers.MaintenanceController.createAdHocMaintenance()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/register""", """controllers.AuthenticationController.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/joinOrganization/""" + "$" + """inviteToken<[^/]+>""", """controllers.AuthenticationController.joinOrganization(inviteToken:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/login""", """controllers.AuthenticationController.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/token""", """controllers.AuthenticationController.getToken()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/token""", """controllers.AuthenticationController.deleteToken()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/switch""", """controllers.AuthenticationController.switchMultiUser(to:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/switchOrganization/""" + "$" + """organizationName<[^/]+>""", """controllers.AuthenticationController.switchOrganization(organizationName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/accessibleBySwitching""", """controllers.AuthenticationController.accessibleBySwitching(organizationName:Option[String], datasetName:Option[String], annotationId:Option[String], workflowHash:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/sendInvites""", """controllers.AuthenticationController.sendInvites()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/startResetPassword""", """controllers.AuthenticationController.handleStartResetPassword()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/changePassword""", """controllers.AuthenticationController.changePassword()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/resetPassword""", """controllers.AuthenticationController.handleResetPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/logout""", """controllers.AuthenticationController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/sso""", """controllers.AuthenticationController.singleSignOn(sso:String, sig:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/oidc/login""", """controllers.AuthenticationController.loginViaOpenIdConnect()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/oidc/callback""", """controllers.AuthenticationController.openIdCallback()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/createOrganizationWithAdmin""", """controllers.AuthenticationController.createOrganizationWithAdmin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/createUserInOrganization/""" + "$" + """organizationName<[^/]+>""", """controllers.AuthenticationController.createUserInOrganization(organizationName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userConfiguration""", """controllers.ConfigurationController.read()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userConfiguration""", """controllers.ConfigurationController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasetConfigurations/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.ConfigurationController.readDatasetViewConfiguration(organizationName:String, datasetName:String, sharingToken:Option[String])"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasetConfigurations/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.ConfigurationController.updateDatasetViewConfiguration(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasetConfigurations/default/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.ConfigurationController.readDatasetAdminViewConfiguration(organizationName:String, datasetName:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasetConfigurations/default/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.ConfigurationController.updateDatasetAdminViewConfiguration(organizationName:String, datasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/tasks/request""", """controllers.TaskController.request()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/tasks/peek""", """controllers.TaskController.peekNext()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.list(isEditable:Option[Boolean], isTeamManagerOrAdmin:Option[Boolean], isAdmin:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.current()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/tasks""", """controllers.UserController.tasks(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/annotations""", """controllers.UserController.annotations(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.user(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/taskTypeId""", """controllers.UserController.updateLastTaskTypeId(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/novelUserExperienceInfos""", """controllers.UserController.updateNovelUserExperienceInfos(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/selectedTheme""", """controllers.UserController.updateSelectedTheme(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/tasks""", """controllers.UserController.userTasks(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/annotations""", """controllers.UserController.userAnnotations(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/loggedTime""", """controllers.TimeController.userLoggedTime(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams""", """controllers.TeamController.list(isEditable:Option[Boolean])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams""", """controllers.TeamController.create()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams/""" + "$" + """id<[^/]+>""", """controllers.TeamController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams/""" + "$" + """id<[^/]+>/availableTasksReport""", """controllers.ReportController.availableTasksReport(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams/""" + "$" + """id<[^/]+>/projectProgressReport""", """controllers.ReportController.projectProgressReport(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""", """controllers.AnnotationController.createExplorational(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/sandbox/""" + "$" + """typ<[^/]+>""", """controllers.AnnotationController.getSandbox(organizationName:String, datasetName:String, typ:String, sharingToken:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets""", """controllers.DatasetController.list(isActive:Option[Boolean], isUnreported:Option[Boolean], organizationName:Option[String], onlyMyOrganization:Option[Boolean], uploaderId:Option[String], folderId:Option[String], includeSubfolders:Option[Boolean], searchQuery:Option[String], limit:Option[Int], compact:Option[Boolean])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets""", """controllers.DatasetController.create(typ:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/exploreRemote""", """controllers.DatasetController.exploreRemoteDataset()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/exploreAndAddRemote""", """controllers.DatasetController.exploreAndAddRemoteDataset()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/disambiguate/""" + "$" + """datasetName<[^/]+>/toNew""", """controllers.DatasetController.getOrganizationForDataset(datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/health""", """controllers.DatasetController.health(organizationName:String, datasetName:String, sharingToken:Option[String])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.DatasetController.update(organizationName:String, datasetName:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/updatePartial""", """controllers.DatasetController.updatePartial(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/accessList""", """controllers.DatasetController.accessList(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/sharingToken""", """controllers.DatasetController.getSharingToken(organizationName:String, datasetName:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/sharingToken""", """controllers.DatasetController.deleteSharingToken(organizationName:String, datasetName:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/teams""", """controllers.DatasetController.updateTeams(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/layers/""" + "$" + """layer<[^/]+>/thumbnail""", """controllers.DatasetController.thumbnail(organizationName:String, datasetName:String, layer:String, w:Option[Int], h:Option[Int], mappingName:Option[String], sharingToken:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/layers/""" + "$" + """layer<[^/]+>/segmentAnythingEmbedding""", """controllers.DatasetController.segmentAnythingEmbedding(organizationName:String, datasetName:String, layer:String, intensityMin:Option[Float], intensityMax:Option[Float])"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/clearThumbnailCache""", """controllers.DatasetController.removeFromThumbnailCache(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/isValidNewName""", """controllers.DatasetController.isValidNewName(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.DatasetController.read(organizationName:String, datasetName:String, sharingToken:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/root""", """controllers.FolderController.getRoot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/tree""", """controllers.FolderController.getTree()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/create""", """controllers.FolderController.create(parentId:String, name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/""" + "$" + """id<[^/]+>""", """controllers.FolderController.get(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/""" + "$" + """id<[^/]+>""", """controllers.FolderController.update(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/""" + "$" + """id<[^/]+>/move""", """controllers.FolderController.move(id:String, newParentId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """folders/""" + "$" + """id<[^/]+>""", """controllers.FolderController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores""", """controllers.DataStoreController.list()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/datasource""", """controllers.WKRemoteDataStoreController.updateOne(name:String, key:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/datasources""", """controllers.WKRemoteDataStoreController.updateAll(name:String, key:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/status""", """controllers.WKRemoteDataStoreController.statusUpdate(name:String, key:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/reserveUpload""", """controllers.WKRemoteDataStoreController.reserveDatasetUpload(name:String, key:String, token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/reportDatasetUpload""", """controllers.WKRemoteDataStoreController.reportDatasetUpload(name:String, key:String, token:String, datasetName:String, datasetSizeBytes:Long, needsConversion:Boolean, viaAddRoute:Boolean)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/deleteDataset""", """controllers.WKRemoteDataStoreController.deleteDataset(name:String, key:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/jobExportProperties""", """controllers.WKRemoteDataStoreController.jobExportProperties(name:String, key:String, jobId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/findCredential""", """controllers.WKRemoteDataStoreController.findCredential(name:String, key:String, credentialId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>/validateUserAccess""", """controllers.UserTokenController.validateAccessViaDatastore(name:String, key:String, token:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores""", """controllers.DataStoreController.create()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>""", """controllers.DataStoreController.delete(name:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datastores/""" + "$" + """name<[^/]+>""", """controllers.DataStoreController.update(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstore""", """controllers.TracingStoreController.listOne()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstores/""" + "$" + """name<[^/]+>/handleTracingUpdateReport""", """controllers.WKRemoteTracingStoreController.handleTracingUpdateReport(name:String, key:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstores/""" + "$" + """name<[^/]+>/validateUserAccess""", """controllers.UserTokenController.validateAccessViaTracingstore(name:String, key:String, token:Option[String])"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstores/""" + "$" + """name<[^/]+>""", """controllers.TracingStoreController.update(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstores/""" + "$" + """name<[^/]+>/dataSource""", """controllers.WKRemoteTracingStoreController.dataSourceForTracing(name:String, key:String, tracingId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstores/""" + "$" + """name<[^/]+>/dataSourceId""", """controllers.WKRemoteTracingStoreController.dataSourceIdForTracing(name:String, key:String, tracingId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracingstores/""" + "$" + """name<[^/]+>/dataStoreUri/""" + "$" + """datasetName<[^/]+>""", """controllers.WKRemoteTracingStoreController.dataStoreUriForDataset(name:String, key:String, organizationName:Option[String], datasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userToken/generate""", """controllers.UserTokenController.generateTokenForDataStore()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/upload""", """controllers.AnnotationIOController.upload()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""", """controllers.AnnotationController.duplicate(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""", """controllers.AnnotationController.editAnnotation(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/editLayer/""" + "$" + """tracingId<[^/]+>""", """controllers.AnnotationController.editAnnotationLayer(typ:String, id:String, tracingId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""", """controllers.AnnotationController.finish(typ:String, id:String, timestamp:Long)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/finish""", """controllers.AnnotationController.finishAll(typ:String, timestamp:Long)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""", """controllers.AnnotationController.reopen(typ:String, id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""", """controllers.AnnotationController.reset(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/transfer""", """controllers.AnnotationController.transfer(typ:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/info""", """controllers.AnnotationController.infoWithoutType(id:String, timestamp:Long)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/makeHybrid""", """controllers.AnnotationController.makeHybridWithoutType(id:String, fallbackLayerName:Option[String])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/downsample""", """controllers.AnnotationController.downsampleWithoutType(id:String, tracingId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/addAnnotationLayer""", """controllers.AnnotationController.addAnnotationLayerWithoutType(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/deleteAnnotationLayer""", """controllers.AnnotationController.deleteAnnotationLayerWithoutType(id:String, layerName:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>""", """controllers.AnnotationController.cancelWithoutType(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""", """controllers.AnnotationController.mergeWithoutType(id:String, mergedTyp:String, mergedId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/download""", """controllers.AnnotationIOController.downloadWithoutType(id:String, skeletonVersion:Option[Long], volumeVersion:Option[Long], skipVolumeData:Option[Boolean], volumeDataZipFormat:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/acquireMutex""", """controllers.AnnotationController.tryAcquiringAnnotationMutex(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """id<[^/]+>/addSegmentIndex""", """controllers.AnnotationController.addSegmentIndex(id:String, tracingId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/addSegmentIndicesToAll""", """controllers.AnnotationController.addSegmentIndicesToAll(parallelBatchCount:Int, dryRun:Boolean, skipTracings:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""", """controllers.AnnotationController.info(typ:String, id:String, timestamp:Long)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/makeHybrid""", """controllers.AnnotationController.makeHybrid(typ:String, id:String, fallbackLayerName:Option[String])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/downsample""", """controllers.AnnotationController.downsample(typ:String, id:String, tracingId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/addAnnotationLayer""", """controllers.AnnotationController.addAnnotationLayer(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/deleteAnnotationLayer""", """controllers.AnnotationController.deleteAnnotationLayer(typ:String, id:String, layerName:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.AnnotationController.cancel(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""", """controllers.AnnotationController.merge(typ:String, id:String, mergedTyp:String, mergedId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/download""", """controllers.AnnotationIOController.download(typ:String, id:String, skeletonVersion:Option[Long], volumeVersion:Option[Long], skipVolumeData:Option[Boolean], volumeDataZipFormat:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/source/""" + "$" + """accessTokenOrId<[^/]+>""", """controllers.AnnotationPrivateLinkController.annotationSource(accessTokenOrId:String, userToken:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/readable""", """controllers.AnnotationController.listExplorationals(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/sharedTeams""", """controllers.AnnotationController.getSharedTeams(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/sharedTeams""", """controllers.AnnotationController.updateSharedTeams(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/othersMayEdit""", """controllers.AnnotationController.updateOthersMayEdit(typ:String, id:String, othersMayEdit:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zarrPrivateLinks""", """controllers.AnnotationPrivateLinkController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zarrPrivateLinks/byAnnotation/""" + "$" + """annotationId<[^/]+>""", """controllers.AnnotationPrivateLinkController.listByAnnotation(annotationId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zarrPrivateLinks""", """controllers.AnnotationPrivateLinkController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zarrPrivateLinks/""" + "$" + """id<[^/]+>""", """controllers.AnnotationPrivateLinkController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zarrPrivateLinks/""" + "$" + """id<[^/]+>""", """controllers.AnnotationPrivateLinkController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zarrPrivateLinks/""" + "$" + """id<[^/]+>""", """controllers.AnnotationPrivateLinkController.get(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meshes""", """controllers.MeshController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meshes/""" + "$" + """id<[^/]+>""", """controllers.MeshController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meshes/""" + "$" + """id<[^/]+>""", """controllers.MeshController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meshes/""" + "$" + """id<[^/]+>""", """controllers.MeshController.get(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meshes/""" + "$" + """id<[^/]+>/data""", """controllers.MeshController.updateData(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meshes/""" + "$" + """id<[^/]+>/data""", """controllers.MeshController.getData(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.TaskController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/createFromFiles""", """controllers.TaskController.createFromFiles()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/list""", """controllers.TaskController.listTasks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/experienceDomains""", """controllers.TaskController.listExperienceDomains()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/""" + "$" + """id<[^/]+>""", """controllers.TaskController.read(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/""" + "$" + """id<[^/]+>""", """controllers.TaskController.delete(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/""" + "$" + """id<[^/]+>""", """controllers.TaskController.update(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/""" + "$" + """id<[^/]+>/assign""", """controllers.TaskController.assignOne(id:String, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/""" + "$" + """id<[^/]+>/annotations""", """controllers.AnnotationController.annotationsForTask(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes""", """controllers.TaskTypeController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes""", """controllers.TaskTypeController.create()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes/""" + "$" + """id<[^/]+>""", """controllers.TaskTypeController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes/""" + "$" + """id<[^/]+>/tasks""", """controllers.TaskController.listTasksForType(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes/""" + "$" + """id<[^/]+>/projects""", """controllers.ProjectController.projectsForTaskType(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes/""" + "$" + """id<[^/]+>""", """controllers.TaskTypeController.get(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskTypes/""" + "$" + """id<[^/]+>""", """controllers.TaskTypeController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scripts""", """controllers.ScriptController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scripts""", """controllers.ScriptController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scripts/""" + "$" + """id<[^/]+>""", """controllers.ScriptController.get(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scripts/""" + "$" + """id<[^/]+>""", """controllers.ScriptController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scripts/""" + "$" + """id<[^/]+>""", """controllers.ScriptController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/withStatus""", """controllers.ProjectController.listWithStatus()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/byName/""" + "$" + """name<[^/]+>""", """controllers.ProjectController.readByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.read(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.delete(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>/tasks""", """controllers.ProjectController.tasksForProject(id:String, limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>/incrementEachTasksInstances""", """controllers.ProjectController.incrementEachTasksInstances(id:String, delta:Option[Long])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>/pause""", """controllers.ProjectController.pause(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>/resume""", """controllers.ProjectController.resume(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>/usersWithActiveTasks""", """controllers.ProjectController.usersWithActiveTasks(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """id<[^/]+>/transferActiveTasks""", """controllers.ProjectController.transferActiveTasks(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations""", """controllers.OrganizationController.list(compact:Option[Boolean])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations""", """controllers.OrganizationController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations/byInvite/""" + "$" + """inviteToken<[^/]+>""", """controllers.OrganizationController.getByInvite(inviteToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations/default""", """controllers.OrganizationController.getDefault()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizationsIsEmpty""", """controllers.OrganizationController.organizationsIsEmpty()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations/""" + "$" + """organizationName<[^/]+>""", """controllers.OrganizationController.get(organizationName:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations/""" + "$" + """organizationName<[^/]+>""", """controllers.OrganizationController.update(organizationName:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations/""" + "$" + """organizationName<[^/]+>""", """controllers.OrganizationController.delete(organizationName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organizations/""" + "$" + """organizationName<[^/]+>/addUser""", """controllers.OrganizationController.addUser(organizationName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """operatorData""", """controllers.OrganizationController.getOperatorData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pricing/requestExtension""", """controllers.OrganizationController.sendExtendPricingPlanEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pricing/requestUpgrade""", """controllers.OrganizationController.sendUpgradePricingPlanEmail(requestedPlan:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pricing/requestUsers""", """controllers.OrganizationController.sendUpgradePricingPlanUsersEmail(requestedUsers:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pricing/requestStorage""", """controllers.OrganizationController.sendUpgradePricingPlanStorageEmail(requestedStorage:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pricing/status""", """controllers.OrganizationController.pricingStatus()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsOfService""", """controllers.OrganizationController.getTermsOfService()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsOfService/accept""", """controllers.OrganizationController.acceptTermsOfService(version:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsOfService/acceptanceNeeded""", """controllers.OrganizationController.termsOfServiceAcceptanceNeeded()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """time/user/""" + "$" + """userId<[^/]+>/spans""", """controllers.TimeController.timeSpansOfUser(userId:String, start:Long, end:Long, annotationTypes:String, annotationStates:String, projectIds:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """time/user/""" + "$" + """userId<[^/]+>/summedByAnnotation""", """controllers.TimeController.timeSummedByAnnotationForUser(userId:String, start:Long, end:Long, annotationTypes:String, annotationStates:String, projectIds:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """time/overview""", """controllers.TimeController.timeOverview(start:Long, end:Long, annotationTypes:String, annotationStates:String, teamIds:Option[String], projectIds:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/request""", """controllers.WKRemoteWorkerController.requestJobs(key:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs""", """controllers.JobsController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/status""", """controllers.JobsController.status()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/convertToWkw/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runConvertToWkwJob(organizationName:String, datasetName:String, scale:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/computeMeshFile/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runComputeMeshFileJob(organizationName:String, datasetName:String, layerName:String, mag:String, agglomerateView:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/computeSegmentIndexFile/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runComputeSegmentIndexFileJob(organizationName:String, datasetName:String, layerName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/exportTiff/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runExportTiffJob(organizationName:String, datasetName:String, bbox:String, layerName:Option[String], mag:Option[String], annotationLayerName:Option[String], annotationId:Option[String], asOmeTiff:Boolean)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/inferNuclei/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runInferNucleiJob(organizationName:String, datasetName:String, layerName:String, newDatasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/inferNeurons/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runInferNeuronsJob(organizationName:String, datasetName:String, layerName:String, bbox:String, outputSegmentationLayerName:String, newDatasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/inferMitochondria/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runInferMitochondriaJob(organizationName:String, datasetName:String, layerName:String, bbox:String, outputSegmentationLayerName:String, newDatasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/materializeVolumeAnnotation/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runMaterializeVolumeAnnotationJob(organizationName:String, datasetName:String, fallbackLayerName:String, annotationId:String, annotationType:String, newDatasetName:String, outputSegmentationLayerName:String, mergeSegments:Boolean, volumeLayerName:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/findLargestSegmentId/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runFindLargestSegmentIdJob(organizationName:String, datasetName:String, layerName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/run/renderAnimation/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""", """controllers.JobsController.runRenderAnimationJob(organizationName:String, datasetName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>""", """controllers.JobsController.get(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>/cancel""", """controllers.JobsController.cancel(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>/status""", """controllers.WKRemoteWorkerController.updateJobStatus(key:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>/export""", """controllers.JobsController.redirectToExport(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publications""", """controllers.PublicationController.listPublications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publications/""" + "$" + """id<[^/]+>""", """controllers.PublicationController.read(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shortLinks""", """controllers.ShortLinkController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shortLinks/byKey/""" + "$" + """key<[^/]+>""", """controllers.ShortLinkController.getByKey(key:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """credentials/httpBasicAuth""", """controllers.CredentialController.createHttpBasicAuthCredential()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """credentials/s3AccessKey""", """controllers.CredentialController.createS3AccessKeyCredential()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """credentials/googleServiceAccount""", """controllers.CredentialController.createGoogleServiceAccountCredential()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """verifyEmail/""" + "$" + """key<[^/]+>""", """controllers.EmailVerificationController.verify(key:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """verifyEmail""", """controllers.EmailVerificationController.requestVerificationMail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/workflows""", """controllers.VoxelyticsController.storeWorkflow()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/workflows""", """controllers.VoxelyticsController.listWorkflows()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>""", """controllers.VoxelyticsController.getWorkflow(workflowHash:String, runId:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>/events""", """controllers.VoxelyticsController.storeWorkflowEvents(workflowHash:String, runName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>/chunkStatistics""", """controllers.VoxelyticsController.getChunkStatistics(workflowHash:String, runId:Option[String], taskName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>/artifactChecksums""", """controllers.VoxelyticsController.getArtifactChecksums(workflowHash:String, runId:Option[String], taskName:String, artifactName:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/logs""", """controllers.VoxelyticsController.appendLogs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voxelytics/logs""", """controllers.VoxelyticsController.getLogs(runId:String, taskName:Option[String], minLevel:Option[String], startTimestamp:Long, endTimestamp:Long, limit:Option[Int])"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_Application_buildInfo0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buildinfo")))
  )
  private[this] lazy val controllers_Application_buildInfo0_invoker = createInvoker(
    Application_20.buildInfo(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.Application",
      "buildInfo",
      Nil,
      "GET",
      this.prefix + """buildinfo""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_Application_features1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("features")))
  )
  private[this] lazy val controllers_Application_features1_invoker = createInvoker(
    Application_20.features(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.Application",
      "features",
      Nil,
      "GET",
      this.prefix + """features""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Application_health2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("health")))
  )
  private[this] lazy val controllers_Application_health2_invoker = createInvoker(
    Application_20.health(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.Application",
      "health",
      Nil,
      "GET",
      this.prefix + """health""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AnalyticsController_ingestAnalyticsEvents3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("analytics/ingest")))
  )
  private[this] lazy val controllers_AnalyticsController_ingestAnalyticsEvents3_invoker = createInvoker(
    AnalyticsController_12.ingestAnalyticsEvents,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnalyticsController",
      "ingestAnalyticsEvents",
      Nil,
      "POST",
      this.prefix + """analytics/ingest""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AnalyticsController_trackAnalyticsEvent4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("analytics/"), DynamicPart("eventType", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnalyticsController_trackAnalyticsEvent4_invoker = createInvoker(
    AnalyticsController_12.trackAnalyticsEvent(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnalyticsController",
      "trackAnalyticsEvent",
      Seq(classOf[String]),
      "POST",
      this.prefix + """analytics/""" + "$" + """eventType<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_helpEmail5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helpEmail")))
  )
  private[this] lazy val controllers_Application_helpEmail5_invoker = createInvoker(
    Application_20.helpEmail(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.Application",
      "helpEmail",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """helpEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_InitialDataController_triggerInsert6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("triggers/initialData")))
  )
  private[this] lazy val controllers_InitialDataController_triggerInsert6_invoker = createInvoker(
    InitialDataController_21.triggerInsert(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.InitialDataController",
      "triggerInsert",
      Nil,
      "POST",
      this.prefix + """triggers/initialData""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MaintenanceController_listCurrentAndUpcoming7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances/listCurrentAndUpcoming")))
  )
  private[this] lazy val controllers_MaintenanceController_listCurrentAndUpcoming7_invoker = createInvoker(
    MaintenanceController_11.listCurrentAndUpcoming(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "listCurrentAndUpcoming",
      Nil,
      "GET",
      this.prefix + """maintenances/listCurrentAndUpcoming""",
      """ Maintenance""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MaintenanceController_listAll8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances/listAll")))
  )
  private[this] lazy val controllers_MaintenanceController_listAll8_invoker = createInvoker(
    MaintenanceController_11.listAll(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "listAll",
      Nil,
      "GET",
      this.prefix + """maintenances/listAll""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MaintenanceController_create9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances")))
  )
  private[this] lazy val controllers_MaintenanceController_create9_invoker = createInvoker(
    MaintenanceController_11.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "create",
      Nil,
      "POST",
      this.prefix + """maintenances""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MaintenanceController_readOne10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceController_readOne10_invoker = createInvoker(
    MaintenanceController_11.readOne(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "readOne",
      Seq(classOf[String]),
      "GET",
      this.prefix + """maintenances/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MaintenanceController_update11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceController_update11_invoker = createInvoker(
    MaintenanceController_11.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """maintenances/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MaintenanceController_delete12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceController_delete12_invoker = createInvoker(
    MaintenanceController_11.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """maintenances/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MaintenanceController_create13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances")))
  )
  private[this] lazy val controllers_MaintenanceController_create13_invoker = createInvoker(
    MaintenanceController_11.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "create",
      Nil,
      "POST",
      this.prefix + """maintenances""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_MaintenanceController_createAdHocMaintenance14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenances/adHoc")))
  )
  private[this] lazy val controllers_MaintenanceController_createAdHocMaintenance14_invoker = createInvoker(
    MaintenanceController_11.createAdHocMaintenance(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MaintenanceController",
      "createAdHocMaintenance",
      Nil,
      "POST",
      this.prefix + """maintenances/adHoc""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AuthenticationController_register15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/register")))
  )
  private[this] lazy val controllers_AuthenticationController_register15_invoker = createInvoker(
    AuthenticationController_1.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "register",
      Nil,
      "POST",
      this.prefix + """auth/register""",
      """ Authentication""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AuthenticationController_joinOrganization16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/joinOrganization/"), DynamicPart("inviteToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthenticationController_joinOrganization16_invoker = createInvoker(
    AuthenticationController_1.joinOrganization(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "joinOrganization",
      Seq(classOf[String]),
      "POST",
      this.prefix + """auth/joinOrganization/""" + "$" + """inviteToken<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AuthenticationController_authenticate17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/login")))
  )
  private[this] lazy val controllers_AuthenticationController_authenticate17_invoker = createInvoker(
    AuthenticationController_1.authenticate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "authenticate",
      Nil,
      "POST",
      this.prefix + """auth/login""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AuthenticationController_getToken18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/token")))
  )
  private[this] lazy val controllers_AuthenticationController_getToken18_invoker = createInvoker(
    AuthenticationController_1.getToken(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "getToken",
      Nil,
      "GET",
      this.prefix + """auth/token""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AuthenticationController_deleteToken19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/token")))
  )
  private[this] lazy val controllers_AuthenticationController_deleteToken19_invoker = createInvoker(
    AuthenticationController_1.deleteToken(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "deleteToken",
      Nil,
      "DELETE",
      this.prefix + """auth/token""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AuthenticationController_switchMultiUser20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/switch")))
  )
  private[this] lazy val controllers_AuthenticationController_switchMultiUser20_invoker = createInvoker(
    AuthenticationController_1.switchMultiUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "switchMultiUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """auth/switch""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AuthenticationController_switchOrganization21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/switchOrganization/"), DynamicPart("organizationName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthenticationController_switchOrganization21_invoker = createInvoker(
    AuthenticationController_1.switchOrganization(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "switchOrganization",
      Seq(classOf[String]),
      "POST",
      this.prefix + """auth/switchOrganization/""" + "$" + """organizationName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AuthenticationController_accessibleBySwitching22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/accessibleBySwitching")))
  )
  private[this] lazy val controllers_AuthenticationController_accessibleBySwitching22_invoker = createInvoker(
    AuthenticationController_1.accessibleBySwitching(fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "accessibleBySwitching",
      Seq(classOf[Option[String]], classOf[Option[String]], classOf[Option[String]], classOf[Option[String]]),
      "GET",
      this.prefix + """auth/accessibleBySwitching""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AuthenticationController_sendInvites23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/sendInvites")))
  )
  private[this] lazy val controllers_AuthenticationController_sendInvites23_invoker = createInvoker(
    AuthenticationController_1.sendInvites(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "sendInvites",
      Nil,
      "POST",
      this.prefix + """auth/sendInvites""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AuthenticationController_handleStartResetPassword24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/startResetPassword")))
  )
  private[this] lazy val controllers_AuthenticationController_handleStartResetPassword24_invoker = createInvoker(
    AuthenticationController_1.handleStartResetPassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "handleStartResetPassword",
      Nil,
      "POST",
      this.prefix + """auth/startResetPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_AuthenticationController_changePassword25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/changePassword")))
  )
  private[this] lazy val controllers_AuthenticationController_changePassword25_invoker = createInvoker(
    AuthenticationController_1.changePassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "changePassword",
      Nil,
      "POST",
      this.prefix + """auth/changePassword""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AuthenticationController_handleResetPassword26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/resetPassword")))
  )
  private[this] lazy val controllers_AuthenticationController_handleResetPassword26_invoker = createInvoker(
    AuthenticationController_1.handleResetPassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "handleResetPassword",
      Nil,
      "POST",
      this.prefix + """auth/resetPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AuthenticationController_logout27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/logout")))
  )
  private[this] lazy val controllers_AuthenticationController_logout27_invoker = createInvoker(
    AuthenticationController_1.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "logout",
      Nil,
      "GET",
      this.prefix + """auth/logout""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_AuthenticationController_singleSignOn28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/sso")))
  )
  private[this] lazy val controllers_AuthenticationController_singleSignOn28_invoker = createInvoker(
    AuthenticationController_1.singleSignOn(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "singleSignOn",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """auth/sso""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AuthenticationController_loginViaOpenIdConnect29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/oidc/login")))
  )
  private[this] lazy val controllers_AuthenticationController_loginViaOpenIdConnect29_invoker = createInvoker(
    AuthenticationController_1.loginViaOpenIdConnect(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "loginViaOpenIdConnect",
      Nil,
      "GET",
      this.prefix + """auth/oidc/login""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AuthenticationController_openIdCallback30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/oidc/callback")))
  )
  private[this] lazy val controllers_AuthenticationController_openIdCallback30_invoker = createInvoker(
    AuthenticationController_1.openIdCallback(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "openIdCallback",
      Nil,
      "GET",
      this.prefix + """auth/oidc/callback""",
      """ /auth/oidc/callback route is used literally in code""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AuthenticationController_createOrganizationWithAdmin31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/createOrganizationWithAdmin")))
  )
  private[this] lazy val controllers_AuthenticationController_createOrganizationWithAdmin31_invoker = createInvoker(
    AuthenticationController_1.createOrganizationWithAdmin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "createOrganizationWithAdmin",
      Nil,
      "POST",
      this.prefix + """auth/createOrganizationWithAdmin""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AuthenticationController_createUserInOrganization32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/createUserInOrganization/"), DynamicPart("organizationName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthenticationController_createUserInOrganization32_invoker = createInvoker(
    AuthenticationController_1.createUserInOrganization(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AuthenticationController",
      "createUserInOrganization",
      Seq(classOf[String]),
      "POST",
      this.prefix + """auth/createUserInOrganization/""" + "$" + """organizationName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ConfigurationController_read33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userConfiguration")))
  )
  private[this] lazy val controllers_ConfigurationController_read33_invoker = createInvoker(
    ConfigurationController_3.read(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ConfigurationController",
      "read",
      Nil,
      "GET",
      this.prefix + """user/userConfiguration""",
      """ Configurations""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ConfigurationController_update34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userConfiguration")))
  )
  private[this] lazy val controllers_ConfigurationController_update34_invoker = createInvoker(
    ConfigurationController_3.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ConfigurationController",
      "update",
      Nil,
      "PUT",
      this.prefix + """user/userConfiguration""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ConfigurationController_readDatasetViewConfiguration35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasetConfigurations/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConfigurationController_readDatasetViewConfiguration35_invoker = createInvoker(
    ConfigurationController_3.readDatasetViewConfiguration(fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ConfigurationController",
      "readDatasetViewConfiguration",
      Seq(classOf[String], classOf[String], classOf[Option[String]]),
      "POST",
      this.prefix + """datasetConfigurations/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ConfigurationController_updateDatasetViewConfiguration36_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasetConfigurations/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConfigurationController_updateDatasetViewConfiguration36_invoker = createInvoker(
    ConfigurationController_3.updateDatasetViewConfiguration(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ConfigurationController",
      "updateDatasetViewConfiguration",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """datasetConfigurations/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ConfigurationController_readDatasetAdminViewConfiguration37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasetConfigurations/default/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConfigurationController_readDatasetAdminViewConfiguration37_invoker = createInvoker(
    ConfigurationController_3.readDatasetAdminViewConfiguration(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ConfigurationController",
      "readDatasetAdminViewConfiguration",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """datasetConfigurations/default/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ConfigurationController_updateDatasetAdminViewConfiguration38_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasetConfigurations/default/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConfigurationController_updateDatasetAdminViewConfiguration38_invoker = createInvoker(
    ConfigurationController_3.updateDatasetAdminViewConfiguration(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ConfigurationController",
      "updateDatasetAdminViewConfiguration",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """datasetConfigurations/default/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_TaskController_request39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/tasks/request")))
  )
  private[this] lazy val controllers_TaskController_request39_invoker = createInvoker(
    TaskController_32.request(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "request",
      Nil,
      "POST",
      this.prefix + """user/tasks/request""",
      """ Users""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_TaskController_peekNext40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/tasks/peek")))
  )
  private[this] lazy val controllers_TaskController_peekNext40_invoker = createInvoker(
    TaskController_32.peekNext(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "peekNext",
      Nil,
      "GET",
      this.prefix + """user/tasks/peek""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UserController_list41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_list41_invoker = createInvoker(
    UserController_24.list(fakeValue[Option[Boolean]], fakeValue[Option[Boolean]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "list",
      Seq(classOf[Option[Boolean]], classOf[Option[Boolean]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_UserController_current42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_current42_invoker = createInvoker(
    UserController_24.current(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "current",
      Nil,
      "GET",
      this.prefix + """user""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_UserController_tasks43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/tasks")))
  )
  private[this] lazy val controllers_UserController_tasks43_invoker = createInvoker(
    UserController_24.tasks(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "tasks",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """user/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_UserController_annotations44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/annotations")))
  )
  private[this] lazy val controllers_UserController_annotations44_invoker = createInvoker(
    UserController_24.annotations(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "annotations",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """user/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_UserController_user45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_user45_invoker = createInvoker(
    UserController_24.user(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "user",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_UserController_update46_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update46_invoker = createInvoker(
    UserController_24.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """users/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_UserController_updateLastTaskTypeId47_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/taskTypeId")))
  )
  private[this] lazy val controllers_UserController_updateLastTaskTypeId47_invoker = createInvoker(
    UserController_24.updateLastTaskTypeId(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "updateLastTaskTypeId",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """users/""" + "$" + """id<[^/]+>/taskTypeId""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_UserController_updateNovelUserExperienceInfos48_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/novelUserExperienceInfos")))
  )
  private[this] lazy val controllers_UserController_updateNovelUserExperienceInfos48_invoker = createInvoker(
    UserController_24.updateNovelUserExperienceInfos(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "updateNovelUserExperienceInfos",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """users/""" + "$" + """id<[^/]+>/novelUserExperienceInfos""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_UserController_updateSelectedTheme49_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/selectedTheme")))
  )
  private[this] lazy val controllers_UserController_updateSelectedTheme49_invoker = createInvoker(
    UserController_24.updateSelectedTheme(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "updateSelectedTheme",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """users/""" + "$" + """id<[^/]+>/selectedTheme""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_UserController_userTasks50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_UserController_userTasks50_invoker = createInvoker(
    UserController_24.userTasks(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "userTasks",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """users/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_UserController_userAnnotations51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_UserController_userAnnotations51_invoker = createInvoker(
    UserController_24.userAnnotations(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserController",
      "userAnnotations",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """users/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_TimeController_userLoggedTime52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/loggedTime")))
  )
  private[this] lazy val controllers_TimeController_userLoggedTime52_invoker = createInvoker(
    TimeController_23.userLoggedTime(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TimeController",
      "userLoggedTime",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """id<[^/]+>/loggedTime""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_TeamController_list53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams")))
  )
  private[this] lazy val controllers_TeamController_list53_invoker = createInvoker(
    TeamController_31.list(fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TeamController",
      "list",
      Seq(classOf[Option[Boolean]]),
      "GET",
      this.prefix + """teams""",
      """ Team""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_TeamController_create54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams")))
  )
  private[this] lazy val controllers_TeamController_create54_invoker = createInvoker(
    TeamController_31.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TeamController",
      "create",
      Nil,
      "POST",
      this.prefix + """teams""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_TeamController_delete55_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TeamController_delete55_invoker = createInvoker(
    TeamController_31.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TeamController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """teams/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_ReportController_availableTasksReport56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams/"), DynamicPart("id", """[^/]+""",true), StaticPart("/availableTasksReport")))
  )
  private[this] lazy val controllers_ReportController_availableTasksReport56_invoker = createInvoker(
    ReportController_14.availableTasksReport(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ReportController",
      "availableTasksReport",
      Seq(classOf[String]),
      "GET",
      this.prefix + """teams/""" + "$" + """id<[^/]+>/availableTasksReport""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_ReportController_projectProgressReport57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams/"), DynamicPart("id", """[^/]+""",true), StaticPart("/projectProgressReport")))
  )
  private[this] lazy val controllers_ReportController_projectProgressReport57_invoker = createInvoker(
    ReportController_14.projectProgressReport(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ReportController",
      "projectProgressReport",
      Seq(classOf[String]),
      "GET",
      this.prefix + """teams/""" + "$" + """id<[^/]+>/projectProgressReport""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_AnnotationController_createExplorational58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/createExplorational")))
  )
  private[this] lazy val controllers_AnnotationController_createExplorational58_invoker = createInvoker(
    AnnotationController_26.createExplorational(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "createExplorational",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""",
      """ Datasets""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_AnnotationController_getSandbox59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/sandbox/"), DynamicPart("typ", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationController_getSandbox59_invoker = createInvoker(
    AnnotationController_26.getSandbox(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "getSandbox",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/sandbox/""" + "$" + """typ<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_DatasetController_list60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets")))
  )
  private[this] lazy val controllers_DatasetController_list60_invoker = createInvoker(
    DatasetController_22.list(fakeValue[Option[Boolean]], fakeValue[Option[Boolean]], fakeValue[Option[String]], fakeValue[Option[Boolean]], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[Boolean]], fakeValue[Option[String]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "list",
      Seq(classOf[Option[Boolean]], classOf[Option[Boolean]], classOf[Option[String]], classOf[Option[Boolean]], classOf[Option[String]], classOf[Option[String]], classOf[Option[Boolean]], classOf[Option[String]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """datasets""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_DatasetController_create61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets")))
  )
  private[this] lazy val controllers_DatasetController_create61_invoker = createInvoker(
    DatasetController_22.create(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "create",
      Seq(classOf[String]),
      "POST",
      this.prefix + """datasets""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_DatasetController_exploreRemoteDataset62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/exploreRemote")))
  )
  private[this] lazy val controllers_DatasetController_exploreRemoteDataset62_invoker = createInvoker(
    DatasetController_22.exploreRemoteDataset(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "exploreRemoteDataset",
      Nil,
      "POST",
      this.prefix + """datasets/exploreRemote""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_DatasetController_exploreAndAddRemoteDataset63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/exploreAndAddRemote")))
  )
  private[this] lazy val controllers_DatasetController_exploreAndAddRemoteDataset63_invoker = createInvoker(
    DatasetController_22.exploreAndAddRemoteDataset(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "exploreAndAddRemoteDataset",
      Nil,
      "POST",
      this.prefix + """datasets/exploreAndAddRemote""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_DatasetController_getOrganizationForDataset64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/disambiguate/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/toNew")))
  )
  private[this] lazy val controllers_DatasetController_getOrganizationForDataset64_invoker = createInvoker(
    DatasetController_22.getOrganizationForDataset(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "getOrganizationForDataset",
      Seq(classOf[String]),
      "GET",
      this.prefix + """datasets/disambiguate/""" + "$" + """datasetName<[^/]+>/toNew""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_DatasetController_health65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/health")))
  )
  private[this] lazy val controllers_DatasetController_health65_invoker = createInvoker(
    DatasetController_22.health(fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "health",
      Seq(classOf[String], classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/health""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_DatasetController_update66_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DatasetController_update66_invoker = createInvoker(
    DatasetController_22.update(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "update",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_DatasetController_updatePartial67_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/updatePartial")))
  )
  private[this] lazy val controllers_DatasetController_updatePartial67_invoker = createInvoker(
    DatasetController_22.updatePartial(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "updatePartial",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/updatePartial""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_DatasetController_accessList68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/accessList")))
  )
  private[this] lazy val controllers_DatasetController_accessList68_invoker = createInvoker(
    DatasetController_22.accessList(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "accessList",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/accessList""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_DatasetController_getSharingToken69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/sharingToken")))
  )
  private[this] lazy val controllers_DatasetController_getSharingToken69_invoker = createInvoker(
    DatasetController_22.getSharingToken(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "getSharingToken",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/sharingToken""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_DatasetController_deleteSharingToken70_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/sharingToken")))
  )
  private[this] lazy val controllers_DatasetController_deleteSharingToken70_invoker = createInvoker(
    DatasetController_22.deleteSharingToken(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "deleteSharingToken",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/sharingToken""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_DatasetController_updateTeams71_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/teams")))
  )
  private[this] lazy val controllers_DatasetController_updateTeams71_invoker = createInvoker(
    DatasetController_22.updateTeams(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "updateTeams",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/teams""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_DatasetController_thumbnail72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/layers/"), DynamicPart("layer", """[^/]+""",true), StaticPart("/thumbnail")))
  )
  private[this] lazy val controllers_DatasetController_thumbnail72_invoker = createInvoker(
    DatasetController_22.thumbnail(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[String]], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "thumbnail",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[String]], classOf[Option[String]]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/layers/""" + "$" + """layer<[^/]+>/thumbnail""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_DatasetController_segmentAnythingEmbedding73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/layers/"), DynamicPart("layer", """[^/]+""",true), StaticPart("/segmentAnythingEmbedding")))
  )
  private[this] lazy val controllers_DatasetController_segmentAnythingEmbedding73_invoker = createInvoker(
    DatasetController_22.segmentAnythingEmbedding(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Option[Float]], fakeValue[Option[Float]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "segmentAnythingEmbedding",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Option[Float]], classOf[Option[Float]]),
      "POST",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/layers/""" + "$" + """layer<[^/]+>/segmentAnythingEmbedding""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_DatasetController_removeFromThumbnailCache74_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/clearThumbnailCache")))
  )
  private[this] lazy val controllers_DatasetController_removeFromThumbnailCache74_invoker = createInvoker(
    DatasetController_22.removeFromThumbnailCache(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "removeFromThumbnailCache",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/clearThumbnailCache""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_DatasetController_isValidNewName75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/isValidNewName")))
  )
  private[this] lazy val controllers_DatasetController_isValidNewName75_invoker = createInvoker(
    DatasetController_22.isValidNewName(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "isValidNewName",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/isValidNewName""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_DatasetController_read76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DatasetController_read76_invoker = createInvoker(
    DatasetController_22.read(fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DatasetController",
      "read",
      Seq(classOf[String], classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_FolderController_getRoot77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/root")))
  )
  private[this] lazy val controllers_FolderController_getRoot77_invoker = createInvoker(
    FolderController_4.getRoot(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "getRoot",
      Nil,
      "GET",
      this.prefix + """folders/root""",
      """ Folders""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_FolderController_getTree78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/tree")))
  )
  private[this] lazy val controllers_FolderController_getTree78_invoker = createInvoker(
    FolderController_4.getTree(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "getTree",
      Nil,
      "GET",
      this.prefix + """folders/tree""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_FolderController_create79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/create")))
  )
  private[this] lazy val controllers_FolderController_create79_invoker = createInvoker(
    FolderController_4.create(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "create",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """folders/create""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_FolderController_get80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FolderController_get80_invoker = createInvoker(
    FolderController_4.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """folders/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_FolderController_update81_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FolderController_update81_invoker = createInvoker(
    FolderController_4.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """folders/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_FolderController_move82_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/"), DynamicPart("id", """[^/]+""",true), StaticPart("/move")))
  )
  private[this] lazy val controllers_FolderController_move82_invoker = createInvoker(
    FolderController_4.move(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "move",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """folders/""" + "$" + """id<[^/]+>/move""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_FolderController_delete83_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("folders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FolderController_delete83_invoker = createInvoker(
    FolderController_4.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.FolderController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """folders/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_DataStoreController_list84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores")))
  )
  private[this] lazy val controllers_DataStoreController_list84_invoker = createInvoker(
    DataStoreController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DataStoreController",
      "list",
      Nil,
      "GET",
      this.prefix + """datastores""",
      """ Datastores""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val controllers_WKRemoteDataStoreController_updateOne85_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/datasource")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_updateOne85_invoker = createInvoker(
    WKRemoteDataStoreController_7.updateOne(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "updateOne",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/datasource""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_WKRemoteDataStoreController_updateAll86_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/datasources")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_updateAll86_invoker = createInvoker(
    WKRemoteDataStoreController_7.updateAll(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "updateAll",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/datasources""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_WKRemoteDataStoreController_statusUpdate87_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/status")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_statusUpdate87_invoker = createInvoker(
    WKRemoteDataStoreController_7.statusUpdate(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "statusUpdate",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/status""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_WKRemoteDataStoreController_reserveDatasetUpload88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/reserveUpload")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_reserveDatasetUpload88_invoker = createInvoker(
    WKRemoteDataStoreController_7.reserveDatasetUpload(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "reserveDatasetUpload",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/reserveUpload""",
      """""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_WKRemoteDataStoreController_reportDatasetUpload89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/reportDatasetUpload")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_reportDatasetUpload89_invoker = createInvoker(
    WKRemoteDataStoreController_7.reportDatasetUpload(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Long], fakeValue[Boolean], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "reportDatasetUpload",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[Long], classOf[Boolean], classOf[Boolean]),
      "POST",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/reportDatasetUpload""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_WKRemoteDataStoreController_deleteDataset90_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/deleteDataset")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_deleteDataset90_invoker = createInvoker(
    WKRemoteDataStoreController_7.deleteDataset(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "deleteDataset",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/deleteDataset""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_WKRemoteDataStoreController_jobExportProperties91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/jobExportProperties")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_jobExportProperties91_invoker = createInvoker(
    WKRemoteDataStoreController_7.jobExportProperties(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "jobExportProperties",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/jobExportProperties""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_WKRemoteDataStoreController_findCredential92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/findCredential")))
  )
  private[this] lazy val controllers_WKRemoteDataStoreController_findCredential92_invoker = createInvoker(
    WKRemoteDataStoreController_7.findCredential(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteDataStoreController",
      "findCredential",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/findCredential""",
      """""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_UserTokenController_validateAccessViaDatastore93_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/validateUserAccess")))
  )
  private[this] lazy val controllers_UserTokenController_validateAccessViaDatastore93_invoker = createInvoker(
    UserTokenController_9.validateAccessViaDatastore(fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserTokenController",
      "validateAccessViaDatastore",
      Seq(classOf[String], classOf[String], classOf[Option[String]]),
      "POST",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>/validateUserAccess""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_DataStoreController_create94_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores")))
  )
  private[this] lazy val controllers_DataStoreController_create94_invoker = createInvoker(
    DataStoreController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DataStoreController",
      "create",
      Nil,
      "POST",
      this.prefix + """datastores""",
      """""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_DataStoreController_delete95_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DataStoreController_delete95_invoker = createInvoker(
    DataStoreController_2.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DataStoreController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:118
  private[this] lazy val controllers_DataStoreController_update96_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datastores/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DataStoreController_update96_invoker = createInvoker(
    DataStoreController_2.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.DataStoreController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """datastores/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_TracingStoreController_listOne97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstore")))
  )
  private[this] lazy val controllers_TracingStoreController_listOne97_invoker = createInvoker(
    TracingStoreController_25.listOne(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TracingStoreController",
      "listOne",
      Nil,
      "GET",
      this.prefix + """tracingstore""",
      """ Tracingstores""",
      Seq()
    )
  )

  // @LINE:122
  private[this] lazy val controllers_WKRemoteTracingStoreController_handleTracingUpdateReport98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/handleTracingUpdateReport")))
  )
  private[this] lazy val controllers_WKRemoteTracingStoreController_handleTracingUpdateReport98_invoker = createInvoker(
    WKRemoteTracingStoreController_28.handleTracingUpdateReport(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteTracingStoreController",
      "handleTracingUpdateReport",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """tracingstores/""" + "$" + """name<[^/]+>/handleTracingUpdateReport""",
      """""",
      Seq()
    )
  )

  // @LINE:123
  private[this] lazy val controllers_UserTokenController_validateAccessViaTracingstore99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/validateUserAccess")))
  )
  private[this] lazy val controllers_UserTokenController_validateAccessViaTracingstore99_invoker = createInvoker(
    UserTokenController_9.validateAccessViaTracingstore(fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserTokenController",
      "validateAccessViaTracingstore",
      Seq(classOf[String], classOf[String], classOf[Option[String]]),
      "POST",
      this.prefix + """tracingstores/""" + "$" + """name<[^/]+>/validateUserAccess""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_TracingStoreController_update100_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstores/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TracingStoreController_update100_invoker = createInvoker(
    TracingStoreController_25.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TracingStoreController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """tracingstores/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:125
  private[this] lazy val controllers_WKRemoteTracingStoreController_dataSourceForTracing101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/dataSource")))
  )
  private[this] lazy val controllers_WKRemoteTracingStoreController_dataSourceForTracing101_invoker = createInvoker(
    WKRemoteTracingStoreController_28.dataSourceForTracing(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteTracingStoreController",
      "dataSourceForTracing",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """tracingstores/""" + "$" + """name<[^/]+>/dataSource""",
      """""",
      Seq()
    )
  )

  // @LINE:126
  private[this] lazy val controllers_WKRemoteTracingStoreController_dataSourceIdForTracing102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/dataSourceId")))
  )
  private[this] lazy val controllers_WKRemoteTracingStoreController_dataSourceIdForTracing102_invoker = createInvoker(
    WKRemoteTracingStoreController_28.dataSourceIdForTracing(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteTracingStoreController",
      "dataSourceIdForTracing",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """tracingstores/""" + "$" + """name<[^/]+>/dataSourceId""",
      """""",
      Seq()
    )
  )

  // @LINE:127
  private[this] lazy val controllers_WKRemoteTracingStoreController_dataStoreUriForDataset103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracingstores/"), DynamicPart("name", """[^/]+""",true), StaticPart("/dataStoreUri/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WKRemoteTracingStoreController_dataStoreUriForDataset103_invoker = createInvoker(
    WKRemoteTracingStoreController_28.dataStoreUriForDataset(fakeValue[String], fakeValue[String], fakeValue[Option[String]], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteTracingStoreController",
      "dataStoreUriForDataset",
      Seq(classOf[String], classOf[String], classOf[Option[String]], classOf[String]),
      "GET",
      this.prefix + """tracingstores/""" + "$" + """name<[^/]+>/dataStoreUri/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_UserTokenController_generateTokenForDataStore104_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userToken/generate")))
  )
  private[this] lazy val controllers_UserTokenController_generateTokenForDataStore104_invoker = createInvoker(
    UserTokenController_9.generateTokenForDataStore(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.UserTokenController",
      "generateTokenForDataStore",
      Nil,
      "POST",
      this.prefix + """userToken/generate""",
      """ User access tokens for datastore authentication""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_AnnotationIOController_upload105_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/upload")))
  )
  private[this] lazy val controllers_AnnotationIOController_upload105_invoker = createInvoker(
    AnnotationIOController_19.upload(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationIOController",
      "upload",
      Nil,
      "POST",
      this.prefix + """annotations/upload""",
      """ Annotations""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_AnnotationController_duplicate106_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/duplicate")))
  )
  private[this] lazy val controllers_AnnotationController_duplicate106_invoker = createInvoker(
    AnnotationController_26.duplicate(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "duplicate",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""",
      """""",
      Seq()
    )
  )

  // @LINE:135
  private[this] lazy val controllers_AnnotationController_editAnnotation107_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_AnnotationController_editAnnotation107_invoker = createInvoker(
    AnnotationController_26.editAnnotation(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "editAnnotation",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_AnnotationController_editAnnotationLayer108_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/editLayer/"), DynamicPart("tracingId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationController_editAnnotationLayer108_invoker = createInvoker(
    AnnotationController_26.editAnnotationLayer(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "editAnnotationLayer",
      Seq(classOf[String], classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/editLayer/""" + "$" + """tracingId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:138
  private[this] lazy val controllers_AnnotationController_finish109_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/finish")))
  )
  private[this] lazy val controllers_AnnotationController_finish109_invoker = createInvoker(
    AnnotationController_26.finish(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "finish",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_AnnotationController_finishAll110_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/finish")))
  )
  private[this] lazy val controllers_AnnotationController_finishAll110_invoker = createInvoker(
    AnnotationController_26.finishAll(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "finishAll",
      Seq(classOf[String], classOf[Long]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/finish""",
      """""",
      Seq()
    )
  )

  // @LINE:140
  private[this] lazy val controllers_AnnotationController_reopen111_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reopen")))
  )
  private[this] lazy val controllers_AnnotationController_reopen111_invoker = createInvoker(
    AnnotationController_26.reopen(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "reopen",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""",
      """""",
      Seq()
    )
  )

  // @LINE:141
  private[this] lazy val controllers_AnnotationController_reset112_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reset")))
  )
  private[this] lazy val controllers_AnnotationController_reset112_invoker = createInvoker(
    AnnotationController_26.reset(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "reset",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""",
      """""",
      Seq()
    )
  )

  // @LINE:142
  private[this] lazy val controllers_AnnotationController_transfer113_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/transfer")))
  )
  private[this] lazy val controllers_AnnotationController_transfer113_invoker = createInvoker(
    AnnotationController_26.transfer(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "transfer",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/transfer""",
      """""",
      Seq()
    )
  )

  // @LINE:144
  private[this] lazy val controllers_AnnotationController_infoWithoutType114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_AnnotationController_infoWithoutType114_invoker = createInvoker(
    AnnotationController_26.infoWithoutType(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "infoWithoutType",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/info""",
      """""",
      Seq()
    )
  )

  // @LINE:145
  private[this] lazy val controllers_AnnotationController_makeHybridWithoutType115_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/makeHybrid")))
  )
  private[this] lazy val controllers_AnnotationController_makeHybridWithoutType115_invoker = createInvoker(
    AnnotationController_26.makeHybridWithoutType(fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "makeHybridWithoutType",
      Seq(classOf[String], classOf[Option[String]]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/makeHybrid""",
      """""",
      Seq()
    )
  )

  // @LINE:146
  private[this] lazy val controllers_AnnotationController_downsampleWithoutType116_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/downsample")))
  )
  private[this] lazy val controllers_AnnotationController_downsampleWithoutType116_invoker = createInvoker(
    AnnotationController_26.downsampleWithoutType(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "downsampleWithoutType",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/downsample""",
      """""",
      Seq()
    )
  )

  // @LINE:147
  private[this] lazy val controllers_AnnotationController_addAnnotationLayerWithoutType117_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/addAnnotationLayer")))
  )
  private[this] lazy val controllers_AnnotationController_addAnnotationLayerWithoutType117_invoker = createInvoker(
    AnnotationController_26.addAnnotationLayerWithoutType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "addAnnotationLayerWithoutType",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/addAnnotationLayer""",
      """""",
      Seq()
    )
  )

  // @LINE:148
  private[this] lazy val controllers_AnnotationController_deleteAnnotationLayerWithoutType118_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/deleteAnnotationLayer")))
  )
  private[this] lazy val controllers_AnnotationController_deleteAnnotationLayerWithoutType118_invoker = createInvoker(
    AnnotationController_26.deleteAnnotationLayerWithoutType(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "deleteAnnotationLayerWithoutType",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/deleteAnnotationLayer""",
      """""",
      Seq()
    )
  )

  // @LINE:149
  private[this] lazy val controllers_AnnotationController_cancelWithoutType119_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationController_cancelWithoutType119_invoker = createInvoker(
    AnnotationController_26.cancelWithoutType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "cancelWithoutType",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:150
  private[this] lazy val controllers_AnnotationController_mergeWithoutType120_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/merge/"), DynamicPart("mergedTyp", """[^/]+""",true), StaticPart("/"), DynamicPart("mergedId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationController_mergeWithoutType120_invoker = createInvoker(
    AnnotationController_26.mergeWithoutType(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "mergeWithoutType",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:151
  private[this] lazy val controllers_AnnotationIOController_downloadWithoutType121_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/download")))
  )
  private[this] lazy val controllers_AnnotationIOController_downloadWithoutType121_invoker = createInvoker(
    AnnotationIOController_19.downloadWithoutType(fakeValue[String], fakeValue[Option[Long]], fakeValue[Option[Long]], fakeValue[Option[Boolean]], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationIOController",
      "downloadWithoutType",
      Seq(classOf[String], classOf[Option[Long]], classOf[Option[Long]], classOf[Option[Boolean]], classOf[Option[String]]),
      "GET",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/download""",
      """""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_AnnotationController_tryAcquiringAnnotationMutex122_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/acquireMutex")))
  )
  private[this] lazy val controllers_AnnotationController_tryAcquiringAnnotationMutex122_invoker = createInvoker(
    AnnotationController_26.tryAcquiringAnnotationMutex(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "tryAcquiringAnnotationMutex",
      Seq(classOf[String]),
      "POST",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/acquireMutex""",
      """""",
      Seq()
    )
  )

  // @LINE:153
  private[this] lazy val controllers_AnnotationController_addSegmentIndex123_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/addSegmentIndex")))
  )
  private[this] lazy val controllers_AnnotationController_addSegmentIndex123_invoker = createInvoker(
    AnnotationController_26.addSegmentIndex(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "addSegmentIndex",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """id<[^/]+>/addSegmentIndex""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_AnnotationController_addSegmentIndicesToAll124_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/addSegmentIndicesToAll")))
  )
  private[this] lazy val controllers_AnnotationController_addSegmentIndicesToAll124_invoker = createInvoker(
    AnnotationController_26.addSegmentIndicesToAll(fakeValue[Int], fakeValue[Boolean], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "addSegmentIndicesToAll",
      Seq(classOf[Int], classOf[Boolean], classOf[Option[String]]),
      "PATCH",
      this.prefix + """annotations/addSegmentIndicesToAll""",
      """""",
      Seq()
    )
  )

  // @LINE:156
  private[this] lazy val controllers_AnnotationController_info125_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_AnnotationController_info125_invoker = createInvoker(
    AnnotationController_26.info(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "info",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "GET",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""",
      """""",
      Seq()
    )
  )

  // @LINE:157
  private[this] lazy val controllers_AnnotationController_makeHybrid126_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/makeHybrid")))
  )
  private[this] lazy val controllers_AnnotationController_makeHybrid126_invoker = createInvoker(
    AnnotationController_26.makeHybrid(fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "makeHybrid",
      Seq(classOf[String], classOf[String], classOf[Option[String]]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/makeHybrid""",
      """""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_AnnotationController_downsample127_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/downsample")))
  )
  private[this] lazy val controllers_AnnotationController_downsample127_invoker = createInvoker(
    AnnotationController_26.downsample(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "downsample",
      Seq(classOf[String], classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/downsample""",
      """""",
      Seq()
    )
  )

  // @LINE:159
  private[this] lazy val controllers_AnnotationController_addAnnotationLayer128_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/addAnnotationLayer")))
  )
  private[this] lazy val controllers_AnnotationController_addAnnotationLayer128_invoker = createInvoker(
    AnnotationController_26.addAnnotationLayer(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "addAnnotationLayer",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/addAnnotationLayer""",
      """""",
      Seq()
    )
  )

  // @LINE:160
  private[this] lazy val controllers_AnnotationController_deleteAnnotationLayer129_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/deleteAnnotationLayer")))
  )
  private[this] lazy val controllers_AnnotationController_deleteAnnotationLayer129_invoker = createInvoker(
    AnnotationController_26.deleteAnnotationLayer(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "deleteAnnotationLayer",
      Seq(classOf[String], classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/deleteAnnotationLayer""",
      """""",
      Seq()
    )
  )

  // @LINE:161
  private[this] lazy val controllers_AnnotationController_cancel130_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationController_cancel130_invoker = createInvoker(
    AnnotationController_26.cancel(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "cancel",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:162
  private[this] lazy val controllers_AnnotationController_merge131_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/merge/"), DynamicPart("mergedTyp", """[^/]+""",true), StaticPart("/"), DynamicPart("mergedId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationController_merge131_invoker = createInvoker(
    AnnotationController_26.merge(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "merge",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:163
  private[this] lazy val controllers_AnnotationIOController_download132_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/download")))
  )
  private[this] lazy val controllers_AnnotationIOController_download132_invoker = createInvoker(
    AnnotationIOController_19.download(fakeValue[String], fakeValue[String], fakeValue[Option[Long]], fakeValue[Option[Long]], fakeValue[Option[Boolean]], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationIOController",
      "download",
      Seq(classOf[String], classOf[String], classOf[Option[Long]], classOf[Option[Long]], classOf[Option[Boolean]], classOf[Option[String]]),
      "GET",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/download""",
      """""",
      Seq()
    )
  )

  // @LINE:165
  private[this] lazy val controllers_AnnotationPrivateLinkController_annotationSource133_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/source/"), DynamicPart("accessTokenOrId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_annotationSource133_invoker = createInvoker(
    AnnotationPrivateLinkController_0.annotationSource(fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "annotationSource",
      Seq(classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """annotations/source/""" + "$" + """accessTokenOrId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:167
  private[this] lazy val controllers_AnnotationController_listExplorationals134_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/readable")))
  )
  private[this] lazy val controllers_AnnotationController_listExplorationals134_invoker = createInvoker(
    AnnotationController_26.listExplorationals(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "listExplorationals",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """annotations/readable""",
      """""",
      Seq()
    )
  )

  // @LINE:168
  private[this] lazy val controllers_AnnotationController_getSharedTeams135_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/sharedTeams")))
  )
  private[this] lazy val controllers_AnnotationController_getSharedTeams135_invoker = createInvoker(
    AnnotationController_26.getSharedTeams(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "getSharedTeams",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/sharedTeams""",
      """""",
      Seq()
    )
  )

  // @LINE:169
  private[this] lazy val controllers_AnnotationController_updateSharedTeams136_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/sharedTeams")))
  )
  private[this] lazy val controllers_AnnotationController_updateSharedTeams136_invoker = createInvoker(
    AnnotationController_26.updateSharedTeams(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "updateSharedTeams",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/sharedTeams""",
      """""",
      Seq()
    )
  )

  // @LINE:170
  private[this] lazy val controllers_AnnotationController_updateOthersMayEdit137_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/othersMayEdit")))
  )
  private[this] lazy val controllers_AnnotationController_updateOthersMayEdit137_invoker = createInvoker(
    AnnotationController_26.updateOthersMayEdit(fakeValue[String], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "updateOthersMayEdit",
      Seq(classOf[String], classOf[String], classOf[Boolean]),
      "PATCH",
      this.prefix + """annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/othersMayEdit""",
      """""",
      Seq()
    )
  )

  // @LINE:173
  private[this] lazy val controllers_AnnotationPrivateLinkController_list138_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zarrPrivateLinks")))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_list138_invoker = createInvoker(
    AnnotationPrivateLinkController_0.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "list",
      Nil,
      "GET",
      this.prefix + """zarrPrivateLinks""",
      """ Annotation Private Links""",
      Seq()
    )
  )

  // @LINE:174
  private[this] lazy val controllers_AnnotationPrivateLinkController_listByAnnotation139_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zarrPrivateLinks/byAnnotation/"), DynamicPart("annotationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_listByAnnotation139_invoker = createInvoker(
    AnnotationPrivateLinkController_0.listByAnnotation(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "listByAnnotation",
      Seq(classOf[String]),
      "GET",
      this.prefix + """zarrPrivateLinks/byAnnotation/""" + "$" + """annotationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:175
  private[this] lazy val controllers_AnnotationPrivateLinkController_create140_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zarrPrivateLinks")))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_create140_invoker = createInvoker(
    AnnotationPrivateLinkController_0.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "create",
      Nil,
      "POST",
      this.prefix + """zarrPrivateLinks""",
      """""",
      Seq()
    )
  )

  // @LINE:176
  private[this] lazy val controllers_AnnotationPrivateLinkController_update141_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zarrPrivateLinks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_update141_invoker = createInvoker(
    AnnotationPrivateLinkController_0.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """zarrPrivateLinks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:177
  private[this] lazy val controllers_AnnotationPrivateLinkController_delete142_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zarrPrivateLinks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_delete142_invoker = createInvoker(
    AnnotationPrivateLinkController_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """zarrPrivateLinks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:178
  private[this] lazy val controllers_AnnotationPrivateLinkController_get143_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zarrPrivateLinks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AnnotationPrivateLinkController_get143_invoker = createInvoker(
    AnnotationPrivateLinkController_0.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationPrivateLinkController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """zarrPrivateLinks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:181
  private[this] lazy val controllers_MeshController_create144_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meshes")))
  )
  private[this] lazy val controllers_MeshController_create144_invoker = createInvoker(
    MeshController_15.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MeshController",
      "create",
      Nil,
      "POST",
      this.prefix + """meshes""",
      """ Meshes""",
      Seq()
    )
  )

  // @LINE:182
  private[this] lazy val controllers_MeshController_update145_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meshes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MeshController_update145_invoker = createInvoker(
    MeshController_15.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MeshController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """meshes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:183
  private[this] lazy val controllers_MeshController_delete146_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meshes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MeshController_delete146_invoker = createInvoker(
    MeshController_15.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MeshController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """meshes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:184
  private[this] lazy val controllers_MeshController_get147_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meshes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MeshController_get147_invoker = createInvoker(
    MeshController_15.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MeshController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """meshes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:185
  private[this] lazy val controllers_MeshController_updateData148_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meshes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/data")))
  )
  private[this] lazy val controllers_MeshController_updateData148_invoker = createInvoker(
    MeshController_15.updateData(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MeshController",
      "updateData",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """meshes/""" + "$" + """id<[^/]+>/data""",
      """""",
      Seq()
    )
  )

  // @LINE:186
  private[this] lazy val controllers_MeshController_getData149_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meshes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/data")))
  )
  private[this] lazy val controllers_MeshController_getData149_invoker = createInvoker(
    MeshController_15.getData(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.MeshController",
      "getData",
      Seq(classOf[String]),
      "GET",
      this.prefix + """meshes/""" + "$" + """id<[^/]+>/data""",
      """""",
      Seq()
    )
  )

  // @LINE:189
  private[this] lazy val controllers_TaskController_create150_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_TaskController_create150_invoker = createInvoker(
    TaskController_32.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "create",
      Nil,
      "POST",
      this.prefix + """tasks""",
      """ Tasks""",
      Seq()
    )
  )

  // @LINE:190
  private[this] lazy val controllers_TaskController_createFromFiles151_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/createFromFiles")))
  )
  private[this] lazy val controllers_TaskController_createFromFiles151_invoker = createInvoker(
    TaskController_32.createFromFiles(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "createFromFiles",
      Nil,
      "POST",
      this.prefix + """tasks/createFromFiles""",
      """""",
      Seq()
    )
  )

  // @LINE:191
  private[this] lazy val controllers_TaskController_listTasks152_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/list")))
  )
  private[this] lazy val controllers_TaskController_listTasks152_invoker = createInvoker(
    TaskController_32.listTasks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "listTasks",
      Nil,
      "POST",
      this.prefix + """tasks/list""",
      """""",
      Seq()
    )
  )

  // @LINE:192
  private[this] lazy val controllers_TaskController_listExperienceDomains153_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/experienceDomains")))
  )
  private[this] lazy val controllers_TaskController_listExperienceDomains153_invoker = createInvoker(
    TaskController_32.listExperienceDomains(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "listExperienceDomains",
      Nil,
      "GET",
      this.prefix + """tasks/experienceDomains""",
      """""",
      Seq()
    )
  )

  // @LINE:193
  private[this] lazy val controllers_TaskController_read154_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_read154_invoker = createInvoker(
    TaskController_32.read(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "read",
      Seq(classOf[String]),
      "GET",
      this.prefix + """tasks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:194
  private[this] lazy val controllers_TaskController_delete155_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_delete155_invoker = createInvoker(
    TaskController_32.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """tasks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:195
  private[this] lazy val controllers_TaskController_update156_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_update156_invoker = createInvoker(
    TaskController_32.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """tasks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:196
  private[this] lazy val controllers_TaskController_assignOne157_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/assign")))
  )
  private[this] lazy val controllers_TaskController_assignOne157_invoker = createInvoker(
    TaskController_32.assignOne(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "assignOne",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """tasks/""" + "$" + """id<[^/]+>/assign""",
      """""",
      Seq()
    )
  )

  // @LINE:197
  private[this] lazy val controllers_AnnotationController_annotationsForTask158_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_AnnotationController_annotationsForTask158_invoker = createInvoker(
    AnnotationController_26.annotationsForTask(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.AnnotationController",
      "annotationsForTask",
      Seq(classOf[String]),
      "GET",
      this.prefix + """tasks/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:200
  private[this] lazy val controllers_TaskTypeController_list159_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes")))
  )
  private[this] lazy val controllers_TaskTypeController_list159_invoker = createInvoker(
    TaskTypeController_10.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskTypeController",
      "list",
      Nil,
      "GET",
      this.prefix + """taskTypes""",
      """ TaskTypes""",
      Seq()
    )
  )

  // @LINE:201
  private[this] lazy val controllers_TaskTypeController_create160_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes")))
  )
  private[this] lazy val controllers_TaskTypeController_create160_invoker = createInvoker(
    TaskTypeController_10.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskTypeController",
      "create",
      Nil,
      "POST",
      this.prefix + """taskTypes""",
      """""",
      Seq()
    )
  )

  // @LINE:203
  private[this] lazy val controllers_TaskTypeController_delete161_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskTypeController_delete161_invoker = createInvoker(
    TaskTypeController_10.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskTypeController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """taskTypes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:204
  private[this] lazy val controllers_TaskController_listTasksForType162_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_TaskController_listTasksForType162_invoker = createInvoker(
    TaskController_32.listTasksForType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskController",
      "listTasksForType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """taskTypes/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:205
  private[this] lazy val controllers_ProjectController_projectsForTaskType163_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/projects")))
  )
  private[this] lazy val controllers_ProjectController_projectsForTaskType163_invoker = createInvoker(
    ProjectController_13.projectsForTaskType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "projectsForTaskType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """taskTypes/""" + "$" + """id<[^/]+>/projects""",
      """""",
      Seq()
    )
  )

  // @LINE:206
  private[this] lazy val controllers_TaskTypeController_get164_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskTypeController_get164_invoker = createInvoker(
    TaskTypeController_10.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskTypeController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """taskTypes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:207
  private[this] lazy val controllers_TaskTypeController_update165_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskTypes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskTypeController_update165_invoker = createInvoker(
    TaskTypeController_10.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TaskTypeController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """taskTypes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:210
  private[this] lazy val controllers_ScriptController_list166_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scripts")))
  )
  private[this] lazy val controllers_ScriptController_list166_invoker = createInvoker(
    ScriptController_27.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ScriptController",
      "list",
      Nil,
      "GET",
      this.prefix + """scripts""",
      """ Scripts""",
      Seq()
    )
  )

  // @LINE:211
  private[this] lazy val controllers_ScriptController_create167_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scripts")))
  )
  private[this] lazy val controllers_ScriptController_create167_invoker = createInvoker(
    ScriptController_27.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ScriptController",
      "create",
      Nil,
      "POST",
      this.prefix + """scripts""",
      """""",
      Seq()
    )
  )

  // @LINE:212
  private[this] lazy val controllers_ScriptController_get168_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scripts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScriptController_get168_invoker = createInvoker(
    ScriptController_27.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ScriptController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """scripts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:213
  private[this] lazy val controllers_ScriptController_update169_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scripts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScriptController_update169_invoker = createInvoker(
    ScriptController_27.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ScriptController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """scripts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:214
  private[this] lazy val controllers_ScriptController_delete170_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scripts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ScriptController_delete170_invoker = createInvoker(
    ScriptController_27.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ScriptController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """scripts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:217
  private[this] lazy val controllers_ProjectController_list171_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectController_list171_invoker = createInvoker(
    ProjectController_13.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "list",
      Nil,
      "GET",
      this.prefix + """projects""",
      """ Projects""",
      Seq()
    )
  )

  // @LINE:218
  private[this] lazy val controllers_ProjectController_listWithStatus172_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/withStatus")))
  )
  private[this] lazy val controllers_ProjectController_listWithStatus172_invoker = createInvoker(
    ProjectController_13.listWithStatus(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "listWithStatus",
      Nil,
      "GET",
      this.prefix + """projects/withStatus""",
      """""",
      Seq()
    )
  )

  // @LINE:219
  private[this] lazy val controllers_ProjectController_create173_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectController_create173_invoker = createInvoker(
    ProjectController_13.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "create",
      Nil,
      "POST",
      this.prefix + """projects""",
      """""",
      Seq()
    )
  )

  // @LINE:220
  private[this] lazy val controllers_ProjectController_readByName174_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/byName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_readByName174_invoker = createInvoker(
    ProjectController_13.readByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "readByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """projects/byName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:221
  private[this] lazy val controllers_ProjectController_read175_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_read175_invoker = createInvoker(
    ProjectController_13.read(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "read",
      Seq(classOf[String]),
      "GET",
      this.prefix + """projects/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:222
  private[this] lazy val controllers_ProjectController_delete176_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_delete176_invoker = createInvoker(
    ProjectController_13.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """projects/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:223
  private[this] lazy val controllers_ProjectController_update177_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_update177_invoker = createInvoker(
    ProjectController_13.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """projects/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:224
  private[this] lazy val controllers_ProjectController_tasksForProject178_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_ProjectController_tasksForProject178_invoker = createInvoker(
    ProjectController_13.tasksForProject(fakeValue[String], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "tasksForProject",
      Seq(classOf[String], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """projects/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:225
  private[this] lazy val controllers_ProjectController_incrementEachTasksInstances179_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/incrementEachTasksInstances")))
  )
  private[this] lazy val controllers_ProjectController_incrementEachTasksInstances179_invoker = createInvoker(
    ProjectController_13.incrementEachTasksInstances(fakeValue[String], fakeValue[Option[Long]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "incrementEachTasksInstances",
      Seq(classOf[String], classOf[Option[Long]]),
      "PATCH",
      this.prefix + """projects/""" + "$" + """id<[^/]+>/incrementEachTasksInstances""",
      """""",
      Seq()
    )
  )

  // @LINE:226
  private[this] lazy val controllers_ProjectController_pause180_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/pause")))
  )
  private[this] lazy val controllers_ProjectController_pause180_invoker = createInvoker(
    ProjectController_13.pause(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "pause",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """projects/""" + "$" + """id<[^/]+>/pause""",
      """""",
      Seq()
    )
  )

  // @LINE:227
  private[this] lazy val controllers_ProjectController_resume181_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/resume")))
  )
  private[this] lazy val controllers_ProjectController_resume181_invoker = createInvoker(
    ProjectController_13.resume(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "resume",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """projects/""" + "$" + """id<[^/]+>/resume""",
      """""",
      Seq()
    )
  )

  // @LINE:228
  private[this] lazy val controllers_ProjectController_usersWithActiveTasks182_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/usersWithActiveTasks")))
  )
  private[this] lazy val controllers_ProjectController_usersWithActiveTasks182_invoker = createInvoker(
    ProjectController_13.usersWithActiveTasks(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "usersWithActiveTasks",
      Seq(classOf[String]),
      "GET",
      this.prefix + """projects/""" + "$" + """id<[^/]+>/usersWithActiveTasks""",
      """""",
      Seq()
    )
  )

  // @LINE:229
  private[this] lazy val controllers_ProjectController_transferActiveTasks183_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/transferActiveTasks")))
  )
  private[this] lazy val controllers_ProjectController_transferActiveTasks183_invoker = createInvoker(
    ProjectController_13.transferActiveTasks(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ProjectController",
      "transferActiveTasks",
      Seq(classOf[String]),
      "POST",
      this.prefix + """projects/""" + "$" + """id<[^/]+>/transferActiveTasks""",
      """""",
      Seq()
    )
  )

  // @LINE:232
  private[this] lazy val controllers_OrganizationController_list184_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations")))
  )
  private[this] lazy val controllers_OrganizationController_list184_invoker = createInvoker(
    OrganizationController_6.list(fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "list",
      Seq(classOf[Option[Boolean]]),
      "GET",
      this.prefix + """organizations""",
      """ Organizations""",
      Seq()
    )
  )

  // @LINE:233
  private[this] lazy val controllers_OrganizationController_create185_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations")))
  )
  private[this] lazy val controllers_OrganizationController_create185_invoker = createInvoker(
    OrganizationController_6.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "create",
      Nil,
      "POST",
      this.prefix + """organizations""",
      """""",
      Seq()
    )
  )

  // @LINE:234
  private[this] lazy val controllers_OrganizationController_getByInvite186_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations/byInvite/"), DynamicPart("inviteToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_getByInvite186_invoker = createInvoker(
    OrganizationController_6.getByInvite(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "getByInvite",
      Seq(classOf[String]),
      "GET",
      this.prefix + """organizations/byInvite/""" + "$" + """inviteToken<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:235
  private[this] lazy val controllers_OrganizationController_getDefault187_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations/default")))
  )
  private[this] lazy val controllers_OrganizationController_getDefault187_invoker = createInvoker(
    OrganizationController_6.getDefault(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "getDefault",
      Nil,
      "GET",
      this.prefix + """organizations/default""",
      """""",
      Seq()
    )
  )

  // @LINE:236
  private[this] lazy val controllers_OrganizationController_organizationsIsEmpty188_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizationsIsEmpty")))
  )
  private[this] lazy val controllers_OrganizationController_organizationsIsEmpty188_invoker = createInvoker(
    OrganizationController_6.organizationsIsEmpty(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "organizationsIsEmpty",
      Nil,
      "GET",
      this.prefix + """organizationsIsEmpty""",
      """""",
      Seq()
    )
  )

  // @LINE:237
  private[this] lazy val controllers_OrganizationController_get189_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations/"), DynamicPart("organizationName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_get189_invoker = createInvoker(
    OrganizationController_6.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """organizations/""" + "$" + """organizationName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:238
  private[this] lazy val controllers_OrganizationController_update190_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations/"), DynamicPart("organizationName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_update190_invoker = createInvoker(
    OrganizationController_6.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """organizations/""" + "$" + """organizationName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:239
  private[this] lazy val controllers_OrganizationController_delete191_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations/"), DynamicPart("organizationName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_delete191_invoker = createInvoker(
    OrganizationController_6.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """organizations/""" + "$" + """organizationName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:240
  private[this] lazy val controllers_OrganizationController_addUser192_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organizations/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/addUser")))
  )
  private[this] lazy val controllers_OrganizationController_addUser192_invoker = createInvoker(
    OrganizationController_6.addUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "addUser",
      Seq(classOf[String]),
      "POST",
      this.prefix + """organizations/""" + "$" + """organizationName<[^/]+>/addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:241
  private[this] lazy val controllers_OrganizationController_getOperatorData193_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("operatorData")))
  )
  private[this] lazy val controllers_OrganizationController_getOperatorData193_invoker = createInvoker(
    OrganizationController_6.getOperatorData(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "getOperatorData",
      Nil,
      "GET",
      this.prefix + """operatorData""",
      """""",
      Seq()
    )
  )

  // @LINE:242
  private[this] lazy val controllers_OrganizationController_sendExtendPricingPlanEmail194_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pricing/requestExtension")))
  )
  private[this] lazy val controllers_OrganizationController_sendExtendPricingPlanEmail194_invoker = createInvoker(
    OrganizationController_6.sendExtendPricingPlanEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "sendExtendPricingPlanEmail",
      Nil,
      "POST",
      this.prefix + """pricing/requestExtension""",
      """""",
      Seq()
    )
  )

  // @LINE:243
  private[this] lazy val controllers_OrganizationController_sendUpgradePricingPlanEmail195_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pricing/requestUpgrade")))
  )
  private[this] lazy val controllers_OrganizationController_sendUpgradePricingPlanEmail195_invoker = createInvoker(
    OrganizationController_6.sendUpgradePricingPlanEmail(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "sendUpgradePricingPlanEmail",
      Seq(classOf[String]),
      "POST",
      this.prefix + """pricing/requestUpgrade""",
      """""",
      Seq()
    )
  )

  // @LINE:244
  private[this] lazy val controllers_OrganizationController_sendUpgradePricingPlanUsersEmail196_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pricing/requestUsers")))
  )
  private[this] lazy val controllers_OrganizationController_sendUpgradePricingPlanUsersEmail196_invoker = createInvoker(
    OrganizationController_6.sendUpgradePricingPlanUsersEmail(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "sendUpgradePricingPlanUsersEmail",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """pricing/requestUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:245
  private[this] lazy val controllers_OrganizationController_sendUpgradePricingPlanStorageEmail197_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pricing/requestStorage")))
  )
  private[this] lazy val controllers_OrganizationController_sendUpgradePricingPlanStorageEmail197_invoker = createInvoker(
    OrganizationController_6.sendUpgradePricingPlanStorageEmail(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "sendUpgradePricingPlanStorageEmail",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """pricing/requestStorage""",
      """""",
      Seq()
    )
  )

  // @LINE:246
  private[this] lazy val controllers_OrganizationController_pricingStatus198_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pricing/status")))
  )
  private[this] lazy val controllers_OrganizationController_pricingStatus198_invoker = createInvoker(
    OrganizationController_6.pricingStatus(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "pricingStatus",
      Nil,
      "GET",
      this.prefix + """pricing/status""",
      """""",
      Seq()
    )
  )

  // @LINE:247
  private[this] lazy val controllers_OrganizationController_getTermsOfService199_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsOfService")))
  )
  private[this] lazy val controllers_OrganizationController_getTermsOfService199_invoker = createInvoker(
    OrganizationController_6.getTermsOfService(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "getTermsOfService",
      Nil,
      "GET",
      this.prefix + """termsOfService""",
      """""",
      Seq()
    )
  )

  // @LINE:248
  private[this] lazy val controllers_OrganizationController_acceptTermsOfService200_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsOfService/accept")))
  )
  private[this] lazy val controllers_OrganizationController_acceptTermsOfService200_invoker = createInvoker(
    OrganizationController_6.acceptTermsOfService(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "acceptTermsOfService",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """termsOfService/accept""",
      """""",
      Seq()
    )
  )

  // @LINE:249
  private[this] lazy val controllers_OrganizationController_termsOfServiceAcceptanceNeeded201_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsOfService/acceptanceNeeded")))
  )
  private[this] lazy val controllers_OrganizationController_termsOfServiceAcceptanceNeeded201_invoker = createInvoker(
    OrganizationController_6.termsOfServiceAcceptanceNeeded(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.OrganizationController",
      "termsOfServiceAcceptanceNeeded",
      Nil,
      "GET",
      this.prefix + """termsOfService/acceptanceNeeded""",
      """""",
      Seq()
    )
  )

  // @LINE:253
  private[this] lazy val controllers_TimeController_timeSpansOfUser202_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("time/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/spans")))
  )
  private[this] lazy val controllers_TimeController_timeSpansOfUser202_invoker = createInvoker(
    TimeController_23.timeSpansOfUser(fakeValue[String], fakeValue[Long], fakeValue[Long], fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TimeController",
      "timeSpansOfUser",
      Seq(classOf[String], classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """time/user/""" + "$" + """userId<[^/]+>/spans""",
      """ Time Tracking
 Note, there is also /users/:id/loggedTime""",
      Seq()
    )
  )

  // @LINE:254
  private[this] lazy val controllers_TimeController_timeSummedByAnnotationForUser203_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("time/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/summedByAnnotation")))
  )
  private[this] lazy val controllers_TimeController_timeSummedByAnnotationForUser203_invoker = createInvoker(
    TimeController_23.timeSummedByAnnotationForUser(fakeValue[String], fakeValue[Long], fakeValue[Long], fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TimeController",
      "timeSummedByAnnotationForUser",
      Seq(classOf[String], classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """time/user/""" + "$" + """userId<[^/]+>/summedByAnnotation""",
      """""",
      Seq()
    )
  )

  // @LINE:255
  private[this] lazy val controllers_TimeController_timeOverview204_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("time/overview")))
  )
  private[this] lazy val controllers_TimeController_timeOverview204_invoker = createInvoker(
    TimeController_23.timeOverview(fakeValue[Long], fakeValue[Long], fakeValue[String], fakeValue[String], fakeValue[Option[String]], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.TimeController",
      "timeOverview",
      Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Option[String]], classOf[Option[String]]),
      "GET",
      this.prefix + """time/overview""",
      """""",
      Seq()
    )
  )

  // @LINE:258
  private[this] lazy val controllers_WKRemoteWorkerController_requestJobs205_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/request")))
  )
  private[this] lazy val controllers_WKRemoteWorkerController_requestJobs205_invoker = createInvoker(
    WKRemoteWorkerController_5.requestJobs(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteWorkerController",
      "requestJobs",
      Seq(classOf[String]),
      "GET",
      this.prefix + """jobs/request""",
      """ Long-Running Jobs""",
      Seq()
    )
  )

  // @LINE:259
  private[this] lazy val controllers_JobsController_list206_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs")))
  )
  private[this] lazy val controllers_JobsController_list206_invoker = createInvoker(
    JobsController_29.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "list",
      Nil,
      "GET",
      this.prefix + """jobs""",
      """""",
      Seq()
    )
  )

  // @LINE:260
  private[this] lazy val controllers_JobsController_status207_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/status")))
  )
  private[this] lazy val controllers_JobsController_status207_invoker = createInvoker(
    JobsController_29.status(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "status",
      Nil,
      "GET",
      this.prefix + """jobs/status""",
      """""",
      Seq()
    )
  )

  // @LINE:261
  private[this] lazy val controllers_JobsController_runConvertToWkwJob208_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/convertToWkw/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runConvertToWkwJob208_invoker = createInvoker(
    JobsController_29.runConvertToWkwJob(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runConvertToWkwJob",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/convertToWkw/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:262
  private[this] lazy val controllers_JobsController_runComputeMeshFileJob209_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/computeMeshFile/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runComputeMeshFileJob209_invoker = createInvoker(
    JobsController_29.runComputeMeshFileJob(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runComputeMeshFileJob",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[Option[String]]),
      "POST",
      this.prefix + """jobs/run/computeMeshFile/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:263
  private[this] lazy val controllers_JobsController_runComputeSegmentIndexFileJob210_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/computeSegmentIndexFile/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runComputeSegmentIndexFileJob210_invoker = createInvoker(
    JobsController_29.runComputeSegmentIndexFileJob(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runComputeSegmentIndexFileJob",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/computeSegmentIndexFile/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:264
  private[this] lazy val controllers_JobsController_runExportTiffJob211_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/exportTiff/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runExportTiffJob211_invoker = createInvoker(
    JobsController_29.runExportTiffJob(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runExportTiffJob",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Option[String]], classOf[Option[String]], classOf[Option[String]], classOf[Option[String]], classOf[Boolean]),
      "POST",
      this.prefix + """jobs/run/exportTiff/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:265
  private[this] lazy val controllers_JobsController_runInferNucleiJob212_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/inferNuclei/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runInferNucleiJob212_invoker = createInvoker(
    JobsController_29.runInferNucleiJob(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runInferNucleiJob",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/inferNuclei/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:266
  private[this] lazy val controllers_JobsController_runInferNeuronsJob213_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/inferNeurons/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runInferNeuronsJob213_invoker = createInvoker(
    JobsController_29.runInferNeuronsJob(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runInferNeuronsJob",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/inferNeurons/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:267
  private[this] lazy val controllers_JobsController_runInferMitochondriaJob214_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/inferMitochondria/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runInferMitochondriaJob214_invoker = createInvoker(
    JobsController_29.runInferMitochondriaJob(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runInferMitochondriaJob",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/inferMitochondria/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:268
  private[this] lazy val controllers_JobsController_runMaterializeVolumeAnnotationJob215_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/materializeVolumeAnnotation/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runMaterializeVolumeAnnotationJob215_invoker = createInvoker(
    JobsController_29.runMaterializeVolumeAnnotationJob(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Boolean], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runMaterializeVolumeAnnotationJob",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Boolean], classOf[Option[String]]),
      "POST",
      this.prefix + """jobs/run/materializeVolumeAnnotation/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:269
  private[this] lazy val controllers_JobsController_runFindLargestSegmentIdJob216_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/findLargestSegmentId/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runFindLargestSegmentIdJob216_invoker = createInvoker(
    JobsController_29.runFindLargestSegmentIdJob(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runFindLargestSegmentIdJob",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/findLargestSegmentId/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:270
  private[this] lazy val controllers_JobsController_runRenderAnimationJob217_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/run/renderAnimation/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_runRenderAnimationJob217_invoker = createInvoker(
    JobsController_29.runRenderAnimationJob(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "runRenderAnimationJob",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/run/renderAnimation/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:271
  private[this] lazy val controllers_JobsController_get218_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobsController_get218_invoker = createInvoker(
    JobsController_29.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:272
  private[this] lazy val controllers_JobsController_cancel219_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/cancel")))
  )
  private[this] lazy val controllers_JobsController_cancel219_invoker = createInvoker(
    JobsController_29.cancel(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "cancel",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>/cancel""",
      """""",
      Seq()
    )
  )

  // @LINE:273
  private[this] lazy val controllers_WKRemoteWorkerController_updateJobStatus220_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/status")))
  )
  private[this] lazy val controllers_WKRemoteWorkerController_updateJobStatus220_invoker = createInvoker(
    WKRemoteWorkerController_5.updateJobStatus(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.WKRemoteWorkerController",
      "updateJobStatus",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>/status""",
      """""",
      Seq()
    )
  )

  // @LINE:274
  private[this] lazy val controllers_JobsController_redirectToExport221_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/export")))
  )
  private[this] lazy val controllers_JobsController_redirectToExport221_invoker = createInvoker(
    JobsController_29.redirectToExport(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.JobsController",
      "redirectToExport",
      Seq(classOf[String]),
      "GET",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>/export""",
      """""",
      Seq()
    )
  )

  // @LINE:277
  private[this] lazy val controllers_PublicationController_listPublications222_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications")))
  )
  private[this] lazy val controllers_PublicationController_listPublications222_invoker = createInvoker(
    PublicationController_8.listPublications(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.PublicationController",
      "listPublications",
      Nil,
      "GET",
      this.prefix + """publications""",
      """ Publications""",
      Seq()
    )
  )

  // @LINE:278
  private[this] lazy val controllers_PublicationController_read223_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PublicationController_read223_invoker = createInvoker(
    PublicationController_8.read(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.PublicationController",
      "read",
      Seq(classOf[String]),
      "GET",
      this.prefix + """publications/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:281
  private[this] lazy val controllers_ShortLinkController_create224_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shortLinks")))
  )
  private[this] lazy val controllers_ShortLinkController_create224_invoker = createInvoker(
    ShortLinkController_30.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ShortLinkController",
      "create",
      Nil,
      "POST",
      this.prefix + """shortLinks""",
      """ Shortlinks""",
      Seq()
    )
  )

  // @LINE:282
  private[this] lazy val controllers_ShortLinkController_getByKey225_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shortLinks/byKey/"), DynamicPart("key", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShortLinkController_getByKey225_invoker = createInvoker(
    ShortLinkController_30.getByKey(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.ShortLinkController",
      "getByKey",
      Seq(classOf[String]),
      "GET",
      this.prefix + """shortLinks/byKey/""" + "$" + """key<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:285
  private[this] lazy val controllers_CredentialController_createHttpBasicAuthCredential226_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("credentials/httpBasicAuth")))
  )
  private[this] lazy val controllers_CredentialController_createHttpBasicAuthCredential226_invoker = createInvoker(
    CredentialController_17.createHttpBasicAuthCredential(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.CredentialController",
      "createHttpBasicAuthCredential",
      Nil,
      "POST",
      this.prefix + """credentials/httpBasicAuth""",
      """ Remote Dataset Credentials""",
      Seq()
    )
  )

  // @LINE:286
  private[this] lazy val controllers_CredentialController_createS3AccessKeyCredential227_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("credentials/s3AccessKey")))
  )
  private[this] lazy val controllers_CredentialController_createS3AccessKeyCredential227_invoker = createInvoker(
    CredentialController_17.createS3AccessKeyCredential(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.CredentialController",
      "createS3AccessKeyCredential",
      Nil,
      "POST",
      this.prefix + """credentials/s3AccessKey""",
      """""",
      Seq()
    )
  )

  // @LINE:287
  private[this] lazy val controllers_CredentialController_createGoogleServiceAccountCredential228_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("credentials/googleServiceAccount")))
  )
  private[this] lazy val controllers_CredentialController_createGoogleServiceAccountCredential228_invoker = createInvoker(
    CredentialController_17.createGoogleServiceAccountCredential(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.CredentialController",
      "createGoogleServiceAccountCredential",
      Nil,
      "POST",
      this.prefix + """credentials/googleServiceAccount""",
      """""",
      Seq()
    )
  )

  // @LINE:290
  private[this] lazy val controllers_EmailVerificationController_verify229_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("verifyEmail/"), DynamicPart("key", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmailVerificationController_verify229_invoker = createInvoker(
    EmailVerificationController_18.verify(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.EmailVerificationController",
      "verify",
      Seq(classOf[String]),
      "POST",
      this.prefix + """verifyEmail/""" + "$" + """key<[^/]+>""",
      """ Email verification""",
      Seq()
    )
  )

  // @LINE:291
  private[this] lazy val controllers_EmailVerificationController_requestVerificationMail230_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("verifyEmail")))
  )
  private[this] lazy val controllers_EmailVerificationController_requestVerificationMail230_invoker = createInvoker(
    EmailVerificationController_18.requestVerificationMail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.EmailVerificationController",
      "requestVerificationMail",
      Nil,
      "POST",
      this.prefix + """verifyEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:294
  private[this] lazy val controllers_VoxelyticsController_storeWorkflow231_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/workflows")))
  )
  private[this] lazy val controllers_VoxelyticsController_storeWorkflow231_invoker = createInvoker(
    VoxelyticsController_16.storeWorkflow(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "storeWorkflow",
      Nil,
      "POST",
      this.prefix + """voxelytics/workflows""",
      """ Voxelytics""",
      Seq()
    )
  )

  // @LINE:295
  private[this] lazy val controllers_VoxelyticsController_listWorkflows232_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/workflows")))
  )
  private[this] lazy val controllers_VoxelyticsController_listWorkflows232_invoker = createInvoker(
    VoxelyticsController_16.listWorkflows(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "listWorkflows",
      Nil,
      "GET",
      this.prefix + """voxelytics/workflows""",
      """""",
      Seq()
    )
  )

  // @LINE:296
  private[this] lazy val controllers_VoxelyticsController_getWorkflow233_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/workflows/"), DynamicPart("workflowHash", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VoxelyticsController_getWorkflow233_invoker = createInvoker(
    VoxelyticsController_16.getWorkflow(fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "getWorkflow",
      Seq(classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:297
  private[this] lazy val controllers_VoxelyticsController_storeWorkflowEvents234_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/workflows/"), DynamicPart("workflowHash", """[^/]+""",true), StaticPart("/events")))
  )
  private[this] lazy val controllers_VoxelyticsController_storeWorkflowEvents234_invoker = createInvoker(
    VoxelyticsController_16.storeWorkflowEvents(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "storeWorkflowEvents",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>/events""",
      """""",
      Seq()
    )
  )

  // @LINE:298
  private[this] lazy val controllers_VoxelyticsController_getChunkStatistics235_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/workflows/"), DynamicPart("workflowHash", """[^/]+""",true), StaticPart("/chunkStatistics")))
  )
  private[this] lazy val controllers_VoxelyticsController_getChunkStatistics235_invoker = createInvoker(
    VoxelyticsController_16.getChunkStatistics(fakeValue[String], fakeValue[Option[String]], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "getChunkStatistics",
      Seq(classOf[String], classOf[Option[String]], classOf[String]),
      "GET",
      this.prefix + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>/chunkStatistics""",
      """""",
      Seq()
    )
  )

  // @LINE:299
  private[this] lazy val controllers_VoxelyticsController_getArtifactChecksums236_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/workflows/"), DynamicPart("workflowHash", """[^/]+""",true), StaticPart("/artifactChecksums")))
  )
  private[this] lazy val controllers_VoxelyticsController_getArtifactChecksums236_invoker = createInvoker(
    VoxelyticsController_16.getArtifactChecksums(fakeValue[String], fakeValue[Option[String]], fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "getArtifactChecksums",
      Seq(classOf[String], classOf[Option[String]], classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """voxelytics/workflows/""" + "$" + """workflowHash<[^/]+>/artifactChecksums""",
      """""",
      Seq()
    )
  )

  // @LINE:300
  private[this] lazy val controllers_VoxelyticsController_appendLogs237_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/logs")))
  )
  private[this] lazy val controllers_VoxelyticsController_appendLogs237_invoker = createInvoker(
    VoxelyticsController_16.appendLogs(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "appendLogs",
      Nil,
      "POST",
      this.prefix + """voxelytics/logs""",
      """""",
      Seq()
    )
  )

  // @LINE:301
  private[this] lazy val controllers_VoxelyticsController_getLogs238_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voxelytics/logs")))
  )
  private[this] lazy val controllers_VoxelyticsController_getLogs238_invoker = createInvoker(
    VoxelyticsController_16.getLogs(fakeValue[String], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Long], fakeValue[Long], fakeValue[Option[Int]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.latest",
      "controllers.VoxelyticsController",
      "getLogs",
      Seq(classOf[String], classOf[Option[String]], classOf[Option[String]], classOf[Long], classOf[Long], classOf[Option[Int]]),
      "GET",
      this.prefix + """voxelytics/logs""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_Application_buildInfo0_route(params@_) =>
      call { 
        controllers_Application_buildInfo0_invoker.call(Application_20.buildInfo())
      }
  
    // @LINE:5
    case controllers_Application_features1_route(params@_) =>
      call { 
        controllers_Application_features1_invoker.call(Application_20.features())
      }
  
    // @LINE:6
    case controllers_Application_health2_route(params@_) =>
      call { 
        controllers_Application_health2_invoker.call(Application_20.health())
      }
  
    // @LINE:7
    case controllers_AnalyticsController_ingestAnalyticsEvents3_route(params@_) =>
      call { 
        controllers_AnalyticsController_ingestAnalyticsEvents3_invoker.call(AnalyticsController_12.ingestAnalyticsEvents)
      }
  
    // @LINE:8
    case controllers_AnalyticsController_trackAnalyticsEvent4_route(params@_) =>
      call(params.fromPath[String]("eventType", None)) { (eventType) =>
        controllers_AnalyticsController_trackAnalyticsEvent4_invoker.call(AnalyticsController_12.trackAnalyticsEvent(eventType))
      }
  
    // @LINE:9
    case controllers_Application_helpEmail5_route(params@_) =>
      call(params.fromQuery[String]("message", None), params.fromQuery[String]("currentUrl", None)) { (message, currentUrl) =>
        controllers_Application_helpEmail5_invoker.call(Application_20.helpEmail(message, currentUrl))
      }
  
    // @LINE:10
    case controllers_InitialDataController_triggerInsert6_route(params@_) =>
      call { 
        controllers_InitialDataController_triggerInsert6_invoker.call(InitialDataController_21.triggerInsert())
      }
  
    // @LINE:13
    case controllers_MaintenanceController_listCurrentAndUpcoming7_route(params@_) =>
      call { 
        controllers_MaintenanceController_listCurrentAndUpcoming7_invoker.call(MaintenanceController_11.listCurrentAndUpcoming())
      }
  
    // @LINE:14
    case controllers_MaintenanceController_listAll8_route(params@_) =>
      call { 
        controllers_MaintenanceController_listAll8_invoker.call(MaintenanceController_11.listAll())
      }
  
    // @LINE:15
    case controllers_MaintenanceController_create9_route(params@_) =>
      call { 
        controllers_MaintenanceController_create9_invoker.call(MaintenanceController_11.create())
      }
  
    // @LINE:16
    case controllers_MaintenanceController_readOne10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MaintenanceController_readOne10_invoker.call(MaintenanceController_11.readOne(id))
      }
  
    // @LINE:17
    case controllers_MaintenanceController_update11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MaintenanceController_update11_invoker.call(MaintenanceController_11.update(id))
      }
  
    // @LINE:18
    case controllers_MaintenanceController_delete12_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MaintenanceController_delete12_invoker.call(MaintenanceController_11.delete(id))
      }
  
    // @LINE:19
    case controllers_MaintenanceController_create13_route(params@_) =>
      call { 
        controllers_MaintenanceController_create13_invoker.call(MaintenanceController_11.create())
      }
  
    // @LINE:20
    case controllers_MaintenanceController_createAdHocMaintenance14_route(params@_) =>
      call { 
        controllers_MaintenanceController_createAdHocMaintenance14_invoker.call(MaintenanceController_11.createAdHocMaintenance())
      }
  
    // @LINE:23
    case controllers_AuthenticationController_register15_route(params@_) =>
      call { 
        controllers_AuthenticationController_register15_invoker.call(AuthenticationController_1.register())
      }
  
    // @LINE:24
    case controllers_AuthenticationController_joinOrganization16_route(params@_) =>
      call(params.fromPath[String]("inviteToken", None)) { (inviteToken) =>
        controllers_AuthenticationController_joinOrganization16_invoker.call(AuthenticationController_1.joinOrganization(inviteToken))
      }
  
    // @LINE:25
    case controllers_AuthenticationController_authenticate17_route(params@_) =>
      call { 
        controllers_AuthenticationController_authenticate17_invoker.call(AuthenticationController_1.authenticate())
      }
  
    // @LINE:26
    case controllers_AuthenticationController_getToken18_route(params@_) =>
      call { 
        controllers_AuthenticationController_getToken18_invoker.call(AuthenticationController_1.getToken())
      }
  
    // @LINE:27
    case controllers_AuthenticationController_deleteToken19_route(params@_) =>
      call { 
        controllers_AuthenticationController_deleteToken19_invoker.call(AuthenticationController_1.deleteToken())
      }
  
    // @LINE:28
    case controllers_AuthenticationController_switchMultiUser20_route(params@_) =>
      call(params.fromQuery[String]("to", None)) { (to) =>
        controllers_AuthenticationController_switchMultiUser20_invoker.call(AuthenticationController_1.switchMultiUser(to))
      }
  
    // @LINE:29
    case controllers_AuthenticationController_switchOrganization21_route(params@_) =>
      call(params.fromPath[String]("organizationName", None)) { (organizationName) =>
        controllers_AuthenticationController_switchOrganization21_invoker.call(AuthenticationController_1.switchOrganization(organizationName))
      }
  
    // @LINE:30
    case controllers_AuthenticationController_accessibleBySwitching22_route(params@_) =>
      call(params.fromQuery[Option[String]]("organizationName", None), params.fromQuery[Option[String]]("datasetName", None), params.fromQuery[Option[String]]("annotationId", None), params.fromQuery[Option[String]]("workflowHash", None)) { (organizationName, datasetName, annotationId, workflowHash) =>
        controllers_AuthenticationController_accessibleBySwitching22_invoker.call(AuthenticationController_1.accessibleBySwitching(organizationName, datasetName, annotationId, workflowHash))
      }
  
    // @LINE:31
    case controllers_AuthenticationController_sendInvites23_route(params@_) =>
      call { 
        controllers_AuthenticationController_sendInvites23_invoker.call(AuthenticationController_1.sendInvites())
      }
  
    // @LINE:32
    case controllers_AuthenticationController_handleStartResetPassword24_route(params@_) =>
      call { 
        controllers_AuthenticationController_handleStartResetPassword24_invoker.call(AuthenticationController_1.handleStartResetPassword())
      }
  
    // @LINE:33
    case controllers_AuthenticationController_changePassword25_route(params@_) =>
      call { 
        controllers_AuthenticationController_changePassword25_invoker.call(AuthenticationController_1.changePassword())
      }
  
    // @LINE:34
    case controllers_AuthenticationController_handleResetPassword26_route(params@_) =>
      call { 
        controllers_AuthenticationController_handleResetPassword26_invoker.call(AuthenticationController_1.handleResetPassword())
      }
  
    // @LINE:35
    case controllers_AuthenticationController_logout27_route(params@_) =>
      call { 
        controllers_AuthenticationController_logout27_invoker.call(AuthenticationController_1.logout())
      }
  
    // @LINE:36
    case controllers_AuthenticationController_singleSignOn28_route(params@_) =>
      call(params.fromQuery[String]("sso", None), params.fromQuery[String]("sig", None)) { (sso, sig) =>
        controllers_AuthenticationController_singleSignOn28_invoker.call(AuthenticationController_1.singleSignOn(sso, sig))
      }
  
    // @LINE:37
    case controllers_AuthenticationController_loginViaOpenIdConnect29_route(params@_) =>
      call { 
        controllers_AuthenticationController_loginViaOpenIdConnect29_invoker.call(AuthenticationController_1.loginViaOpenIdConnect())
      }
  
    // @LINE:39
    case controllers_AuthenticationController_openIdCallback30_route(params@_) =>
      call { 
        controllers_AuthenticationController_openIdCallback30_invoker.call(AuthenticationController_1.openIdCallback())
      }
  
    // @LINE:40
    case controllers_AuthenticationController_createOrganizationWithAdmin31_route(params@_) =>
      call { 
        controllers_AuthenticationController_createOrganizationWithAdmin31_invoker.call(AuthenticationController_1.createOrganizationWithAdmin())
      }
  
    // @LINE:41
    case controllers_AuthenticationController_createUserInOrganization32_route(params@_) =>
      call(params.fromPath[String]("organizationName", None)) { (organizationName) =>
        controllers_AuthenticationController_createUserInOrganization32_invoker.call(AuthenticationController_1.createUserInOrganization(organizationName))
      }
  
    // @LINE:44
    case controllers_ConfigurationController_read33_route(params@_) =>
      call { 
        controllers_ConfigurationController_read33_invoker.call(ConfigurationController_3.read())
      }
  
    // @LINE:45
    case controllers_ConfigurationController_update34_route(params@_) =>
      call { 
        controllers_ConfigurationController_update34_invoker.call(ConfigurationController_3.update())
      }
  
    // @LINE:46
    case controllers_ConfigurationController_readDatasetViewConfiguration35_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[Option[String]]("sharingToken", None)) { (organizationName, datasetName, sharingToken) =>
        controllers_ConfigurationController_readDatasetViewConfiguration35_invoker.call(ConfigurationController_3.readDatasetViewConfiguration(organizationName, datasetName, sharingToken))
      }
  
    // @LINE:47
    case controllers_ConfigurationController_updateDatasetViewConfiguration36_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_ConfigurationController_updateDatasetViewConfiguration36_invoker.call(ConfigurationController_3.updateDatasetViewConfiguration(organizationName, datasetName))
      }
  
    // @LINE:48
    case controllers_ConfigurationController_readDatasetAdminViewConfiguration37_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_ConfigurationController_readDatasetAdminViewConfiguration37_invoker.call(ConfigurationController_3.readDatasetAdminViewConfiguration(organizationName, datasetName))
      }
  
    // @LINE:49
    case controllers_ConfigurationController_updateDatasetAdminViewConfiguration38_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_ConfigurationController_updateDatasetAdminViewConfiguration38_invoker.call(ConfigurationController_3.updateDatasetAdminViewConfiguration(organizationName, datasetName))
      }
  
    // @LINE:52
    case controllers_TaskController_request39_route(params@_) =>
      call { 
        controllers_TaskController_request39_invoker.call(TaskController_32.request())
      }
  
    // @LINE:53
    case controllers_TaskController_peekNext40_route(params@_) =>
      call { 
        controllers_TaskController_peekNext40_invoker.call(TaskController_32.peekNext())
      }
  
    // @LINE:55
    case controllers_UserController_list41_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isEditable", None), params.fromQuery[Option[Boolean]]("isTeamManagerOrAdmin", None), params.fromQuery[Option[Boolean]]("isAdmin", None)) { (isEditable, isTeamManagerOrAdmin, isAdmin) =>
        controllers_UserController_list41_invoker.call(UserController_24.list(isEditable, isTeamManagerOrAdmin, isAdmin))
      }
  
    // @LINE:56
    case controllers_UserController_current42_route(params@_) =>
      call { 
        controllers_UserController_current42_invoker.call(UserController_24.current())
      }
  
    // @LINE:57
    case controllers_UserController_tasks43_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_UserController_tasks43_invoker.call(UserController_24.tasks(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:58
    case controllers_UserController_annotations44_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_UserController_annotations44_invoker.call(UserController_24.annotations(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:59
    case controllers_UserController_user45_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_user45_invoker.call(UserController_24.user(id))
      }
  
    // @LINE:60
    case controllers_UserController_update46_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_update46_invoker.call(UserController_24.update(id))
      }
  
    // @LINE:61
    case controllers_UserController_updateLastTaskTypeId47_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_updateLastTaskTypeId47_invoker.call(UserController_24.updateLastTaskTypeId(id))
      }
  
    // @LINE:62
    case controllers_UserController_updateNovelUserExperienceInfos48_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_updateNovelUserExperienceInfos48_invoker.call(UserController_24.updateNovelUserExperienceInfos(id))
      }
  
    // @LINE:63
    case controllers_UserController_updateSelectedTheme49_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_updateSelectedTheme49_invoker.call(UserController_24.updateSelectedTheme(id))
      }
  
    // @LINE:64
    case controllers_UserController_userTasks50_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_UserController_userTasks50_invoker.call(UserController_24.userTasks(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:65
    case controllers_UserController_userAnnotations51_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_UserController_userAnnotations51_invoker.call(UserController_24.userAnnotations(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:66
    case controllers_TimeController_userLoggedTime52_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TimeController_userLoggedTime52_invoker.call(TimeController_23.userLoggedTime(id))
      }
  
    // @LINE:69
    case controllers_TeamController_list53_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isEditable", None)) { (isEditable) =>
        controllers_TeamController_list53_invoker.call(TeamController_31.list(isEditable))
      }
  
    // @LINE:70
    case controllers_TeamController_create54_route(params@_) =>
      call { 
        controllers_TeamController_create54_invoker.call(TeamController_31.create())
      }
  
    // @LINE:71
    case controllers_TeamController_delete55_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TeamController_delete55_invoker.call(TeamController_31.delete(id))
      }
  
    // @LINE:72
    case controllers_ReportController_availableTasksReport56_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ReportController_availableTasksReport56_invoker.call(ReportController_14.availableTasksReport(id))
      }
  
    // @LINE:73
    case controllers_ReportController_projectProgressReport57_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ReportController_projectProgressReport57_invoker.call(ReportController_14.projectProgressReport(id))
      }
  
    // @LINE:76
    case controllers_AnnotationController_createExplorational58_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_AnnotationController_createExplorational58_invoker.call(AnnotationController_26.createExplorational(organizationName, datasetName))
      }
  
    // @LINE:77
    case controllers_AnnotationController_getSandbox59_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromPath[String]("typ", None), params.fromQuery[Option[String]]("sharingToken", None)) { (organizationName, datasetName, typ, sharingToken) =>
        controllers_AnnotationController_getSandbox59_invoker.call(AnnotationController_26.getSandbox(organizationName, datasetName, typ, sharingToken))
      }
  
    // @LINE:78
    case controllers_DatasetController_list60_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isActive", None), params.fromQuery[Option[Boolean]]("isUnreported", None), params.fromQuery[Option[String]]("organizationName", None), params.fromQuery[Option[Boolean]]("onlyMyOrganization", None), params.fromQuery[Option[String]]("uploaderId", None), params.fromQuery[Option[String]]("folderId", None), params.fromQuery[Option[Boolean]]("includeSubfolders", None), params.fromQuery[Option[String]]("searchQuery", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Boolean]]("compact", None)) { (isActive, isUnreported, organizationName, onlyMyOrganization, uploaderId, folderId, includeSubfolders, searchQuery, limit, compact) =>
        controllers_DatasetController_list60_invoker.call(DatasetController_22.list(isActive, isUnreported, organizationName, onlyMyOrganization, uploaderId, folderId, includeSubfolders, searchQuery, limit, compact))
      }
  
    // @LINE:79
    case controllers_DatasetController_create61_route(params@_) =>
      call(params.fromQuery[String]("typ", None)) { (typ) =>
        controllers_DatasetController_create61_invoker.call(DatasetController_22.create(typ))
      }
  
    // @LINE:80
    case controllers_DatasetController_exploreRemoteDataset62_route(params@_) =>
      call { 
        controllers_DatasetController_exploreRemoteDataset62_invoker.call(DatasetController_22.exploreRemoteDataset())
      }
  
    // @LINE:81
    case controllers_DatasetController_exploreAndAddRemoteDataset63_route(params@_) =>
      call { 
        controllers_DatasetController_exploreAndAddRemoteDataset63_invoker.call(DatasetController_22.exploreAndAddRemoteDataset())
      }
  
    // @LINE:82
    case controllers_DatasetController_getOrganizationForDataset64_route(params@_) =>
      call(params.fromPath[String]("datasetName", None)) { (datasetName) =>
        controllers_DatasetController_getOrganizationForDataset64_invoker.call(DatasetController_22.getOrganizationForDataset(datasetName))
      }
  
    // @LINE:83
    case controllers_DatasetController_health65_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[Option[String]]("sharingToken", None)) { (organizationName, datasetName, sharingToken) =>
        controllers_DatasetController_health65_invoker.call(DatasetController_22.health(organizationName, datasetName, sharingToken))
      }
  
    // @LINE:84
    case controllers_DatasetController_update66_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_update66_invoker.call(DatasetController_22.update(organizationName, datasetName))
      }
  
    // @LINE:85
    case controllers_DatasetController_updatePartial67_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_updatePartial67_invoker.call(DatasetController_22.updatePartial(organizationName, datasetName))
      }
  
    // @LINE:86
    case controllers_DatasetController_accessList68_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_accessList68_invoker.call(DatasetController_22.accessList(organizationName, datasetName))
      }
  
    // @LINE:87
    case controllers_DatasetController_getSharingToken69_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_getSharingToken69_invoker.call(DatasetController_22.getSharingToken(organizationName, datasetName))
      }
  
    // @LINE:88
    case controllers_DatasetController_deleteSharingToken70_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_deleteSharingToken70_invoker.call(DatasetController_22.deleteSharingToken(organizationName, datasetName))
      }
  
    // @LINE:89
    case controllers_DatasetController_updateTeams71_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_updateTeams71_invoker.call(DatasetController_22.updateTeams(organizationName, datasetName))
      }
  
    // @LINE:90
    case controllers_DatasetController_thumbnail72_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromPath[String]("layer", None), params.fromQuery[Option[Int]]("w", None), params.fromQuery[Option[Int]]("h", None), params.fromQuery[Option[String]]("mappingName", None), params.fromQuery[Option[String]]("sharingToken", None)) { (organizationName, datasetName, layer, w, h, mappingName, sharingToken) =>
        controllers_DatasetController_thumbnail72_invoker.call(DatasetController_22.thumbnail(organizationName, datasetName, layer, w, h, mappingName, sharingToken))
      }
  
    // @LINE:91
    case controllers_DatasetController_segmentAnythingEmbedding73_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromPath[String]("layer", None), params.fromQuery[Option[Float]]("intensityMin", None), params.fromQuery[Option[Float]]("intensityMax", None)) { (organizationName, datasetName, layer, intensityMin, intensityMax) =>
        controllers_DatasetController_segmentAnythingEmbedding73_invoker.call(DatasetController_22.segmentAnythingEmbedding(organizationName, datasetName, layer, intensityMin, intensityMax))
      }
  
    // @LINE:92
    case controllers_DatasetController_removeFromThumbnailCache74_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_removeFromThumbnailCache74_invoker.call(DatasetController_22.removeFromThumbnailCache(organizationName, datasetName))
      }
  
    // @LINE:93
    case controllers_DatasetController_isValidNewName75_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_DatasetController_isValidNewName75_invoker.call(DatasetController_22.isValidNewName(organizationName, datasetName))
      }
  
    // @LINE:94
    case controllers_DatasetController_read76_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[Option[String]]("sharingToken", None)) { (organizationName, datasetName, sharingToken) =>
        controllers_DatasetController_read76_invoker.call(DatasetController_22.read(organizationName, datasetName, sharingToken))
      }
  
    // @LINE:97
    case controllers_FolderController_getRoot77_route(params@_) =>
      call { 
        controllers_FolderController_getRoot77_invoker.call(FolderController_4.getRoot())
      }
  
    // @LINE:98
    case controllers_FolderController_getTree78_route(params@_) =>
      call { 
        controllers_FolderController_getTree78_invoker.call(FolderController_4.getTree())
      }
  
    // @LINE:99
    case controllers_FolderController_create79_route(params@_) =>
      call(params.fromQuery[String]("parentId", None), params.fromQuery[String]("name", None)) { (parentId, name) =>
        controllers_FolderController_create79_invoker.call(FolderController_4.create(parentId, name))
      }
  
    // @LINE:100
    case controllers_FolderController_get80_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_FolderController_get80_invoker.call(FolderController_4.get(id))
      }
  
    // @LINE:101
    case controllers_FolderController_update81_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_FolderController_update81_invoker.call(FolderController_4.update(id))
      }
  
    // @LINE:102
    case controllers_FolderController_move82_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("newParentId", None)) { (id, newParentId) =>
        controllers_FolderController_move82_invoker.call(FolderController_4.move(id, newParentId))
      }
  
    // @LINE:103
    case controllers_FolderController_delete83_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_FolderController_delete83_invoker.call(FolderController_4.delete(id))
      }
  
    // @LINE:106
    case controllers_DataStoreController_list84_route(params@_) =>
      call { 
        controllers_DataStoreController_list84_invoker.call(DataStoreController_2.list())
      }
  
    // @LINE:107
    case controllers_WKRemoteDataStoreController_updateOne85_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None)) { (name, key) =>
        controllers_WKRemoteDataStoreController_updateOne85_invoker.call(WKRemoteDataStoreController_7.updateOne(name, key))
      }
  
    // @LINE:108
    case controllers_WKRemoteDataStoreController_updateAll86_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None)) { (name, key) =>
        controllers_WKRemoteDataStoreController_updateAll86_invoker.call(WKRemoteDataStoreController_7.updateAll(name, key))
      }
  
    // @LINE:109
    case controllers_WKRemoteDataStoreController_statusUpdate87_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None)) { (name, key) =>
        controllers_WKRemoteDataStoreController_statusUpdate87_invoker.call(WKRemoteDataStoreController_7.statusUpdate(name, key))
      }
  
    // @LINE:110
    case controllers_WKRemoteDataStoreController_reserveDatasetUpload88_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[String]("token", None)) { (name, key, token) =>
        controllers_WKRemoteDataStoreController_reserveDatasetUpload88_invoker.call(WKRemoteDataStoreController_7.reserveDatasetUpload(name, key, token))
      }
  
    // @LINE:111
    case controllers_WKRemoteDataStoreController_reportDatasetUpload89_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[String]("token", None), params.fromQuery[String]("datasetName", None), params.fromQuery[Long]("datasetSizeBytes", None), params.fromQuery[Boolean]("needsConversion", None), params.fromQuery[Boolean]("viaAddRoute", None)) { (name, key, token, datasetName, datasetSizeBytes, needsConversion, viaAddRoute) =>
        controllers_WKRemoteDataStoreController_reportDatasetUpload89_invoker.call(WKRemoteDataStoreController_7.reportDatasetUpload(name, key, token, datasetName, datasetSizeBytes, needsConversion, viaAddRoute))
      }
  
    // @LINE:112
    case controllers_WKRemoteDataStoreController_deleteDataset90_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None)) { (name, key) =>
        controllers_WKRemoteDataStoreController_deleteDataset90_invoker.call(WKRemoteDataStoreController_7.deleteDataset(name, key))
      }
  
    // @LINE:113
    case controllers_WKRemoteDataStoreController_jobExportProperties91_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[String]("jobId", None)) { (name, key, jobId) =>
        controllers_WKRemoteDataStoreController_jobExportProperties91_invoker.call(WKRemoteDataStoreController_7.jobExportProperties(name, key, jobId))
      }
  
    // @LINE:114
    case controllers_WKRemoteDataStoreController_findCredential92_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[String]("credentialId", None)) { (name, key, credentialId) =>
        controllers_WKRemoteDataStoreController_findCredential92_invoker.call(WKRemoteDataStoreController_7.findCredential(name, key, credentialId))
      }
  
    // @LINE:115
    case controllers_UserTokenController_validateAccessViaDatastore93_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[Option[String]]("token", None)) { (name, key, token) =>
        controllers_UserTokenController_validateAccessViaDatastore93_invoker.call(UserTokenController_9.validateAccessViaDatastore(name, key, token))
      }
  
    // @LINE:116
    case controllers_DataStoreController_create94_route(params@_) =>
      call { 
        controllers_DataStoreController_create94_invoker.call(DataStoreController_2.create())
      }
  
    // @LINE:117
    case controllers_DataStoreController_delete95_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_DataStoreController_delete95_invoker.call(DataStoreController_2.delete(name))
      }
  
    // @LINE:118
    case controllers_DataStoreController_update96_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_DataStoreController_update96_invoker.call(DataStoreController_2.update(name))
      }
  
    // @LINE:121
    case controllers_TracingStoreController_listOne97_route(params@_) =>
      call { 
        controllers_TracingStoreController_listOne97_invoker.call(TracingStoreController_25.listOne())
      }
  
    // @LINE:122
    case controllers_WKRemoteTracingStoreController_handleTracingUpdateReport98_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None)) { (name, key) =>
        controllers_WKRemoteTracingStoreController_handleTracingUpdateReport98_invoker.call(WKRemoteTracingStoreController_28.handleTracingUpdateReport(name, key))
      }
  
    // @LINE:123
    case controllers_UserTokenController_validateAccessViaTracingstore99_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[Option[String]]("token", None)) { (name, key, token) =>
        controllers_UserTokenController_validateAccessViaTracingstore99_invoker.call(UserTokenController_9.validateAccessViaTracingstore(name, key, token))
      }
  
    // @LINE:124
    case controllers_TracingStoreController_update100_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_TracingStoreController_update100_invoker.call(TracingStoreController_25.update(name))
      }
  
    // @LINE:125
    case controllers_WKRemoteTracingStoreController_dataSourceForTracing101_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[String]("tracingId", None)) { (name, key, tracingId) =>
        controllers_WKRemoteTracingStoreController_dataSourceForTracing101_invoker.call(WKRemoteTracingStoreController_28.dataSourceForTracing(name, key, tracingId))
      }
  
    // @LINE:126
    case controllers_WKRemoteTracingStoreController_dataSourceIdForTracing102_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[String]("tracingId", None)) { (name, key, tracingId) =>
        controllers_WKRemoteTracingStoreController_dataSourceIdForTracing102_invoker.call(WKRemoteTracingStoreController_28.dataSourceIdForTracing(name, key, tracingId))
      }
  
    // @LINE:127
    case controllers_WKRemoteTracingStoreController_dataStoreUriForDataset103_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("key", None), params.fromQuery[Option[String]]("organizationName", None), params.fromPath[String]("datasetName", None)) { (name, key, organizationName, datasetName) =>
        controllers_WKRemoteTracingStoreController_dataStoreUriForDataset103_invoker.call(WKRemoteTracingStoreController_28.dataStoreUriForDataset(name, key, organizationName, datasetName))
      }
  
    // @LINE:130
    case controllers_UserTokenController_generateTokenForDataStore104_route(params@_) =>
      call { 
        controllers_UserTokenController_generateTokenForDataStore104_invoker.call(UserTokenController_9.generateTokenForDataStore())
      }
  
    // @LINE:133
    case controllers_AnnotationIOController_upload105_route(params@_) =>
      call { 
        controllers_AnnotationIOController_upload105_invoker.call(AnnotationIOController_19.upload())
      }
  
    // @LINE:134
    case controllers_AnnotationController_duplicate106_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_duplicate106_invoker.call(AnnotationController_26.duplicate(typ, id))
      }
  
    // @LINE:135
    case controllers_AnnotationController_editAnnotation107_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_editAnnotation107_invoker.call(AnnotationController_26.editAnnotation(typ, id))
      }
  
    // @LINE:136
    case controllers_AnnotationController_editAnnotationLayer108_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromPath[String]("tracingId", None)) { (typ, id, tracingId) =>
        controllers_AnnotationController_editAnnotationLayer108_invoker.call(AnnotationController_26.editAnnotationLayer(typ, id, tracingId))
      }
  
    // @LINE:138
    case controllers_AnnotationController_finish109_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (typ, id, timestamp) =>
        controllers_AnnotationController_finish109_invoker.call(AnnotationController_26.finish(typ, id, timestamp))
      }
  
    // @LINE:139
    case controllers_AnnotationController_finishAll110_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromQuery[Long]("timestamp", None)) { (typ, timestamp) =>
        controllers_AnnotationController_finishAll110_invoker.call(AnnotationController_26.finishAll(typ, timestamp))
      }
  
    // @LINE:140
    case controllers_AnnotationController_reopen111_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_reopen111_invoker.call(AnnotationController_26.reopen(typ, id))
      }
  
    // @LINE:141
    case controllers_AnnotationController_reset112_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_reset112_invoker.call(AnnotationController_26.reset(typ, id))
      }
  
    // @LINE:142
    case controllers_AnnotationController_transfer113_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_transfer113_invoker.call(AnnotationController_26.transfer(typ, id))
      }
  
    // @LINE:144
    case controllers_AnnotationController_infoWithoutType114_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (id, timestamp) =>
        controllers_AnnotationController_infoWithoutType114_invoker.call(AnnotationController_26.infoWithoutType(id, timestamp))
      }
  
    // @LINE:145
    case controllers_AnnotationController_makeHybridWithoutType115_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[String]]("fallbackLayerName", None)) { (id, fallbackLayerName) =>
        controllers_AnnotationController_makeHybridWithoutType115_invoker.call(AnnotationController_26.makeHybridWithoutType(id, fallbackLayerName))
      }
  
    // @LINE:146
    case controllers_AnnotationController_downsampleWithoutType116_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("tracingId", None)) { (id, tracingId) =>
        controllers_AnnotationController_downsampleWithoutType116_invoker.call(AnnotationController_26.downsampleWithoutType(id, tracingId))
      }
  
    // @LINE:147
    case controllers_AnnotationController_addAnnotationLayerWithoutType117_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationController_addAnnotationLayerWithoutType117_invoker.call(AnnotationController_26.addAnnotationLayerWithoutType(id))
      }
  
    // @LINE:148
    case controllers_AnnotationController_deleteAnnotationLayerWithoutType118_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("layerName", None)) { (id, layerName) =>
        controllers_AnnotationController_deleteAnnotationLayerWithoutType118_invoker.call(AnnotationController_26.deleteAnnotationLayerWithoutType(id, layerName))
      }
  
    // @LINE:149
    case controllers_AnnotationController_cancelWithoutType119_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationController_cancelWithoutType119_invoker.call(AnnotationController_26.cancelWithoutType(id))
      }
  
    // @LINE:150
    case controllers_AnnotationController_mergeWithoutType120_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("mergedTyp", None), params.fromPath[String]("mergedId", None)) { (id, mergedTyp, mergedId) =>
        controllers_AnnotationController_mergeWithoutType120_invoker.call(AnnotationController_26.mergeWithoutType(id, mergedTyp, mergedId))
      }
  
    // @LINE:151
    case controllers_AnnotationIOController_downloadWithoutType121_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Long]]("skeletonVersion", None), params.fromQuery[Option[Long]]("volumeVersion", None), params.fromQuery[Option[Boolean]]("skipVolumeData", None), params.fromQuery[Option[String]]("volumeDataZipFormat", None)) { (id, skeletonVersion, volumeVersion, skipVolumeData, volumeDataZipFormat) =>
        controllers_AnnotationIOController_downloadWithoutType121_invoker.call(AnnotationIOController_19.downloadWithoutType(id, skeletonVersion, volumeVersion, skipVolumeData, volumeDataZipFormat))
      }
  
    // @LINE:152
    case controllers_AnnotationController_tryAcquiringAnnotationMutex122_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationController_tryAcquiringAnnotationMutex122_invoker.call(AnnotationController_26.tryAcquiringAnnotationMutex(id))
      }
  
    // @LINE:153
    case controllers_AnnotationController_addSegmentIndex123_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("tracingId", None)) { (id, tracingId) =>
        controllers_AnnotationController_addSegmentIndex123_invoker.call(AnnotationController_26.addSegmentIndex(id, tracingId))
      }
  
    // @LINE:154
    case controllers_AnnotationController_addSegmentIndicesToAll124_route(params@_) =>
      call(params.fromQuery[Int]("parallelBatchCount", None), params.fromQuery[Boolean]("dryRun", None), params.fromQuery[Option[String]]("skipTracings", None)) { (parallelBatchCount, dryRun, skipTracings) =>
        controllers_AnnotationController_addSegmentIndicesToAll124_invoker.call(AnnotationController_26.addSegmentIndicesToAll(parallelBatchCount, dryRun, skipTracings))
      }
  
    // @LINE:156
    case controllers_AnnotationController_info125_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (typ, id, timestamp) =>
        controllers_AnnotationController_info125_invoker.call(AnnotationController_26.info(typ, id, timestamp))
      }
  
    // @LINE:157
    case controllers_AnnotationController_makeHybrid126_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Option[String]]("fallbackLayerName", None)) { (typ, id, fallbackLayerName) =>
        controllers_AnnotationController_makeHybrid126_invoker.call(AnnotationController_26.makeHybrid(typ, id, fallbackLayerName))
      }
  
    // @LINE:158
    case controllers_AnnotationController_downsample127_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[String]("tracingId", None)) { (typ, id, tracingId) =>
        controllers_AnnotationController_downsample127_invoker.call(AnnotationController_26.downsample(typ, id, tracingId))
      }
  
    // @LINE:159
    case controllers_AnnotationController_addAnnotationLayer128_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_addAnnotationLayer128_invoker.call(AnnotationController_26.addAnnotationLayer(typ, id))
      }
  
    // @LINE:160
    case controllers_AnnotationController_deleteAnnotationLayer129_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[String]("layerName", None)) { (typ, id, layerName) =>
        controllers_AnnotationController_deleteAnnotationLayer129_invoker.call(AnnotationController_26.deleteAnnotationLayer(typ, id, layerName))
      }
  
    // @LINE:161
    case controllers_AnnotationController_cancel130_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_cancel130_invoker.call(AnnotationController_26.cancel(typ, id))
      }
  
    // @LINE:162
    case controllers_AnnotationController_merge131_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromPath[String]("mergedTyp", None), params.fromPath[String]("mergedId", None)) { (typ, id, mergedTyp, mergedId) =>
        controllers_AnnotationController_merge131_invoker.call(AnnotationController_26.merge(typ, id, mergedTyp, mergedId))
      }
  
    // @LINE:163
    case controllers_AnnotationIOController_download132_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Option[Long]]("skeletonVersion", None), params.fromQuery[Option[Long]]("volumeVersion", None), params.fromQuery[Option[Boolean]]("skipVolumeData", None), params.fromQuery[Option[String]]("volumeDataZipFormat", None)) { (typ, id, skeletonVersion, volumeVersion, skipVolumeData, volumeDataZipFormat) =>
        controllers_AnnotationIOController_download132_invoker.call(AnnotationIOController_19.download(typ, id, skeletonVersion, volumeVersion, skipVolumeData, volumeDataZipFormat))
      }
  
    // @LINE:165
    case controllers_AnnotationPrivateLinkController_annotationSource133_route(params@_) =>
      call(params.fromPath[String]("accessTokenOrId", None), params.fromQuery[Option[String]]("userToken", None)) { (accessTokenOrId, userToken) =>
        controllers_AnnotationPrivateLinkController_annotationSource133_invoker.call(AnnotationPrivateLinkController_0.annotationSource(accessTokenOrId, userToken))
      }
  
    // @LINE:167
    case controllers_AnnotationController_listExplorationals134_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_AnnotationController_listExplorationals134_invoker.call(AnnotationController_26.listExplorationals(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:168
    case controllers_AnnotationController_getSharedTeams135_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_getSharedTeams135_invoker.call(AnnotationController_26.getSharedTeams(typ, id))
      }
  
    // @LINE:169
    case controllers_AnnotationController_updateSharedTeams136_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_AnnotationController_updateSharedTeams136_invoker.call(AnnotationController_26.updateSharedTeams(typ, id))
      }
  
    // @LINE:170
    case controllers_AnnotationController_updateOthersMayEdit137_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Boolean]("othersMayEdit", None)) { (typ, id, othersMayEdit) =>
        controllers_AnnotationController_updateOthersMayEdit137_invoker.call(AnnotationController_26.updateOthersMayEdit(typ, id, othersMayEdit))
      }
  
    // @LINE:173
    case controllers_AnnotationPrivateLinkController_list138_route(params@_) =>
      call { 
        controllers_AnnotationPrivateLinkController_list138_invoker.call(AnnotationPrivateLinkController_0.list())
      }
  
    // @LINE:174
    case controllers_AnnotationPrivateLinkController_listByAnnotation139_route(params@_) =>
      call(params.fromPath[String]("annotationId", None)) { (annotationId) =>
        controllers_AnnotationPrivateLinkController_listByAnnotation139_invoker.call(AnnotationPrivateLinkController_0.listByAnnotation(annotationId))
      }
  
    // @LINE:175
    case controllers_AnnotationPrivateLinkController_create140_route(params@_) =>
      call { 
        controllers_AnnotationPrivateLinkController_create140_invoker.call(AnnotationPrivateLinkController_0.create())
      }
  
    // @LINE:176
    case controllers_AnnotationPrivateLinkController_update141_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationPrivateLinkController_update141_invoker.call(AnnotationPrivateLinkController_0.update(id))
      }
  
    // @LINE:177
    case controllers_AnnotationPrivateLinkController_delete142_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationPrivateLinkController_delete142_invoker.call(AnnotationPrivateLinkController_0.delete(id))
      }
  
    // @LINE:178
    case controllers_AnnotationPrivateLinkController_get143_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationPrivateLinkController_get143_invoker.call(AnnotationPrivateLinkController_0.get(id))
      }
  
    // @LINE:181
    case controllers_MeshController_create144_route(params@_) =>
      call { 
        controllers_MeshController_create144_invoker.call(MeshController_15.create())
      }
  
    // @LINE:182
    case controllers_MeshController_update145_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MeshController_update145_invoker.call(MeshController_15.update(id))
      }
  
    // @LINE:183
    case controllers_MeshController_delete146_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MeshController_delete146_invoker.call(MeshController_15.delete(id))
      }
  
    // @LINE:184
    case controllers_MeshController_get147_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MeshController_get147_invoker.call(MeshController_15.get(id))
      }
  
    // @LINE:185
    case controllers_MeshController_updateData148_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MeshController_updateData148_invoker.call(MeshController_15.updateData(id))
      }
  
    // @LINE:186
    case controllers_MeshController_getData149_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MeshController_getData149_invoker.call(MeshController_15.getData(id))
      }
  
    // @LINE:189
    case controllers_TaskController_create150_route(params@_) =>
      call { 
        controllers_TaskController_create150_invoker.call(TaskController_32.create())
      }
  
    // @LINE:190
    case controllers_TaskController_createFromFiles151_route(params@_) =>
      call { 
        controllers_TaskController_createFromFiles151_invoker.call(TaskController_32.createFromFiles())
      }
  
    // @LINE:191
    case controllers_TaskController_listTasks152_route(params@_) =>
      call { 
        controllers_TaskController_listTasks152_invoker.call(TaskController_32.listTasks())
      }
  
    // @LINE:192
    case controllers_TaskController_listExperienceDomains153_route(params@_) =>
      call { 
        controllers_TaskController_listExperienceDomains153_invoker.call(TaskController_32.listExperienceDomains())
      }
  
    // @LINE:193
    case controllers_TaskController_read154_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskController_read154_invoker.call(TaskController_32.read(id))
      }
  
    // @LINE:194
    case controllers_TaskController_delete155_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskController_delete155_invoker.call(TaskController_32.delete(id))
      }
  
    // @LINE:195
    case controllers_TaskController_update156_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskController_update156_invoker.call(TaskController_32.update(id))
      }
  
    // @LINE:196
    case controllers_TaskController_assignOne157_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("userId", None)) { (id, userId) =>
        controllers_TaskController_assignOne157_invoker.call(TaskController_32.assignOne(id, userId))
      }
  
    // @LINE:197
    case controllers_AnnotationController_annotationsForTask158_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AnnotationController_annotationsForTask158_invoker.call(AnnotationController_26.annotationsForTask(id))
      }
  
    // @LINE:200
    case controllers_TaskTypeController_list159_route(params@_) =>
      call { 
        controllers_TaskTypeController_list159_invoker.call(TaskTypeController_10.list())
      }
  
    // @LINE:201
    case controllers_TaskTypeController_create160_route(params@_) =>
      call { 
        controllers_TaskTypeController_create160_invoker.call(TaskTypeController_10.create())
      }
  
    // @LINE:203
    case controllers_TaskTypeController_delete161_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskTypeController_delete161_invoker.call(TaskTypeController_10.delete(id))
      }
  
    // @LINE:204
    case controllers_TaskController_listTasksForType162_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskController_listTasksForType162_invoker.call(TaskController_32.listTasksForType(id))
      }
  
    // @LINE:205
    case controllers_ProjectController_projectsForTaskType163_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_projectsForTaskType163_invoker.call(ProjectController_13.projectsForTaskType(id))
      }
  
    // @LINE:206
    case controllers_TaskTypeController_get164_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskTypeController_get164_invoker.call(TaskTypeController_10.get(id))
      }
  
    // @LINE:207
    case controllers_TaskTypeController_update165_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TaskTypeController_update165_invoker.call(TaskTypeController_10.update(id))
      }
  
    // @LINE:210
    case controllers_ScriptController_list166_route(params@_) =>
      call { 
        controllers_ScriptController_list166_invoker.call(ScriptController_27.list())
      }
  
    // @LINE:211
    case controllers_ScriptController_create167_route(params@_) =>
      call { 
        controllers_ScriptController_create167_invoker.call(ScriptController_27.create())
      }
  
    // @LINE:212
    case controllers_ScriptController_get168_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ScriptController_get168_invoker.call(ScriptController_27.get(id))
      }
  
    // @LINE:213
    case controllers_ScriptController_update169_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ScriptController_update169_invoker.call(ScriptController_27.update(id))
      }
  
    // @LINE:214
    case controllers_ScriptController_delete170_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ScriptController_delete170_invoker.call(ScriptController_27.delete(id))
      }
  
    // @LINE:217
    case controllers_ProjectController_list171_route(params@_) =>
      call { 
        controllers_ProjectController_list171_invoker.call(ProjectController_13.list())
      }
  
    // @LINE:218
    case controllers_ProjectController_listWithStatus172_route(params@_) =>
      call { 
        controllers_ProjectController_listWithStatus172_invoker.call(ProjectController_13.listWithStatus())
      }
  
    // @LINE:219
    case controllers_ProjectController_create173_route(params@_) =>
      call { 
        controllers_ProjectController_create173_invoker.call(ProjectController_13.create())
      }
  
    // @LINE:220
    case controllers_ProjectController_readByName174_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ProjectController_readByName174_invoker.call(ProjectController_13.readByName(name))
      }
  
    // @LINE:221
    case controllers_ProjectController_read175_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_read175_invoker.call(ProjectController_13.read(id))
      }
  
    // @LINE:222
    case controllers_ProjectController_delete176_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_delete176_invoker.call(ProjectController_13.delete(id))
      }
  
    // @LINE:223
    case controllers_ProjectController_update177_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_update177_invoker.call(ProjectController_13.update(id))
      }
  
    // @LINE:224
    case controllers_ProjectController_tasksForProject178_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, limit, pageNumber, includeTotalCount) =>
        controllers_ProjectController_tasksForProject178_invoker.call(ProjectController_13.tasksForProject(id, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:225
    case controllers_ProjectController_incrementEachTasksInstances179_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Long]]("delta", None)) { (id, delta) =>
        controllers_ProjectController_incrementEachTasksInstances179_invoker.call(ProjectController_13.incrementEachTasksInstances(id, delta))
      }
  
    // @LINE:226
    case controllers_ProjectController_pause180_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_pause180_invoker.call(ProjectController_13.pause(id))
      }
  
    // @LINE:227
    case controllers_ProjectController_resume181_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_resume181_invoker.call(ProjectController_13.resume(id))
      }
  
    // @LINE:228
    case controllers_ProjectController_usersWithActiveTasks182_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_usersWithActiveTasks182_invoker.call(ProjectController_13.usersWithActiveTasks(id))
      }
  
    // @LINE:229
    case controllers_ProjectController_transferActiveTasks183_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_transferActiveTasks183_invoker.call(ProjectController_13.transferActiveTasks(id))
      }
  
    // @LINE:232
    case controllers_OrganizationController_list184_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("compact", None)) { (compact) =>
        controllers_OrganizationController_list184_invoker.call(OrganizationController_6.list(compact))
      }
  
    // @LINE:233
    case controllers_OrganizationController_create185_route(params@_) =>
      call { 
        controllers_OrganizationController_create185_invoker.call(OrganizationController_6.create())
      }
  
    // @LINE:234
    case controllers_OrganizationController_getByInvite186_route(params@_) =>
      call(params.fromPath[String]("inviteToken", None)) { (inviteToken) =>
        controllers_OrganizationController_getByInvite186_invoker.call(OrganizationController_6.getByInvite(inviteToken))
      }
  
    // @LINE:235
    case controllers_OrganizationController_getDefault187_route(params@_) =>
      call { 
        controllers_OrganizationController_getDefault187_invoker.call(OrganizationController_6.getDefault())
      }
  
    // @LINE:236
    case controllers_OrganizationController_organizationsIsEmpty188_route(params@_) =>
      call { 
        controllers_OrganizationController_organizationsIsEmpty188_invoker.call(OrganizationController_6.organizationsIsEmpty())
      }
  
    // @LINE:237
    case controllers_OrganizationController_get189_route(params@_) =>
      call(params.fromPath[String]("organizationName", None)) { (organizationName) =>
        controllers_OrganizationController_get189_invoker.call(OrganizationController_6.get(organizationName))
      }
  
    // @LINE:238
    case controllers_OrganizationController_update190_route(params@_) =>
      call(params.fromPath[String]("organizationName", None)) { (organizationName) =>
        controllers_OrganizationController_update190_invoker.call(OrganizationController_6.update(organizationName))
      }
  
    // @LINE:239
    case controllers_OrganizationController_delete191_route(params@_) =>
      call(params.fromPath[String]("organizationName", None)) { (organizationName) =>
        controllers_OrganizationController_delete191_invoker.call(OrganizationController_6.delete(organizationName))
      }
  
    // @LINE:240
    case controllers_OrganizationController_addUser192_route(params@_) =>
      call(params.fromPath[String]("organizationName", None)) { (organizationName) =>
        controllers_OrganizationController_addUser192_invoker.call(OrganizationController_6.addUser(organizationName))
      }
  
    // @LINE:241
    case controllers_OrganizationController_getOperatorData193_route(params@_) =>
      call { 
        controllers_OrganizationController_getOperatorData193_invoker.call(OrganizationController_6.getOperatorData())
      }
  
    // @LINE:242
    case controllers_OrganizationController_sendExtendPricingPlanEmail194_route(params@_) =>
      call { 
        controllers_OrganizationController_sendExtendPricingPlanEmail194_invoker.call(OrganizationController_6.sendExtendPricingPlanEmail())
      }
  
    // @LINE:243
    case controllers_OrganizationController_sendUpgradePricingPlanEmail195_route(params@_) =>
      call(params.fromQuery[String]("requestedPlan", None)) { (requestedPlan) =>
        controllers_OrganizationController_sendUpgradePricingPlanEmail195_invoker.call(OrganizationController_6.sendUpgradePricingPlanEmail(requestedPlan))
      }
  
    // @LINE:244
    case controllers_OrganizationController_sendUpgradePricingPlanUsersEmail196_route(params@_) =>
      call(params.fromQuery[Int]("requestedUsers", None)) { (requestedUsers) =>
        controllers_OrganizationController_sendUpgradePricingPlanUsersEmail196_invoker.call(OrganizationController_6.sendUpgradePricingPlanUsersEmail(requestedUsers))
      }
  
    // @LINE:245
    case controllers_OrganizationController_sendUpgradePricingPlanStorageEmail197_route(params@_) =>
      call(params.fromQuery[Int]("requestedStorage", None)) { (requestedStorage) =>
        controllers_OrganizationController_sendUpgradePricingPlanStorageEmail197_invoker.call(OrganizationController_6.sendUpgradePricingPlanStorageEmail(requestedStorage))
      }
  
    // @LINE:246
    case controllers_OrganizationController_pricingStatus198_route(params@_) =>
      call { 
        controllers_OrganizationController_pricingStatus198_invoker.call(OrganizationController_6.pricingStatus())
      }
  
    // @LINE:247
    case controllers_OrganizationController_getTermsOfService199_route(params@_) =>
      call { 
        controllers_OrganizationController_getTermsOfService199_invoker.call(OrganizationController_6.getTermsOfService())
      }
  
    // @LINE:248
    case controllers_OrganizationController_acceptTermsOfService200_route(params@_) =>
      call(params.fromQuery[Int]("version", None)) { (version) =>
        controllers_OrganizationController_acceptTermsOfService200_invoker.call(OrganizationController_6.acceptTermsOfService(version))
      }
  
    // @LINE:249
    case controllers_OrganizationController_termsOfServiceAcceptanceNeeded201_route(params@_) =>
      call { 
        controllers_OrganizationController_termsOfServiceAcceptanceNeeded201_invoker.call(OrganizationController_6.termsOfServiceAcceptanceNeeded())
      }
  
    // @LINE:253
    case controllers_TimeController_timeSpansOfUser202_route(params@_) =>
      call(params.fromPath[String]("userId", None), params.fromQuery[Long]("start", None), params.fromQuery[Long]("end", None), params.fromQuery[String]("annotationTypes", None), params.fromQuery[String]("annotationStates", None), params.fromQuery[Option[String]]("projectIds", None)) { (userId, start, _pf_escape_end, annotationTypes, annotationStates, projectIds) =>
        controllers_TimeController_timeSpansOfUser202_invoker.call(TimeController_23.timeSpansOfUser(userId, start, _pf_escape_end, annotationTypes, annotationStates, projectIds))
      }
  
    // @LINE:254
    case controllers_TimeController_timeSummedByAnnotationForUser203_route(params@_) =>
      call(params.fromPath[String]("userId", None), params.fromQuery[Long]("start", None), params.fromQuery[Long]("end", None), params.fromQuery[String]("annotationTypes", None), params.fromQuery[String]("annotationStates", None), params.fromQuery[Option[String]]("projectIds", None)) { (userId, start, _pf_escape_end, annotationTypes, annotationStates, projectIds) =>
        controllers_TimeController_timeSummedByAnnotationForUser203_invoker.call(TimeController_23.timeSummedByAnnotationForUser(userId, start, _pf_escape_end, annotationTypes, annotationStates, projectIds))
      }
  
    // @LINE:255
    case controllers_TimeController_timeOverview204_route(params@_) =>
      call(params.fromQuery[Long]("start", None), params.fromQuery[Long]("end", None), params.fromQuery[String]("annotationTypes", None), params.fromQuery[String]("annotationStates", None), params.fromQuery[Option[String]]("teamIds", None), params.fromQuery[Option[String]]("projectIds", None)) { (start, _pf_escape_end, annotationTypes, annotationStates, teamIds, projectIds) =>
        controllers_TimeController_timeOverview204_invoker.call(TimeController_23.timeOverview(start, _pf_escape_end, annotationTypes, annotationStates, teamIds, projectIds))
      }
  
    // @LINE:258
    case controllers_WKRemoteWorkerController_requestJobs205_route(params@_) =>
      call(params.fromQuery[String]("key", None)) { (key) =>
        controllers_WKRemoteWorkerController_requestJobs205_invoker.call(WKRemoteWorkerController_5.requestJobs(key))
      }
  
    // @LINE:259
    case controllers_JobsController_list206_route(params@_) =>
      call { 
        controllers_JobsController_list206_invoker.call(JobsController_29.list())
      }
  
    // @LINE:260
    case controllers_JobsController_status207_route(params@_) =>
      call { 
        controllers_JobsController_status207_invoker.call(JobsController_29.status())
      }
  
    // @LINE:261
    case controllers_JobsController_runConvertToWkwJob208_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("scale", None)) { (organizationName, datasetName, scale) =>
        controllers_JobsController_runConvertToWkwJob208_invoker.call(JobsController_29.runConvertToWkwJob(organizationName, datasetName, scale))
      }
  
    // @LINE:262
    case controllers_JobsController_runComputeMeshFileJob209_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("layerName", None), params.fromQuery[String]("mag", None), params.fromQuery[Option[String]]("agglomerateView", None)) { (organizationName, datasetName, layerName, mag, agglomerateView) =>
        controllers_JobsController_runComputeMeshFileJob209_invoker.call(JobsController_29.runComputeMeshFileJob(organizationName, datasetName, layerName, mag, agglomerateView))
      }
  
    // @LINE:263
    case controllers_JobsController_runComputeSegmentIndexFileJob210_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("layerName", None)) { (organizationName, datasetName, layerName) =>
        controllers_JobsController_runComputeSegmentIndexFileJob210_invoker.call(JobsController_29.runComputeSegmentIndexFileJob(organizationName, datasetName, layerName))
      }
  
    // @LINE:264
    case controllers_JobsController_runExportTiffJob211_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("bbox", None), params.fromQuery[Option[String]]("layerName", None), params.fromQuery[Option[String]]("mag", None), params.fromQuery[Option[String]]("annotationLayerName", None), params.fromQuery[Option[String]]("annotationId", None), params.fromQuery[Boolean]("asOmeTiff", None)) { (organizationName, datasetName, bbox, layerName, mag, annotationLayerName, annotationId, asOmeTiff) =>
        controllers_JobsController_runExportTiffJob211_invoker.call(JobsController_29.runExportTiffJob(organizationName, datasetName, bbox, layerName, mag, annotationLayerName, annotationId, asOmeTiff))
      }
  
    // @LINE:265
    case controllers_JobsController_runInferNucleiJob212_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("layerName", None), params.fromQuery[String]("newDatasetName", None)) { (organizationName, datasetName, layerName, newDatasetName) =>
        controllers_JobsController_runInferNucleiJob212_invoker.call(JobsController_29.runInferNucleiJob(organizationName, datasetName, layerName, newDatasetName))
      }
  
    // @LINE:266
    case controllers_JobsController_runInferNeuronsJob213_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("layerName", None), params.fromQuery[String]("bbox", None), params.fromQuery[String]("outputSegmentationLayerName", None), params.fromQuery[String]("newDatasetName", None)) { (organizationName, datasetName, layerName, bbox, outputSegmentationLayerName, newDatasetName) =>
        controllers_JobsController_runInferNeuronsJob213_invoker.call(JobsController_29.runInferNeuronsJob(organizationName, datasetName, layerName, bbox, outputSegmentationLayerName, newDatasetName))
      }
  
    // @LINE:267
    case controllers_JobsController_runInferMitochondriaJob214_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("layerName", None), params.fromQuery[String]("bbox", None), params.fromQuery[String]("outputSegmentationLayerName", None), params.fromQuery[String]("newDatasetName", None)) { (organizationName, datasetName, layerName, bbox, outputSegmentationLayerName, newDatasetName) =>
        controllers_JobsController_runInferMitochondriaJob214_invoker.call(JobsController_29.runInferMitochondriaJob(organizationName, datasetName, layerName, bbox, outputSegmentationLayerName, newDatasetName))
      }
  
    // @LINE:268
    case controllers_JobsController_runMaterializeVolumeAnnotationJob215_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("fallbackLayerName", None), params.fromQuery[String]("annotationId", None), params.fromQuery[String]("annotationType", None), params.fromQuery[String]("newDatasetName", None), params.fromQuery[String]("outputSegmentationLayerName", None), params.fromQuery[Boolean]("mergeSegments", None), params.fromQuery[Option[String]]("volumeLayerName", None)) { (organizationName, datasetName, fallbackLayerName, annotationId, annotationType, newDatasetName, outputSegmentationLayerName, mergeSegments, volumeLayerName) =>
        controllers_JobsController_runMaterializeVolumeAnnotationJob215_invoker.call(JobsController_29.runMaterializeVolumeAnnotationJob(organizationName, datasetName, fallbackLayerName, annotationId, annotationType, newDatasetName, outputSegmentationLayerName, mergeSegments, volumeLayerName))
      }
  
    // @LINE:269
    case controllers_JobsController_runFindLargestSegmentIdJob216_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None), params.fromQuery[String]("layerName", None)) { (organizationName, datasetName, layerName) =>
        controllers_JobsController_runFindLargestSegmentIdJob216_invoker.call(JobsController_29.runFindLargestSegmentIdJob(organizationName, datasetName, layerName))
      }
  
    // @LINE:270
    case controllers_JobsController_runRenderAnimationJob217_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_JobsController_runRenderAnimationJob217_invoker.call(JobsController_29.runRenderAnimationJob(organizationName, datasetName))
      }
  
    // @LINE:271
    case controllers_JobsController_get218_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_JobsController_get218_invoker.call(JobsController_29.get(id))
      }
  
    // @LINE:272
    case controllers_JobsController_cancel219_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_JobsController_cancel219_invoker.call(JobsController_29.cancel(id))
      }
  
    // @LINE:273
    case controllers_WKRemoteWorkerController_updateJobStatus220_route(params@_) =>
      call(params.fromQuery[String]("key", None), params.fromPath[String]("id", None)) { (key, id) =>
        controllers_WKRemoteWorkerController_updateJobStatus220_invoker.call(WKRemoteWorkerController_5.updateJobStatus(key, id))
      }
  
    // @LINE:274
    case controllers_JobsController_redirectToExport221_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_JobsController_redirectToExport221_invoker.call(JobsController_29.redirectToExport(id))
      }
  
    // @LINE:277
    case controllers_PublicationController_listPublications222_route(params@_) =>
      call { 
        controllers_PublicationController_listPublications222_invoker.call(PublicationController_8.listPublications())
      }
  
    // @LINE:278
    case controllers_PublicationController_read223_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PublicationController_read223_invoker.call(PublicationController_8.read(id))
      }
  
    // @LINE:281
    case controllers_ShortLinkController_create224_route(params@_) =>
      call { 
        controllers_ShortLinkController_create224_invoker.call(ShortLinkController_30.create())
      }
  
    // @LINE:282
    case controllers_ShortLinkController_getByKey225_route(params@_) =>
      call(params.fromPath[String]("key", None)) { (key) =>
        controllers_ShortLinkController_getByKey225_invoker.call(ShortLinkController_30.getByKey(key))
      }
  
    // @LINE:285
    case controllers_CredentialController_createHttpBasicAuthCredential226_route(params@_) =>
      call { 
        controllers_CredentialController_createHttpBasicAuthCredential226_invoker.call(CredentialController_17.createHttpBasicAuthCredential())
      }
  
    // @LINE:286
    case controllers_CredentialController_createS3AccessKeyCredential227_route(params@_) =>
      call { 
        controllers_CredentialController_createS3AccessKeyCredential227_invoker.call(CredentialController_17.createS3AccessKeyCredential())
      }
  
    // @LINE:287
    case controllers_CredentialController_createGoogleServiceAccountCredential228_route(params@_) =>
      call { 
        controllers_CredentialController_createGoogleServiceAccountCredential228_invoker.call(CredentialController_17.createGoogleServiceAccountCredential())
      }
  
    // @LINE:290
    case controllers_EmailVerificationController_verify229_route(params@_) =>
      call(params.fromPath[String]("key", None)) { (key) =>
        controllers_EmailVerificationController_verify229_invoker.call(EmailVerificationController_18.verify(key))
      }
  
    // @LINE:291
    case controllers_EmailVerificationController_requestVerificationMail230_route(params@_) =>
      call { 
        controllers_EmailVerificationController_requestVerificationMail230_invoker.call(EmailVerificationController_18.requestVerificationMail())
      }
  
    // @LINE:294
    case controllers_VoxelyticsController_storeWorkflow231_route(params@_) =>
      call { 
        controllers_VoxelyticsController_storeWorkflow231_invoker.call(VoxelyticsController_16.storeWorkflow())
      }
  
    // @LINE:295
    case controllers_VoxelyticsController_listWorkflows232_route(params@_) =>
      call { 
        controllers_VoxelyticsController_listWorkflows232_invoker.call(VoxelyticsController_16.listWorkflows())
      }
  
    // @LINE:296
    case controllers_VoxelyticsController_getWorkflow233_route(params@_) =>
      call(params.fromPath[String]("workflowHash", None), params.fromQuery[Option[String]]("runId", None)) { (workflowHash, runId) =>
        controllers_VoxelyticsController_getWorkflow233_invoker.call(VoxelyticsController_16.getWorkflow(workflowHash, runId))
      }
  
    // @LINE:297
    case controllers_VoxelyticsController_storeWorkflowEvents234_route(params@_) =>
      call(params.fromPath[String]("workflowHash", None), params.fromQuery[String]("runName", None)) { (workflowHash, runName) =>
        controllers_VoxelyticsController_storeWorkflowEvents234_invoker.call(VoxelyticsController_16.storeWorkflowEvents(workflowHash, runName))
      }
  
    // @LINE:298
    case controllers_VoxelyticsController_getChunkStatistics235_route(params@_) =>
      call(params.fromPath[String]("workflowHash", None), params.fromQuery[Option[String]]("runId", None), params.fromQuery[String]("taskName", None)) { (workflowHash, runId, taskName) =>
        controllers_VoxelyticsController_getChunkStatistics235_invoker.call(VoxelyticsController_16.getChunkStatistics(workflowHash, runId, taskName))
      }
  
    // @LINE:299
    case controllers_VoxelyticsController_getArtifactChecksums236_route(params@_) =>
      call(params.fromPath[String]("workflowHash", None), params.fromQuery[Option[String]]("runId", None), params.fromQuery[String]("taskName", None), params.fromQuery[Option[String]]("artifactName", None)) { (workflowHash, runId, taskName, artifactName) =>
        controllers_VoxelyticsController_getArtifactChecksums236_invoker.call(VoxelyticsController_16.getArtifactChecksums(workflowHash, runId, taskName, artifactName))
      }
  
    // @LINE:300
    case controllers_VoxelyticsController_appendLogs237_route(params@_) =>
      call { 
        controllers_VoxelyticsController_appendLogs237_invoker.call(VoxelyticsController_16.appendLogs())
      }
  
    // @LINE:301
    case controllers_VoxelyticsController_getLogs238_route(params@_) =>
      call(params.fromQuery[String]("runId", None), params.fromQuery[Option[String]]("taskName", None), params.fromQuery[Option[String]]("minLevel", None), params.fromQuery[Long]("startTimestamp", None), params.fromQuery[Long]("endTimestamp", None), params.fromQuery[Option[Int]]("limit", None)) { (runId, taskName, minLevel, startTimestamp, endTimestamp, limit) =>
        controllers_VoxelyticsController_getLogs238_invoker.call(VoxelyticsController_16.getLogs(runId, taskName, minLevel, startTimestamp, endTimestamp, limit))
      }
  }
}
