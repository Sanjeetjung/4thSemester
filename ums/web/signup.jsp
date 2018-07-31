<%-- 
    Document   : signup
    Created on : Jul 14, 2018, 11:26:23 AM
    Author     : Sanjeet Jung Gurung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UMS:Sign up</title>
    </head>
    <body>
         <center>
               <h1>Create Your Account</h1>
               <h2>Already have an Account?
                   <a href="login.jsp">
                     Login</a>
                   </h2>
        <form method="get" action="./SignupServlet">
               Name:<input type="text" name="userName" placeholder="username"/><br/><br/>
               Password:<input type="password" name="userPass" placeholder="Password"/><br/><br/>
               Address:<input type="text" name="address" placeholder="address"/><br/><br/>
               Contact:<input type="number" name="ContactNumber" placeholder="Contact Number"/><br/><br/>
               Email:<input type="email" name="EmailId" placeholder="Email address"/><br/><br/>
               Birthday:<input type="date" name="Birthday"/><br/><br/> 
               Gender:
               <br/><input type="radio" value="Male" name="gender"/>Male<br/>
                      <input type="radio" value="Female" name="gender" />Female<br/>
                      <input type="radio" value="Others" name="gender" />Others<br/><br/>
                 <input type="submit" value="Create Account" name="Sign Up"/>
        </form>
      </center>
    </body>
</html>
