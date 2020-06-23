<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	修改信息
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String day = request.getParameter("day");
	String mobile = request.getParameter("num");
	System.out.print(id + name + pass + day + mobile);
%>
	<form action="" method="post">
		序号：<input name="id" value="<%=id%>" type="text"><br> 账号：<input
			name="name" value="<%=name%>" type="text"><br> 密码：<input
			name="pass" value="<%=pass%>" type="text"><br> 生日：<input
			name="day" value="<%=day%>" type="text"><br> 手机号：<input
			name="num" value="<%=mobile%>" type="text"><br> <input
			name="submit" value="修改" type="submit"><br>

	</form>
</body>
</html>