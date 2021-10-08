package ca.javacourse.Class_8;

public class break_continue {

    public static void main(String[] args) {

      //  for (int y = 0; y <10; y++)
     //   {
       //     if (y == 5)
       //         break; //it will break before to print the 5

         //   System.out.println(y);
      //  } //will print 0 1 2 3 4

        for (int y = 0; y <10; y++) {
            if (y == 5)
                continue;

            System.out.println(y);
        }
        //will print 0 1 2 3 4 5 6 7 8 9
    }
}
