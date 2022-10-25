package day24_예외_수업2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class CoreMain2 {
	
	
	public static void func2() throws IOException
	{
		Path file = Paths.get("C:\\Users\\101-12\\Documents\\test.txt");
		
		BufferedWriter writer = null;
		
//		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('D');
			
			if(writer != null)
				writer.close();
		}
//		catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//	}
	
	public static void func1() throws IOException
	{
//		try {
			func2();
//		}
//		catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//		
	}
	

	public static void main(String[] args)
	{
		try {
			func1();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
//		-자잘한 예외처리----------------------------
//		
//		
//	--- java.lang.ArrayIndexOutOfBoundsException
		int[] ar = {11, 22, 33, 44 ,55};
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(ar[i]);
		}
		
//	--- java.lang.NullPointerException

		String str = null;
		str.length();
		
		
//	
//	---  예외 처리를 해주지 않으면 컴파일조차 되지 않는 예도가 있다. - 자바 언어의 특징
		/*
//		 java.lang.Error
//		 Unhandled exception type IOException
//		 Paths 전역객체
//		 */
//		Path file = Paths.get("C:\\Users\\101-12\\Documents\\test.txt");
//		
//		BufferedWriter writer = null;
//		
////		try {
//			writer = Files.newBufferedWriter(file);
//			writer.write('A');
//			writer.write('D');
//			
//			if(writer != null)
//				writer.close();
////		}
////		catch (IOException e)
////		{
////			e.printStackTrace();
////		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
