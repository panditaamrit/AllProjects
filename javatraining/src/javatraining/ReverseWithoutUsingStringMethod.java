package javatraining;
public class ReverseWithoutUsingStringMethod {
	
	public static void main(String args[])
	{
		String str= "Amrit";
		StringBuilder Str2= new StringBuilder();
		Str2.append(str);
		Str2=Str2.reverse();
		System.out.println(Str2);
		
	}

}
