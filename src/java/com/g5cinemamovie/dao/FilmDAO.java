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
import javax.swing.JOptionPane;

/**
 *
 * @author Quyen Evy
 */
public class FilmDAO {
     private UtilityConnection uc;
    public FilmDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    public ArrayList<Film> FindAll()
    {
        ArrayList<Film> list=new ArrayList<>();
        String query="select * from Film";
        try
        {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next())
            {
                Film e = new Film();
               e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setCountry(rs.getString("Country"));
               
                e.setNameF (rs.getString("NameF"));
                e.setDirector (rs.getString("Director"));

                e.setActor (rs.getString("Actor"));
                e.setDuration (rs.getInt("Duration"));
                e.setDescription (rs.getString("Description"));

                e.setPicture (rs.getString("Picture"));
                e.setStatus(rs.getBoolean("Status"));

                list.add(e);
 
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erorr connect "+ex);
        }
        return list;
    }
    public Film FindFBId(int FilmId)
    {
	    String query ="Select * from Film where FilId='"+FilmId+"'";
	     try
        {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next())
            {
                Film e = new Film();               
               e.setFilId(rs.getInt("FilId"));
                e.setTypId(rs.getInt("TypId"));
                e.setCountry(rs.getString("Country"));
               
                e.setNameF (rs.getString("NameF"));
                e.setDirector (rs.getString("Director"));

                e.setActor (rs.getString("Actor"));
                e.setDuration (rs.getInt("Duration"));
                e.setDescription (rs.getString("Description"));

                e.setPicture (rs.getString("Picture"));
                e.setStatus(rs.getBoolean("Status"));
                return e;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    } 
    public TypeFilm GetTypeById(int TypeId)
    {
	    String query="select NameType from TypeFilm where TypeId='"+TypeId+"'";
	      try
        {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next())
            {
              TypeFilm e=new TypeFilm();
	      e.setNameType(rs.getString("NameType"));
	      e.setTypeId(TypeId);
                return e;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }
public boolean AddNew(Film film) {
        String query = "Insert into Film (TypId,Country,NameF,Director,Actor,Duration,Description,Picture,Status) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, film.getTypId());
            ps.setString(2, film.getCountry());
            ps.setString(3, film.getNameF());
            ps.setString(4, film.getDirector());
            ps.setString(5, film.getActor());
            ps.setInt(6, film.getDuration());
            ps.setString(7, film.getDescription());
            ps.setString(8, film.getPicture());
            ps.setBoolean(9, false);

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
                 e.setCountry(rs.getString("Country"));
                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return null;
    }

    public boolean Update(Film film) {
        String query = "update Film set TypId=?,Country=?,NameF=?,Director=?,Actor=?,Duration=?,Description=?,Picture=?";
        query += " where FilId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, film.getTypId());
            ps.setString(2, film.getCountry());
            ps.setString(3, film.getNameF());
            ps.setString(4, film.getDirector());
            ps.setString(5, film.getActor());
            ps.setInt(6, film.getDuration());
            ps.setString(7, film.getDescription());
            ps.setString(8, film.getPicture());
             ps.setInt(9, film.getFilId());
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
}








