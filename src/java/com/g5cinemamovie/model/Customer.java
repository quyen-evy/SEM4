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
    private Date DateCreate;
    private String CreditCard;      
    private  Date Bod;
    private String  FullName;
    private String Gender;
    private String Address;
    private String Phone;
    private String Email;
    private String Avata;
    private boolean Status;

    public Customer() {
    }

    public Customer(int CusId, String Username, String Password, Date DateCreate, String CreditCard, Date Bod, String FullName, String Gender, String Address, String Phone, String Email, String Avata, boolean Status) {
        this.CusId = CusId;
        this.Username = Username;
        this.Password = Password;
        this.DateCreate = DateCreate;
        this.CreditCard = CreditCard;
        this.Bod = Bod;
        this.FullName = FullName;
        this.Gender = Gender;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.Avata = Avata;
        this.Status = Status;
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(String CreditCard) {
        this.CreditCard = CreditCard;
    }

    

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    

    public void setCusId(int CusId) {
        this.CusId = CusId;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setDateCreate(Date DateCreate) {
        this.DateCreate = DateCreate;
    }

    

    public void setBod(Date Bod) {
        this.Bod = Bod;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAvata(String Avata) {
        this.Avata = Avata;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public int getCusId() {
        return CusId;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public Date getDateCreate() {
        return DateCreate;
    }

   

    public Date getBod() {
        return Bod;
    }

    public String getFullName() {
        return FullName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getAvata() {
        return Avata;
    }

    public boolean isStatus() {
        return Status;
    }

	

}







