package practice.demo;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {

		System.out.println("Enter your 'name' and 'customerId' ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String customerId = sc.nextLine();
		BankAccount obj1 = new BankAccount(name, customerId);
		obj1.menu();

	}

}

class BankAccount {
	double bal;
	String name;
	String customerId;
	double prvsTxn;

	BankAccount(String name, String customerId) {
		this.name = name;
		this.customerId = customerId;

	}

	void deposit(double amt) {
		if (amt != 0) {
			bal = bal + amt;
			prvsTxn = amt;

			System.out.println(amt + " Deposited Successfull and available balance is::" + bal);

		}

	}

	void withdraw(double amt) {
		if (amt > bal) {
			System.out.println("Insufficiet fund!!");
			
		} else if(amt<0) {
		System.out.println("Invalid Input");
		}
		else if (amt <= bal) {
			bal = bal - amt;
			prvsTxn = amt;
			System.out.println("Debited amount is::"+ amt + "available balance is now::" + bal);
		}
	}

	void getPrvTxn() {
		if (prvsTxn > 0) {
			System.out.println("Depoisted::" + prvsTxn);
		} else if(prvsTxn < 0) {
			System.out.println("Withdrawl::" + prvsTxn);
		} else {
			System.out.println("No txn occured.");
		}
	}

	void menu() {
		char option;
		System.out.println("Welcome you " + name);
		System.out.println("Your CustId :: " + customerId);
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
				System.out.println("Balance is:: " + bal);
				System.out.println("\n");
				break;

			case 'b':
				System.out.println("**********");
				System.out.println("Enter your amount");
				double amount = sc.nextDouble();
				deposit(amount);
				break;
			case 'c':
				System.out.println("**********");
				System.out.println("Enter your amount");
				double wAmt = sc.nextDouble();
				withdraw(wAmt);
				break;
			case 'd':
				System.out.println("**********");
				System.out.println(prvsTxn);
				getPrvTxn();
				break;

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
