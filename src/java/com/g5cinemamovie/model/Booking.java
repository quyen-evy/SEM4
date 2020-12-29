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
public class Booking {

    public Booking() {
    }

    public Booking(int BooId, int CusId, int ShoId, int Quantity, float Bilmoney, Date DateBooking, boolean Status) {
        this.BooId = BooId;
        this.CusId = CusId;
        this.ShoId = ShoId;
        this.Quantity = Quantity;
        this.Bilmoney = Bilmoney;
        this.DateBooking = DateBooking;
        this.Status = Status;
    }

    public int getBooId() {
        return BooId;
    }

    public void setBooId(int BooId) {
        this.BooId = BooId;
    }

    public int getCusId() {
        return CusId;
    }

    public void setCusId(int CusId) {
        this.CusId = CusId;
    }

    public int getShoId() {
        return ShoId;
    }

    public void setShoId(int ShoId) {
        this.ShoId = ShoId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getBilmoney() {
        return Bilmoney;
    }

    public void setBilmoney(float Bilmoney) {
        this.Bilmoney = Bilmoney;
    }

    public Date getDateBooking() {
        return DateBooking;
    }

    public void setDateBooking(Date DateBooking) {
        this.DateBooking = DateBooking;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    private int BooId;
    private int CusId;
    private int ShoId;
    private int Quantity;
    private float Bilmoney;
    private Date DateBooking;
    private boolean Status;
}
