package innerclasses;

public class College {
	
	
	public static void sayHello(){
		System.out.println("Hello");
		/*Department department = college.new Department();
		department.sayGoodBye();*/
/*//		Department department = new Department();
		department.sayGoodBye();*/
	
		Department department= new Department();
		department.sayGoodBye();
		Department.sayGoodBye();
	}
	
	public static void main(String[] args) {
		sayHello();
		/*Department department = college.new Department();
		department.sayGoodBye();
*/	}
	
	
	static class  Department{
		
		public static void sayGoodBye(){
			System.out.println("Good Bye");
		}
		
	}
	

}
