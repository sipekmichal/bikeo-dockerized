<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layouts/taglibs.jsp"%>

<ul class="thumbnails">
	<c:choose>
		<c:when test="${isSearchEmpty == true}">
			<h3 align="center">Hledane video nebylo nalezeno!</h3>
		</c:when>
	</c:choose>
	<c:forEach items="${videos}" var="video">
		<li class="span3">
			<div class="thumbnail">
				<a href="/bikeo/watch?v=${video.id}"> <img
					src="http://i.ytimg.com/vi/${video.yid}/hqdefault.jpg"
					alt="${video.title}">
					<div class="caption">
						<p>
							<strong>${fn:substring(video.title, 0, 30)}...</strong>
						</p>
					</div>
				</a>
			</div>
		</li>
	</c:forEach>
</ul>