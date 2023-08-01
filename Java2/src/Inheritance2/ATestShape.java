package Inheritence;

public class ATestShape {
	public static void main(String[] args) {
		ARectangle r= new ARectangle ();
		r. area();
		
		Ashape s = new ARectangle ();
		s.area();
		
		Ashape.sum();
	}

}