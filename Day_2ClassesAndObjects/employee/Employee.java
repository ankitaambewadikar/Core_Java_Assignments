package employee;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double monthlyBasic;
	private double pFRate=10;
	//private static double annualBasic,monthlyGross,annualGross;
	
	public double getpFRate() {
		return pFRate;
	}
	public void setpFRate(double pFRate) {
		this.pFRate = pFRate;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public double getAnnualBasicSalary() {
		
		//annualBasic = (12 * monthlyBasic );
		//System.out.println("AnnualbasicSalary: "+ (12 * monthlyBasic ));
		return (12 * monthlyBasic );
	}
	public double getMonthlyGrossSalary() {
		
		double HRA = (0.5*monthlyBasic);
		double medicalAllowance =1250;
		double conveyance = 800;
		return (monthlyBasic + HRA + medicalAllowance +conveyance);
	}
	public double getAnnualGrossSalary() {
		//System.out.println(12*getMonthlyGrossSalary());
		return (12 * getMonthlyGrossSalary());
	}
	public double getMonthlyDeductions() {
		
		double ESCI = 0;
		double professionTax;
		double pfAmount;
		pfAmount=( (pFRate * monthlyBasic ) / 100  <6500 )? ( (pFRate * monthlyBasic)/100 ) : 6500;
		ESCI = ( monthlyBasic <= 5000 ) ? ( (4.75/100) * monthlyBasic ) : 0;
		professionTax =( monthlyBasic <= 10000 ) ? 50 : 100;
		//System.out.println(pfAmount + professionTax + ESCI);
		return (pfAmount + professionTax + ESCI);
	}
	public double getMonthlyTakeHome() {
		//System.out.println(getMonthlyGrossSalary()-getMonthlyDeductions());
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	public double getAnnualTakeHome() {
		System.out.println(12*getMonthlyTakeHome());
		return( 12 * getMonthlyTakeHome());
	}
	

}
