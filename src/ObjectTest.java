import oopstest.Student;

public class ObjectTest {

	
	String name;
	int age;
	
	public ObjectTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
	
		Student student = new Student();
		student.setId(1);
		student.setName("Sahil");
		student.setAddress("USA");
		student.setEmail("sahil@gmail.com");
		
		System.out.println(student);
		
	}
	
}
