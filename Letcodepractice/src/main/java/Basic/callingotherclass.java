package Basic;

public class callingotherclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodhandson mh = new methodhandson();

		String ch = mh.video();

		System.out.println(ch);
		mh.createvideo();
	}

}
