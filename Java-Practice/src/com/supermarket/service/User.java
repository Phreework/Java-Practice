package com.supermarket.service;

public class User {
	private String name = "admin";
	private String password = "admin";
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPass() {
		return this.password;
	}
	public void setPass(String password) {
		this.password = password;
	}
}
