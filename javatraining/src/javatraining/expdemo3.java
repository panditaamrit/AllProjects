package javatraining;


public class expdemo3 {

	public static void main(String[] args) {
	Account account = new Account(101,20000);
	try {
		account.withdraw(200);
	} catch (InsufficientBalanceException e) {
   // System.out.println("Ex Message:- "+e.getMessage());
		e.printStackTrace();
  
	}

	}

}