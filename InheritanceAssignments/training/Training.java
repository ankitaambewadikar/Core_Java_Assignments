/**
 * Training is an abstract class where there an abstract method getOrderValue()
 * here to classes PublicTraining and CorporateTraining extend Class Training 
 * and implement the overridden method
 */

package com.training;														
import com.testTraining.TestTraining;

public abstract class Training {

	private int id;
	private String subject;
	protected double fees;
	private static int trainingId;								//Id for every new course  is unique therfore static variable used 
	
	static														//initilizers used so as on every object instancited gets new Id
	{
		trainingId =10;
	}
	{
		 trainingId++;
	}


	Training(String subject, double fees) {
		this.id = trainingId;
		this.subject = subject;
		this.fees = fees;
		
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public double getFees() {
		return fees;
	}

	public static int getTrainingId() {
		return trainingId;
	}

	public abstract double getOrderValue();									//absrtact method -as both the child classes consist of this method and have different logic


}
