package infosys.demo.conversion;

public class Demo4 {
	public static void main(String[] args) {
		int discountPercentage = 10;
		double totalPrice = 24568;
		double priceAfterDiscount = totalPrice * (1 - ((double)discountPercentage / 100));
		System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
	}

}
