package innerclasses;

public class AnonymusTest extends AnonumusInterface.Test {

	interface Test{
		int abc();
	}

	public void showName(String name){
		
		System.out.println(name);
		
	}
	
	
	public void showName2(String name){
		
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		
		
	/*	AnonumusInterface interface1 = new AnonumusInterface() {
			
			@Override
			public int sum(int a, int b) {
			
				return a+b;
			}
		};
		int result = interface1.sum(55, 55);
		System.out.println(result);*/
		
	/* System.out.println(new AnonumusInterface() {
			
			@Override
			public int sum(int a, int b) {
			
				return a+b;
			}
		}.sum(44,55));*/
	
		
		
		AnonymusTest test= new AnonymusTest();
		AnonumusInterface anonumusInterface = new AnonumusInterface() {
			
			@Override
			public String sum(String name) {
				return name.toUpperCase();
			}
		};
		
		test.showName(anonumusInterface.sum("sandeep"));
	
		test.showName2(new AnonumusInterface() {
			
			@Override
			public String sum(String name) {
				// TODO Auto-generated method stub
				return name.toUpperCase();
			}
		}.sum("sandeep"));
		
		Test test2 = new Test() {
			
			@Override
			public int abc() {
			
				return 5;
			}
		};
		test2.abc();

	}
}
