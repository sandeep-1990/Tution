package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	
	public static void main(String[] args) {
		
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("C:/Users/randh_000/eclipse-workspace/Tution/src/filehandling/testfile2.txt")));
			bufferedWriter.write("Testing");
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:/Users/randh_000/eclipse-workspace/Tution/src/filehandling/testfile.txt")));
			while (bufferedReader.readLine() != null) {
				System.out.println(bufferedReader.readLine());
			}
			bufferedReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
