package conditions;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scn.next();
		System.out.println("Enter your city");
		//String city="London";
		String city=scn.next();//create
		if(city.equals("London"))
			System.out.println("Hello "+name+" you are a Brit");
		else if(city=="New York")
			System.out.println("Hello "+name+" you are a New Yorker");
		else
			System.out.println("I don't know");
		
		scn.close();
		
	}
}
