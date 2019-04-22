package chapter2;

import java.util.Scanner;

public class ex30 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 5 digits: ");
		int number = input.nextInt();
		
		input.close();
		
		if(number/100000 == 0 && number/10000 != 0) {
			
			int one,two,three,four,five;
					
			one = number/10000; //first number retrieve
			two = (number/1000)%10; // get first two numbers then get the last number from them. ie from 12 get 2
			three = (number/100)%10; //get first three numbers then get the last one from them
			four = (number/10)%10;
			five = number%10; // get the last
			
			System.out.printf("%d   %d   %d   %d   %d\n", one,two,three,four,five);
		} else 
			System.out.println("You have entered more or less then 5 digits");	
	}
	
}

