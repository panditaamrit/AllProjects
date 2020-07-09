package javatraining;

public class StaticDemo {
	
	static int count;
	
	public StaticDemo()
	{
		
		count++;
		System.out.println("count is "+count);
			
		
	}
	
	public static void main(String args[])
	{
		
			StaticDemo obj1 = new StaticDemo();
		   StaticDemo obj2 = new StaticDemo();
		   StaticDemo obj3 = new StaticDemo();
		   StaticDemo obj4 = new StaticDemo();
		
		
		
	}
	

}
