package com.cmsapp.dao;

import java.util.List;

import com.cmsapp.exceptions.criminalException;
import com.cmsapp.model.crime;
import com.cmsapp.model.criminal;

public class criminalDaoImpl implements criminalDao{

	@Override
	public int addNewCriminal(criminal c) throws criminalException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<criminal> displayAllCriminalDetails() throws criminalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<crime> displayCrimesLinkedWithCriminalid(int criminal_id) throws criminalException {
		// TODO Auto-generated method stub
		return null;
	}

}
