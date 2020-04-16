package wrappertest;

public class PrToStr {

	public static void main(String[] args) {
		
		int a = 10;
		String s = ""+a;
		
		String ss = String.valueOf(a);
		System.out.println(s+ "  "+ss);
		
		String str = "8";
		
		int no = Integer.parseInt(str);
		System.out.println(no);
		
		byte b = Byte.parseByte(str);
		
		System.out.println(b);
		
		
		
	}
	
}
