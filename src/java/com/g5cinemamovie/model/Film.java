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
public class Film {
private int FilId;
private int TypId;
private String Language;
private int AgeLimit;
private String Country;
private String NameF;
private String Director;
private String Actor;
private Date ReleaseDate;
private int Duration;
private String  Description;
private String  Picture;
private String Status;	

    public Film() {
    }

    public Film(int FilId, int TypId, String Language, int AgeLimit, String Country, String NameF, String Director, String Actor, Date ReleaseDate, int Duration, String Description, String Picture, String Status) {
        this.FilId = FilId;
        this.TypId = TypId;
        this.Language = Language;
        this.AgeLimit = AgeLimit;
        this.Country = Country;
        this.NameF = NameF;
        this.Director = Director;
        this.Actor = Actor;
        this.ReleaseDate = ReleaseDate;
        this.Duration = Duration;
        this.Description = Description;
        this.Picture = Picture;
        this.Status = Status;
    }

    public int getFilId() {
        return FilId;
    }

    public int getTypId() {
        return TypId;
    }

    public String getLanguage() {
        return Language;
    }

    public int getAgeLimit() {
        return AgeLimit;
    }

    public String getCountry() {
        return Country;
    }

    public String getNameF() {
        return NameF;
    }

    public String getDirector() {
        return Director;
    }

    public String getActor() {
        return Actor;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public int getDuration() {
        return Duration;
    }

    public String getDescription() {
        return Description;
    }

    public String getPicture() {
        return Picture;
    }

    public String getStatus() {
        return Status;
    }

    public void setFilId(int FilId) {
        this.FilId = FilId;
    }

    public void setTypId(int TypId) {
        this.TypId = TypId;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public void setAgeLimit(int AgeLimit) {
        this.AgeLimit = AgeLimit;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setNameF(String NameF) {
        this.NameF = NameF;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setActor(String Actor) {
        this.Actor = Actor;
    }

    public void setReleaseDate(Date ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

	

}





