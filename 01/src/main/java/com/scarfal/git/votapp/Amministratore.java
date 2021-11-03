package com.scarfal.git.votapp;

public class Amministratore {
	//FIELDS
	private String mail, username, password;
	private String name, surname;
	private int bday, bmonth, byear;
	
	//CONSTRUCTORS
	public Amministratore() {
		mail="mail@mail.com";
		username="username";
		password="password";
		name="guest";
		surname="guest";
		bday= 1;
		bmonth=1;
		byear=1900;
	}
	
	public Amministratore(String mail,String username,String psw,String name,String surname,int bday,int bmonth,int byear) {
		this.mail = mail;
		this.username=username;
		this.password=psw;
		this.name=name;
		this.surname=surname;
		this.bday=bday;
		this.bmonth=bmonth;
		this.byear=byear; 
	}
	
	//METHODS
	public String getUsername() {
		return "";
	}
	
	public String getPassword() {
		return "";
	}
	
	public boolean changeUsername() {
		return false;
	}
	
	public boolean changePassword() {
		return false;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
