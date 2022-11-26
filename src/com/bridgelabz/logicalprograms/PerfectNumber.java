package com.bridgelabz.logicalprograms;


import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Enter the Number to check whether it is perfect number or not; Number");
        Scanner scanner =new Scanner(System.in);
        int Number =scanner. nextInt();

        int sum=0;
        for(int i =1;i<Number;i++) {
            if(Number % i ==0) {
                sum = i;
                System.out.println(sum);
                sum = sum +i ;
            }
        }
        if (sum==Number) {
            System.out.print(+Number  + " " + "is perfect number");
        }
        else {
            System.out.println(+Number + " " + "is not a perfect number");
        }
    }
}
