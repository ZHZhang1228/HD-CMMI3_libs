<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	身份验证
	<%
	String aa = "123";
	//response.sendRedirect("./demo/index");
%>

	<form action="./login/login" method="post">
		<input name="username" type="text"><br> <input
			name="submit" type="submit" value="验证"><br>
	</form>
</body>
</html>