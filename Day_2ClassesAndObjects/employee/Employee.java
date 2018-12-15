/*

Write a program for Employee class with attribute Id,Name and monthly basic and write the behaviours to get 
annualBasic(),getMonthlyGrossSalary(),getAnnualGrossSalary(),getMonthlyDeductions(),getMonthlyTakeHome(),
getAnnualTakeHome() 
HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
PF = 10% of  monthly basic or 6500 whichever is lower.
ESIC = 4.75% of monthly basic if monthly basic <= 5000
professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100



 */



package employee;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double monthlyBasic;
	private double pFRate=10;
	//private static double annualBasic,monthlyGross,annualGross;
	
	//Setters and getters for employeeId,employeeName,monthlybasic and pfrate
	
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
	public double getAnnualBasicSalary() {															//method for returning annualBasic to GetAnnualBasic salary
		
		//annualBasic = (12 * monthlyBasic );
		//System.out.println("AnnualbasicSalary: "+ (12 * monthlyBasic ));
		return (12 * monthlyBasic );
	}
	public double getMonthlyGrossSalary() {															//method for returning monthlyGross t
		
		double HRA = (0.5*monthlyBasic);
		double medicalAllowance =1250;
		double conveyance = 800;
		return (monthlyBasic + HRA + medicalAllowance +conveyance);
	}
	public double getAnnualGrossSalary() {															// method to return annualGrossSalary
		//System.out.println(12*getMonthlyGrossSalary());
		return (12 * getMonthlyGrossSalary());
	}
	public double getMonthlyDeductions() {															//method to return monthlyDeductions
		
		double ESCI = 0;
		double professionTax;
		double pfAmount;
		pfAmount=( (pFRate * monthlyBasic ) / 100  <6500 )? ( (pFRate * monthlyBasic)/100 ) : 6500;	//using ternary operator find the pfAmount
		ESCI = ( monthlyBasic <= 5000 ) ? ( (4.75/100) * monthlyBasic ) : 0;						//using ternary operator find the ESIC
		professionTax =( monthlyBasic <= 10000 ) ? 50 : 100;										//using ternary operator find the profession tax
		//System.out.println(pfAmount + professionTax + ESCI);
		return (pfAmount + professionTax + ESCI);
	}
	public double getMonthlyTakeHome() {															//method to return monthlyTakeHome														
		//System.out.println(getMonthlyGrossSalary()-getMonthlyDeductions());
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	public double getAnnualTakeHome() {																//method to return annualTakeHome
		System.out.println(12*getMonthlyTakeHome());
		return( 12 * getMonthlyTakeHome());
	}
	

}
