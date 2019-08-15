<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%><!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><la:message key="labels.admin_brand_title" /> | <la:message
            key="labels.plugin_management" /></title>
    <jsp:include page="/WEB-INF/view/common/admin/head.jsp"></jsp:include>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="/WEB-INF/view/common/admin/header.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/view/common/admin/sidebar.jsp">
        <jsp:param name="menuCategoryType" value="system" />
        <jsp:param name="menuType" value="plugin" />
    </jsp:include>
    <div class="content-wrapper">
        <section class="content-header">
            <h1>
                <la:message key="labels.plugin_management" />
            </h1>
            <jsp:include page="/WEB-INF/view/common/admin/crud/breadcrumb.jsp"></jsp:include>
        </section>
        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <!-- /.box-header -->

                        <div class="box-body">
                            <%-- Message --%>
                            <div>
                                <la:info id="msg" message="true">
                                    <div class="alert alert-info">${msg}</div>
                                </la:info>
                                <la:errors />
                            </div>
                            <%-- List --%>
                            <div class="data-wrapper">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <table class="table table-bordered table-striped dataTable">
                                            <tbody>
                                            <tr>
                                                <th><la:message key="labels.plugin_type" /></th>
                                                <th><la:message key="labels.plugin_name" /></th>
                                                <th><la:message key="labels.plugin_version" /></th>
                                                <th></th>
                                            </tr>
                                            <c:forEach var="artifact" varStatus="s"
                                                       items="${installedArtifactItems}">
                                                <tr>
                                                    <td>${f:h(artifact.type)}</td>
                                                    <td>${f:h(artifact.name)}</td>
                                                    <td>${f:h(artifact.version)}</td>
                                                    <td>

                                                        <button type="button" class="btn btn-danger" name="delete"
                                                                data-toggle="modal" data-target="#confirmToDelete"
                                                                value="<la:message key="labels.crud_button_delete" />">
                                                            <em class="fa fa-trash"></em>
                                                            <la:message key="labels.crud_button_delete" />
                                                        </button>
                                                        <div class="modal modal-danger fade" id="confirmToDelete" tabindex="-1"
                                                             role="dialog">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">
                                                                    <div class="modal-header">
                                                                        <button type="button" class="close" data-dismiss="modal"
                                                                                aria-label="Close">
                                                                            <span aria-hidden="true">×</span>
                                                                        </button>
                                                                        <h4 class="modal-title">
                                                                            <la:message key="labels.crud_title_delete" />
                                                                        </h4>
                                                                    </div>
                                                                    <div class="modal-body">
                                                                        <p>
                                                                            <la:message key="labels.crud_delete_confirmation" />
                                                                        </p>
                                                                    </div>
                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn btn-outline pull-left"
                                                                                data-dismiss="modal">
                                                                            <la:message key="labels.crud_button_cancel" />
                                                                        </button>
                                                                        <button type="submit" class="btn btn-outline btn-danger"
                                                                                name="delete"
                                                                                value="<la:message key="labels.crud_button_delete" />">
                                                                            <em class="fa fa-trash"></em>
                                                                            <la:message key="labels.crud_button_delete" />
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- /.data-wrapper -->
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
            </div>
        </section>
    </div>
    <jsp:include page="/WEB-INF/view/common/admin/footer.jsp"></jsp:include>
</div>
<jsp:include page="/WEB-INF/view/common/admin/foot.jsp"></jsp:include>
</body>
</html>

