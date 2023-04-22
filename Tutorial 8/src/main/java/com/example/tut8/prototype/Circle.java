package com.example.tut8.prototype;

//Create the Circle concrete class which extends the Shape abstract class
public class Circle extends Shape {
	// TO-DO: Declare the constructor
	private double radius;
	public Circle(double radius) {
		// Set type to be similar with class name
		this.radius = radius;
		type = "circle";
	}

	// TO-DO: Declare the draw() method
	@Override
	public void draw() {
		/*
		 * Only print out the draw() method to test. No need to implement the real
		 * drawing
		 */
		System.out.println("Draw a circle with the radius of "+this.radius);

	}
}
