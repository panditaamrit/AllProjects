package javatraining;

import java.util.Scanner;

public class hello_world {
	
	public static void main(String args[])
	   {
	String str;
    System.out.println("Enter String");
    Scanner in = new Scanner(System.in);

  str= in.nextLine();
  String arr[]=str.split(" ");
  
  int count=arr.length;
  System.out.println(count);


}
}
