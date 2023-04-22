package com.example.tut8.prototype;

/* Create the ShapeDraw class which uses ShapeCache class 
to get clones of shapes stored in a Hashtable. */
public class ShapeDraw {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// run loadCache() method
		ShapeCache.loadCache();
		/*
		 * create 3 cloned shapes with 3 different types Hint: use getShape() &
		 * getType() methods
		 */
		Shape cloneShape = (Shape) ShapeCache.getShape("1");
		Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
		Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape: "+ cloneShape.getType());
		System.out.println("Shape: "+ cloneShape2.getType());
		System.out.println("Shape: "+ cloneShape3.getType());
	}
}