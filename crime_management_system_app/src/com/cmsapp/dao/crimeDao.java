package com.cmsapp.dao;

import java.util.List;

import com.cmsapp.exceptions.crimeException;
import com.cmsapp.exceptions.criminalException;
import com.cmsapp.exceptions.victimException;
import com.cmsapp.model.crime;
import com.cmsapp.model.criminal;

public interface crimeDao {

	//add a new crime
	public int addNewCrime(crime c) throws crimeException;
		
	//link crime and criminal
	public int linkCriminalWithCrime(int crime_id,int criminal_id) throws crimeException,criminalException; 
		
	//link crime and victim
	public int linkVictimWithCrime(int crime_id,int victim_id) throws crimeException,victimException;
	
	
	//display crime details based on id
	public crime displayCrimeDetails(int crime_id) throws crimeException;
	
	//display all crime details
	public List<crime> displayAllCrimeDetails() throws crimeException;
		
	//display criminals linked with crime id	
	public List<criminal> criminalsLinkedWithCrime(int crime_id) throws crimeException,criminalException;
		
	//display victims linked with crime id	
	public List<criminal> victimsLinkedWithCrime(int crime_id) throws crimeException,victimException;
	
	//display case status of a crime
	public String getCrimeStatus(int crime_id) throws crimeException;
	
	//update crime case status
	public String updateCrimeStatus(int crime_id,String case_status) throws crimeException;
			
	//display report	
	public String[] generateReport() throws crimeException;
	
	
	
}
