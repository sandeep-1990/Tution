package innerclasses;

public class VaribleScopeTest {

	static int a = 10;
	
	public static void main(String[] args) {
		new VaribleScopeTest().new Test().abc();
//		new Test().abc();
	}
	 class Test{
		int b = 20;
		 int d = 55;
	
		public  void abc(){
			int c = 30;
			final int zz= 5;
			System.out.println(a+"  "+b+"  "+c+ "  "+d +"  "+zz);
		}
	}
}
