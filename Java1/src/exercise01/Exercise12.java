package exercise01;

public class Exercise12 {
	public static void main(String[] args) {
    int number = 151;
    int reverse=0;
    int n = number;
    int r;
    while (n>0) {
    	r=n%10;
    	reverse = reverse*10+r;
    	n=n/10;
    	
    }
    System.out.println(reverse);	
    
}

}
