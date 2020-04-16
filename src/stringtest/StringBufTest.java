package stringtest;

public class StringBufTest {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Sandeep");
		StringBuffer buffer2 = new StringBuffer();
		buffer2.append("Sandeep");
		
//		buffer.append("Singh");
		System.out.println(buffer.equals(buffer2));
		
		String name = "Sahil";
		
		StringBuffer buffer3 = new StringBuffer(name);
		System.out.println(buffer3);
		
		
		
		
		
		
		
	}
	

}
