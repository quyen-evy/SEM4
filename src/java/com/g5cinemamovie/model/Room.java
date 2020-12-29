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
public class Room {

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }

    public String getNameRo() {
        return NameRo;
    }

    public void setNameRo(String NameRo) {
        this.NameRo = NameRo;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public Room() {
    }

    public Room(int RoomId, String NameRo, int Seats, String Image, boolean Status) {
        this.RoomId = RoomId;
        this.NameRo = NameRo;
        this.Seats = Seats;
        this.Image = Image;
        this.Status = Status;
    }
    private int RoomId;
    private String NameRo;
    private int Seats;
    private  String Image;
    private  boolean Status;     
}
