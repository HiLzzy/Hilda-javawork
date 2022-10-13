package adapter;

public class Demo {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg =new RoundPeg(5);
		if (hole.fits(rped)) {
			System.out.println("Round peg r5 fits round hole r5");
		}
		
		SquarePeg smallSqPg = new SquarePeg(2);
		SquarePeg largeSqPg = new SquarePeg(20);
				
		
	   SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPg);
	   if (hole.fits(smallSqPegAdapter)) {
		   System.out.println("Square peg w2 fits round hole r5");
	   }
	   
	   SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(smallSqPeg)
;
	   if(hole.fits(largeSqPegAdapter)) {
		   System.out.println("Square peg w20 does not fit into round hole r5");
	   }


	}
}
	
