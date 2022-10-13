package personExample;

public class Person {
	String name;
	int age;
	String jobTitle;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getjobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		jobTitle = jobTitle;
	}
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle=jobTitle;
	}
	


	@Override 
	public String toString() {
		return "Person \n [name=" + name + "\n age" 
			+ age + "\n jobTitle=";
		
		//closing square bracket had "remove this token error"

}
}
