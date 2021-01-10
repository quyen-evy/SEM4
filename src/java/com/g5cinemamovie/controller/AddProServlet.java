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
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
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
//@WebServlet(name = "AddProServlet", urlPatterns = {"/AddProServlet"})
public class AddProServlet extends HttpServlet {

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

            Film film = new Film();
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
            String dirUrl = request.getServletContext().getRealPath("") + "Images\\" + part.getSubmittedFileName();
            part.write(dirUrl);
            film.setPicture("" + part.getSubmittedFileName());
            film.setStatus(request.getParameter("Status"));
            
            FilmDAO filmDAO = new FilmDAO();
            if (filmDAO.AddNew(film)) {
                response.sendRedirect("Admin/tables.jsp");
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
