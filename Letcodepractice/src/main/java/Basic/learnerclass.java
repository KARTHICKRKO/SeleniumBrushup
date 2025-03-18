package Basic;

public class learnerclass {

	int x;
	String name;
	float weight;
	byte age;
	short thousand;
	long cellphone;

	learnerclass() {
		this.weight = 56.76f;
		this.age = 45;
	}

	public void inputdata() {
		System.out.println("x " + "---->" + x);
		System.out.println("name " + "---->" + name);
		System.out.println("weight " + "---->" + weight);
		System.out.println("age " + "---->" + age);
		System.out.println("thousand " + "---->" + thousand);

	}

	public void inputdata1(long cellphone,String name) {
		this.cellphone = cellphone;
		this.name=name;
		System.out.println("cellphone " + "---->" + cellphone);
		System.out.println("name "+ "--->" + name);
	}

	public static void main(String[] args) {

		learnerclass learner = new learnerclass();
		learner.inputdata();

		learner.inputdata1(982343243l,"America");
		learner.inputdata1(900000000l,"Chicago");

	}

}
