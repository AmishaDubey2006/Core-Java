package clonning;

public class AccountClone implements Cloneable {
	int balance = 0;
	public AccountClone (int balance) {
		this.balance = balance; 
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	}
	
	
	
	
	



