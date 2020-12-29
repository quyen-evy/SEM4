/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.model;

/**
 *
 * @author ASUS
 */
public class SeatNumber {

    public SeatNumber() {
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }

    public String getSeatId() {
        return SeatId;
    }

    public void setSeatId(String SeatId) {
        this.SeatId = SeatId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SeatNumber(String SeatNo, String SeatId, String Status) {
        this.SeatNo = SeatNo;
        this.SeatId = SeatId;
        this.Status = Status;
    }
    public String SeatNo;
    public String SeatId;       
    public String Status;
}
