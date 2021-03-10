<%-- 
    Document   : error
    Created on : 25 feb. 2021, 21:19:39
    Author     : l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservas -Error</title>
    </head>
    <body>
        <c:if test="${not empty mensaje}">
            <h1>Ha ocurrido un error</h1>
            <h3>${mensaje}</h3>
        </c:if>
    </body>
</html>
