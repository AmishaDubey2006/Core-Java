package raysjava;

public class Table00 {
	public static void main(String[] args) {
		for ( int table=1; table<=5; table++ ) {
			for (int i=1; i<=10; i++) {
				System.out.println(table+"*" + (i) + "=" + (table*(i)));
			}
			System.out.println("___________________");
		}
	}

}
