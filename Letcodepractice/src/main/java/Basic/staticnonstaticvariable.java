package Basic;

public class staticnonstaticvariable {

	int x=100;
	static int y=100;
	
	void increment() {
		
		x++;
		y++;
		System.out.println("static values is: " + y + " nonstatic value is: " + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticnonstaticvariable stv= new staticnonstaticvariable();
		stv.increment();
		stv.increment();

		staticnonstaticvariable stv1= new staticnonstaticvariable();
		stv1.increment();
		stv1.increment();
	}

}
