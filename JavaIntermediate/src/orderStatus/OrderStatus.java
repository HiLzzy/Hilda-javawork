package orderStatus;

public enum OrderStatus {
	PROCESSECING("View order update"),
	COMPLETE("Order successfully completed"),
	UNSUCCESFUL("Order failed, try again"),
	INTRANSIT("Track your order"),
	ORDERDELIVERED("Order succesfully delivered"),
	FEEDBACKSENT("Feedback collected");
	
	String des;
	
	private OrderStatus(String o) {
		des=o;
	}
	public String getStatus()
	{
		return des;
	}

}
