package chapter2;

import java.util.Scanner;

public class ex32 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number,negative,positive,zero;
		negative = positive = zero = 0;
		for (int i=0;i<5;i++) {
			
			System.out.print("Enter number " + (i+1) + ": ");
			number = input.nextInt();	
			if(number != 0) {
				 if (number < 0) negative++;
				 else positive ++;
			}
			else zero ++;
			
		}
		
		System.out.printf("\n%d positive numbers, %d negative numbers and %d numbers equal with 0",positive,negative,zero);
		
		input.close();
	}
	
}

