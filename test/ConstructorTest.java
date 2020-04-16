
public class ConstructorTest {

	int no;
	String name;

	public ConstructorTest() {
		System.out.println("Hello");
	}

	public ConstructorTest(String name) {
		
		this.name = name;
	}

	public ConstructorTest(int ticketNo) {
		this("Sandeep Singh");
		System.out.println("Your ticket no is : " + ticketNo);
	}

	public void showName() {

		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("msjkwen");
		ConstructorTest constructorTest = new ConstructorTest("Sandeep Singh");
		System.out.println(constructorTest.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
