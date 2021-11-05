package ca.javacourse.Class_15;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] sample1 = new int[10];
        int[] sample2 = new int[] { 6, 6, 6, 6, 8, 8, 8, 6, 6, 6};

        Arrays.fill(sample1, 6);
        Arrays.fill(sample1, 4, 7, 8);

        // 6 6 6 6 8 8 8 6 6 6

        System.out.println(Arrays.toString(sample1));
        System.out.println(Arrays.toString(sample2));

        System.out.println(Arrays.equals(sample1, sample2));
        System.out.println(sample1 == sample2);

       // System.out.println(sample1.equals(sample2)); // don't do this

        String a = "Hi";
        String b = "HELLO";

        System.out.println(a.equals(b)); // This is ok , string compare

        Arrays.sort(sample2);
        System.out.println(Arrays.toString(sample2));
    }
}
