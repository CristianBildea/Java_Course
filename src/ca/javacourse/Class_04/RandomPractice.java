package ca.javacourse.Class_04;

public class RandomPractice {

    public static void main(String[] args) {

        // Obtain a random number between 1 and 10

        int randomValue1;

        for (int x = 0; x < 20; x++)
        {
            randomValue1 = (int)(Math.random() * 10) + 1;
            System.out.println(randomValue1);
        }



       // double randomValue1 = Math.random() * 10;
       // System.out.println(randomValue1);


        // Between 1 and 100

  //      double randomValue2 = Math.random() * 100;
  //      System.out.println(randomValue2);

        // Between 50 and 100

   //     double randomValue3 = 100 -(Math.random() * 50);
   //     System.out.println(randomValue3);



    }
}
