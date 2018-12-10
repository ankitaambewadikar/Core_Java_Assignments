
import java.util.Scanner;
 class CalculateIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int annualIncome;
		int taxPercent;
		double tax=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your CTC :");
		annualIncome = scanner.nextInt();
	
		if(annualIncome>0 && annualIncome<180000){
			System.out.println("Taxa payable Nil");
		}
		else if (annualIncome > 181001 && annualIncome < 300000) {
			System.out.println("TaxPercent=10%");
			tax = annualIncome * 0.1;
			System.out.println("Tax amount payable is : "+tax);
			
		}
		else if (annualIncome > 300001 && annualIncome < 500000) {
			System.out.println("TaxPercent=20%");
			tax = annualIncome * 0.2;
			System.out.println("Tax amount payable is : "+tax);
			
		}
		else if (annualIncome > 500001 && annualIncome < 1000000) {
			System.out.println("TaxPercent=30%");
			tax = annualIncome * 0.3;
			System.out.println("Tax amount payable is : "+tax);
		}
		else{
			System.out.println("More Tax");
		}

	}

}
