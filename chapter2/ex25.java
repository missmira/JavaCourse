package chapter2;

import java.util.Scanner;

public class ex25 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int number;
		System.out.print("Enter any number:");
		number = input.nextInt();
		input.close();
		
		if (number%2 == 0) 
			System.out.println("The number is even");
		else 
			System.out.println("The number is odd");
	}
	
}
