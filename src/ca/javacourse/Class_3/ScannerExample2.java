package ca.javacourse.Class_3;

import java.util.Scanner;

    public class ScannerExample2 {

        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            int firstNumber;
            int secondNumber;

            System.out.println("Please enter your first number.");
            firstNumber = myScanner.nextInt();

            System.out.println("Now, enter your second number.");
            secondNumber = myScanner.nextInt();

            String answer = "The two numbers added equal " + (firstNumber + secondNumber);

            System.out.println(answer);
        }
    }


