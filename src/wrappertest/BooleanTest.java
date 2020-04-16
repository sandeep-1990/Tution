package wrappertest;

public class BooleanTest {

	public static void main(String[] args) {
		
		boolean b = false;
		
		Boolean boolean1 = new Boolean(b);
		
		System.out.println(boolean1);
		
		Boolean b4 = Boolean.valueOf(b);
		
		Boolean b5 = b;
		
		/**
		 * reverse
		 */
		
		
		boolean b2 = boolean1;
		
		boolean b3 = boolean1.booleanValue();
		
		
		/**
		 * With String type
		 */
		
		Boolean boolean2 = new Boolean("dvbjbvsk");
		
		System.out.println(boolean2);
		
		
		
	}
	
	
}
