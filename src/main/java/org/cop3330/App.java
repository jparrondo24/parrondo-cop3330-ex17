/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = in.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        double alcoholConsumed = in.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        double weight = in.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        double hours = in.nextDouble();

        double alcoholDistributionRatio = 0;
        if (gender == 1)
            alcoholDistributionRatio = 0.73;
        else if (gender == 2)
            alcoholDistributionRatio = 0.66;

        double BAC = (alcoholConsumed * 5.14 / weight * alcoholDistributionRatio) - 0.015 * hours;

        System.out.println();
        System.out.printf("Your BAC is %.6f\n", BAC);
        System.out.println(BAC < 0.08 ? "It is legal for you to drive." : "It is not legal for you to drive.");
    }
}
