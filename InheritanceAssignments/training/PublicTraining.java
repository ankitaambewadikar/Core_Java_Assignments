package com.training;
import com.testTraining.TestTraining;
/**
 * 
 * @author aambewad
 * class PublicTraining extends the abstract class training and also overides the getOrderVlaue abstract method
 *
 */
public class PublicTraining extends Training {

	private int participants;

	public PublicTraining( String subject, double fees , int participants) {		
		super( subject, fees);											//to call the parent constructor
		this.participants = participants;
	}
/**
 * 	 * method overrided from the training class to find the total fees for public training by course Id fees* no of participants

 */
	@Override														
	public double getOrderValue() {
	
		return (fees * participants);
	}

	@Override
	public String toString() {
		return "PublicTraining [ Id =" + getId()+ " Subject =" + getSubject() + " Fees = " +
				getFees() + " participants=" + participants
				+ ", getOrderValue()=" + getOrderValue() +  "]";
	}

	public int getParticipants() {
		return participants;
	}

	
	

}
