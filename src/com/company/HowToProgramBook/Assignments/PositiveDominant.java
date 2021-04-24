package com.company.HowToProgramBook.Assignments;

import java.util.Scanner;

public class PositiveDominant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.printf("Enter %d numbers", n);
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        boolean result1 = isPositiveDominant(array);
        System.out.println(result1);
    }
    /**
     * This function checks if an array is positive dominant or not
     *
     * @param arr the array to be considered
     * @return true or false
     */

        public static boolean isPositiveDominant(int[] arr) {

        int negativeCount = 0;
        int positiveCount = 0;

        for (int value : arr) { //Iterate through each number in the array
            if (value >= 0) {   //If a number is greater than zero, increment positiveCount by 1
                positiveCount++;
            } else {
                negativeCount++; //If a number is less than zero, increment negativeCount by 1
            }
        }

        return positiveCount > negativeCount; //returns true or false if positive numbers are more than negative numbers

    }
}
