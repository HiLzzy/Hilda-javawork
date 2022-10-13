package polymorphism;

public class Mug {
	
public void addLiquid(Liquid l)
{
	if(l instanceof Milk)
		System.out.println("swirling milk");
	else if(l instanceof Tea)
		System.out.println("swrling tea");
	else if(l instanceof Coffee)
		System.out.println("swriling coffee");
	else 
		System.out.println("swirling some liquid");
	
	
}
}