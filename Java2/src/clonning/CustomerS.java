package clonning;

public class CustomerS implements Cloneable {
	public String name = null;
	public AccountClone account = null;
	public CustomerS(String name) {
		this.name = name ;
		this.account = new AccountClone (10);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		CustomerS C = (CustomerS)super.clone();
		C.account = (AccountClone)account.clone();
		return C;
		
	}
		 

	}	
			
		
		
	



