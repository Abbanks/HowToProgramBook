package com.company.HowToProgramBook.Assignments;

public class Bugger {
    public static void main(String[] args) {
        int r = 999;
        bugger(r);
    }
        public static void bugger(int x){
        int product = 1;
        int numOfDigits = Integer.toString(x).length();
        int count= 0;

        for (int i = 0; i < numOfDigits; i++) {

            if (numOfDigits == 1) {
                System.out.println(count);
                break;
            }else {
                while (x != 0) {
                    product = product * (x % 10);
                    x = x / 10;
                }
                bugger(product);
            }
        }}
}
