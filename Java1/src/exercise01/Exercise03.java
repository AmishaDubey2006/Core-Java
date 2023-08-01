package exercise01;

public class Exercise03 {
	public static void main(String[] args) {
		//for (int i=1; i<=5; i++) {
			
			//System.out.println((int) (Math.random()*1000));
			//}
		for (int i=1; i<=5; i++ ) {
			int number = (int) (Math.random()* 1000);
			if (number >= 100) {
				System.out.println(number);
			}
			
		}
	}

}
	
// Note:it's Random number