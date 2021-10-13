package ca.javacourse.Class_9;

public class PassByValue {

    public static int increaseNumber(int n) // this n is not affect the second n
    {
        n++;

        return n;
    }

    public static void main(String[] args) { // is print this n which is different n like first

        int n = 0;
        n = increaseNumber(n);
        System.out.println(n);


    }


}
