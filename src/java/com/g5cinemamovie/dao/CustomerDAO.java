/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;

import com.g5cinemamovie.model.Admin;
import com.g5cinemamovie.model.Customer;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CustomerDAO {

    private UtilityConnection uc;

    public CustomerDAO() {
        uc = new UtilityConnection();
        uc.connect();
    }

    public Customer FindCustomerByUserPass(String user, String pass) {
        String query = "select * from Customer where Username='" + user + "' and Password='" + pass + "'";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Customer e = new Customer();
                e.setUsername(rs.getString("Username"));
                e.setPassword(rs.getString("Password"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }

    public boolean Addnew(Customer cus) {
        String query = "Insert into Customer(Username,Password,CreditCard,FullName,Bod,Address,Phone,Email,Avata,Status) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setString(1, cus.getUsername());
            ps.setString(2, cus.getPassword());
            ps.setString(3, cus.getCreditCard());
            ps.setString(4, cus.getFullName());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(5, sdf.format(cus.getBod()));
            ps.setString(6, cus.getAddress());
            ps.setString(7, cus.getPhone());
            ps.setString(8, cus.getEmail());
            ps.setString(9, cus.getAvata());
            ps.setBoolean(10, false);
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    //Customer
    public ArrayList<Customer> FindAll() {
        ArrayList<Customer> list = new ArrayList<>();
        String query = "select * from Customer";
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Customer e = new Customer();

                e.setCusId(rs.getInt("CusId"));
                e.setUsername(rs.getString("Username"));
                e.setPassword(rs.getString("Password"));
                e.setDateCreate(rs.getDate("DateCreate"));
                e.setCreditCard(rs.getString("CreditCard"));
                e.setFullName(rs.getString("FullName"));
                e.setGender(rs.getString("Gender"));
                e.setBod(rs.getDate("Bod"));
                e.setAddress(rs.getString("Address"));
                e.setPhone(rs.getString("Phone"));
                e.setEmail(rs.getString("Email"));
                e.setAvata(rs.getString("Avata"));
                e.setStatus(rs.getBoolean("Status"));

                list.add(e);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect " + ex);
        }
        return list;
    }

    public Customer FindCustomer(int id) {
        String query = "select * from Customer where CusId=" + id;
        try {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Customer e = new Customer();
                e.setCusId(rs.getInt("CusId"));
                e.setUsername(rs.getString("Username"));
                e.setPassword(rs.getString("Password"));
                e.setDateCreate(rs.getDate("DateCreate"));
                e.setCreditCard(rs.getString("CreditCard"));
                e.setFullName(rs.getString("FullName"));
                e.setGender(rs.getString("Gender"));
                e.setBod(rs.getDate("Bod"));
                e.setAddress(rs.getString("Address"));
                e.setPhone(rs.getString("Phone"));
                e.setEmail(rs.getString("Email"));
                e.setAvata(rs.getString("Avata"));
                e.setStatus(rs.getBoolean("Status"));
                return e;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return null;
    }

    public boolean AddNewCus(Customer cus) {
        String query = "Insert into Customer(Username,Password,DateCreate,CreditCard,FullName,Gender,"
                + "Bod,Address,Phone,Email,Status) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setString(1, cus.getUsername());
            ps.setString(2, "123");
            String d = java.time.LocalDate.now().toString();
            ps.setString(3, d);
            ps.setString(4, cus.getCreditCard());
            ps.setString(5, cus.getFullName());
            ps.setString(6, cus.getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(7, sdf.format(cus.getBod()));
            ps.setString(8, cus.getAddress());
            ps.setString(9, cus.getPhone());
            ps.setString(10, cus.getEmail());
            ps.setBoolean(11, false);
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    public boolean Delete(Customer cus) {
        String query = "delete from Customer";
        query += " where CusId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            ps.setInt(1, cus.getCusId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return false;
    }

    public boolean Update(Customer cus) {
        String query = "update Customer set DateCreate=?,CreditCard=?,FullName=?,Gender=?,Bod=?,"
                + "Address=?,Phone=?,Email=?";
        query += " where CusId=?";
        try {
            PreparedStatement ps = uc.getConn().prepareStatement(query);
            String d = java.time.LocalDate.now().toString();
            ps.setString(1, d);
            ps.setString(2, cus.getCreditCard());
            ps.setString(3, cus.getFullName());
            ps.setString(4, cus.getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(5, sdf.format(cus.getBod()));
            ps.setString(6, cus.getAddress());
            ps.setString(7, cus.getPhone());
            ps.setString(8, cus.getEmail());
            ps.setInt(9, cus.getCusId());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr connect" + ex);
        }
        return false;
    }
}
