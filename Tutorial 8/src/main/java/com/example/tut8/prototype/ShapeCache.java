package com.example.tut8.prototype;

import java.util.Hashtable;

/* Create the ShapeCache class to get concrete classes from database 
   and store them in a Hashtable. */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	/*
	 * TO-DO: Implement the loadCache() method 
	 * For each shape run database query and
	 * create shape shapeMap.put(shapeKey, shape);
	 */
	public static void loadCache() {
		Circle circle = new Circle(6.9);
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle(4.5, 6.7);
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square(2.6);
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
}