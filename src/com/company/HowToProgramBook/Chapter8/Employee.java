// Employee class with references to other objects.
// Static variable used to maintain a count of the number of
// Employee objects in memory.
package com.company.HowToProgramBook.Chapter8;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private static int count = 0;

    // initialize Employee, add 1 to static count and
   // output String indicating that constructor was called
    public Employee( String first, String last, Date dateOfBirth, Date dateOfHire )
  {
          firstName = first;
          lastName = last;
          birthDate = dateOfBirth;
          hireDate = dateOfHire;
          ++count;   // increment static count of employees
          System.out.printf( "Employee constructor: %s %s; count = %d\n",
              firstName, lastName, count );


  } // end Employee constructor

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount(){
        return count;
    }
    // convert Employee to String format
 public String toString()
  {
          return String.format( "%s, %s Hired: %s Birthday: %s",
                 lastName, firstName, hireDate, birthDate );
          } // end method toString
}
