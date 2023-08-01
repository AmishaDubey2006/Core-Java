package exceptionhandling;
                           //(TEST ACCOUNT)
public class TestInsufficient {
	public static void main(String[] args) {
		InsufficientFund a= new  InsufficientFund ();
		a.deposit(5000);
		try {
			a.withdrawal (3000);
		} catch (InsufficientFund e) {
			e.printStackTrace();
		}
	}

}
