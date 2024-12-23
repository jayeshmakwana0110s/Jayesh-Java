<%@page import="com.model.ProductModel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Regal Threads India</title>
    <link rel="stylesheet" href="index.css">

</head>
<body>
	${msg }
	<%@ include file="header.jsp" %>
	 
	<main>
	<section class="product-section">
	<%Connection cn = new DBUtil().getConnection();
        String qry = "select * from product";
        PreparedStatement stmt = cn.prepareStatement(qry);
     	ResultSet rs = stmt.executeQuery();
        while(rs.next())
       {
       %>
    	<div class="product-card">
        <img src="productimage/<%=rs.getString(7)%>" alt="Wireless Headphones" class="product-image">
        <h3><%=rs.getString(2) %></h3>
        <p><%=rs.getString(6) %></p>
        <h1>Price : <%=rs.getString(5) %></h1>
			<a href="edit.jsp?productid=<%= rs.getInt(1) %>" 
   			style="display: inline-block; padding: 10px 20px; background-color: #007bff; color: white; text-decoration: none; border-radius: 5px; font-size: 14px; border: none; margin-right: 5px;">
   			Edit
			</a>
			<a href="ProductController?action=deleteuser" 
   			style="display: inline-block; padding: 10px 20px; background-color: #dc3545; color: white; text-decoration: none; border-radius: 5px; font-size: 14px; border: none;">
   			Delete
			</a>

    	</div>
    	<%
       }
        %>
	</section>
		
    </main>
    
    <main>
        <section class="hero-section">
            <h1>Welcome to Regal Threads India Where Elegance Meets Tradition</h1>
            <p>Discover a world of timeless ethnic fashion at Regal Threads India!</p>
        </section>
    </main>
    
    <script src="index.js"></script>
</body>
</html>