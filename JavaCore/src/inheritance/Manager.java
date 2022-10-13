package inheritance;

public class Manager extends Employee{
	String dept;
	public Manager() {}
	public Manager(String name, int age, int empId,String dept)
	{
		super(name,age,empId);
		this.dept=dept;
		System.out.println("Manager constructor"); 
	}

}
