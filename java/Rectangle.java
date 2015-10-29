import java.util.*;
import java.lang.*;
import java.io.*;

public class Rectangle extends GeometricObjects implements Colourable {
	double x1,x2,x3,x4,y1,y2,y3,y4;
	
	Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}
	
	double area;
	double perimeter;
	
//	public void tt() {
//	System.out.println(x1);
//	System.out.println(y1);
//	System.out.println(x2);
//	System.out.println(y2);
//	System.out.println(x3);
//	}
	
	public double distance(double a1, double b1, double a2, double b2) {
		
		return ( Math.sqrt( ((a2-a1) * (a2-a1)) + ((b2-b1) * (b2-b1)) ) );
		}
	
	


	public double getArea() {
		double length1 = distance(x1,y1,x2,y2);
		double width1 = distance(x2,y2,x3,y3);
		double length2 = distance(x3,y3, x4,y4);
		double width2 = distance(x4, y4, x1, y1);
		
			if(width1 != width2 ){
				System.out.println("exception"); return 0;}
			if(length1 != length2 ){
				System.out.println("exception"); return 0;}
				
		System.out.println("The distance is "+ length1);
		System.out.println("The width is "+ width1);
		System.out.println("The area is "+ length1 * width1);
		area = length1 * width1;
		return area;
	}
	
	public double getPerimeter() {
	System.out.println();
	return 0;
	}
	
	public double costToColour(double c) {
		return c*getArea();
	}
	Colourable
}



