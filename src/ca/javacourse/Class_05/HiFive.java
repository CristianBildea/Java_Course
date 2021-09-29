package ca.javacourse.Class_05;

import java.util.Scanner;

public class HiFive {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int answer = s.nextInt();

        // Div 5 = hifive
        // Div 2 = hiEven

        if (answer % 5 == 0)
        {
            System.out.println("hiFive");
        }
         if (answer % 2 == 0)
        {
            System.out.println("hiEven");
        }

        boolean five = (answer % 5) == 0;
        boolean even = (answer % 2) == 0;

        if (five) {
            System.out.println("hiFive");
        }
        if  (even) {
            System.out.println("hiEven");
        }

    }
}
