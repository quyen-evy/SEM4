/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.controller;

import com.g5cinemamovie.dao.FilmDAO;
import com.g5cinemamovie.model.Film;
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
public class ShowtimesAdServlet extends HttpServlet {

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
                    + "<th>Movie name</th>"
                    + "<th>Room</th>"
                    + "<th>Date show</th>"
                    + "<th>Time begin</th>"
                    + "<th>Time end</th>"
                    + "<th>View</th>"
                    + "<th></th>"
                    + "<th></th>"
                    + "</tr>"
                    + "</thead>");
            out.print("<tbody>");
            FilmDAO filmDAO = new FilmDAO();
            ArrayList<Film> list = filmDAO.FindAll();
            int i = 1;
            for (Film item : list) {
                out.print("<tr>"
                        + "<th scope='row'>" + item.getFilId() + "</th>"
                        + "<td>" + filmDAO.GetTypeById(item.getTypId()).getNameType() + "</td>"
                        + "<td>" + item.getCountry() + "</td>"
                        + "<td>" + item.getNameF() + "</td>"
                        + "<td>" + item.getAgeLimit() + "</td>"
                        + "<td>" + item.getDirector() + "</td>"
                        + "<td>" + item.getActor() + "</td>"
                        + "<td>" + item.getLanguage() + "</td>"
                        + "<td>" + item.getDuration() + "</td>"
                        + "<td>" + item.getReleaseDate() + "</td>"
                        + "<td>" + item.getDescription() + "</td>"
                        + "<td> <img src='../images/" + item.getPicture() + "' width='100px'/></td>"
                         + "<td>" + item.getStatus()+ "</td>"
                        + "<td><a href=updatepro.jsp?id=" + item.getFilId() + " class=\"btn-success btn\">Update</a></td>"
                        + "<td><a class='btn-default btn' href=\\G5CinemaMovie\\DeleteProServlet?id=" + item.getFilId() + ">Delete</a></td>"
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
