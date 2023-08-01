package clonning;

                                                        // ( Shallow Cloning) //
public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException  {
		AccountClone a1 = new AccountClone (10);
		AccountClone a2 = (AccountClone) a1.clone ();
		a1.balance = 20;
		System.out.println( a1.balance);
		System.out.println(a2.balance);
		
		
		
		                                                 //( Deep Cloning)//
		
		
		CustomerS c1 =new CustomerS ( " Pratha " );
		CustomerS c2 = (CustomerS) c1.clone();
		c2.name = "Prarthana";
		c2.account.balance = 20;
		System.out.println( c2.name);
		System.out.println(c2.account.balance);
	}

}
