package com.example.tut8.prototype;

//Create the Rectangle concrete class which extends the Shape abstract class
public class Rectangle extends Shape {
	// TO-DO: Declare the constructor
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		// Set type to be similar with class name
		this.height = height;
		this.width = width;
		type = "rectangle";
	}

	// TO-DO: Declare the draw() method
	@Override
	public void draw() {
		/*
		 * Only print out the draw() method to test. No need to implement the real
		 * drawing
		 */
		System.out.println("Draw a rectangle with the width of " + width + " and the height of " + height);
	}
}