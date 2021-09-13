/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Enter the principal: ");
        String principal = in.nextLine();
        System.out.print("Enter the rate of interest: ");
        String rate = in.nextLine();
        System.out.print("Enter the number of years: ");
        String years = in.nextLine();
        //string conversion
        float p = Float.parseFloat(principal);
        float r = (Float.parseFloat(rate)) / 100;
        float y = Float.parseFloat(years);
        //math + roundup process
        float amount = p * (1 + (r * y));
        float ramount = (Math.round(amount * 100) / 100);
        //output
        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + ramount + ".");
    }
}
