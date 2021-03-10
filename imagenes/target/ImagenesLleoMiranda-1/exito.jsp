<%-- 
    Document   : exito
    Created on : 25 feb. 2021, 21:19:29
    Author     : l
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Su reserva</title>
    </head>
    <body>
        <c:if test="${not empty total}">
            <h1>Su reserva ha tenido éxito</h1>
            <img src="images/${codigo}.jpg"/>
            <h3>Precio de la reserva ${codigo}: ${total}</h3>
        </c:if>

    </body>
</html>
