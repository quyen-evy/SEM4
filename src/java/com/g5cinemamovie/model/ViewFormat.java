/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5cinemamovie.model;

/**
 *
 * @author Quyen Evy
 */
public class ViewFormat {
    private int ViewId;
    private String NameView;
    private boolean Status;

    public ViewFormat() {
    }

    public ViewFormat(int ViewId, String NameView, boolean Status) {
        this.ViewId = ViewId;
        this.NameView = NameView;
        this.Status = Status;
    }

    public int getViewId() {
        return ViewId;
    }

    public String getNameView() {
        return NameView;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setViewId(int ViewId) {
        this.ViewId = ViewId;
    }

    public void setNameView(String NameView) {
        this.NameView = NameView;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
}
