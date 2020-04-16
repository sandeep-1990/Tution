package stringtest;

public class ImutableTest {

	public static void main(String[] args) {
		
		String name = "Sand@eep* Sin#gh";
		String name2 = "Sandeep";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.charAt(0));
		
		System.out.println(name.subSequence(3,7));
		
		System.out.println(name.substring(3, 7));
		System.out.println(name.substring(3));
		
		int dIndex = name.indexOf('d');
		int pIndex = name.indexOf('p');
		System.out.println(name.substring(dIndex,pIndex+1));
		
		int no = 1324354678;
		String no2 = String.valueOf(no);
		System.out.println(no2);
		
		String[] ss = new String[name.length()];
		
		for(int i=0; i<name.length(); i++){
			ss[i] = String.valueOf(name.charAt(i));
		}
		
		String[] nn = name.split("[*,#,@]");
		for(String n : nn){
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
	
}
