<%--
  Created by IntelliJ IDEA.
  User: Ильнур
  Date: 09.12.2022
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<%@ page import="model.Cart" %>
<% Cart cart = (Cart) session.getAttribute("cart"); %>

<p>
    Наименование: <%= cart.getProduct() %>
</p>

<p>
    Количе6свто: <%= cart.getQuantity() %>
<p>
<%--%> for (int i = 0; i < 10; i++) {
    System.out.println(i);
} --%>
</p>
</body>
</html>
