package ca.javacourse.Class_3;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExample {

    public static void main(String[] args) {

        //Currency
        double salary = 2310.11;
        NumberFormat n = NumberFormat.getCurrencyInstance(); //Number Format is a class , n is a object
        String formattedSalary = n.format(salary);
        System.out.println(formattedSalary);

        //Percentage
        double passingGrade = .6;
        NumberFormat p = NumberFormat.getPercentInstance();
        String formattedPercentage = p.format(passingGrade);
        System.out.println(formattedPercentage);

        //Numbers
        double gasVolume = 123456.1234;
        NumberFormat g = NumberFormat.getNumberInstance();
        String formattedNumber = g.format(gasVolume);
        g.setMaximumFractionDigits(3);
        System.out.println(formattedNumber);



    }
}
