package filehandling;

import java.io.File;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/randh_000/eclipse-workspace/Tution/src/filehandling/Test");
		if(file.isDirectory()){
			System.out.println("This is Folder");
			
			File[] fileList = file.listFiles();
			for(File f: fileList){
				System.out.println(f.getName());
			}
		}else if(file.isFile()) {
			System.out.println("this is file");
		}
			
			
			
			
			
			
		/*  File file2 = new File(file, "Test3.txt");
		  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2,true));
		  bufferedWriter.write("Test file 3");
		  bufferedWriter.close();*/
		}
	
}
