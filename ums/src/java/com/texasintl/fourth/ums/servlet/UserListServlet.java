/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texasintl.fourth.ums.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import com.texasintl.fourth.ums.db.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Sanjeet Jung Gurung
 */
public class UserListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
        try{
              Connection cn= DatabaseConnection.getConnection();
            Statement stat = cn.createStatement();
            String viewUserQuery = "SELECT * FROM user_signup";
            ResultSet rs= stat.executeQuery(viewUserQuery);
            ArrayList<UserDto> userDtoList= new ArrayList<>();
            
            while(rs.next()){
               
               UserDto userdto= new UserDto();
               int id = rs.getInt("ID");
               String username= rs.getString("Username");
               String address= rs.getString("Address");
               String email= rs.getString("Email");
               userdto.setId(id);
               userdto.setUsername(username);
               userdto.setAddress(address);
               userdto.setEmail(email);
               userDtoList.add(userdto);
              
            }
            
             request.setAttribute("userDtoList",userDtoList);
               RequestDispatcher rd = request.getRequestDispatcher("./userList.jsp");
               rd.forward(request,response);
        
        }catch(Exception e){
            e.printStackTrace();
        
        }
    }

    
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
