package Basic;

public class instanceclass {

	int c = 10;

	int num() {
		return 0;
	}

	public void add2numbers(int a, int b) {
		// int c=15;
		System.out.println(a + b + this.c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instanceclass inst = new instanceclass();
		inst.add2numbers(12, 45);
		
	}

}
