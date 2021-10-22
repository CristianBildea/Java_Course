package ca.javacourse.Assignment_1_Cristian_Bildea;


/**
 * Date: 2012-10-18
 * Author: Cristian Bildea
 * The following program the calculates the price per person for a meal
 * The program should ask the user several questions including: the number of diners, The price of the meal, before tax and
 * the tip percentage (Horrible = 0% -D, Basic service = 10% - C, Good service = 15% - B, Exceptional Service = 20% - A)
 * The program will then display the following information:
 * • The number of diners
 * • The price of the meal before tax
 * • The Quebec tax added (Federal)
 * • The Quebec tax added (Provincial)
 * • The total including tax
 * • The tip amount (based on the price before tax)
 * • The grand total including tax
 * • The amount owed per person
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        final double GST = 0.05;
        final double QST = 0.09975;
        final float D = 0.0f;
        final float C = .1f;
        final float B = .15f;
        final float A = .2f;

        Scanner sc = new Scanner(System.in);
        int mealsQuantity;
        double priceOfMealBeforeTax;
        double valueGST;
        double valueQST;
        double totalWithTax;
        float tipPercentage;
        double valueOfTip;
        double grandTotal;
        double amountPerPerson;
        String formattedPrice;

        // Display number of diners

        System.out.println("How many meals were ordered?");
        String reading = "";
        reading = sc.nextLine();
        while (!reading.matches("\\d+")){ //format for integer
            System.out.println("Please input the value again.");
            reading = sc.nextLine();
        }

        mealsQuantity = Integer.parseInt(reading);

        // Display price of the meal before tax

        System.out.println("What is the price of the meal?");
        reading = sc.nextLine();
        while (!reading.matches("\\d*\\.?\\d+")){ // format of the double
            System.out.println("Please input the value again.");
            reading = sc.nextLine();
        }
        priceOfMealBeforeTax = Double.parseDouble(reading);
        formattedPrice =NumberFormat.getCurrencyInstance().format(priceOfMealBeforeTax);

        System.out.println(String.format("The number of meal ordered are " + mealsQuantity ));
        System.out.println(String.format("The price of the meal is " + formattedPrice));


        // Display value of Federal tax (GST)

        valueGST = priceOfMealBeforeTax * GST;
        System.out.println("GST: " + valueGST);

        // Display value of Provincial Tax (QST)

        valueQST = priceOfMealBeforeTax * QST;
        System.out.println("QST: " + valueQST);

        // Display the total including tax

        totalWithTax = priceOfMealBeforeTax + valueGST + valueQST;
        formattedPrice = NumberFormat.getCurrencyInstance().format(totalWithTax);
        System.out.println("Total price with tax is: " + formattedPrice);

        //Display  tip amount based on the price before tax and based by customer choices (A=20%, B=15%, C=10%, D=0%

        do {  // will loop until the customer put a valid option

        System.out.println("Please enter a tip percentage: A=20, B=15, C=10, D=0:");
        char answer = sc.next().charAt(0);

        switch (answer)
        {
            case 'A':
                tipPercentage = A;
                 break;
            case 'B':
                tipPercentage = B;
                break;
            case 'C':
                tipPercentage = C;
                break;
            case 'D':
                tipPercentage = D;
            default:
                System.out.println("This option is not valid, pls choose one of the valid percentage");
                tipPercentage = 1f;
                break;

        }
        }while (tipPercentage == 1f);
        valueOfTip = tipPercentage * priceOfMealBeforeTax;
        formattedPrice = NumberFormat.getCurrencyInstance().format(valueOfTip);
        System.out.println("The tip amount is: " + formattedPrice);

        // Display grand total value including tax and tip

        grandTotal = totalWithTax + valueOfTip;
        formattedPrice = NumberFormat.getCurrencyInstance().format(grandTotal);
        System.out.println("The grand total is: " + formattedPrice);

        // Display amount owed per person

        amountPerPerson = grandTotal / mealsQuantity;
        formattedPrice = NumberFormat.getCurrencyInstance().format(amountPerPerson);
        System.out.println("Value of the amount owed per person is: " + formattedPrice);

        NumberFormat f = NumberFormat.getInstance();
        if (f instanceof DecimalFormat) {
            ((DecimalFormat) f).setDecimalSeparatorAlwaysShown(true);
        }



    }
}
