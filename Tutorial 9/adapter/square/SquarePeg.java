package tuts.tut9.todo.adapter.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePeg {
	//TO-DO: Declare an attribute: name = width, type = double
   private double width;
	//TO-DO: Declare the constructor with a parameter

    public SquarePeg(double width) {
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //TO-DO: Implement getWidth() method
    public double getWidth() {
		return width;
    }

    //TO-DO: Implement getSquare() method
    public double getSquare() {
        double result = 0;
        //TO-DO: result = width^2
        result = width * width;
        return result;
    }
}
