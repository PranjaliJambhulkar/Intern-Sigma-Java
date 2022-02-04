package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput
{
    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        firstNumber = kb.nextInt();

        System.out.println("Please enter second number: ");
        secondNumber = kb.nextInt();

        double average;
        average = (firstNumber + secondNumber)/2;
        System.out.println("Average: " + average);

        String name;
        String surname;

        kb.nextLine();
        System.out.println("Please enter your name: ");
        name = kb.nextLine();

        System.out.println("Please enter your surname:");
        surname = kb.nextLine();

        System.out.println(name+" "+surname);
    }
}
