/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.dao;
import com.g5cinemamovie.model.Customer;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CustomerDAO {
    private UtilityConnection uc;
    public CustomerDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    public Customer FindCustomerByUserPass(String user, String pass )
    {
        String query="select * from Customer where Username='"+user+"' and Password='"+pass+"'";
        try
        {
            Statement stm = uc.getConn().createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next())
            {
                Customer e = new Customer();               
                e.setUsername(rs.getString("Username"));
                e.setPassword(rs.getString("Password"));
                return e;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erorr connect");
        }
        return null;
    }
    public boolean Addnew(Customer cus)
    {
    String query="Insert into Customer(Username,Password,CreditCard,FullName,Bod,Address,Phone,Email,Avata,Status) values(?,?,?,?,?,?,?,?,?,?)";
	    try{
	    PreparedStatement ps=uc.getConn().prepareStatement(query);
	    ps.setString(1,cus.getUsername());
	    ps.setString(2, cus.getPassword());
	    ps.setInt(3, cus.getCreditCard());
	    ps.setString(4,cus.getFullName());
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	    ps.setString(5,sdf.format(cus.getBod()));
	    ps.setString(6, cus.getAddress());
	    ps.setString(7, cus.getPhone());
	    ps.setString(8, cus.getEmail());
	    ps.setString(9, cus.getAvata());
	    ps.setBoolean(10, false);
	    return  ps.executeUpdate()>0;
	    }
	    catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
	    return false;
    }
}







