package chapter2;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        //15
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number");
        int number1 = input.nextInt();
        System.out.print("Enter second number");
        int number2 = input.nextInt();

        int sum, product, difference, division;
        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        division = number1 / number2;

        System.out.printf("%nsum is %d%nproduct is %d%ndifference is %d%ndivision is %d", sum, product, difference, division);
    }


    }
