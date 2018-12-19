package classJava;
import test.TestTraining;											//importing test class package

public class PublicTraining extends Training {

	private int participants;

	public PublicTraining( String subject, double fees , int participants) {		
		super( subject, fees);											//to call the parent constructor
		this.participants = participants;
	}

	@Override														//method overriding
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
