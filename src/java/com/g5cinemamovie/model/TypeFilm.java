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
public class TypeFilm {
    private int TypeId;
    private String NameType;

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int TypeId) {
        this.TypeId = TypeId;
    }

    public String getNameType() {
        return NameType;
    }

    public void setNameType(String NameType) {
        this.NameType = NameType;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public TypeFilm() {
    }

    public TypeFilm(int TypeId, String NameType, boolean Status) {
        this.TypeId = TypeId;
        this.NameType = NameType;
        this.Status = Status;
    }
    private boolean Status;
}
