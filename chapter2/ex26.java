package chapter2;

import java.util.Scanner;

	public class ex26 {
		public static void main (String[] args) {
			Scanner input = new Scanner (System.in);
			int number1,number2;
			System.out.print("Enter number1:");
			number1 = input.nextInt();
			System.out.print("Enter number2:");
			number2 = input.nextInt();
			
			input.close();
			
			if (number1%number2 == 0) 
				System.out.printf("%d is a multimple of %d",number1,number2);
			else 
				System.out.printf("%d is NOT a multimple of %d",number1,number2);
		}

}
