<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. 깃</P><br>
<p>마이바티스 연동 테스트</p>
<c:forEach var="user" items="${bList}">
	<c:out value="${user.name}"/>
	<c:out value="${user.id}"/>
	<c:out value="${user.password}"/>
	<br>
</c:forEach>
<br>
<br>
<c:forEach var="admin" items="${aList}">
	<c:out value="${admin.name}"/>
	<c:out value="${admin.id}"/>
	<c:out value="${admin.password}"/>
	<br>
</c:forEach>
</body>
</html>