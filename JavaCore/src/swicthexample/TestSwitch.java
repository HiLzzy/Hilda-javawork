package swicthexample;

public class TestSwitch {

	public static void main(String[] args) {
		String card = "spade";
		switch (card) {
		case "club": 
			System.out.println("You got a club");
			break; 
		case "diamond":
			System.out.println("You got a diamond");
			break;
		case "spade":
			System.out.println("You got a spade");
			break;
		case "heart":
			System.out.println("You got a heart");
			break;
		default : 
			System.out.println("Not a valid card"); 
			
		}
	}
}
