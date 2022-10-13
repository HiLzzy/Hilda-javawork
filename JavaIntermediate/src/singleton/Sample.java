package singleton;

public class Sample {

	public static Sample x;
	private Sample (){
		
	} 
	public static Sample getObjectOfSample() {
		if(x ==null) {
			x =new Sample();
		}
		return x;
	}
	public void hello()
	{
		System.out.println("Hello");
	}
	public void hi()
	{
		System.out.println("hi");
		

	}

}
