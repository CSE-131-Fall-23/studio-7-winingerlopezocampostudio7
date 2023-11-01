package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	//instance variables 
	private double length; 
	private double width; 
	private double xPosition;
	private double yPosition;
	
	//constructor 
	public Rectangle(double length, double width, double xPosition, double yPosition) {
		this.length = length;
		this.width = width;
		this.xPosition=xPosition;
		this.yPosition=yPosition;
	}
	
	//getters 
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
		
	//method to compute area 
	public double area(double length, double width) {
		return length*width;
	}
	
	//method to compute perimeter 
	public double perimeter(double length, double width) {
		return (2*length)+ (2*width);
	}
	
	//method to determine if a rectangle is a square 
	public boolean isSquare(double length, double width) {
		if (length==width) {
			return true;
		}
		else {
			return false;
		}
		}
	
	//method to have the rectangle draw itself
	public void drawItself(double xPosition, double yPosition, double width, double length) {
		 StdDraw.rectangle(xPosition,yPosition, width/2, length/2);
		 StdDraw.show();
	}
	
	public static void main(String[]args) {
		Rectangle r1=new Rectangle(.25,.75,.5,.5);
		double area = r1.area(.25,.75);
		double perimeter = r1.perimeter(.25, .75);
		System.out.println(area);
		System.out.println(perimeter);
		r1.drawItself(.5,.5,.25,.75);
		
		
	}
	
	
}



	
