package com.cmsapp.model;

public class crime {
	
	private String crime_date;
	private String crime_place;
	private String crime_desc;
	private String detail_desc;
	public String getCrime_date() {
		return crime_date;
	}
	public void setCrime_date(String crime_date) {
		this.crime_date = crime_date;
	}
	public String getCrime_place() {
		return crime_place;
	}
	public void setCrime_place(String crime_place) {
		this.crime_place = crime_place;
	}
	public String getCrime_desc() {
		return crime_desc;
	}
	public void setCrime_desc(String crime_desc) {
		this.crime_desc = crime_desc;
	}
	public String getDetail_desc() {
		return detail_desc;
	}
	public void setDetail_desc(String detail_desc) {
		this.detail_desc = detail_desc;
	}
	public crime(String crime_date, String crime_place, String crime_desc, String detail_desc) {
		super();
		this.crime_date = crime_date;
		this.crime_place = crime_place;
		this.crime_desc = crime_desc;
		this.detail_desc = detail_desc;
	}
	public crime() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
