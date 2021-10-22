package ca.javacourse.Assignment_1_Cristian_Bildea;

/**
 * Date: 2012-10-18
 * Author: Cristian Bildea
 * The following program  create  a multiplication table based on the input of the user.
 */

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("What size multiplication table would you like printed? > ");
        size = sc.nextInt();

        int a;
        int b;

        //Add the title of the table

        int middle = Math.round(size / 2);
        for (a = 1; a<= middle; ++a ) {
            System.out.print("\t\t");
        }

            System.out.print("Multiplication Table");

        System.out.println();

        // Row Header

        System.out.print(String.format("\t"));
            for (a = 1; a <= size; ++a) {
                System.out.print(String.format("\t%4d", a));
            }
        System.out.println();

            // Column Header


        for (a = 1; a <= size; ++a) {
            System.out.print(String.format("---------"));
        }
        System.out.println();

        // Body of the table with results

            for (a = 1; a <= size; ++a) {

                System.out.print(String.format("%4d|", a));

                for (b = 1; b <= size; ++b) {

                    System.out.print(String.format("\t%4d", a * b));
                }
                System.out.println();
            }

    }
}

