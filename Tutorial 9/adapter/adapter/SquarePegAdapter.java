package tuts.tut9.todo.adapter.adapter;

import tuts.tut9.todo.adapter.round.RoundPeg;
import tuts.tut9.todo.adapter.square.SquarePeg;
import tuts.tut9.todo.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
	//TO-DO: Declare an attribute: name = peg, type = SquarePeg
    private SquarePeg peg;
    //TO-DO: Declare the constructor with a parameter

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public SquarePeg getPeg() {
        return peg;
    }

    public void setPeg(SquarePeg peg) {
        this.peg = peg;
    }

    //TO-DO: Implement getRadius() method
    @Override
    public double getRadius() {
        double result = 0;
        // Calculate a minimum circle radius, which can fit this peg.
        //TO-DO: result = Square Root [(getWidth() of SquarePeg/2)^2) * 2)]
        result = Math.sqrt(Math.pow((peg.getWidth() / 2),2) * 2 );
        return result;
    }
}