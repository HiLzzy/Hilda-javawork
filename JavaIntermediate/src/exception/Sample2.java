package exception;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Sample2 {

		public static void main(String[] args) {
			try {
				int x = 10;
				int y = 2;
				int z = x / y; // logical issue
				int[] nums=new int[5];
				nums[4]=200;
				Connection connection=DriverManager.getConnection("","","");}
				
				catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
					System.out.println(e.getMessage());
					System.out.println("We can not div a num by zero");
					
				} finally {
					
					System.out.println("I will always be executed");
				}
			System.out.println("something after try-catch");
					

			// connection con=DriverManager.getConnection("","","");
		}

}
	
