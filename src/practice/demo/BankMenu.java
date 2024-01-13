package practice.demo;

import java.util.Scanner;

public class BankMenu {

	
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	String customerId = sc.nextLine();
	BankAccount ba =new BankAccount(name, customerId);
	
	

	void menu() {
		char option;
		Scanner sc = new Scanner(System.in);
		System.out.println("a) Balence Enquiry");
		System.out.println("b)  Deposit cash");
		System.out.println("c) Withdraw Cash");
		System.out.println("d) Previous transactions");
		System.out.println("e) exist");

		do {
			System.out.println("Choose options..");
			System.out.println("****************************");
			option = sc.next().charAt(0);

			switch (option) {
			case 'a':
				System.out.println("**********");
				System.out.println("Balance is:: " + ba.accountBalance);
				System.out.println("\n");
				break;

			case 'b':
				System.out.println("**********");
				System.out.println("Enter your amount");
				double amount = sc.nextDouble();
				ba.amountDeposit(amount);
				break;
			case 'c':
				System.out.println("**********");
				System.out.println("Enter your amount");
				double wAmt = sc.nextDouble();
				ba.withdrawAmount(wAmt);
				break;
			case 'd':
				System.out.println("**********");
				System.out.println("Choose options:: {1} All statement \n {2} Deafault statement");
				
		    	try {
				int in =sc.nextInt();
				
				switch(in) {
				case 1:
					ba.getAllStatement();
					break;
				case 2:
					System.out.println("Enter Number of statement");
					int statementCount =sc.nextInt();
					ba.getNoStatement(statementCount);
					break;
				default:
					System.out.println("Invalid input");
				}
				break;
			
				}catch(NumberFormatException e) 
				{
		           System.err.println("Error: Invalid input. Please enter a valid integer.");
		            
				}
		finally {sc.close();}
		

			case 'e':
				System.out.println("**********");
				break;
			default:
				System.out.println("Invalid Options");

			}

		} while (option != 'e');
		System.out.println("Thank you!!");
		
		

	}
	

}
