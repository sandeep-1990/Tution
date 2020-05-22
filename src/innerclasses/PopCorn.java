package innerclasses;

public class PopCorn {
	
	interface Taste{
		
		void demand(String demand);
		
		class Test{
			
			void abc(){
				System.out.println("Testing ......");
			}
			
			
		}
		
		
	}

	
	
	
	public static void main(String[] args) {
		
		new Taste() {
			
			@Override
			public void demand(String demand) {
				System.out.println(demand);
			}
		}.demand("salted");
		

		new Taste() {
			
			@Override
			public void demand(String demand) {
				System.out.println(demand);
			}
			
			
		}.demand("Sweet Corn");
		
		Taste.Test test = new Taste.Test();
		test.abc();
		
		
	}
	

}
