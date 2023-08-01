package raysjava;

public class PrimePractice {
	public static void main(String[] args) {
		int number =155;
		int count = 0;
		for (int i =2; i<number ; i ++) {
			if (number % i ==0){
				count++;
				System.out.println("Wo no"+i);
			}
		}
		if ( count == 0) {
			System.out.println("Prime number");
		}else {
			System.out.println("not prime number");
			
		}
		
		
	}
	

}
