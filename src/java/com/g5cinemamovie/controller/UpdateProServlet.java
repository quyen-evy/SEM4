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
 * @author ASUS
 */
@MultipartConfig
public class UpdateProServlet extends HttpServlet {

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
            FilmDAO filDAO = new FilmDAO();
            String a = request.getParameter("id");
            int id = Integer.parseInt(a);
            Film film = filDAO.FindProduct(id);

            film.setTypId(Integer.parseInt(request.getParameter("TypId")));
            film.setLanguage(request.getParameter("Language"));
            film.setAgeLimit(Integer.parseInt(request.getParameter("AgeLimit")));
            film.setCountry(request.getParameter("Country"));
            film.setNameF(request.getParameter("NameF"));
            film.setDirector(request.getParameter("Director"));
            film.setActor(request.getParameter("Actor"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            film.setReleaseDate(sdf.parse(request.getParameter("ReleaseDate")));
            film.setDuration(Integer.parseInt(request.getParameter("Duration")));
            film.setDescription(request.getParameter("Description"));
            Part part = request.getPart("Picture");
            String image = part.getSubmittedFileName();
            if (image.length() != 0) {
                String dirUrl = request.getServletContext().getRealPath("") + "Images\\" + part.getSubmittedFileName();
                part.write(dirUrl);
                film.setPicture("" + part.getSubmittedFileName());
            }
            film.setStatus(request.getParameter("Status"));
            if (filDAO.Update(film)) {
                response.sendRedirect("Admin/tables.jsp");
            }
            out.print("<h1>Update successfully</h1>");
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
