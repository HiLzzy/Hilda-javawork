package exception;

public class ShopTest {

	public static void main(String[] args) {

			Shopping sh=new Shopping();
			sh.addToCart();
			try {
				sh.makePayment();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	

	}


