/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.model;
import java.util.Date;
import org.apache.tomcat.jni.Time;

/**
 *
 * @author Quyen Evy
 */
public class Showtimes {
    private int ShoId;
    private int FilId;
    private int RoomId;
    private Date DateShow;
    private String TimeBegin;
    private String TimeEnd;
    private int ViewId;
    private boolean Status;

    public Showtimes() {
    }

    public Showtimes(int ShoId, int FilId, int RoomId, Date DateShow, String TimeBegin, String TimeEnd, int ViewId, boolean Status) {
        this.ShoId = ShoId;
        this.FilId = FilId;
        this.RoomId = RoomId;
        this.DateShow = DateShow;
        this.TimeBegin = TimeBegin;
        this.TimeEnd = TimeEnd;
        this.ViewId = ViewId;
        this.Status = Status;
    }

    public void setShoId(int ShoId) {
        this.ShoId = ShoId;
    }

    public void setFilId(int FilId) {
        this.FilId = FilId;
    }

    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }

    public void setDateShow(Date DateShow) {
        this.DateShow = DateShow;
    }

    public void setTimeBegin(String TimeBegin) {
        this.TimeBegin = TimeBegin;
    }

    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    public void setViewId(int ViewId) {
        this.ViewId = ViewId;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public int getShoId() {
        return ShoId;
    }

    public int getFilId() {
        return FilId;
    }

    public int getRoomId() {
        return RoomId;
    }

    public Date getDateShow() {
        return DateShow;
    }

    public String getTimeBegin() {
        return TimeBegin;
    }

    public String getTimeEnd() {
        return TimeEnd;
    }

    public int getViewId() {
        return ViewId;
    }

    public boolean isStatus() {
        return Status;
    }
    
    
}
