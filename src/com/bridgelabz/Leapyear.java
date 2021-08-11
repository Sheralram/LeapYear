package com.bridgelabz;

import com.bridgelabz.com.utility.Utilityleapyear;

import java.util.Scanner;

public class Leapyear
{
       public static void main(String[] args)
    {
        System.out.println("Welcome to Leap Year Program");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Year ");
        int num = scanner.nextInt();
        Utilityleapyear utility = new Utilityleapyear(); // Object Initialisation
        utility.leap(num); // calling method
    }
}
