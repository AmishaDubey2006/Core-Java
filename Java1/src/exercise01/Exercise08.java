package exercise01;

public class Exercise08 {
	public static void main(String[] args) {
		int[] table1 = {2,4,6,8,10};
		int[] table2 = new int [5];
		int[][] table3= new int [10] [10];
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				table3 [i-1] [j-1]=i*j;
				System.out.print(table3 [i-1] [j-1] + "\t");
			}
			System.out.println();
		}
	}

}

// note:- 2Dimensional solution.