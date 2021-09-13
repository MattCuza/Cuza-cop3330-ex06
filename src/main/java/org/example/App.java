/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        Date d=new Date();
        int year=d.getYear();
        int currentYear = (year +1900);

        System.out.println("What is your current age? ");
        String age = sc.nextLine();

        System.out.println("At what age do you want to retire? ");
        String retire = sc.nextLine();

        int ageNum  =Integer.parseInt(age);
        int retireNum=Integer.parseInt(retire);

        System.out.println("You have " + (retireNum - ageNum) + " years left until you can retire.\n" +
                           "It's " + currentYear + ", so you can retire in " + (currentYear + retireNum));
    }
}
