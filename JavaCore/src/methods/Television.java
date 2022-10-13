package methods;

public class Television {
	String brand;
	int price;
	int screenSize;
	
	public void turnOn()
	{
		System.out.println("shows display");
	}
	public int switchToAChannel()
	{
		return 1;
	}
	public double getDiscount()
	{
		return (price*10/100);
	}

	public double getDiscountOnTheFly(int dis)
	{
		return (price*dis/100);

	}
	public double discountOnBlackFriday(int dis)
	{
		return (price*dis/100);
 
	}
	public double discountWithCityBank(int dis, int cityDiscount)
	{
		System.out.println("");
		return (price*dis/100);

}
}
