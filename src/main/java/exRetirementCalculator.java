/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
import java.time.LocalDate;
public class exRetirementCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your current age?");
        String curAge = sc.next();
        System.out.println("At what age would you like to retire?");
        String retAge = sc.next();

        int age1 = Integer.parseInt(curAge); //Converting String to integer
        int age2 = Integer.parseInt(retAge); //Converting String to integer
        int yrsLeft = age2-age1; //finding the actual years left until retirement
        LocalDate t = LocalDate.now(); //creating an object of LocalDate type & instantiating it to get the current date value of the system
        int yr = t.getYear(); //Getting the current year based on system date
        int retYr = yr+yrsLeft; //Calculating the retirement year

        System.out.println("You have " + yrsLeft + " years left until you can retire.");
        System.out.println("It's " + yr + ", so you can retire in " + retYr + ".");
    }
}
