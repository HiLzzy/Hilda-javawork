package swicthexample;

public class continents {
	

	public static void main(String[] args) {
		String continent = "asia";
		switch (continent) {
		case "club": 
			System.out.println("You're in Africa");
			break; 
		case "Asia":
			System.out.println("You're in Asia");
			break;
		case "Australia":
			System.out.println("Look at that kangaroo");
			break;
		case "Antarctica":
			System.out.println("You're frozen!!!");
			break;
		case "Europe":
			System.out.println("It's cold in Europe");
			break;
		case "North America":
			System.out.println("You're in North America");
			break;
		case "South America":
			System.out.println("It's hot in South America");
			break;
		default : 
			System.out.println("You're lost"); 
			}
	}
}
