package ca.javacourse.Class_6;

import java.text.NumberFormat;

public class Switch_case_statement {

    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getCurrencyInstance();
        //f.setMinimumFractionDigits(2);

        double salary = 60000.00;
        char employeeType = 'R';  // M= Management, R=Regular, T=temp
        double bonus = 0.0;

        switch (employeeType)
        {
            case 'M':
               // bonus = .1;
              //  break;
            case 'R':
                bonus = .05;
                break;
            default:
                bonus = .01;
                break;

        }

        double finalBonus = bonus * salary;

        System.out.println("Bonus will be " + f.format(finalBonus));
    }
}
