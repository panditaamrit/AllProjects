package javatraining;

public class Account {
	
	
	private int id;
	private float balance;
	
	public Account(int id, float balance)
	{
		this.id=id;
		this.balance=balance;
		
		
	}
	
	
	public int getid()
	{
		
		return id;
	}
	public float getbalance()
	{
		
		return balance;
	}
	public void withdraw(int amt) throws InsufficientBalanceException
	{
		
		
		if(amt>balance)
		{
			
			throw new InsufficientBalanceException("Insufficient Balance");
			
		}
		else
		{
			
			balance = balance - amt;
			System.out.println("Remaining balance "+balance);
		}
	}
	

}
