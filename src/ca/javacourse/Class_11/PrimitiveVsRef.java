package ca.javacourse.Class_11;

public class PrimitiveVsRef {

    static int i = 1;
    static int j = 2;

    public static void main(String[] args) {

        i = j;

        System.out.println(i);
        System.out.println(j);

    }
}
