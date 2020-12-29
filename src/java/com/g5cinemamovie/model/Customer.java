/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Customer {
    private int CusId;
    private String Username;
    private String Password;
    private String DateCreate;
    private int CreditCard;      
    private  Date Bod;
    private String  FullName;
    private String Address;
    private String Phone;
    private String Email;
    private String Avata;
    private boolean Status;

    public Customer() {
    }

	public Customer(int CusId, String Username, String Password, String DateCreate, int CreditCard, Date Bod, String FullName, String Address, String Phone, String Email, String Avata, boolean Status) {
		this.CusId = CusId;
		this.Username = Username;
		this.Password = Password;
		this.DateCreate = DateCreate;
		this.CreditCard = CreditCard;
		this.Bod = Bod;
		this.FullName = FullName;
		this.Address = Address;
		this.Phone = Phone;
		this.Email = Email;
		this.Avata = Avata;
		this.Status = Status;
	}

	public String getDateCreate() {
		return DateCreate;
	}

	public void setDateCreate(String DateCreate) {
		this.DateCreate = DateCreate;
	}

    public int getCusId() {
        return CusId;
    }

    public void setCusId(int CusId) {
        this.CusId = CusId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(int CreditCard) {
        this.CreditCard = CreditCard;
    }

    

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAvata() {
        return Avata;
    }

    public void setAvata(String Avata) {
        this.Avata = Avata;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }




	public Date getBod() {
		return Bod;
	}

	public void setBod(Date Bod) {
		this.Bod = Bod;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String FullName) {
		this.FullName = FullName;
	}

   

}







