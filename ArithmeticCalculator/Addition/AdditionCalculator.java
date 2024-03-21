package ArithmeticCalculator.Addition;

import java.util.Scanner;

public class AdditionCalculator {

	public static double num1, num2;
	public static Scanner input = new Scanner (System.in);
	public static String pause;

	public static void main (String[] args) {
		
		System.out.print("Enter The First Number : ");
		num1 = input.nextDouble();

		System.out.print("Enter The Second Number : ");
		num2 = input.nextDouble();

		Addition.addition(num1, num2);
		pause = input.next();
	} 
}

class Addition {

	public static void addition (double x, double y) {

		System.out.println(x + " + " + y + " = " + (x + y));
	}
}
