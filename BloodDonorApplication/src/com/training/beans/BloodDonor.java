package com.training.beans;

public class BloodDonor {
	private String donorName;
	private long donorId;
	private String bloodGroup;
	private String donorLocation;
	private int timesDonated;
	
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BloodDonor(String donorName, long donorId, String bloodGroup, String donorLocation, int timesDonated) {
		super();
		this.donorName = donorName;
		this.donorId = donorId;
		this.bloodGroup = bloodGroup;
		this.donorLocation = donorLocation;
		this.timesDonated = timesDonated;
	}
	
	public BloodDonor(String donorName, long donorId, String bloodGroup, String donorLocation) {
		super();
		this.donorName = donorName;
		this.donorId = donorId;
		this.bloodGroup = bloodGroup;
		this.donorLocation = donorLocation;
		this.timesDonated = 0;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public long getDonorId() {
		return donorId;
	}

	public void setDonorId(long donorId) {
		this.donorId = donorId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDonorLocation() {
		return donorLocation;
	}

	public void setDonorLocation(String donorLocation) {
		this.donorLocation = donorLocation;
	}

	public int getTimesDonated() {
		return timesDonated;
	}

	public void setTimesDonated(int timesDonated) {
		this.timesDonated = timesDonated;
	}

	@Override
	public String toString() {
		return "BloodDonor [donorName=" + donorName + ", donorId=" + donorId + ", bloodGroup=" + bloodGroup
				+ ", donorLocation=" + donorLocation + ", timesDonated=" + timesDonated + "]";
	}
	
	
	
}
