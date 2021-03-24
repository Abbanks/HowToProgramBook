package com.company.HowToProgramBook.Chapter10;
// Employee abstract superclass -\that implements Payable.
public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


    // initialize Employee, add 1 to static count and
    // output String indicating that constructor was called
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;



    } // end Employee constructor

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }



    // convert Employee to String format
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end method toString
    

    // Note: We do not implement Payable method getPaymentAmount here so
// this class must be declared abstract to avoid a compilation error.
}

