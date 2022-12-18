package com.cmsapp.model;

public class victim {

	private String victim_name;
	private String victim_dob;
	private String victim_gender;
	private String victim_area;
	private String victim_address;
	private String victim_mobile;
	public String getVictim_name() {
		return victim_name;
	}
	public void setVictim_name(String victim_name) {
		this.victim_name = victim_name;
	}
	public String getVictim_dob() {
		return victim_dob;
	}
	public void setVictim_dob(String victim_dob) {
		this.victim_dob = victim_dob;
	}
	public String getVictim_gender() {
		return victim_gender;
	}
	public void setVictim_gender(String victim_gender) {
		this.victim_gender = victim_gender;
	}
	public String getVictim_area() {
		return victim_area;
	}
	public void setVictim_area(String victim_area) {
		this.victim_area = victim_area;
	}
	public String getVictim_address() {
		return victim_address;
	}
	public void setVictim_address(String victim_address) {
		this.victim_address = victim_address;
	}
	public String getVictim_mobile() {
		return victim_mobile;
	}
	public void setVictim_mobile(String victim_mobile) {
		this.victim_mobile = victim_mobile;
	}
	public victim(String victim_name, String victim_dob, String victim_gender, String victim_area,
			String victim_address, String victim_mobile) {
		super();
		this.victim_name = victim_name;
		this.victim_dob = victim_dob;
		this.victim_gender = victim_gender;
		this.victim_area = victim_area;
		this.victim_address = victim_address;
		this.victim_mobile = victim_mobile;
	}
	public victim() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
