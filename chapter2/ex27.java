package chapter2;

import java.util.Scanner;

public class ex27 {

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int row,col;
		System.out.print("Enter row number:");
		row = input.nextInt();
		System.out.print("Enter column number:");
		col = input.nextInt();
		
		input.close();
			
		for (int i = 0; i < row; i++){
			if (i%2 != 0) System.out.print(" ");
			for (int j = 0; j < col; j++) {	
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
