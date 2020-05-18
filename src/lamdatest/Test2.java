package lamdatest;

public class Test2 {

	public static void main(String[] args) {
		
		Funtional1 funtional1 = (a,b)->a+b;
		System.out.println(funtional1.sum(5, 5));
		
		Funtional2 funtional2 = (str)->{
			
			String name=str.toUpperCase();
			
			
			return name;
		};
		String name = funtional2.test("sandeep");
		System.out.println(name);
	}
}
