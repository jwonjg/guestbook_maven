<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="insert" method="post">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="pass"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="message" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<c:forEach varStatus="status" var="vo" items="${ list }">
	<br>
	<table width=510 border=1>
		<tr>
			<td>${ status.index }</td>
			<td>${ vo.name }</td>
			<td>${ vo.regDate }</td>
			<td><a href="deleteform?no=${ vo.no }">삭제</a></td>
		</tr>
		<tr>
			<td colspan=4>
				${ vo.message }
			</td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>