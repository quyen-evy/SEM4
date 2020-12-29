/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;

import java.sql.ResultSet;
import com.g5cinemamovie.model.Admin;
import com.g5cinemamovie.model.Film;
import com.g5cinemamovie.model.TypeFilm;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Quyen Evy
 */
public class AdminDAO {

    private UtilityConnection uc;

    public AdminDAO() {
        uc = new UtilityConnection();
        uc.connect();
    }

    public Admin FindCustomerByUserPass(String user, String pass) {
        String query = "select * from Admin where Username='" + user + "' and Pass='" + pass + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Admin e = new Admin();
                e.setUsername(rs.getString("Username"));
                e.setPass(rs.getString("Pass"));
		e.setAddress(rs.getString("Address"));
		e.setBod(rs.getDate("Bod"));
		e.setFullName(rs.getString("FullName"));
		e.setPhone(rs.getString("Phone"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
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

                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));

                e.setActor(rs.getString("Actor"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));

                e.setPicture(rs.getString("Picture"));
                e.setStatus(rs.getBoolean("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public ArrayList<TypeFilm> FindAllType() {
        ArrayList<TypeFilm> list = new ArrayList<>();
        String query = "select * from TypeFilm";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                TypeFilm e = new TypeFilm();
                e.setTypeId(rs.getInt("TypeID"));
                e.setNameType(rs.getString("NameType"));
                list.add(e);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public ArrayList<Film> FindByType(int typeID) {
        ArrayList<Film> list = new ArrayList<>();
        String query = "select * from Film where TypeId='" + typeID + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("setFilId"));
                e.setTypId(rs.getInt("TypeId"));
                e.setCountry(rs.getString("Country"));
                e.setNameF(rs.getString("NameF"));
                e.setDirector(rs.getString("Director"));
                e.setActor(rs.getString("Actor"));
                e.setDuration(rs.getInt("Duration"));
                e.setDescription(rs.getString("Description"));
                e.setPicture(rs.getString("Picture"));

                list.add(e);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

   
}

