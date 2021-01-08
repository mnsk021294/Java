
public class SavingsAcc {

	
	int accountno;
	double balance;
	int pin;
	final static int minimumbal=500;
	
	
	
	
	
	public SavingsAcc(int accountno, double balance, int pin) {
		super();
		this.accountno = accountno;
		this.balance = balance;
		this.pin = pin;
	}
	public void deposit(int depositAmount) {
	if(depositAmount > 0){
		balance = balance + depositAmount;
	}else {
		System.out.println("Invalid");
	}
	
	
	
	}
	public void withdraw(int withdrawalAmount) {
		if (withdrawalAmount>0 && withdrawalAmount<= balance) {
			balance=balance-withdrawalAmount;
			
		}
		else {
			System.out.println("Insufficient funds");
			
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Your Balance is :"+balance);
		
	}
	
}
