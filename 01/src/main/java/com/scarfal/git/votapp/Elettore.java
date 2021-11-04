package com.scarfal.git.votapp;

public class Elettore {
	//FIELDS
	private String id, name, surname, num_tes_elet; 
	private int bday, bmonth, byear;
	
	//CONSTRUCTORS
	public Elettore(){
		id = "00000000";
		name = "guest";
		surname = "guest";
		bday = 1;
		bmonth = 1;
		byear = 1900;
		num_tes_elet = "0000000000";
	}
	
	public Elettore(String id, String name, String surname, int bday, int bmonth, int byear, String num_tes_elet){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.num_tes_elet = num_tes_elet;
	}
	
	//METHODS
	public String getInfo() {
		return "culo";
	}
	public boolean vote() {
		return false;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
