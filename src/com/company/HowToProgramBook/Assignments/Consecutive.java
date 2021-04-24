package com.company.HowToProgramBook.Assignments;

import java.util.Arrays;

public class Consecutive {
    public static void main(String[] args) {
           int[] arr = {5, 1, 4, 3, 2, 8};
        boolean result2 = consecutive(arr);
        System.out.println(result2);

    }
        public static boolean consecutive(int[] array) {
        boolean result = true;

        Arrays.sort(array); //sorts the array from ascending to descending order

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) //Tests if the current element + 1 is not equal to the next element
            {
                result = false;  //returns false if condition is true;
            }

        }

        return result; //returns true or false
    }
}
