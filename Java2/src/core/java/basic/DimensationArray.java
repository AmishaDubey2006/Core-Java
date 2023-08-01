package core.java.basic;

public class DimensationArray {
public static void main(String[] args ) {
	
	//int[] table1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20} ;
	
	int[] table2  = new int [10];
	
	for ( int i= 1; i<= table2.length; i++) {
		table2 [i - 1] = 2 * i ;
	}
	for (int i : table2 ) {
		System.out.print( i + " ");
	
	}
}
}
		
	