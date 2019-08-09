<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="service" class="com.demo.service.UserService"/>
<jsp:useBean id="user" class="com.demo.users.User"/>
<jsp:setProperty property="*" name="user"/>

	<%
	
//String uname=request.getParameter("username");
//String pword=request.getParameter("password");
//	UserService service=new UserService();
	if(service.login(user)){
		response.sendRedirect("dashboard.jsp");
	}
	else
		response.sendRedirect("error.jsp");
	%>
</body>
</html>