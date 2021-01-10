/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.controller;
import com.g5cinemamovie.dao.AdminDAO;
import com.g5cinemamovie.model.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author Quyen Evy
 */
@MultipartConfig
public class AddEmployeeServlet extends HttpServlet {

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
           Admin admin = new Admin();
           admin.setUsername(request.getParameter("Username"));
           admin.setPass(request.getParameter("Pass"));
           Part part = request.getPart("Picture");
           String dirUrl = request.getServletContext().getRealPath("") + "Admin\\images\\" + part.getSubmittedFileName();
           part.write(dirUrl);
           admin.setAvata("" + part.getSubmittedFileName());
           admin.setFullName(request.getParameter("FullName"));
            if(request.getParameter("Gender").equals("Male")){
                admin.setGender("Male");
            }
            else{
                admin.setGender("Female");
            }
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           admin.setBod(sdf.parse(request.getParameter("Bod")));
           admin.setAddress(request.getParameter("Address"));
           admin.setPhone(request.getParameter("Phone"));
           admin.setEmail(request.getParameter("Email"));
           admin.setRoleId(Integer.parseInt(request.getParameter("RoleId")));
           
           AdminDAO adminDAO = new AdminDAO();
           if(adminDAO.AddNew(admin)){
                 response.sendRedirect("Admin/employees.jsp");
           }
        }
        catch (Exception ex){
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
