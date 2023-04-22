package com.example.tut8.abstract_factory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	//TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
		ShapeFactory shapeFactory = new ShapeFactory();
		// get an object of Shape Rectangle
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		rectangle.draw();
		// get an object of Shape Square
		Shape square = shapeFactory.getShape("SQUARE");
		// call draw method of Shape Square
		square.draw();

	}
}