package exceptionhandling;

public class TestInvalidUser {
	public static void main(String[] args) {
		String name = "admi";
		try {
			if (name.equals("admin")){
				System.out.println("valid user....!!!");
	}else {
		throw new InvalidUser();
		}
	}catch (Exception e){
		System.out.println(e.getMessage());
	}
		System.out.println("Hello Javaaa");
		
	}}

		
