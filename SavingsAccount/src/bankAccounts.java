
public class bankAccounts {

	public static void main(String[] args) {
		SavingsAcc account1 = new SavingsAcc(1804, 10000, 1220);
		
		account1.deposit(1000);
		account1.checkBalance();
		

	}

}
