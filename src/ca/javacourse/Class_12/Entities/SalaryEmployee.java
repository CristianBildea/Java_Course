package ca.javacourse.Class_12.Entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryEmployee extends Employee {

    private BigDecimal yearlySalary;

    //Constructor

    public SalaryEmployee(int id, String name, BigDecimal yearlySalary) {
        super(id, name);
        this.yearlySalary = yearlySalary;
    }

    //Getter/Setter

    public BigDecimal getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(BigDecimal yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    @Override
    public BigDecimal calculatePay() {

        BigDecimal monthlyPay = this.yearlySalary.divide(new BigDecimal("12"), RoundingMode.CEILING);

        determineOnlinePay(monthlyPay);
        return monthlyPay;
    }



}
