package com.cmsapp.dao;

import com.cmsapp.exceptions.policeException;

public interface policeDao {

	//update police password
		public String updatePassword(String password) throws policeException;
	
	
}
