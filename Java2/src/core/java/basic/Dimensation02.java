package core.java.basic;

public class Dimensation02 {
	public static void main(String[] args) {

		int[][] table = new int[10][10];

		for (int b = 1; b <= 10; b++) {

			for (int c = 1; c <= 10; c++) {
				

				table[b - 1][c - 1] = b * c;
				//System.out.print(table[b-1] [c-1] +"\t");

			}
               // System.out.println();
		}

		for (int[] w : table) {

			for (int i = 1; i < w.length; i++) {

				System.out.print(w[i] + "\t");

			}

			System.out.println();
		}

	}
}
