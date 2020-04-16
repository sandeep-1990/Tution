package wrappertest;

public class PrToWr {

	public static void main(String[] args) {
		
		int a = 10;
		
		/**
		 * 1st way
		 */
		
		Integer integer = Integer.valueOf(a);
		System.out.println(integer);
		
		/**
		 * 2nd Way
		 */
		
		Integer integer2 = new Integer(a);
		System.out.println(integer2);
		
		
		/**
		 * 3rd way
		 */
		
		Integer integer3 = a;
		
		System.out.println(integer3);
		
		/**
		 * Reverse
		 */
		
		Integer integer4 = new Integer(55);
		
		
		/**
		 * 1st Way
		 */
		
		int i = integer4;
		
		
		/**
		 * 2nd Way
		 */
		
		int j = integer4.intValue();
		
		System.out.println(i+"   "+j);
		
		
		
		
	}
}
