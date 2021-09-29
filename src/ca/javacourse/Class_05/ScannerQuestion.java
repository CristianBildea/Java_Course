package ca.javacourse.Class_05;

import java.util.Scanner;

public class ScannerQuestion {

    public static void main(String[] args) {

        //1) 5
        //2) Brendan
        //3) Wood

        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        s.nextLine();
        String firstString = s.nextLine();
        String secondString = s.nextLine();

        System.out.println(firstNumber);
        System.out.println(firstString);
        System.out.println(secondString);
    }
}
