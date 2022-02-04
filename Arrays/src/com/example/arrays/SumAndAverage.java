package com.example.arrays;

public class SumAndAverage
{
    public static void main(String[] args) {
        int [] values = {1, 2, 3};

        //average = sum of all values / number of values

        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        double average = (double) sum / values.length;
        System.out.println("The sum is: "+ sum + "\nThe average is: "+ average);
    }
}
