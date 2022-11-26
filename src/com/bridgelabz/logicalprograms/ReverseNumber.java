package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter Any Number For Reverse ");

        Scanner scanner =new Scanner(System.in);
        int a =scanner.nextInt();
        int  reversenumber = 0;

        while (a != 0) {
            int remainder = a % 10;
            reversenumber = reversenumber * 10 + remainder;
            a = a / 10;

        }

        System.out.println("The Reverse Number is " +  reversenumber );
    }
}