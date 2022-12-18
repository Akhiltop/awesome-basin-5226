package com.cmsapp.model;

public class criminal {
	
	
	private String criminal_name;
	private String criminal_dob;
	private String criminal_gender;
	private String criminal_area;
	private String criminal_address;
	private String criminal_mark_face;
	private String place_arrested_first;
	public String getCriminal_name() {
		return criminal_name;
	}
	public void setCriminal_name(String criminal_name) {
		this.criminal_name = criminal_name;
	}
	public String getCriminal_dob() {
		return criminal_dob;
	}
	public void setCriminal_dob(String criminal_dob) {
		this.criminal_dob = criminal_dob;
	}
	public String getCriminal_gender() {
		return criminal_gender;
	}
	public void setCriminal_gender(String criminal_gender) {
		this.criminal_gender = criminal_gender;
	}
	public String getCriminal_area() {
		return criminal_area;
	}
	public void setCriminal_area(String criminal_area) {
		this.criminal_area = criminal_area;
	}
	public String getCriminal_address() {
		return criminal_address;
	}
	public void setCriminal_address(String criminal_address) {
		this.criminal_address = criminal_address;
	}
	public String getCriminal_mark_face() {
		return criminal_mark_face;
	}
	public void setCriminal_mark_face(String criminal_mark_face) {
		this.criminal_mark_face = criminal_mark_face;
	}
	public String getPlace_arrested_first() {
		return place_arrested_first;
	}
	public void setPlace_arrested_first(String place_arrested_first) {
		this.place_arrested_first = place_arrested_first;
	}
	public criminal(String criminal_name, String criminal_dob, String criminal_gender, String criminal_area,
			String criminal_address, String criminal_mark_face, String place_arrested_first) {
		super();
		this.criminal_name = criminal_name;
		this.criminal_dob = criminal_dob;
		this.criminal_gender = criminal_gender;
		this.criminal_area = criminal_area;
		this.criminal_address = criminal_address;
		this.criminal_mark_face = criminal_mark_face;
		this.place_arrested_first = place_arrested_first;
	}
	public criminal() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
