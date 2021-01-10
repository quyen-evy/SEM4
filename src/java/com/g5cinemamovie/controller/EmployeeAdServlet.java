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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Quyen Evy
 */
public class EmployeeAdServlet extends HttpServlet {

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
            out.print("<div class='xs tabls'>"
                    + "<div class='bs-example4'style='overflow: auto;height: 80vh' data-example-id='simple-responsive-table>"
                    + "<div class='table-responsive'>"
                    + "<table class='table table-bordered'>"
                    + "<thead>"
                    + "<tr>"
                    + "<th>ID</th>"
                    + "<th>User name</th>"
                    + "<th>Full name</th>"
                    + "<th>Gender</th>"
                    + "<th>Birthday</th>"
                    + "<th>Address</th>"
                    + "<th>Phone</th>"
                    + "<th>Email</th>"
                    + "<th>Role</th>"
                    + "<th>Avatar</th>"
                    + "<th></th>"
                    + "<th></th>"
                    + "</tr>"
                    + "</thead>"
            );
            out.print("<tbody>");
            AdminDAO adDAO = new AdminDAO();
            ArrayList<Admin> list = adDAO.FindAll();
            int i = 1;
            for (Admin item : list) {
                out.print("<tr>"
                        + "<th scope='row'>" + item.getAdmId() + "</th>"
                        + "<td>" + item.getUsername() + "</td>"
                        + "<td>" + item.getFullName() + "</td>"
                        + "<td>" + item.getGender() + "</td>"
                        + "<td>" + item.getBod() + "</td>"
                        + "<td>" + item.getAddress() + "</td>"
                        + "<td>" + item.getPhone() + "</td>"
                        + "<td>" + item.getEmail() + "</td>"
                        + "<td>" + adDAO.GetRoleById(item.getRoleId()).getNameRole() + "</td>"
                        + "<td> <img src='../Admin/images/" + item.getAvata() + "' width='100px'/></td>"
                        + "<td><a href=updateemployee.jsp?AdId=" + item.getAdmId() + " class=\"btn-success btn\">Update</a></td>"
                        + "<td><a class='btn-default btn' href=\\G5CinemaMovie\\DeleteEmServlet?id=" + item.getAdmId() + ">Delete</a></td>"
                        + "</tr>");
                i++;
            }
            out.print("</tbody>");
            out.print("</table>"
                    + "</div><!-- /.table-responsive -->"
                    + "</div>"
                    + "</div>");

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
