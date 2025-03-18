package Basic;

public class Mobile {
	public void Byname() {
		System.out.println("Name saved in mobile");
	}

	public void NameMobile(String FirstName,String LastName) {
		System.out.println("Name is - " + FirstName +"," + LastName);

	}

	public void NameMobile(int mobile) {
		System.out.println("Mobile number is - " + mobile);

	}

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.Byname();
		mobile.NameMobile("Kavin","Ruth");
		mobile.NameMobile(24343242);
	}
}
