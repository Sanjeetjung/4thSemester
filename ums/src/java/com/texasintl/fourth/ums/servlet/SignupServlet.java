/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texasintl.fourth.ums.servlet;

import com.texasintl.fourth.ums.db.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sanjeet Jung Gurung
 */
public class SignupServlet extends HttpServlet {
 public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
          response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
        String password=request.getParameter("userPass");
	String username=request.getParameter("userName");
        String address=request.getParameter("address");
        String cnumber=request.getParameter("ContactNumber");
        String email=request.getParameter("EmailId");
        String birthday=request.getParameter("Birthday");
        String gender=request.getParameter("gender");

        out.println("Details of Login user:"+"<br/>"+"<br/>");
	out.println("Username :"+username+"<br/>"+"<br/>");
	out.println("Password :"+password+"<br/>"+"<br/>"); 
        out.println("Address :"+address+"<br/>"+"<br/>");
        out.println("Contact Number:"+cnumber+"<br/>"+"<br/>");
        out.println("Email :"+email+"<br/>"+"<br/>");
        out.println("Birthday :"+birthday+"<br/>"+"<br/>");
        out.println("Gender :"+gender+"<br/>"+"<br/>"); 
        
        
        Connection cn = DatabaseConnection.getConnection();
        String sql= "insert into user_signup(Username,Password,Contact_Number,Birthday,Gender,Address,Email) "
                + "values('"+username+"','"+password+"','"+cnumber+"','"+birthday+"','"+gender+"',"
                + "'"+address+"','"+email+"')";
        System.out.println("SQL:"+sql);
        try{
            Statement stat= cn.createStatement();
            stat.executeUpdate(sql);
            out.println("Inserted");
             response.sendRedirect("./login.jsp");
            
    }
        catch(SQLException ex){
            ex.printStackTrace();
             response.sendRedirect("./error.jsp");
        }
        
       

     }

}