package day24_예외_수업7;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

public class CoreMain7 {
	
	public static void main(String[] args)
	{
		
		Path file = Paths.get("C:\\Users\\101-12\\Documents\\test.txt");
		BufferedWriter bwriter = null;
		
		try {
			bwriter = Files.newBufferedWriter(file); //1
			bwriter.write('A'); //2
			bwriter.write('B'); //3
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{	
			try {
			if(bwriter != null)
				bwriter.close();
			}
			catch(IOException e)
			{
				
			}
		}
		
		/*
		 finally를 써야만 하는 전형적인 경우
		 */
		
		
		
		
		
		
	
		
	}
	
}
