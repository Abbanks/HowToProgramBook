package com.company.HowToProgramBook.Chapter10;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable {

    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary); // validate and store base salary
    }

    // set base salary
    public void setBaseSalary(double salary) {
        if (salary >= 0.0)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double getPaymentAmount()
    {
        return getBaseSalary() + super.getPaymentAmount() ;
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString()
    {
        return String.format( "%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary() );
    } // end method toString

}
