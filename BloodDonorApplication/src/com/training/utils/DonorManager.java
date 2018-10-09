package com.training.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.training.beans.BloodDonor;

public class DonorManager implements DonorDAO {
	
	private Connection con;
	

	public DonorManager() {
		super();
		try {
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/ds1");
			this.con = dataSource.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(con);
	}
	
	@Override
	public int addDonor(BloodDonor donor) throws SQLException {
		
		int result = 0; 
		
		String sql = "Insert into bloodDonor_ag values(?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		
		
		pstmt=con.prepareStatement(sql);
		pstmt.setLong(1, donor.getDonorId());
		pstmt.setString(2, donor.getDonorName());
		pstmt.setString(3, donor.getBloodGroup());
		pstmt.setString(4, donor.getDonorLocation());
		pstmt.setInt(5, donor.getTimesDonated());
		
		result=pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

	@Override
	public List<BloodDonor> searchDonorByLocation(String location) throws SQLException {

		List<BloodDonor> donorsFound = new ArrayList<>();
		
		String sql = "Select * from bloodDonor_ag where donorLocation = ? ";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, location);

		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			long donorId = rs.getLong("donorId");
			String donorName = rs.getString("donorName");
			String donorLocation = rs.getString("donorLocation");
			String bloodGroup = rs.getString("bloodGroup");
			int timesDonated = rs.getInt("timesDonated");
			
			BloodDonor donor = new BloodDonor(donorName, donorId, bloodGroup, donorLocation, timesDonated);
			donorsFound.add(donor);
			
		}
		
		pstmt.close();
	
		return donorsFound;
	}

	@Override
	public List<BloodDonor> searchDonorByLocationAndGroup(String location, String bloodGroup) throws SQLException {

	List<BloodDonor> donorsFound = new ArrayList<>();
		
		String sql = "Select * from bloodDonor_ag where donorLocation = ? and bloodGroup = ? ";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, location);
		pstmt.setString(2, bloodGroup);

		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			long donorId = rs.getLong("donorId");
			String donorName = rs.getString("donorName");
			String donorLocation = rs.getString("donorLocation");
			int timesDonated = rs.getInt("timesDonated");
			
			BloodDonor donor = new BloodDonor(donorName, donorId, bloodGroup, donorLocation, timesDonated);
			donorsFound.add(donor);
			
		}
		
		pstmt.close();
	
		return donorsFound;	
	}

	@Override
	public boolean updateDonationDetails(long donorId, String property, String newValue) throws SQLException {
		boolean status = false; 
		
		int result = 0; 
		
		String sql = "update bloodDonor_ag set " + property + "= ? where donorId = ? ";
		PreparedStatement pstmt = null;
		
		
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, newValue);
		pstmt.setLong(2, donorId);
		
		result=pstmt.executeUpdate();
		
		pstmt.close();
		
		if (result>0)
			status = true;
		System.out.println(status);
		return status;
	}

	@Override
	public List<String> getDistinctLocations() throws SQLException {
		List<String> locationList = new ArrayList<>(); 		
		String sql = "select distinct donorlocation from bloodDonor_ag";
		
		PreparedStatement pstmt = null;
		pstmt=con.prepareStatement(sql);
		
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String donorLocation = rs.getString("donorLocation");
			
			locationList.add(donorLocation);
			
		}		
		pstmt.close();
		
		
		return locationList;
	}

	@Override
	public List<String> getDistinctBloodGroups() throws SQLException {

		List<String> bloodGroupList = new ArrayList<>(); 		
		String sql = "select distinct bloodGroup from bloodDonor_ag";
		
		PreparedStatement pstmt = null;
		pstmt=con.prepareStatement(sql);
		
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String bloodGroup = rs.getString("bloodGroup");
			
			bloodGroupList.add(bloodGroup);
			
		}		
		pstmt.close();
		
		
		return bloodGroupList;
	
	}
	
}
