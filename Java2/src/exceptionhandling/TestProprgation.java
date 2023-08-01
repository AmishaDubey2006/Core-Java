package exceptionhandling;

public class TestProprgation {

	public static void main(String[] args) {
		dad();
	}
	public static void dad () {
		try {
			mom();
		} catch (AbNiHogi e) {
		System.out.println(e);
			//Se.printStackTrace();
		}
	}
	public static void mom () throws AbNiHogi{
		son();
	}
	public static void son() throws AbNiHogi {
	throw new AbNiHogi();
	}
}
