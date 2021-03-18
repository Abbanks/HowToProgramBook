package com.company.HowToProgramBook.Chapter10;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    // four-argument constructor
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn); // pass to Employee constructor
        setWeeklySalary(salary); // validate and store salary
    }

    // set salary
    public void setWeeklySalary( double salary )
    {
            if ( salary >= 0.0 )
                baseSalary = salary;
            else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0" );
        } // end method setWeeklySalary

    // return salary
    public double getWeeklySalary()
    {
            return weeklySalary;
            } // end method getWeeklySalary

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format( "salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary() );
    } // end method toString
}
