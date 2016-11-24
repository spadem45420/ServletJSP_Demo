<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="getServlet" method="get">
		name: <input type="text" id="nameId" name="name"/><br>
		text: <input type="text" id="textId" name="text"/><br>
		<input type="submit" id="submit" value="submit"/>
		
		<p>${test}</p>
		<c:forEach items="${mapList}" var="map">
			<p>${map.text}</p>
		</c:forEach>
		<p></p>
	</form>
</body>
</html>