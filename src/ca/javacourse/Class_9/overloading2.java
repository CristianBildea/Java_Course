package ca.javacourse.Class_9;

public class overloading2 {

    public static void main(String[] args) {
        System.out.println(addingMachine(1, 2));


    }

    public static double addingMachine(double x, double y)
    {
        double z = x + y;
        return z;
    }

    public static double addingMachine(int x, double y)
    {
        double z = x + y;
        return z;
    }

    public static int addingMachine(int x, int y)
    {

        return x + y;
    }
}
