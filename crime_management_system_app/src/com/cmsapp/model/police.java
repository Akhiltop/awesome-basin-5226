package com.cmsapp.model;

public class police {

	private String police_name;
	private String reporting_area_ps;
	private String police_password;
	public String getPolice_name() {
		return police_name;
	}
	public void setPolice_name(String police_name) {
		this.police_name = police_name;
	}
	public String getReporting_area_ps() {
		return reporting_area_ps;
	}
	public void setReporting_area_ps(String reporting_area_ps) {
		this.reporting_area_ps = reporting_area_ps;
	}
	public String getPolice_password() {
		return police_password;
	}
	public void setPolice_password(String police_password) {
		this.police_password = police_password;
	}
	public police(String police_name, String reporting_area_ps, String police_password) {
		super();
		this.police_name = police_name;
		this.reporting_area_ps = reporting_area_ps;
		this.police_password = police_password;
	}
	public police() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
