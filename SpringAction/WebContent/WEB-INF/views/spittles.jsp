<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<c:forEach items="${spittleList}" var="spillte">
		<li id="spittle_<c:out value="spittle.id"/>">
			<div class="spittleMessage">
				<c:out value="${spittle.message}"/>
			</div>
			<div>
				<span class="spittleTime"><c:out value="${spittle.time}"/></span>
				<span class="spittleLocation">
					(<c:out value="${spittle.latitude }"/>,
					<c:out value="${spittle.longitude }"/>)
				</span>
			</div>
		</li>
	</c:forEach>
</ul>
</body>
</html>