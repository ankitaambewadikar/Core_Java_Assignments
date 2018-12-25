package com.advancedCollectionAssignmentCarParking;

public class ParkedCarOwnerDetails {

	private String carOwnersName;
	private String carModel;
	private String carNumber;
	private String ownerMobileNumber;
	private String ownerAddress;



	public ParkedCarOwnerDetails(String carOwnersName, String carModel, String carNumber,
			String ownerMobileNumber, String ownerAddress) {
		
		this.carOwnersName = carOwnersName;
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.ownerMobileNumber = ownerMobileNumber;
		this.ownerAddress = ownerAddress;
	}

	public String getCarOwnersName() {
		return carOwnersName;
	}

	public void setCarOwnersName(String carOwnersName) {
		this.carOwnersName = carOwnersName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarnumber() {
		return carNumber;
	}

	public void setCarnumber(String carnumber) {
		this.carNumber = carNumber;
	}

	public String getOwnerMobileNumber() {
		return ownerMobileNumber;
	}

	public void setOwnerMobileNumber(String ownerMobileNumber) {
		this.ownerMobileNumber = ownerMobileNumber;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

}
