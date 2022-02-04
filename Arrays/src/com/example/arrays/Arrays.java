package com.example.arrays;

public class Arrays
{
    public static void main(String[] args) {
    /*    int number0 = 5;
        int number1 = 10;
        int number2 = 15;
        int number3 = 20;
        int number4 = 25;
        int number5 = 30;
        int number6 = 35;
        int number7 = 40;
        int number8 = 45;
        int number9 = 50;

        int [] number = new int[10];
        number[0] = 5;
        number[1] = 10;
        number[2] = 15;
        number[3] = 20;
        number[4] = 25;
        number[5] = 30;
        number[6] = 35;
        number[7] = 40;
        number[8] = 45;
        number[9] = 50;

     */
        //declaration of array

        int [] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;

        int [] numbers2 = {5, 10, 15, 20};
        System.out.println("first array declare: "+numbers[0] + " \nsecond array declare: " +numbers2[1]);

        System.out.println("\nSecond Way:");
        for(int i = 0; i < numbers2.length;i++){
            System.out.println(numbers2[i]);
        }

        System.out.println("");
        for(int val : numbers2){
            System.out.println(val);
        }
    }
}
