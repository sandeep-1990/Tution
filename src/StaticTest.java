
public class StaticTest {

	static{
		
	}
	
	public static void main(String[] args) {
		
		CalculatorTest calculatorTest =new CalculatorTest();
		
		
		int add  = CalculatorTest.add(5, 5);
		int mul = calculatorTest.mul(6, 4);
		System.out.println("Result : "+ add );
		
		
		
	}
	
	
	
}
