<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layouts/taglibs.jsp"%>

<div class="col-sm-9 col-md-10">
	<ol class="breadcrumb">
		<li><a
			href='<spring:url value="/pridat-video.html"></spring:url>'>Nové
				video</a></li>
	</ol>
	<div class="row">
		<c:forEach items="${videos}" var="video">
			<c:if test="${video.enabled == true}">
				<div class="col-md-3">
					<div class="panel panel-default">
						<div class="panel-body">
							<p>${fn:substring(video.title, 0, 25)}...</p>
							<a href="<spring:url value="/admin/video?id=${video.id}" />"><img
								src="http://i.ytimg.com/vi/${video.yid}/hqdefault.jpg"
								class="img-responsive" alt="" /></a>
						</div>
						<div class="panel-footer">
							<span class="glyphicon glyphicon-calendar"></span>
							<fmt:formatDate value="${video.publishDate}" pattern="dd.MM.yyyy" />
							<a href="<spring:url value="/admin/video/zverejnit?id=${video.id}" />"
								class="btn btn-xs btn-default pull-right btn-success">Zveřejnit</a>
						</div>
					</div>
				</div>
			</c:if>
		</c:forEach>
	</div>
</div>