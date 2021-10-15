package ca.javacourse.Assignment_1_Cristian_Bildea;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("What size multiplication table would you like printed? > ");
        size = sc.nextInt();

        int a;
        int b;
        int middle = Math.round(size / 2);
        for (a = 1; a<= middle; ++a ) { // add the title of table in middle
            System.out.print("\t\t");
        }

            System.out.print("Multiplication Table");



        System.out.println();



        System.out.print(String.format("\t")); //row header
            for (a = 1; a <= size; ++a) {
                System.out.print(String.format("\t%4d", a));
            }
        System.out.println();

        for (a = 1; a <= size; ++a) { // column header
            System.out.print(String.format("---------"));
        }
        System.out.println();

            for (a = 1; a <= size; ++a) { // the body of table with results

                System.out.print(String.format("%4d|", a));

                for (b = 1; b <= size; ++b) {

                    System.out.print(String.format("\t%4d", a * b));
                }
                System.out.println();
            }

    }
}

