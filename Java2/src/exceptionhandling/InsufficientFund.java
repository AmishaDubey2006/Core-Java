package exceptionhandling;
                            //(ACCOUNT)
public class InsufficientFund  extends Exception{
	private double balance = 0;
	private String accountNumber = null;
	
	public void setBalance (double balance) {
		this.balance = balance;
	}
public  double  getBalance() {
	return balance;
}
public void deposit(double d) {
	balance = balance +d;
	System.out.println("Deposit Amount is :-" +d);
}
public void withdrawal (double amt) throws InsufficientFund  {
	if ((balance - amt)<2000) {
		throw new InsufficientFund ();
	}else {
		balance = balance -amt;
		System.out.println("Withdrawal Amount is :" +amt);
		System.out.println("Current balance is :-" +balance);
	}
}

}
