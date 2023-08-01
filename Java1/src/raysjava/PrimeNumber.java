package raysjava;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 25;
		int count = 0;
		for ( int i =2;i<number;i++) {
			if (number % i ==0) {
				count++;
				System.out.println("wo number="+i);
		}
		}
		if (count ==0) {
			System.out.println("Prime number");
		}else {
			System.out.println("not Prime number");
		}
	}

}
