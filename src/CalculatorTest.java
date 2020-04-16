
public class CalculatorTest {

	static int result;

	public static int add(int a, int b) {

		
		result = a + b;
		return result;
	}

	public int mul(int a, int b) {
		add(7,7);
		result = a * b;

		return result;
	}

	public static void main(String[] args) {

		System.out.println(add(5,5));
		
		CalculatorTest test = new CalculatorTest();
		System.out.println(test.mul(5,6));
		
	}

}
