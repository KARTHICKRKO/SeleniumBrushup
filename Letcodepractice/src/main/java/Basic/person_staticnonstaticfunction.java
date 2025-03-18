package Basic;

public class person_staticnonstaticfunction {

	String name;

	public void eat(String name) {
		this.name = name;
		System.out.println("Ramai");
		System.out.println("name is: " + name);
	}

	public static void sleep() {

		System.out.println("Gumai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sleep();
		person_staticnonstaticfunction lst = new person_staticnonstaticfunction();
		lst.eat("Kovail");

		String a = "11";
		String b = "12";
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		System.out.println(c + d);

	}

}
