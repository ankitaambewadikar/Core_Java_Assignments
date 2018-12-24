package com.training;

public class CorporateTraining extends Training {

	private int days;

	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days = days;
	
	}

	/**
	 * method overrided from the training class to find the total fees for corporate training by course Id fees* no of days
	 */
	@Override
	public double getOrderValue() {
		
		return (fees * days);
	}

}
