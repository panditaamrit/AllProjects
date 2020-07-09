package javatraining;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exceptionhandling {
	
	public static void main(String args[]) throws IOException
	{
		int no1,no2,result;
		no1=10;
		no2=0;
		try {
			
			result=no1/no2;
			System.out.println("result is"+result);
			
			
		}catch(Exception e)
		{
			
			System.out.println("division by zero not allowed");
			
			
		}
		
		
		
		File file = new File("D:\\desktop_amrit");
		FileWriter filewriter= new FileWriter(file);
		
		
		
		
		
	}
	
	
	

}
