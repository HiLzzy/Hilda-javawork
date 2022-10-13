package orderStatus;


public class Test {
	public static void main(String[] args) {
		Options myStatus=Options.PROCESSING;
		System.out.println(myStatus);
		
		OrderStatus mObj=OrderStatus.PROCESSECING;
		System.out.println(mObj.getStatus());
	}

}
