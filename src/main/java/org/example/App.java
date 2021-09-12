package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App {

    public static int add (int num1, int num2){
        return num1 + num2;
    }

    public static int sub (int num1, int num2){
        return num1 - num2;
    }
    public static int multiply (int num1, int num2){
        return num1 * num2;
    }
    public static int divide (int num1, int num2){
        return num1 / num2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number?");
        String str = input.nextLine();
        Integer number1;
        try {
            number1 = Integer.valueOf(str);
            if (number1<0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }


        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the second number?");
        String str2 = input2.nextLine();
        Integer number2;
        try {
            number2 = Integer.valueOf(str2);
            if (number2<0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }
        

        int a = add(number1, number2);
        int b = sub(number1, number2);
        int c = multiply(number1, number2);
        int d = divide(number1, number2);

        // Uses the method and prints the answer
        System.out.println(number1 +"+"+number2+ "=" + a);
        System.out.println(number1 +"-"+number2+ "=" + b);
        System.out.println(number1 +"*"+number2+ "=" + c);
        System.out.println(number1 +"/"+number2+ "=" + d);
    }

}