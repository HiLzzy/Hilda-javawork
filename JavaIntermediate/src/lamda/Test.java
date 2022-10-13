package lamda;

public class Test {

	public static void main(String[] args) {
		Person p=new Person();
		p.greet();
		//Greeting gr=new Greeting();		
		Greeting gr=new Greeting() {
			public void greet()
		
		{
			System.out.println("Hello World");
		}

		};
			gr.greet();
			//lamda expression
			// leftside -> rightside
			//arguments -> body
			// -> {printing/calculation/whatever action you want}
			//Lamda without any args and no return type
			Greeting gr1=()->{System.out.println("Hello World");};
	        gr1.greet();
	        
	        //Lamda with args and no return type
			
			GreetingWithName grName=(x)->{System.out.println("Hello World");};
			grName.greet("Kevin");
			
			//Lamda with args and with return type
			GreetingWithReturn grReturn=(x)->{return "Hello "+x ;};
			System.out.println(grReturn.greet("Hasan"));
	}
}


