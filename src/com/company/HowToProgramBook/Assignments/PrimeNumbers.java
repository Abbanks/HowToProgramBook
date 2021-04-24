package com.company.HowToProgramBook.Assignments;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();
        input.close();

        primeNumbers(number);

    }
        public static void primeNumbers(int n) { //n=5
        int count = 0;

        for (int i = 2; i < n; i++) {//loop through n starting from 2  i = 2 n= 5
            boolean isPrime = true;

            //check to see if the i is a prime number
            for (int j = 2; j < i; j++) { //j =2 i = 2
                if (i % j == 0) //Tests if i modulus j is zero
                {
                    isPrime = false; //i is not a prime number if the condition is true
                    break;
                }
            }
            // print the number
            if (isPrime)
                ++count;    //Increments count by 1 if i is a prime number
        }
        System.out.printf("The number of prime numbers between 1 and " + "%d" + " is" + " %d\n", n, count);
    }

}
