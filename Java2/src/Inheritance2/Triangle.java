package Inheritance2;

public class Triangle extends Shape {
	private int Length;
	private int Breadth ;
	
	public void setLength(int length) {
		this.Length = Length;
	}
	public int getLength() {
		return Length;
	}
	public void setBreadth(int Breadth) {
		this.Breadth = Breadth;
		
	}
	public int getBreath() {
		return Breadth;
	}
	public void area () {
		int tarea = ((getBreath()*getLength())/2); 
		System.out.println(" area of triangle="+ tarea);
	}

}
