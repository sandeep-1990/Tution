package wrappertest;

public class WrToStr {

	public static void main(String[] args) {
		
		Integer integer = new Integer(55);
		
		/**
		 * 1st way
		 */
		
		String str  = ""+integer;
		System.out.println(str);
		
		/**
		 * 2nd Way
		 */
		
		String str2 = String.valueOf(integer);
		System.out.println(str2);
		
		/**
		 * 3rd Way
		 */
		
		String str3 = integer.toString();
		
		System.out.println(str3);
		
		System.out.println(integer);
		
		/**
		 * Reverse
		 */
		
		String st = "1234567";
		
		Integer integer2 = new Integer(st);
		System.out.println(integer2);
		
		
		
		
		
		
		
		
		
		
	}
}
