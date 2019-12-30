package com.pankaj.designprinciples.solid.liskovprinciple;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println("Rectangle Area = " + rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println("Square Area = " + square.computeArea());
		
		useRectangle(rectangle);
		//useRectangle(square);
		

	}
	
	private static void useRectangle(Rectangle rectangle) {
		
		rectangle.setHeight(30);
		rectangle.setWidth(20);
		
		assert rectangle.getHeight() == 30 :"Height not equal to 30";
		assert rectangle.getWidth() == 20 : "Width not equal to 20";
		
	}

}
