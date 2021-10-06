package ca.javacourse.Class_7;

public class dowhile {
    public static void main(String[] args) {

        // Print all even numbers between one and ten. Use a while loop and also a do-while loop.

        // #1
        int counter1 = 0;

        while (counter1 < 10) {
            counter1++;

            if (counter1 % 2 == 0) // Is counter1 even ? (%)

                System.out.println("Number: " + counter1);
        }

        // #2

        //WHILE

        int counter = 0;

        while (counter < 10)
        {
            counter += 2;

            System.out.println("Number: " + counter);


            // counter = counter + 2; is the same with what is down

        }

        // DO-WHILE

        int counter3 = 0;

        do {
            counter3 += 2;
            System.out.println("Number: " + counter3);
        }
        while (counter3 < 10);


    }






    }

