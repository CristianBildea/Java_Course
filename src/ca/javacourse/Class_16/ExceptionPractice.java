package ca.javacourse.Class_16;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        //Ask for two numbers, integers, a and b (string)
        //Parse the number to integer
        //Show the result of a /b


        try
        {
            //throw new Exception("I just want to make an exception here");

            Scanner s = new Scanner(System.in);

            int num1;

            while(true) {
                System.out.println("enter the first number >");
                String numString1 = s.nextLine();
                try {
                    num1 = Integer.parseInt(numString1); //**
                    break;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Sorry the number you entered was not valid");
                }
            }

            System.out.println("enter the second number >");
            String numString2 = s.nextLine();
            int num2 = Integer.parseInt(numString2);



            if (num2 == 0)
            {
                System.out.println("You can't divide by 0");
                System.exit(0);
            }

            System.out.println("The result of the first divided by the second number is:");
            System.out.println(num1 / num2); //**
        }
        catch (NumberFormatException e)
        {
            System.out.println("Sorry, you must enter digits only eg: 4");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: You can't divide by 0.");
        }
        catch(Exception e)
        {
            System.out.println("An error has occurred, please check your values");
            System.out.println(e.getMessage());
        }

    }
}
