package Inheritance2;

public class ConstructorTriangle {
	public ConstructorTriangle() {
		
	}
	int height;
	int base;
	public ConstructorTriangle (int height,int base) {
		this.height =height;
		this .base = base;
	}
	public void setHeigth(int height) {
		this.height=height;
	}
	public void setbase(int base) {
		this.base=base;
	}
	public int getheight() {
		return height;
	}
public int getBase() {
	return base;
}
public void area () {
	int Tarea=(getheight()*getBase())/2;
	System.out.println("Area of triangle=" + Tarea);
}
}
