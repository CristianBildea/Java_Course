package ca.javacourse.Class_8;

import java.util.Scanner;

public class addnums_function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();


        System.out.println(addNums(first, second));


    }

    public static int addNums(int a, int b) // methods
    {
        return a + b;

    }


}
