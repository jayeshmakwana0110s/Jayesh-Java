<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eCommerce - Computer Accessories</title>
<link rel="stylesheet" href="addproduct.css">
</head>
<body>
	${msg }
	<%@ include file="header.jsp" %>
	
	<div class="form-container">
        <h2>Add Product</h2>
        <form action="AddProductController" method="post" enctype="multipart/form-data">
    <label for="productname">Product Name:</label>
    <input type="text" id="productname" name="productname" />

    <label for="productcategory">Product Category:</label>
    <input type="text" id="productcategory" name="productcategory" />

    <label for="productmodel">Product Model:</label>
    <input type="text" id="productmodel" name="productmodel" />

    <label for="price">Price:</label>
    <input type="text" id="price" name="price" />

    <label for="productdescription">Product Description:</label>
    <textarea id="productdescription" name="productdescription"></textarea>
            
    <label for="productImage">Product Image:</label>
    <input type="file" id="productImage" name="image" accept="image/*" />
            
    <button type="submit">Submit</button>
</form>
    </div>	
</body>
</html>