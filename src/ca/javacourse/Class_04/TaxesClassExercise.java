package ca.javacourse.Class_04;

import java.text.NumberFormat;
import java.util.Scanner;

public class TaxesClassExercise {


    public static void main(String[] args) {

        final double GST = 0.05;  //for good practice we are using capital letter for what never change and we are using final
        final double QST = 0.09975;

        Scanner sc = new Scanner(System.in);

        double totalPrice;
        double subTotal;
        double itemPrice;
        int itemQuantity;
        String formattedPrice;

        System.out.println("What is the price of the item? (double)");
        itemPrice = sc.nextDouble();

        System.out.println("How many items were purchased? (int)");
        itemQuantity = sc.nextInt();

        subTotal = itemPrice * itemQuantity;

        totalPrice = subTotal + (subTotal * GST) + (subTotal * QST);

        formattedPrice = NumberFormat.getCurrencyInstance().format(totalPrice);


        System.out.println("Thank you, the total price is " + formattedPrice); //cantonating (text + somthing, etc)







    }
}

