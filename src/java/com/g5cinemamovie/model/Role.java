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
public class Role {
	private int RoleId;
	private String NameRole;

	public Role() {
	}

	public Role(int RoleId, String NameRole) {
		this.RoleId = RoleId;
		this.NameRole = NameRole;
	}

	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int RoleId) {
		this.RoleId = RoleId;
	}

	public String getNameRole() {
		return NameRole;
	}

	public void setNameRole(String NameRole) {
		this.NameRole = NameRole;
	}
	
}



