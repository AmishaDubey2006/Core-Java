package Inheritance2;

public class ConstructorRectangle  extends ConstructorShape{
	public ConstructorRectangle () {
	}
	private int Length =0;
	private int Width = 0;
	public ConstructorRectangle (int Length, int Width) {
		this.Length = Length;
		this.Width=Width;
	}
	public void setlength(int Length) {
		this.Length= Length;
	}
	public void setWidth (int Width) {
	}
	public int getLength () {
		return Length;
	}
	public int getWidth() {
		return Width;
		
	}
	public void area () {
		int rarea = getLength()*getWidth();
		System.out.println("Area of Rectangle=" + rarea);
	}
	
}
