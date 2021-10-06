package ca.javacourse.Class_7;

import java.util.Scanner;



public class menu_example {

    public static void main(String[] args) {

        //The following will ask for an entry, it will print the square of the entry.
        //If the user entered "Q" then we quit.
         /*
        Main Menu
        A) Square a number
        B) Math menu
        Q) Quit program

        Math Menu
        A) Negate a number
        B) Double a number
        Q) Return to Main Menu
         */


        Scanner s = new Scanner(System.in);

        String response;
        String subResponse;




        // MAIN MENU LOGIC
        while(true)
        {
            System.out.println(MenuConstant.MainMenuText);
            System.out.print(MenuConstant.Prompt);
            response = s.nextLine();

            // Display Math Menu -  Chose B
            if (response.equalsIgnoreCase("B"))
            {
                while(true) {
                    System.out.println(MenuConstant.MathMenuText);
                    System.out.print(MenuConstant.Prompt);
                    subResponse = s.nextLine();

                    if(subResponse.equalsIgnoreCase("A"))
                    {
                        // NEGATE HERE
                        System.out.println("Enter a number to negate: ");
                        double num = s.nextDouble();
                        System.out.println(num * -1);
                    }

                    if(subResponse.equalsIgnoreCase("B"))
                    {
                        // DOUBLE HERE
                        System.out.println("Enter a number to double: ");
                        double num = s.nextDouble();
                        System.out.println(num + num);
                    }

                    // User selection Q - Goes back to the previous menu
                    if(subResponse.equalsIgnoreCase("Q"))
                    {
                        break;
                    }
                }
            }


            //User selection A
            if(response.equalsIgnoreCase("A"))
            {
                System.out.println("OK, Square a number.");
                System.out.println("Enter a number to square >");
                response = s.nextLine();
                //Convert to a number , square, display the result.
                double num = Double.parseDouble(response);
                System.out.println("The number squared is : " + Math.pow(num, 2.0));

            }

             // User selection Q - Quits the program
            if(response.equalsIgnoreCase("Q"))
            {
                System.out.println("Thank you for using this program.");
                break;
            }

        }




    }
}
