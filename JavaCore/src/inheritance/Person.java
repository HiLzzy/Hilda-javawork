package inheritance;

public abstract class Person {
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Person constructor");
	}
	public abstract void doSomething();//no body
	
	public void talk()
	{
		System.out.println("People work to make a living");
	}

}
