package com.cmsapp.dao;

import java.util.List;
import com.cmsapp.exceptions.criminalException;
import com.cmsapp.model.crime;
import com.cmsapp.model.criminal;

public interface criminalDao {
	
	//add a new criminal
	public int addNewCriminal(criminal c) throws criminalException;
	
	
	//display all criminal details
	public List<criminal> displayAllCriminalDetails() throws criminalException;
	
	
	//display all crimes linked with criminal id
	public List<crime> displayCrimesLinkedWithCriminalid(int criminal_id) throws criminalException;
 	
	
	

}
