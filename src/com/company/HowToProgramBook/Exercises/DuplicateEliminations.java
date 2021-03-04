package com.company.HowToProgramBook.Exercises;

import java.util.Scanner;

public class DuplicateEliminations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];
        int length = num.length;

        int index = 0;

        for (int i = 0; i <= length - 1; i++) {
            System.out.print("Input a number between 10 and 100 inclusive:");
            int temp = input.nextInt();


            if (temp >= 10 && temp <= 100) {
                num[i] = temp;
                index++;
            }


        }

        input.close();

        printNumbers(num);

        //displayNumbers(num);
    }

    public static void displayNumbers(int[] num) {

        int unique = 0;
        for (int i = 1; i < num.length; i++) {

            if (num[i] > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (num[i] == num[j]) {
                        unique = 0;
                        break;
                    } else
                        unique = num[i];
                }
            }

            if (unique > 0) {
                System.out.print(unique + "");
            } else
                continue;
            ;
        }
        System.out.println();


    }

    public static void printNumbers(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

