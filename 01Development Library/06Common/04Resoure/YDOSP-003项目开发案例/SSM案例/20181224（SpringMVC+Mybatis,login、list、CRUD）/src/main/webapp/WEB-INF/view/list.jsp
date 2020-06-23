<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*,com.hwadee.pro.model.users"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserList</title>
</head>
<body>
<%
 //List<users> listUser;
%>
 <table border="1">
        <tbody>
            <tr>
                <th>序号</th>
                <th>账号</th>
                <th>密码</th>
                <th>生日</th>                               
                <th>电话号码</th>
                <th>操作</th>
            </tr>
            <c:if test="${!empty listUser }">
                <c:forEach items="${listUser}" var="list">
                    <tr>
                        <td>${list.id }</td>
                        <td>${list.username }</td>
                        <td>${list.password }</td>
                        <td>${list.birthday }</td>
                        <td>${list.mobile }</td>                      
                        <td><a href="">删除</a>、<a href="../update.jsp?id=${list.id}&name=${list.username}&pass=${list.password}&day=${list.birthday}&num=${list.mobile}">修改</a></td>
                        
                    </tr>                
                </c:forEach>
            </c:if>
        </tbody>
    </table>
</body>
</html>