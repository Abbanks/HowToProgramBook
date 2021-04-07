package com.company.HowToProgramBook.Assignments;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise {


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
        if (result1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        System.out.println("Enter number:");
        int number = input.nextInt();
        input.close();

        boolean result = isDisarium(number);
        if (result) {
            System.out.println("This is a Disarium Number");
        } else System.out.println("This is not a Disarium Number");
    }


    public static boolean isPositiveDominant(int[] arr ){

        Arrays.sort(arr);

        int neg_count = 0;
        int pos_count = 0;

        for (int value : arr) {
            if (value >= 0) {
                pos_count++;
            }
            if (value < 0) {
                neg_count++;
            }
        }

        return pos_count > neg_count;

    }


    public static boolean isDisarium(int number){
        int numOfDigits = Integer.toString(number).length(); //Calculates the number of digits in number


        int sum = 0;

        int copy = number; //Create a copy of number

        //Calculate the raised to their respective positions
        while (copy != 0) {
            int digit =  copy% 10;//Get the rightmost or last digit

            sum = sum + (int) Math.pow(digit,numOfDigits );//Adds the value of sum to the digit raised to its position

            numOfDigits--;//Subtracts the numOfDigits by 1
            copy = copy / 10; //Divides digit by 10, Get the next left number
        }
        return (sum == number) ; //Returns true or false
    }
//        System.out.println("Enter number of elements in array:");
//        int g = input.nextInt();
//        char[] ab = new char[g];
//        System.out.printf("Enter %d numbers",g);
//        for (int i = 0; i < g ; i++) {
//            ab = input.next().toCharArray();
//        }
//        input.close();

//
//        int sum = 0;
//        for (int i= 0; i <ab.length; ++i){
//
//            sum = (ab.length* (ab.length + 1)) /2;
//            System.out.printf("%d", sum);
//        }
//            int miss = sum - ab.length;
//        System.out.printf("%d", miss);
//    }

//        public static int missingLetter(char[] a){
//
//
//
//
//
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int number = input.nextInt();
//        input.close();
//
//        for (int i = 1; i <= number; i++){
//            if (i == 1 || i == 0)
//                continue;
//            int prime = number% i;
//            if (prime != 0){
//                System.out.println(number);
//            }
//
//        }
//    }
//
////    public static int primeNumbers(int x){
////
////
////
////        return x;
////    }
//
//        int[] a = {5, 1, 2, 3, 7, 7};



//    public static boolean consecutive(int[] array, int n) {
//        int n = array.length;
//        Arrays.sort(array);
//
//
//        for (int i = 1; i < n; i++) {
//            int max = array[i] < array[0];
//            int min = array[i] > array[0];
//
//            if (array[i] - min != 0) {
//                return false; }
//            else if
//                    (array[i] - min == 0) {
//                    return true;
//                }
//
//            }
//
//        }
//
//        return array;
//    }
//}



        }