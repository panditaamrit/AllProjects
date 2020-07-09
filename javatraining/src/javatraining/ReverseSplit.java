package javatraining;

import java.util.Scanner;

public class ReverseSplit {
	
	public static void main(String args[])
	{
		String Str;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Your String");
		Str=scan.nextLine();
		String[] Str2=Str.split(" ");
		for(int i=Str2.length-1;i>=0;i--)
		{
			
			System.out.println(Str2[i]+"");
			
			
			
		}
		
		
		
		
		
		
	}

}
