package ca.javacourse.Class_13;

public class ArrayExample {

    public static void main(String[] args) {

        // Array
        // Fixed size thing
        // It contains things of the same type .. without exception.
        // Cannot ,ake large or smaller after creation
        // The array is indexed by a number (each element).
        // The first "box" starts at 0.

        int[] selections = new int[6];

        // To add numbers into array:
        selections[0] = 9;

        // To get the length of the whole array:
        System.out.println(selections.length);

        // To print any value in the array:
        System.out.println(selections[0]);

        // We can assign values immediately to an array at creation time like this:

        int[] selections2 = {2, 3, 4, 4, 2, 1};





    }
}
