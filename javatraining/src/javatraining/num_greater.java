package javatraining;

public class num_greater {
	
	
	public static void main(String args[])
	{
		int[] A= {7,56,20,6,9,32};
		int i,j;
		
		for ( i=0;i<A.length-1;i++)
			
		{int temp=-1;
			for(j=i+1;j<A.length;j++)
			{
				
				if(A[i]<A[j])
				{
					temp=A[j];
					break;

					
				}
				else 
					j++;
				
			}
			System.out.println(temp);
			
			
			
			
			
			
	}
	
	
	
	}
	

}
