package ca.javacourse.Class_9;

public class Exercise162 {

    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 8;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println("The GCD of both numbers above is :" + gcd2(n1, n2));
        System.out.println("The GCD of both numbers above is :" + gcd(n1, n2)); // asta il scriem la urma dupa ce am facut a doua methode pt ca pprima data face a doua metoda si apoi face asta
    }

    //with while loop

    public static int gcd2(int n1, int n2)
    {
        int start = Math.min(n1, n2);
        int end = 1;

        while(start >= end)
        {
            if (n1 % start == 0 && n2 % start == 0)
            {
                return start;
            }

            start--;
        }

        return 0;
    }


    // with for loop

    public static int gcd(int n1, int n2)
    {
        int start = Math.min(n1, n2);
        int end = 1; //Verify

        for (int x = start; x >= end; x--)
        {
            if (n1 % x == 0 && n2 % x == 0) //% modulus inseamna rest, && and
            {
                return x;
            }
        }

        return 0;
    }
}
