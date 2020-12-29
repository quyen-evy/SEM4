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
public class Film {
private int FilId;
private int TypId;
private String Language;
private String Country;
private String NameF;
private String Director;
private String Actor;
private int Duration;
private String  Description;
private String  Picture;
private Boolean Status;	



	public Film(int FilId, int TypId, String Language, String Country, String NameF, String Director, String Actor, int Duration, String Description, String Picture, Boolean Status) {
		this.FilId = FilId;
		this.TypId = TypId;
		this.Language = Language;
		this.Country = Country;
		this.NameF = NameF;
		this.Director = Director;
		this.Actor = Actor;
		this.Duration = Duration;
		this.Description = Description;
		this.Picture = Picture;
		this.Status = Status;
	}

	public Film() {
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String Language) {
		this.Language = Language;
	}

	public int getFilId() {
		return FilId;
	}

	public void setFilId(int FilId) {
		this.FilId = FilId;
	}

	public int getTypId() {
		return TypId;
	}

	public void setTypId(int TypId) {
		this.TypId = TypId;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public String getNameF() {
		return NameF;
	}

	public void setNameF(String NameF) {
		this.NameF = NameF;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String Director) {
		this.Director = Director;
	}

	public String getActor() {
		return Actor;
	}

	public void setActor(String Actor) {
		this.Actor = Actor;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int Duration) {
		this.Duration = Duration;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String Picture) {
		this.Picture = Picture;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean Status) {
		this.Status = Status;
	}

}




