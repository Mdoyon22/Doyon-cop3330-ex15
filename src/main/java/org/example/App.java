/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("What is the password? ");
        String enteredPassword = inp.nextLine();
        String correctPassword = "abc$123";

        if (enteredPassword.equals(correctPassword))
        {
            System.out.print("Welcome!");
        }

        else
        {
            System.out.print("I don't know you.");
        }
    }
}
