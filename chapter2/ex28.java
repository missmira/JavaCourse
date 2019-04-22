package chapter2;

import java.util.Scanner;

public class ex28 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter radius value: ");
		int radius = input.nextInt();
		
		input.close();

		System.out.printf("\nIt's diameter is %d"
				+ "\nIt's circumference is %f"
				+ "\nIt's area is %f", 2 * radius, 2 * Math.PI * radius,Math.PI * (radius*radius));
	}
}
