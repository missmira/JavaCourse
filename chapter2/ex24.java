package chapter2;

import java.util.Scanner;

public class ex24 {

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);

		int number,largest,smallest;
		largest = smallest = 0;
		
		for (int i=0;i<5;i++) {
			
			System.out.print("Enter number " + (i+1) + ": ");
			number = input.nextInt();	
			if(number > largest) 
				largest = number;
			if (number < smallest) 
				smallest = number;
		}
	
		System.out.printf("\nlargest number is: %d\nsmallest number is: %d" ,largest,smallest);
		
		input.close();
	}
	
}
