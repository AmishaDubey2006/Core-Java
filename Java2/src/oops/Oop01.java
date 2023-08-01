package oops;

public class Oop01 {
	private int balance = 0;
	private String accountNumber = null;

	public void setBalance(int b) {
		balance = b;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance1(int b) {
		balance = b;
	}

	public int getbalance() {
		return balance;
	}

	public void setAccountNumber(String s) {
		accountNumber = s;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public void withdrawal (int amount) {
		int total = getBalance ()- amount ;
		setBalance (total);
		
	}
	private String color = null;
	private int borderwiddth =0;
	public  void setcolor (String Color) {
		this.color =color ;
	}
	public String getcolor() {
		return color;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderwiddth=borderwiddth;
	}
	public int getBorderWidth () {
		return borderwiddth;
		
		
		
	}

}