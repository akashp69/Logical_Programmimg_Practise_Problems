package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    static void checkPrime(){
        int count = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();


        if (number < 2)
            System.out.println ("The given is number " + number + " is not prime");
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
                count += 1;
        }
        if (count > 2)
            System.out.println ("The given is number " + number+ " is not prime");
        else
            System.out.println ("The given is number " + number + " is prime");
    }


    public static void main(String[] args) {

        System.out.println("Enter Number For Prime Number Checking");
        checkPrime();

    }
}
