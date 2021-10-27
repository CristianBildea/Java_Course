package ca.javacourse.Class_12;

import ca.javacourse.Class_12.Entities.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {

    public static void main(String[] args) {

        //Inheritance
        //Encapsulation
        //Polymorphism
        //Abstraction

        List<Employee> employeeList = new ArrayList();

        // What is the total pay due to all employee?


        SalaryEmployee se1 = new SalaryEmployee(1, "Brendan", new BigDecimal("75000"));
        CommissionEmployee ce1 = new CommissionEmployee( 2, "Jim", new BigDecimal( "80000"), new BigDecimal( "1.10"));
        HourlyEmployee he1 = new HourlyEmployee(3, "Mary", new BigDecimal("65.00"));

        employeeList.add(se1);
        employeeList.add(ce1);
        employeeList.add(he1);

        BigDecimal totalPay = new BigDecimal("0.00");

        for (Employee e : employeeList)
        {
            totalPay = totalPay.add(e.calculatePay());
        }

        System.out.println("The total pay for all employee is " + totalPay);



    }
}
