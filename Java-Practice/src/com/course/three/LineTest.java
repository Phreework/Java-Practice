package com.course.three;

public class LineTest {
	public static void main(String[] args) {
		Point p1 = new Point(10,10);
		Point p2 = new Point(20,30);
		Point p3 = new Point(5,30);
		Point p4 = new Point(10,30);
		Line l1 = new Line(p1,p2);
		Line l2 = new Line(p3,p2);
		Line l3 = new Line(p4,p2);
		Line l4 = new Line(p3,p4);
		
		Line[] lineArray = {l1,l2,l3,l4};
		
		for(Line l : lineArray) {
			System.out.println(l.toString());
			System.out.println(l.getLength());
			
		}
	}
}
