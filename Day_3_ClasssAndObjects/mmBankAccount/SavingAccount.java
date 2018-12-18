package mmBankAccount;

public class SavingAccount {
	
	private static int nextAccountNumber = 0;
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance=0;
	
	SavingAccount(String accountHolderName){							//constructer to initilize zero balance account
		accountNumber = ++nextAccountNumber;
		this.accountHolderName = accountHolderName;
	}

	
	SavingAccount(String accountHolderName,double initialBalance){		//constructer to initlize initial balance account
		accountNumber = ++nextAccountNumber;
		this.accountHolderName = accountHolderName;
		accountBalance = initialBalance;
		
	}
	
	static int getNextAccountNumber(){									//to get nextAccountNumber without object reference
		
		return nextAccountNumber+1;
	}


	public double depositAmount(double depositAmount) {					//deposit method
		return (this.accountBalance += depositAmount);
		
	}

	public double withdrawAmount(double withdrawAmount) {				//withdraw method
		
		if(withdrawAmount <= accountBalance){
			return (this.accountBalance -= withdrawAmount);
		}
		return (0);
	}


	@Override																//
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + getAccountBalance() + "]";
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
/* Main method to create objects of saving account class and display details on reference printing and test the 
 * withdraw and deposit method
 */
	
	public static void main(String[] args){
			//objectOne 
				SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
				savingAccountOne.depositAmount(1000);
				savingAccountOne.withdrawAmount(500);
				System.out.println(savingAccountOne);
				
				//objectTwo
				SavingAccount savingAccountTwo= new SavingAccount("ankit",1500);
				savingAccountTwo.depositAmount(1000);
				savingAccountTwo.withdrawAmount(500);
				System.out.println(savingAccountTwo);
				//Objectthree
				SavingAccount savingAccountThree= new SavingAccount("ankit");
				System.out.println(savingAccountThree);
				SavingAccount.getNextAccountNumber();
	}

	
}
