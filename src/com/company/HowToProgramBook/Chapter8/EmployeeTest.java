// Composition demonstration.
// static member demonstration.
package com.company.HowToProgramBook.Chapter8;


public class EmployeeTest {
    public static void main(String[] args) {
        // show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d\n",
                Employee.getCount());

        //composition
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println(employee);

        // create two Employees; count should be 2
        Employee e1 = new Employee("Susan", "Baker", birth, hire);
        Employee e2 = new Employee("Bob", "Blue", birth, hire);

        // show that count is 2 after creating two Employees
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n", Employee.getCount());


        // get names of Employees
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());

        // in this example, there is only one reference to each Employee,
        // so the following two statements indicate that these objects
        // are eligible for garbage collection
        e1 = null;
        e2 = null;

    }
}