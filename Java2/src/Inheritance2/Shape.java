package Inheritance2;

public class Shape {
	private String color = null;
	private int borderwidth = 0;
	public void setColor (String color) {
		this.color = color;
	}
	public  String getColor() {
		return color;
	}
	public void setBorderwidth (int Borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderwidth() {
		return borderwidth;
		
	}
	public void area(){
		String s = getColor();
		int i = getBorderwidth();
		System.out.println("Shape Area Color=" +s);
		System.out.println("Shape Area Borderwidth=" +i);
	}}
	
		
		
	


