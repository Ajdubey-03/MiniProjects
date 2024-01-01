package practice.demo;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		newEmp ne = new newEmp();
		ne.insertData(44535, "BF-003", "QA Automation Engineer");
		ne.displayData();

		int result = new addTwo().takeInput(); // Anonymous object creations
		System.out.println(result);

	}

}

class newEmp {
	int Sal;
	String empCode;
	String designation;

	void insertData(int a, String b, String c) {
		Sal = a;
		empCode = b;
		designation = c;

	}

	void displayData() {
		System.out.println(designation + "::" + empCode + " ::" + Sal);
	}
}

class addTwo {
	int num1;
	int num2;

	int takeInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input here");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		return (num1 + num2);

	}

}
