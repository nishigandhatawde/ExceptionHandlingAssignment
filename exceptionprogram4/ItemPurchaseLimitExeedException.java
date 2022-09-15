package exceptionprogram4;

public class ItemPurchaseLimitExeedException {

	public static void priceamount(int price) {
		if(price<50000) {
			throw new ArithmeticException("item purchase limit exceed");
		}else {
			System.out.println("total amount of item:");
		}
	}
	
}
