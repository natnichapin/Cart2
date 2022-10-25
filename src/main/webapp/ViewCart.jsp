<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Natnicha
  Date: 10/25/2022
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<h1>View Cart</h1>
<hr>
<c:if test="${message!=null}">
<h2> ${message} </h2>
</c:if>
<c:forEach items="${cart.getItems()}" var="cartItem" varStatus="vs">
    <h1>   ${cartItem.product.productName}   </h1>
    <h3>  Number :  ${cartItem.amount}   </h3>
    <h3>   ${cartItem.getLineItemTotal()} bath   </h3>
------------------------------------------------------

</c:forEach>
<br>
<c:if test="${message==null}">
<h2> total : ${cart.getCartTotal()} bath </h2>
</c:if>
</body>
</html>
