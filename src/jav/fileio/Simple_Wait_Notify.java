package jav.fileio;

class Customer{
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		
		System.out.println("going to withdraw");
		
		if(this.amount < amount) {
			System.out.println("Insufficent funds");
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
	}
	
	synchronized void deposit(int amount) {
		
		System.out.println("going to deposit");
		this.amount += amount;
		
		System.out.println("deposit completed..." + this.amount);
		notify();
	}
}
public class Simple_Wait_Notify {
	
	public static void main(String args[]) {
	    
		final Customer c=new Customer();
		
	}
	

}
