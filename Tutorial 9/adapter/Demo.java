package tuts.tut9.todo.adapter;

import tuts.tut9.todo.adapter.adapter.SquarePegAdapter;
import tuts.tut9.todo.adapter.round.RoundHole;
import tuts.tut9.todo.adapter.round.RoundPeg;
import tuts.tut9.todo.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole h1 = new RoundHole(2);
		RoundPeg p1 = new RoundPeg(2);
	 
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
		if(h1.fits(p1)) System.out.println("The round peg fits the hole");
	 
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
		SquarePeg squarePeg = new SquarePeg(1);
		SquarePeg squarePeg2 = new SquarePeg(4);

		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.

		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		 SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg);
		 SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(squarePeg2);

		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
		if(h1.fits(squarePegAdapter1)) System.out.println("the square peg fits");
	 
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
		if(!h1.fits(squarePegAdapter2)) System.out.println("the square peg doesnt fit");
	}
}