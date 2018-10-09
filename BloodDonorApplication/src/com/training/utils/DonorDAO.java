package com.training.utils;

import java.sql.SQLException;
import java.util.List;

import com.training.beans.BloodDonor;

public interface DonorDAO {
	
	public int addDonor(BloodDonor donor) throws SQLException;
	public List<BloodDonor> searchDonorByLocation(String location) throws SQLException;
	public List<BloodDonor> searchDonorByLocationAndGroup(String location, String bloodGroup) throws SQLException;
	public boolean updateDonationDetails(long donorId, String property, String newValue) throws SQLException;
	public List<String> getDistinctLocations() throws SQLException;
	public List<String> getDistinctBloodGroups() throws SQLException;

}
