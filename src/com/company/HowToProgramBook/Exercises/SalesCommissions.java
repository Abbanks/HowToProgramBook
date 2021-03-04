package com.company.HowToProgramBook.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesCommissions {
    public static void main (String []args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> salaries = new ArrayList<>();

        int grossSales = 0;

        while (grossSales != -1){
            System.out.println("\nInput Gross sale for the week or -1 to quit:");
            grossSales = input.nextInt();

            salaries.add(200 + (int)(0.09 * grossSales));
        }

        displayRanges(salaries);
    }

    public static void displayRanges(ArrayList<Integer> salaries){
        int[] frequency = new int[11];

        for (Integer salary : salaries){
            int rangeIndex = salary/100;
           ++frequency[Math.min(rangeIndex, 10)];
        }

        System.out.print("Salaries Frequency\n");

        for(int count= 2; count < frequency.length; count++){

            if (count == 10)
            System.out.printf( "$%5d %s: ", 1000, "and over" );
            else
            {
                System.out.printf( "$%02d-$%02d: ", count * 100, count * 100 + 99 );
            }

            // print bar of asterisks

            for ( int stars = 0; stars < frequency[ count ]; stars++ )

                System.out.print( "*" );

            System.out.println(); // start a new line of output
        }
    }
}
