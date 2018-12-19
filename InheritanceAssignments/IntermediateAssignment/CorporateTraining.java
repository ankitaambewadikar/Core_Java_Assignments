package classJava;

public class CorporateTraining extends Training {

	private int days;

	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days = days;
	
	}

	@Override
	public double getOrderValue() {
		
		return (fees * days);
	}

}
