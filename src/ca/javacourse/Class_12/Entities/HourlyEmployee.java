package ca.javacourse.Class_12.Entities;

import java.math.BigDecimal;

public class HourlyEmployee extends Employee{

    private BigDecimal hourlyRate;

    //Constructor

    public HourlyEmployee(int id, String name, BigDecimal hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    //Getter/Setter

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Methode

    @Override
    public BigDecimal calculatePay()
    {
        BigDecimal monthlyPay = this.hourlyRate.multiply(new BigDecimal("160"));

        determineOnlinePay(monthlyPay);
        return monthlyPay;

    }
}
