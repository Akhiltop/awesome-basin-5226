package com.cmsapp.dao;

import java.util.List;

import com.cmsapp.exceptions.victimException;
import com.cmsapp.model.crime;
import com.cmsapp.model.victim;

public class victimDaoImpl implements victimDao{

	@Override
	public int addNewVictim(victim v) throws victimException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<victim> displayAllVictimDetails() throws victimException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<crime> displayCrimesLinkedWithVictimid(int victim_id) throws victimException {
		// TODO Auto-generated method stub
		return null;
	}

}
