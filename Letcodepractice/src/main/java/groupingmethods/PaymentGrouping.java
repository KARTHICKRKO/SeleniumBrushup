package groupingmethods;

import org.testng.annotations.Test;

public class PaymentGrouping {
	
	@Test(priority = 1,groups = {"sanity","regression","functional"})
	void paymentincash() {
		System.out.println("Payment in Cash");
	}
	@Test(priority = 2,groups = {"sanity","regression","functional"})
	void paymentindebit() {
		System.out.println("Payment in Debit");
	}

}
