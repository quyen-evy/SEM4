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
public class Seat {

    public int getSeatId() {
        return SeatId;
    }

    public void setSeatId(int SeatId) {
        this.SeatId = SeatId;
    }

    public String getRow() {
        return Row;
    }

    public void setRow(String Row) {
        this.Row = Row;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public Seat(int SeatId, String Row, String RoomId) {
        this.SeatId = SeatId;
        this.Row = Row;
        this.RoomId = RoomId;
    }

    public Seat() {
    }
    private int SeatId;
    private String Row;
    private String RoomId;       
}
