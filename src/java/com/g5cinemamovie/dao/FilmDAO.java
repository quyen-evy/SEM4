/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;

import com.g5cinemamovie.model.Film;
import com.g5cinemamovie.model.TypeFilm;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Quyen Evy
 */
public class FilmDAO {

    private UtilityConnection uc;

    public FilmDAO() {
        uc = new UtilityConnection();
        uc.connect();
    }

    public ArrayList<Film> FindAll() {
        ArrayList<Film> list = new ArrayList<>();
        String query = "select * from Film";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setCountry(rs.getString("Country"));
                e.setLanguage(rs.getString("Language"));
                e.setAgeLimit(rs.getInt("AgeLimit"));
                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setReleaseDate(rs.getDate("ReleaseDate"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));
                e.setStatus(rs.getString("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public Film FindFBId(int FilmId) {
        String query = "Select * from Film where FilId='" + FilmId + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setCountry(rs.getString("Country"));
                e.setLanguage(rs.getString("Language"));
                e.setAgeLimit(rs.getInt("AgeLimit"));
                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setReleaseDate(rs.getDate("ReleaseDate"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));
                e.setStatus(rs.getString("Status"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }

    public TypeFilm GetTypeById(int TypeId) {
        String query = "select NameType from TypeFilm where TypeId='" + TypeId + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                TypeFilm e = new TypeFilm();
                e.setNameType(rs.getString("NameType"));
                e.setTypeId(TypeId);
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }

    public boolean AddNew(Film film) {
        String query = "Insert into Film (TypId,Language,AgeLimit,Country,NameF,Director,Actor,ReleaseDate,Duration,Description,Picture,Status) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, film.getTypId());
            ps.setString(2, film.getLanguage());
            ps.setInt(3, film.getAgeLimit());
            ps.setString(4, film.getCountry());
            ps.setString(5, film.getNameF());
            ps.setString(6, film.getDirector());
            ps.setString(7, film.getActor());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(8, sdf.format(film.getReleaseDate()));
            ps.setInt(9, film.getDuration());
            ps.setString(10, film.getDescription());
            ps.setString(11, film.getPicture());
            ps.setString(12, film.getStatus());

            return ps.executeUpdate() > 0;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return false;
    }

    public Film FindProduct(int id) {
        String query = "select * from Film where FilId=" + id;
        try {

            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setLanguage(rs.getString("Language"));
                e.setAgeLimit(rs.getInt("AgeLimit"));
                e.setCountry(rs.getString("Country"));
                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setReleaseDate(rs.getDate("ReleaseDate"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));
                e.setStatus(rs.getString("Status"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return null;
    }

    public boolean Update(Film film) {
        String query = "update Film set TypId=?,Language=?,AgeLimit=?,Country=?,NameF=?,Director=?,Actor=?,ReleaseDate=?,Duration=?,Description=?,Picture=?,Status=?";
        query += " where FilId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, film.getTypId());
            ps.setString(2, film.getLanguage());
            ps.setInt(3, film.getAgeLimit());
            ps.setString(4, film.getCountry());
            ps.setString(5, film.getNameF());
            ps.setString(6, film.getDirector());
            ps.setString(7, film.getActor());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(8, sdf.format(film.getReleaseDate()));
            ps.setInt(9, film.getDuration());
            ps.setString(10, film.getDescription());
            ps.setString(11, film.getPicture());
            ps.setString(12, film.getStatus());
            ps.setInt(13, film.getFilId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return false;
    }

    public boolean Delete(Film film) {
        String query = "delete Film";
        query += " where FilId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, film.getFilId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return false;
    }

    public ArrayList<Film> SearchbyName(String find) {
        ArrayList<Film> list = new ArrayList<>();
      String query = "select * from Film where NameF like '%" + find.trim() + "%' ";
         try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setCountry(rs.getString("Country"));
                e.setLanguage(rs.getString("Language"));
                e.setAgeLimit(rs.getInt("AgeLimit"));
                e.setNameF(find);
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setReleaseDate(rs.getDate("ReleaseDate"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));
                e.setStatus(rs.getString("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
      
    }
public ArrayList<Film> SearchbyStatus(String find) {
        ArrayList<Film> list = new ArrayList<>();
      String query = "select * from Film where Status like '%" + find.trim()+ "%' ";
         try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setCountry(rs.getString("Country"));
                e.setLanguage(rs.getString("Language"));
                e.setAgeLimit(rs.getInt("AgeLimit"));
                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setReleaseDate(rs.getDate("ReleaseDate"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));
                e.setStatus(rs.getString("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
   
}
}
