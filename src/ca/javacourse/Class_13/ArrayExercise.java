package ca.javacourse.Class_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercise {

    static int[] sampleSet = new int[10];


    public static void main(String[] args) {

        for (int x = 0; x < sampleSet.length; x++)
        {
            sampleSet[x] =(int)(Math.random() * 100);
        }

        // 1: Display all the elements in this array

        // 2: Find out what is the highest and lowest number in the array,
        //    then print them at the end.

        // 1
        System.out.println("Elements in this array are:");

        System.out.println(Arrays.toString(sampleSet));

        // 2

        int maxNum = sampleSet[0];
        int minNum = sampleSet[0];


        for (int a : sampleSet)
        {

            if (a > maxNum)
            {
                maxNum = a;
            }

            if (a < minNum)
            {
                minNum = a;
            }
        }
        System.out.println("Max number is " + maxNum);
        System.out.println("Min number is " + minNum);

        //SORT method.

        Arrays.sort(sampleSet);

        System.out.println(Arrays.toString(sampleSet));

        System.out.println("Max number is " + sampleSet[sampleSet.length -1]);
        System.out.println("Min number is " + sampleSet[0]);

    }
}
