package innerclasses;

public class MethodInnerClass {

	
	public void test(){
		
		class Cal{
			public int sum(int a, int b){
				return a+b;
			}
		}
		int result = new Cal().sum(5, 5);
	
	}
	
	
}
