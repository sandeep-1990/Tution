package exceptiontest;

import java.io.File;
import java.io.IOException;

public class Test {

	public int sum() {
		int no = 0;
		try{
			 no = 5/0;
			 return no;
		}catch (Exception e) {
			try {
				throw new ZeroValueException();
			} catch (ZeroValueException e1) {
				e1.printStackTrace();
			}	
			return 0;
		}finally {
			System.out.println("finally");
		}
	}
	
	public int div(int a, int b)throws Exception{
		
		return a/b;
	}
	
	
	public static void main(String[] args) {
			
		Test test = new Test();
		System.out.println(test.sum());
		
		try {
			test.div(5, 2);
		} catch (IndexOutOfBoundsException|ArithmeticException|IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
