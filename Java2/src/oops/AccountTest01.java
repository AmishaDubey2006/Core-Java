package oops;

public class AccountTest01 {

	public static void main(String[] args) {

		Oop01 a = new Oop01();
		// a.balance=20;
		// System.out.println(a.balance);
		a.setBalance(1000);
		a.setAccountNumber("BOI1234");
		System.out.println(a.getbalance());
		System.out.println(a.getAccountNumber());
		a.withdrawal(500);
		System.out.println(a.getBalance());

	}

}
