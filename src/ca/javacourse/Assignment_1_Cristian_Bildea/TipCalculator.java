package ca.javacourse.Assignment_1_Cristian_Bildea;

import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        final double GST = 0.05;
        final double QST = 0.09975;
        final float H = 0.0f;
        final float BS = .1f;
        final float GS = .15f;
        final float ES = .2f;

        Scanner sc = new Scanner(System.in);
        int mealsQuantity;
        double priceOfMealBeforeTax;
        double subTotalBeforeTax;
        double valueGST;
        double valueQST;
        double totalWithTax;
        float tipPercentage;
        double valueOfTip;
        double grandTotal;
        double amountPerPerson;
        String formattedPrice;

        System.out.println("How many meals were ordered?");
        String reading = "";
        reading = sc.nextLine();
        while (!reading.matches("\\d+")){ //format for integer
            System.out.println("Please input the value again.");
            reading = sc.nextLine();
        }

        mealsQuantity = Integer.parseInt(reading);


        System.out.println("What is the price of the meal?");
        reading = sc.nextLine();
        while (!reading.matches("\\d*\\.?\\d+")){ // format of the double
            System.out.println("Please input the value again.");
            reading = sc.nextLine();
        }
        priceOfMealBeforeTax = Double.parseDouble(reading);

        System.out.println(String.format("The number of meal ordered are " + mealsQuantity ));
        System.out.println(String.format("The price of the meal is " + priceOfMealBeforeTax));

        subTotalBeforeTax = mealsQuantity * priceOfMealBeforeTax;
        System.out.println("Price of the meal before tax is: " + subTotalBeforeTax );

        valueGST = subTotalBeforeTax * GST;
        System.out.println("GST: " + valueGST);

        valueQST = subTotalBeforeTax * QST;
        System.out.println("QST: " + valueQST);

        totalWithTax = subTotalBeforeTax + valueGST + valueQST;
        System.out.println("Total price with tax is: " + totalWithTax);

        do {  // will loop until the customer put a valid option

        // System.out.println("Please enter a tip percentage: 0% , 10%, 15% or 20%");
        System.out.println("Please enter a tip percentage: A=20, B=15, C=10, D=0:");
        char answer = sc.next().charAt(0);

        switch (answer)
        {
            case 'A':
                tipPercentage = ES;
                 break;
            case 'B':
                tipPercentage = GS;
                break;
            case 'C':
                tipPercentage = BS;
                break;
            case 'D':
                tipPercentage = H;
            default:
                System.out.println("This option is not valid, pls choose one of the valid percentage");
                tipPercentage = 1f;
                break;

        }
        }while (tipPercentage == 1f);
        valueOfTip = tipPercentage * subTotalBeforeTax;
        System.out.println("The tip amount is: " + valueOfTip);

        grandTotal = totalWithTax + valueOfTip;
        System.out.println("The grand total is: " + grandTotal);

        amountPerPerson = grandTotal / mealsQuantity;
        System.out.println("Value of the amount owed per person is: " + amountPerPerson);

       // formattedPrice = NumberFormat.getCurrencyInstance();

       /* boolean A = (answer % 10) == 0;
        boolean B = (answer % 15) == 0;
        if (A) {
            valueOfTip = subTotalBeforeTax * BS;
            System.out.println("The tip amount is: " + valueOfTip);
        }
        if (B) {
            valueOfTip = subTotalBeforeTax * GS;
            System.out.println("The tip amount is: " + valueOfTip);
        }*/


    }
}
