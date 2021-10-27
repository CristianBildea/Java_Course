package ca.javacourse.Class_12.Entities;

import java.math.BigDecimal;

public abstract class Employee {

    private int id;
    private String name;
    private char payMethod; // O = Online, C = Cash

    //Constructor

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.payMethod = 'C';
    }

    //Getter/Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(char payMethod) {

        if (payMethod != 'O' && payMethod != 'C')
        {
            System.out.println("Error: You can only set the pay method to O or C.");
        }
        else {
            this.payMethod = payMethod;
        }
        this.payMethod = payMethod;
    }

    //Methods

    public abstract BigDecimal calculatePay();

    /**
     * If the pay is large than 1000, set this object to "O" online pay
     * @param amount
     * @return
     */
    protected void determineOnlinePay(BigDecimal amount)
    {
        if(amount.compareTo(new BigDecimal("1000")) > 0) // Is amount bigger than 1000?
        {
            this.payMethod = 'O';
            System.out.println("Payment method was changed to O for online");
        }
    }

}
