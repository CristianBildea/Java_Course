package ca.javacourse.Class_8;

public class biggers_of_three {

    public static void main(String[] args) {

        System.out.println(largestOfThree(10,30,20));
        System.out.println(largestOfThree(10, 10,20));
        System.out.println(largestOfThree(-10, 10, -5));



    }

    // Design a method that returns the biggest number from 3 numbers supplied.

    public static int largestOfThree(int a, int b, int c)
    {
        if (a > b && a> c) {
            return a;
        }
        if (b > c)
        {
            return b;
        }
        return c;




    }
}
