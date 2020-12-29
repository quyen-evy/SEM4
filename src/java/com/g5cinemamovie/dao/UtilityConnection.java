/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;
import java.sql.*;
import javax.swing.JOptionPane;
public class UtilityConnection {
    private Connection conn; //Tạo biến connect

    public UtilityConnection() {
    }

    public UtilityConnection(Connection conn) {
        this.conn = conn;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public void connect(){
        if(conn==null)
        {

            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databasename=BookingTicket_Movie;username=sa;password=sa"); //dùng để connect
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Connect Error : "+ex);
        }
//          if(conn!=null)
//               JOptionPane.showMessageDialog(null, "Connect Successfull !!!  ");
        }
        
    }
    
    public void disconnect(){
        if(conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Disconnect Error : "+ex);
            }
        }
        
    }
    public static void main(String[] args) {
        UtilityConnection uc=new UtilityConnection();
        uc.connect();
    }
}




