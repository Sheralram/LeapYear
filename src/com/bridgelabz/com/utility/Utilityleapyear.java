package com.bridgelabz.com.utility;

import com.bridgelabz.Leapyear;

import java.util.Scanner;

public class Utilityleapyear extends Leapyear
{
    public void leap(int num)
    {
        if (num > 999 && num < 10000)
        {
            if (((num % 4 == 0) && (num % 100!= 0)) || (num % 400 == 0))
           // if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            {
                System.out.println(num + "is a Leap year");
            } else
            {
                System.out.println(num + "is a Not a Leap year");
            }
        } else
        {
            System.out.println("Year is Invalid : Please enter 4 digit number ");
        }
    }

}


