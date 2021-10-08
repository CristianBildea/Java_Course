package ca.javacourse.Class_8;

public class for_loop_1 {

    public static void main(String[] args) {

        for (int x =5; x <= 15; x++)
        {
            System.out.println(x);
        }//because x daing we can use again pt ca varialbila x este in interior la for (x..)

        System.out.println("##################");

        //(1) 1-20 only add numbers.
        // (2) 5, 10, 15, 20 --->50.
        //(3)  20 to 10 (eleven total numbers, backwards)

        //1

        for (int x = 1; x <=20; x++)
        {
            System.out.println(x);
        }
        System.out.println("##################");

        //2

        for (int x = 5; x <=50; x += 5 )
        {
            System.out.println(x);
        }
        System.out.println("##################");

        //3

        for (int x = 20; x > 10; x--)
        {
            System.out.println(x);
        }
    }
}
