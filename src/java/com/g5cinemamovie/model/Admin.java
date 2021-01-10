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
public class Admin {
    private int AdmId;
    private String Username;
    private String Pass;
    private String Avata;
    private String FullName;
    private String Gender;
    private Date Bod;
    private String Address;
    private String Phone;
    private String Email;
    private int RoleId;
    private Boolean Status;
    public Admin() {
    }

    public Admin(int AdmId, String Username, String Pass, String Avata, String FullName, String Gender, Date Bod, String Address, String Phone, String Email, int RoleId, Boolean Status) {
        this.AdmId = AdmId;
        this.Username = Username;
        this.Pass = Pass;
        this.Avata = Avata;
        this.FullName = FullName;
        this.Gender = Gender;
        this.Bod = Bod;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.RoleId = RoleId;
        this.Status = Status;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

	

	public String getAvata() {
		return Avata;
	}

	public void setAvata(String Avata) {
		this.Avata = Avata;
	}

	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int RoleId) {
		this.RoleId = RoleId;
	}

   

    public int getAdmId() {
        return AdmId;
    }

    public void setAdmId(int AdmId) {
        this.AdmId = AdmId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public Date getBod() {
        return Bod;
    }

    public void setBod(Date Bod) {
        this.Bod = Bod;
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

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }
   
}

