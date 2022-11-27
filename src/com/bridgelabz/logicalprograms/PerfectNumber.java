package com.bridgelabz.logicalprograms;


import java.util.Scanner;

public class PerfectNumber {
     /**
    *This  Method is Created For get Perfect Number
    */
    public static void main(String[] args) {

        System.out.println("Enter the Number to check whether it is perfect number or not; Number");
        Scanner scanner =new Scanner(System.in);
        int Number =scanner. nextInt();

        int sum=0;
    /**
    *Using For loop for gets values to find the Perfect Number
    */
        for(int i =1;i<Number;i++) {
            if(Number % i ==0) {
                sum = i;
                System.out.println(sum);
                sum = sum +i ;
            }
        }
    /**
    *Using if-else loop to find the Perfect Number
    */
        if (sum==Number) {
            System.out.print(+Number  + " " + "is perfect number");
        }
        else {
            System.out.println(+Number + " " + "is not a perfect number");
        }
    }
}
