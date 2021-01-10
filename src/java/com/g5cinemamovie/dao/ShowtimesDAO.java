/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;

import com.g5cinemamovie.model.Film;

import com.g5cinemamovie.model.Room;
import com.g5cinemamovie.model.Showtimes;
import com.g5cinemamovie.model.ViewFormat;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Quyen Evy
 */
public class ShowtimesDAO {

    private UtilityConnection uc;

    public ShowtimesDAO() {
        uc = new UtilityConnection();
        uc.connect();
    }

    public Room GetTypeById(int RoomId) {
        String query = "select NameRo from TypeFilm where RoomId='" + RoomId + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Room e = new Room();
                e.setNameRo(rs.getString("NameRo"));
                e.setRoomId(RoomId);
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }

    public ArrayList<Film> FindAllMovie() {
        ArrayList<Film> list = new ArrayList<>();
        String query = "select * from Film where Status = 'Showing' or Status = 'Coming'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Film e = new Film();
                e.setFilId(rs.getInt("FilId"));
                e.setNameF(rs.getString("NameF"));
                list.add(e);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public ArrayList<ViewFormat> FindAllView() {
        ArrayList<ViewFormat> list = new ArrayList<>();
        String query = "select * from ViewFormat";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                ViewFormat e = new ViewFormat();
                e.setViewId(rs.getInt("ViewId"));
                e.setNameView(rs.getString("NameView"));
                list.add(e);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public ArrayList<Showtimes> FindAll() {
        ArrayList<Showtimes> list = new ArrayList<>();
        String query = "select * from Showtimes";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Showtimes e = new Showtimes();
                e.setShoId(rs.getInt("ShoId"));
                e.setFilId(rs.getInt("FilId"));
                e.setRoomId(rs.getInt("RoomId"));
                e.setDateShow(rs.getDate("DateShow"));
                SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
                e.setTimeBegin(sd.format("TimeBegin"));
                e.setTimeEnd(sd.format("TimeEnd"));
                e.setViewId(rs.getInt("ViewId"));
                e.setStatus(rs.getBoolean("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public boolean AddNew(Showtimes show) {
        String query = "Insert into Film (FilId,RoomId,DateShow,TimeBegin,TimeEnd,ViewId,Status) "
                + "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
            ps.setInt(1, show.getFilId());
            ps.setInt(2, show.getRoomId());
            ps.setString(3, sdf.format(show.getDateShow()));
            ps.setString(4, sd.format(show.getTimeBegin()));
            ps.setString(5, sd.format(show.getTimeEnd()));
            ps.setInt(6, show.getViewId());
            ps.setBoolean(7, false);
            return ps.executeUpdate() > 0;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return false;
    }

    public boolean Delete(Showtimes show) {
        String query = "delete ShowTimes";
        query += " where ShoId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, show.getShoId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return false;
    }

}
