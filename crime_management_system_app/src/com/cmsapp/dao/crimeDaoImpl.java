package com.cmsapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cmsapp.exceptions.crimeException;
import com.cmsapp.exceptions.criminalException;
import com.cmsapp.exceptions.victimException;
import com.cmsapp.model.crime;
import com.cmsapp.model.criminal;
import com.cmsapp.utility.DButil;

public class crimeDaoImpl implements crimeDao{

	@Override
	public int addNewCrime(crime c) throws crimeException {
		
		int ans=0;
		
		try(Connection conn=DButil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into crime_information(crime_date,crime_place,crime_desc,detail_desc) values(?,?,?,?)");
			
			ps.setDate(1, java.sql.Date.valueOf(c.getCrime_date()));
			ps.setString(2, c.getCrime_place());
			ps.setString(3, c.getCrime_desc());
			ps.setString(3, c.getDetail_desc());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				ans=1;
				System.out.println("Crime details added successfully");
				
			}else {
				throw new crimeException("Improper Crime Details!");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return ans;
		//if ans=0 repeat the usecase function again
	}

	@Override
	public int linkCriminalWithCrime(int crime_id, int criminal_id) throws crimeException, criminalException {

		int ans=0;
		
		try(Connection conn=DButil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into crime_criminal_link values(?,?)");
			
			ps.setInt(1, crime_id);
			ps.setInt(2, criminal_id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				ans=1;
				System.out.println("Crime and criminal linked successfully");
				
			}else {
				throw new crimeException("Improper id's used");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return ans;
		//if ans=0 repeat the usecase function again
	}

	@Override
	public int linkVictimWithCrime(int crime_id, int victim_id) throws crimeException, victimException {

		int ans=0;
		
		try(Connection conn=DButil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into crime_victim_link values(?,?)");
			
			ps.setInt(1, crime_id);
			ps.setInt(2, victim_id);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				ans=1;
				System.out.println("Crime and victim linked successfully");
				
			}else {
				throw new crimeException("Improper id's used");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return ans;
		//if ans=0 repeat the usecase function again
	}

	@Override
	public crime displayCrimeDetails(int crime_id) throws crimeException {
		
		crime c=null;
		
		try(Connection conn=DButil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from crime_information where crime_id=?");
			
			ps.setInt(1, crime_id);

			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				c=new crime();
				c.setCrime_date(rs.getString("crime_date"));
				c.setCrime_desc(rs.getString("crime_desc"));
				c.setCrime_place(rs.getString("crime_place"));
				c.setDetail_desc(rs.getString("detail_desc"));
				
			}else {
				
				throw new crimeException("crime_id not found!");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return c;
		//if c=null repeat use statement
	}

	@Override
	public List<crime> displayAllCrimeDetails() throws crimeException {
		crime c;
		List<crime> list=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from crime_information");
			
			
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				c=new crime();
				c.setCrime_date(rs.getString("crime_date"));
				c.setCrime_desc(rs.getString("crime_desc"));
				c.setCrime_place(rs.getString("crime_place"));
				c.setDetail_desc(rs.getString("detail_desc"));
				list.add(c);
			}		
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return list;
		//print list in use case
	}

	@Override
	public List<criminal> criminalsLinkedWithCrime(int crime_id) throws crimeException, criminalException {
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<criminal> victimsLinkedWithCrime(int crime_id) throws crimeException, victimException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCrimeStatus(int crime_id) throws crimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCrimeStatus(int crime_id, String case_status) throws crimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] generateReport() throws crimeException {
		// TODO Auto-generated method stub
		return null;
	}

}
