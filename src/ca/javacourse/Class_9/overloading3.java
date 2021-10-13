package ca.javacourse.Class_9;

public class overloading3 {

    public static void main(String[] args) {
        System.out.println(add2(1, 2));


    }

    public static double add2(int x, int y)
    {

        return x + y;
    }

    public static double add3(int x, int y, int z)
    {

        return x + y + z;
    }

    public static double add4(int x, int y, int z, int w)
    {

        return x + y + z + w;
    }
}
