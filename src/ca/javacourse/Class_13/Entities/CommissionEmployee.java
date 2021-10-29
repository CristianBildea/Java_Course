package ca.javacourse.Class_13.Entities;

import java.math.BigDecimal;

public class CommissionEmployee extends SalaryEmployee {

    private BigDecimal commissionRate;

    //Constructor

    public CommissionEmployee(int id, String name, BigDecimal yearlySalary, BigDecimal commissionRate) {
        super(id, name, yearlySalary);
        this.commissionRate = commissionRate;
    }
//Getter/Setter
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }
    //Methode
    public BigDecimal calculatePay()
    {
        BigDecimal monthlyPay = super.calculatePay().multiply(this.commissionRate);

        determineOnlinePay(monthlyPay);

        return monthlyPay;

    }
}
