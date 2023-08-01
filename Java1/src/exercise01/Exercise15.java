package exercise01;

public class Exercise15 {
	public static void main(String[] args) {
		int [] arr = { 15,151,10,20,50,100 };
		int a=0;
		for (int i=0; i<arr.length;i++) {
			if (arr [i]>a) {
				a=arr[i];
				
			}
		}
	System.out.println(a);	
	}

}
