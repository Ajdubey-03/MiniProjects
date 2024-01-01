package practice.demo;

import java.util.Scanner;

public class BounceyNo {

	public static void main(String[] args) {

		System.out.println("Enter yout input..");
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();

		if (isIncreasing(inputNumber) || isDecreasing(inputNumber) || inputNumber < 101) {

			System.out.println("Not a bouncy number");
		} else {
			System.out.println(inputNumber + " is a bouncy number");
		}

	}

	public static boolean isIncreasing(int n) {

		boolean flag = true;
		char digit;

		String str = Integer.toString(n); // 1234561

		for (int i = 0; i < str.length() - 1; i++) {
			digit = str.charAt(i);
			if (digit >= str.charAt(i + 1)) 
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	
	
	public static boolean isDecreasing(int n) {

		boolean flag = true;

		char digit;

		String str = Integer.toString(n); // 1234561

		for (int i = 0; i <str.length() - 1; i++) {
			digit = str.charAt(i);
			if (digit < str.charAt(i + 1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
