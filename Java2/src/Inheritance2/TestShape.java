package Inheritance2;

public class TestShape {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(3);
		r.setWidth(4);
		r.area();
		
		
		r.setColor("red");
		System.out.println(r.getColor());
		r.setBorderwidth(10);
		System.out.println(r.getBorderwidth());
		
		Shape s= new Shape ();
		s.setColor("blue");
		s. setBorderwidth(5);
		s.area ();
		
		Shape s1= new Rectangle();
		Shape s2 = new Shape();
		Rectangle r1 = (Rectangle)s1;
				r1. setWidth(20);
		s1.area();
		
		Circle c = new Circle ();
		c.setRadius(5);
		c.area();
		Shape[] sa = new Shape[2];
		sa [0] = new Rectangle();	
		sa [1] = new Shape();
		
		Rectangle ra= (Rectangle) sa[0];
		r.setLength(10);
		
		Triangle t= new Triangle ();
		t.setBreadth(82);
		t.setLength(40);
		t.area();
		
		
		
		
		
		
		
		
		
	}
	

}
