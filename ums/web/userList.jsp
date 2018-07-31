<%-- 
    Document   : useList
    Created on : Jul 20, 2018, 8:47:01 AM
    Author     : Sanjeet Jung Gurung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Lists:</h1>
        
        <table border="1">
            
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Address</td>
                <td>Email</td>

            </tr>
            <c:forEach var="user" items="${userDtoList}">
             <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.address}</td>
                <td>${user.email}</td>

            </tr>
            </c:forEach>
            
        </table>
        
        
         <h4>OR</h4>
               <h5>
                   <a href="login.jsp">
                       Go to Login:</a>
               </h5>
    </body>
</html>
