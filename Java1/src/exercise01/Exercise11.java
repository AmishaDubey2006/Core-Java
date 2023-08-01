package exercise01;

public class Exercise11 {
	public static void main(String[] args) {
		int number=13;
		int count =0;
		for (int i=2; i<number; i++) {
			if (number% i==0) {
				count ++;
				System.out.println("wo number=+i");
			}
			
		}
		if (count == 0) {
			System.out.println(number+"prime number ");
		} else {
			System.out.println(number + "not prime number");
			count=0;
		}
		
	}

}
