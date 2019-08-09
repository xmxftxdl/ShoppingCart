<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.demo.productElement.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>Product ID </td>
	<td>Product name</td>
	<td>Product price</td>
</tr>
<%
    List<Product>Products=(List)request.getAttribute("ListProduct");
	for(int i=0;i<Products.size();i++){
%><tr>
		<td><%=Products.get(i).getID() %></td>
		<td><%=Products.get(i).getName() %></td>
		<td><%=Products.get(i).getPrice() %></td>
		<td><a href="CartList?ID=<%=Products.get(i).getID() %>">Add To Cart</a></td>
</tr>
<% 
	}
%>
</table>
</body>
</html>