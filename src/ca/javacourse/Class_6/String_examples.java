package ca.javacourse.Class_6;

public class String_examples {

    public static void main(String[] args) {

        String s1 = "ABC";

        String s2 = new String("ABC");

        boolean isEqual = s1.equals(s2);

        if (isEqual) {
            System.out.println("String are equal.");

        } else {
            System.out.println("String are not equal.");
        }


    }
}
