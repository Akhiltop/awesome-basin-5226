package com.cmsapp.dao;

import java.util.List;
import com.cmsapp.exceptions.victimException;
import com.cmsapp.model.crime;
import com.cmsapp.model.victim;

public interface victimDao {
	
	//add a new victim
	public int addNewVictim(victim v) throws victimException;
	
	//display all victim details
	public List<victim> displayAllVictimDetails() throws victimException;
	
	//display all crimes linked with victim id
	public List<crime> displayCrimesLinkedWithVictimid(int victim_id) throws victimException;
	

}
