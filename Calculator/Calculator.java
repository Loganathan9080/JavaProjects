package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a = sc.nextDouble();
		System.out.println("Enter Second number: ");
		double b = sc.nextDouble();

		System.out.println("Select u want +,-,*,/");
		char c = sc.next().charAt(0);
		double result = 0;
		switch (c) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			if (b != 0) {
				result = a / b;
			} else {
				System.out.println("Error: can not divide by zero");
				System.exit(1);
			}
			break;
		default:
			System.out.println("Something wrong...");
			System.exit(1);
		}

		System.out.println("The Result is : " + result);
		sc.close();

	}

}
