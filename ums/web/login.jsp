<%-- 
    Document   : login
    Created on : Jul 11, 2018, 8:43:39 AM
    Author     : Sanjeet Jung Gurung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UMS:Login</title>
    </head>
    <body>
      <center>
          
               <h1>Welcome to UMS:</h1>
               <h2> LOGIN</h2>
        <form method="get" action="/LoginServlet">
               Username:<input type="text" name="username" placeholder="username"><br><br>
               Password:<input type="password" name="password" placeholder="password"><br><br>
               <input type="submit" value="Login" name="Login">
        </form>
               <h2>OR</h2>
               <h3> 
                   <a href="signup.jsp">
                       Create Account</a>
               </h3>
               <h4>OR</h4>
               <h5>
                   <a href="./UserListServlet">
                       
                        View List of Users!</a>
               </h5>
      </center>
    
    </body>
</html>
