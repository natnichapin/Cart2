<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Natnicha
  Date: 10/24/2022
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<form action="add_to_cart_021Servlet" method="post">
<c:forEach items="${ListP}" var="product" varStatus="vs">
    <h2> getProductName : ${product.productName} </h2> <br>
    <input type="checkbox" name="select" value="${product.productCode}">
    productCode : ${product.productCode} <br>
    price :  ${product.price} bath <br>
    <input type="number" min="1"  maxlength="4" name="${product.productCode}"  size="4" > <br>
    ------------------------------------------------------
</c:forEach>
    <br>
    <input style="background-color: papayawhip" type="submit" value="Confirm">
</form>
</body>
</html>
