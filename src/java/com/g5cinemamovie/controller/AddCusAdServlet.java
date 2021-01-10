/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.controller;

import com.g5cinemamovie.dao.CustomerDAO;

import com.g5cinemamovie.model.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

/**
 *
 * @author Quyen Evy
 */
@MultipartConfig
public class AddCusAdServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Customer cus = new Customer();
            cus.setUsername(request.getParameter("Username"));
            cus.setCreditCard(request.getParameter("CreditCard"));
            cus.setFullName(request.getParameter("Fullname"));
            if(request.getParameter("Gender").equals("Male")){
                cus.setGender("Male");
            }
            else{
                cus.setGender("Female");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            cus.setBod(sdf.parse(request.getParameter("Bod")));
            cus.setAddress(request.getParameter("Address"));
            cus.setEmail(request.getParameter("Email"));
            cus.setPhone(request.getParameter("Phone"));
            CustomerDAO cusDAO = new CustomerDAO();
            if (cusDAO.AddNewCus(cus)) {
                response.sendRedirect("Admin/customers.jsp");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
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
