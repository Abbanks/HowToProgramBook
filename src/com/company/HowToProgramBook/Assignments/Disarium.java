package com.company.HowToProgramBook.Assignments;

import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter number:");
        int number = input.nextInt();
        input.close();

        boolean result = isDisarium(number);
        if (result){
            System.out.println("This is a disarium number");
        }
        else System.out.println("This is not a disarium number");

    }
     public static boolean isDisarium(int number) {
        int numOfDigits = Integer.toString(number).length(); //Calculates the number of digits in number


        int sum = 0;

        int copy = number; //Create a copy of number

        //Calculate the raised to their respective positions
        while (copy != 0) {
            int digit = copy % 10;//Get the rightmost or last digit

            sum = sum + (int) Math.pow(digit, numOfDigits);//Adds the value of sum to the digit raised to its position

            numOfDigits--;//Subtracts the numOfDigits by 1
            copy = copy / 10; //Divides digit by 10, Get the next left number
        }
        return (sum == number); //Returns true or false
    }
}
