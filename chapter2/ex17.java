package chapter2;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number");
        int number1 = input.nextInt();
        System.out.print("Enter second number");
        int number2 = input.nextInt();

        if (number1 == number2)
            System.out.println("These numbers are equal");
        else if (number1 > number2)
            System.out.println("First number is larger");
        else
            System.out.println("Second number is larger");



    }
}
