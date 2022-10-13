package userdefinedException;

public class ElectionDay {
	public static void main(String[] args) {
		Election objElection=new Election();
		try {
			objElection.checkEligibility(12);
		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		CheckCC obj1=new CheckCC();
		try {
			obj1.check("1234567891234567");
		} catch (CreditCardException e) {
			System.out.println(e.getMessage());
		}
	}

}
