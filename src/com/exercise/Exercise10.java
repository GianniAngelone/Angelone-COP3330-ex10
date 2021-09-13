/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Here we first take in the input from a user
        System.out.print("Enter the price of item 1: ");
        String price1 = input.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = input.nextLine();
        System.out.print("Enter the price of item 2: ");
        String price2 = input.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = input.nextLine();
        System.out.print("Enter the price of item 3: ");
        String price3 = input.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = input.nextLine();
        //Next we have to make the user input into numeric numbers
        int Price1 = Integer.parseInt(price1);
        int Quantity1 = Integer.parseInt(quantity1);
        int Price2 = Integer.parseInt(price2);
        int Quantity2 = Integer.parseInt(quantity2);
        int Price3 = Integer.parseInt(price3);
        int Quantity3 = Integer.parseInt(quantity3);
        double subtotal = (Price1 * Quantity1) + (Price2 * Quantity2) + (Price3 * Quantity3);
        double taxrate = subtotal * .055;
        double total = subtotal + taxrate;
        //Now we print our results to the screen after calculating.
        System.out.print(String.format("Subtotal: $%.2f\n", subtotal));
        System.out.print(String.format("Tax: $%.2f\n", taxrate));
        System.out.print(String.format("Total: $%.2f", total));
    }
}
