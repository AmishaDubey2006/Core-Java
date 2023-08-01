package raysjava;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int number =10;
		int count = 0;
		for (int j =3; j<=100 ; j ++) {
			for (int i= 2; i<j; i++) {
			if (j % i ==0){
				count++;
				
			}
		}
		if ( count == 0) {
			System.out.println(number+"Prime number" +j );
		}else {
			System.out.println(number+"not prime number");
			count=0;
			

}
	}
}
}
