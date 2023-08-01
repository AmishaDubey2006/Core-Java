package exercise01;

import java.util.Arrays;

public class Exercise16 {
	public static void main(String[] args) {
		Arrays[]arr = new Arrays[10]; 
		
		int []arr1 = {1500,20000,99,150,16,5,555};
		int a=5;
		int b=10;
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i] > b) {
				a=b;
				b= arr1[i];
				System.out.println(b);
			}
			
		}
	}

}
