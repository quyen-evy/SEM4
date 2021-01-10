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
public class UpdateAdServlet extends HttpServlet {

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
            AdminDAO adDAO = new AdminDAO();
            int error=0;
             String a=request.getParameter("id");
            int id=Integer.parseInt(a);
            Admin admin = adDAO.FindAdmin(id);
            
            if(request.getParameter("RePassword").equals(request.getParameter("Password")))
            {
                error=0;
               
            }
             else{
                error++;
                  
             }
            if(error!=0)
            {
            JOptionPane.showMessageDialog(null, "Password does not match");
             response.sendRedirect("Admin/editprofile.jsp");
            } 
            else{
                 Part part = request.getPart("Avata");
            String image = part.getSubmittedFileName();
            if (image.length() != 0) {
                String dirUrl = request.getServletContext().getRealPath("") + "Images\\Admin\\" + part.getSubmittedFileName();
                part.write(dirUrl);
                admin.setAvata("" + part.getSubmittedFileName());
            }
            admin.setUsername(request.getParameter("Username"));
            admin.setPass(request.getParameter("Password"));
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
             
              if (adDAO.Update(admin)) {
                 JOptionPane.showMessageDialog(null, "Update success");
                response.sendRedirect("Admin/tables.jsp");
            }
            };
        }
            catch (Exception ex) {
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
