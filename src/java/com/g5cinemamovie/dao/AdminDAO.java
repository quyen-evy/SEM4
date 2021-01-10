/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;

import java.sql.ResultSet;
import com.g5cinemamovie.model.Admin;
import com.g5cinemamovie.model.Customer;
import com.g5cinemamovie.model.Film;

import com.g5cinemamovie.model.Role;
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
//Admin

    public Admin FindCustomerByUserPass(String user, String pass) {
        String query = "select * from Admin where Username='" + user + "' and Pass='" + pass + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Admin e = new Admin();
                e.setAdmId(rs.getInt("AdmId"));
                e.setUsername(rs.getString("Username"));
                e.setPass(rs.getString("Pass"));
                e.setAvata(rs.getString("Avata"));
                e.setFullName(rs.getString("FullName"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }

    public ArrayList<Admin> FindAll() {
        ArrayList<Admin> list = new ArrayList<>();
        String query = "select * from Admin where RoleId=2";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Admin e = new Admin();

                e.setAdmId(rs.getInt("AdmId"));
                e.setUsername(rs.getString("Username"));
                e.setPass(rs.getString("Pass"));
                e.setAvata(rs.getString("Avata"));
                e.setFullName(rs.getString("FullName"));
                e.setGender(rs.getString("Gender"));
                e.setBod(rs.getDate("Bod"));
                e.setAddress(rs.getString("Address"));
                e.setPhone(rs.getString("Phone"));
                e.setEmail(rs.getString("Email"));
                e.setRoleId(rs.getInt("RoleId"));
                e.setStatus(rs.getBoolean("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public Admin FindAdmin(int id) {
        String query = "select * from Admin where AdmId=" + id;
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Admin e = new Admin();
                e.setAdmId(rs.getInt("AdmId"));
                e.setUsername(rs.getString("Username"));
                e.setPass(rs.getString("Pass"));
                e.setAvata(rs.getString("Avata"));
                e.setFullName(rs.getString("FullName"));
                e.setGender(rs.getString("Gender"));
                e.setBod(rs.getDate("Bod"));
                e.setAddress(rs.getString("Address"));
                e.setPhone(rs.getString("Phone"));
                e.setEmail(rs.getString("Email"));
                e.setRoleId(rs.getInt("RoleId"));
                e.setStatus(rs.getBoolean("Status"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return null;
    }

    public Role GetRoleById(int RoleId) {
        String query = "select NameRole from Role where RoleId='" + RoleId + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Role e = new Role();
                e.setNameRole(rs.getString("NameRole"));
                e.setRoleId(RoleId);
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }

    public ArrayList<Role> FindAllRole() {
        ArrayList<Role> list = new ArrayList<>();
        String query = "select * from Role";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Role e = new Role();
                e.setRoleId(rs.getInt("RoleId"));
                e.setNameRole(rs.getString("NameRole"));
                list.add(e);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }
    //chưa set gender

    public boolean Update(Admin admin) {
        String query = "update Admin set Username=?,Pass=?,Avata=?,FullName=?,Gender=?,Bod=?,"
                + "Address=?,Phone=?,Email=? ";
        query += " where AdmId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPass());
            ps.setString(3, admin.getAvata());
            ps.setString(4, admin.getFullName());
            ps.setString(5, admin.getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(6, sdf.format(admin.getBod()));
            ps.setString(7, admin.getAddress());
            ps.setString(8, admin.getPhone());
            ps.setString(9, admin.getEmail());
            ps.setInt(10, admin.getAdmId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return false;
    }

    public boolean UpdateEmployee(Admin admin) {
        String query = "update Admin set Avata=?,FullName=?,Gender=?,Bod=?,"
                + "Address=?,Phone=?,Email=?,RoleId=? ";
        query += " where AdmId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);

            ps.setString(1, admin.getAvata());
            ps.setString(2, admin.getFullName());
            ps.setString(3, admin.getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(4, sdf.format(admin.getBod()));
            ps.setString(5, admin.getAddress());
            ps.setString(6, admin.getPhone());
            ps.setString(7, admin.getEmail());
            ps.setInt(8, admin.getRoleId());
            ps.setInt(9, admin.getAdmId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return false;
    }

    public boolean AddNew(Admin ad) {
        String query = "Insert into Admin (Username,Pass,Avata,FullName,Gender,"
                + "Bod,Address,Phone,Email,RoleId,Status) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setString(1, ad.getUsername());
            ps.setString(2, ad.getPass());
            ps.setString(3, ad.getAvata());
            ps.setString(4, ad.getFullName());
            ps.setString(5, ad.getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(6, sdf.format(ad.getBod()));
            ps.setString(7, ad.getAddress());
            ps.setString(8, ad.getPhone());
            ps.setString(9, ad.getEmail());
            ps.setInt(10, ad.getRoleId());
            ps.setBoolean(11, false);
            return ps.executeUpdate() > 0;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return false;
    }

    public boolean Delete(Admin admin) {
        String query = "delete Admin";
        query += " where AdmId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, admin.getAdmId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return false;
    }
    //Film

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

}
