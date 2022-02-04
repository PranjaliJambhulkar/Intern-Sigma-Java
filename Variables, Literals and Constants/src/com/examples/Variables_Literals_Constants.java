package com.examples;

public class Variables_Literals_Constants
{
    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;

        firstNumber = 11;
        secondNumber = 20;

        double average;
        average = (firstNumber + secondNumber)/2;
        System.out.println("Average: "+ average);

        String name;
        String surname;

        name = "John";
        surname = "Deasy";
        System.out.println(name + " " + surname);

        boolean value;
        value = false;
        System.out.println(value);

        char letter;
        letter = 'k';
        System.out.println("letter: " + letter);
    }
}
