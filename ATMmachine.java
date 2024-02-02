package Internship;
import java.util.*;
public class ATMmachine{
	
	private static double balance=2000.0;
	
	private static void checkbalance() {
		System.out.println("Your balance is: "+balance);
	}
	
	private static void cashwithdraw(Scanner in)
	{
		double amount;
		System.out.println("Enter the amount you want to withdraw");
		amount=in.nextDouble();
		
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("Your withdrawral is successful!! The available balance is:"+balance);
		}
		else if(amount<0) {
			System.out.println("The amount you entered is invalid. Please enter a positive amount");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	private static void deposit(Scanner in)
	{
		double amount;
		System.out.println("Enter the amount you want to deposit");
		amount=in.nextDouble();
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Entered amount is deposited successfully. The new balance is:"+balance);
		}
		else
		{
			System.out.println("Invalid input!! Please enter a valid positive amount");
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int choice;
		System.out.println("Welcome to the AtM service");
		
		while(true)
		{
			System.out.println("\nSelect the following choice");
			System.out.println("1.Cash Withdrawal");
			System.out.println("2.Deposit money");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("\nEnter your choice");
			choice=in.nextInt();
			
			switch(choice) {
			case 1:
				cashwithdraw(in);
				break;
			case 2:
				deposit(in);
				break;
			case 3:
				checkbalance();
				break;
			}		
				
				
		}
			
	}
		
}


