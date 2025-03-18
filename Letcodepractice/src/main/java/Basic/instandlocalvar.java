package Basic;

public class instandlocalvar {

	// Instance variable
	String name;

	// Method to set name using 'this' to refer to the instance variable
	void setName(String name) {
		this.name = name; // 'this.name' refers to the instance variable
	}

	// Method to display the name
	void display() {
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		// Create an object of ExampleClass
		instandlocalvar inst = new instandlocalvar();

		// Call the setName method
		inst.setName("John");

		// Display the name
		inst.display();

		// Try to use 'this' in the static main method (this will cause an error)
		// Uncomment the following line to see the error:
		// this.name = "Error"; // This is not allowed in a static context
	}
}
