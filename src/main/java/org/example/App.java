/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;

import java.text.NumberFormat;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        float principal = Float.parseFloat( strIO("What is the principal amount? ",sc));
        float rate = Float.parseFloat( strIO("What is the rate? ",sc));
        int numYears = Integer.parseInt( strIO("What is the number of years? ",sc));
        int yearlyCompound = Integer.parseInt( strIO("What is the number of times the interest is compounded per year? ",sc));
        float investmentWorth= (float) (principal * Math.pow( 1.0 + ( (rate/100) / yearlyCompound ) , yearlyCompound*numYears ));
        NumberFormat cur = NumberFormat.getCurrencyInstance();
        String formattedInvestment = cur.format(investmentWorth);
        String initialInvestment = cur.format(principal);
        System.out.println(initialInvestment + " invested at " + rate + "% for "+ numYears +" years compounded "+ yearlyCompound + " times per year is "+formattedInvestment);

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
