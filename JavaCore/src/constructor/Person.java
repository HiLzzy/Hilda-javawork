package constructor;


public class Person  {
	String name;
	int age;
	String address;
	int phone;
	
	public Person() {
		System.out.println("Person class instatiated");
	}
	public Person(String n, int a, String add, int p) {
		name=n;
		if(a<=0)
		{
			System.out.println("age can't be less than 0");
		}
		else {
			age=a;
		}
		address=add;
		phone=p;
	}
	public Person(String n, int a) {
		name=n;
		if(a<=0)
		{
			System.out.println("age can't be less than 0");
		}
		else {
			age=a;
		}
		
	}
}
