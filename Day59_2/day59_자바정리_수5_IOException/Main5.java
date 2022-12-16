package day59_자바정리_수5_IOException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main5 {

	public static void fileFunc1() throws IOException
	{
		fileFunc2();
	}
	
	public static void fileFunc2() throws IOException
	{
		Path file = Paths.get("‪C:\\Users\\101-12\\Documents");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);
		writer.write('a');
		writer.write('b');
		
		if(writer != null)
			writer.close();
		
	}
	
	
	
	
	public static void main(String[] args) {

		try {
			fileFunc1();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
