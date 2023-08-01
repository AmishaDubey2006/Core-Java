package Inheritance2;

public class TestConstructorShape {
	public static void main(String[] args) {
		ConstructorRectangle R = new ConstructorRectangle(10,5);
		R.area();
		ConstructorCircle C= new ConstructorCircle (5);
		C.area();
		ConstructorTriangle t = new ConstructorTriangle(10,30);
		t.area();
		
	}

}
