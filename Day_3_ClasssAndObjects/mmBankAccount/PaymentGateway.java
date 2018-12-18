package mmBankAccount;

public class PaymentGateway {

	public static boolean fundTransfer(SavingAccount sender,
			SavingAccount receiver, int transfer) {
		
				if(sender.getAccountBalance() >= transfer){
					sender.withdrawAmount(transfer);
					receiver.depositAmount(transfer);
					return true;
				}
				else
				 return false;
				}

}
