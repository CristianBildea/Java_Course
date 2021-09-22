package ca.javacourse.Class_3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        //Scanner? Scans (observes) the input for data.
        //Input = System.IN

        //What is the first name, last name, and print a salutation.

        Scanner myScanner = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Please enter your first name.");
        firstName = myScanner.nextLine();

        System.out.println("Now, enter your last name.");
        lastName = myScanner.nextLine();

        String fullName="Hello, " + firstName  + " " + lastName + ".";

        System.out.println(fullName);
    }
}
