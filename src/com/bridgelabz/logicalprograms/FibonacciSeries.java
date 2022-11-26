package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter the Nth number upto which you want fibonacci series; N");
        Scanner scanner =new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        int i =1;
        int a=0;
        int b=1;
        while(i<=number) {
            System.out.println(a + " ");
            int nextnumber = a+ b;
            a = b;
            b = nextnumber;
            i++;
        }
    }
}
