package ca.javacourse.Class_9;

public class overloading1 {

    public static void main(String[] args) {

        printSalutation();
        printSalutation("Salute!");
        printSalutation("Hi", 5);


    }

    public static void printSalutation()
    {
        System.out.println("Hello");
    }

    public static void printSalutation(String salute) {
        System.out.println(salute);

    }

    public static void printSalutation(String salute, int times)
    {
        for(int x = 0; x < times; x++)
        System.out.print(salute);
    }
}
