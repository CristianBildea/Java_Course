package ca.javacourse.Class_13.Entities;

import java.math.BigDecimal;

public class SigninWebPage {

    public static void main(String[] args) {

        // Enter the employee number => 1

        //Find the employee
        HourlyEmployee a = new HourlyEmployee(1, "Henry", new BigDecimal("90.00"));


        //IF the employee has the ability of signing in and signing out, then we will record this.
        if (a instanceof IAttendance)
        {
            a.signIn();

        }
    }
}
