package org.cop3330;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your weight (in pounds)? ");
        double weight = in.nextDouble();
        in.nextLine();
        System.out.print("What is your gender? (male/female) ");
        String gender = in.nextLine().toLowerCase();
        System.out.print("What is the total amount of alcohol you have consumed (in ounces)? ");
        double alcoholConsumed = in.nextDouble();
        System.out.print("How long has it been since your last drink? (in hours)? ");
        double hours = in.nextDouble();

        double alcoholDistributionRatio = 0;
        if (gender.equals("male"))
            alcoholDistributionRatio = 0.73;
        else if (gender.equals("female"))
            alcoholDistributionRatio = 0.66;

        double BAC = (alcoholConsumed * 5.14 / weight * alcoholDistributionRatio) - 0.015 * hours;

        System.out.printf("Your BAC is %.2f\n", BAC);
        System.out.println(BAC < 0.08 ? "It is legal for you to drive." : "It is not legal for you to drive.");
    }
}
