package com.example.arrays;

import java.util.Arrays;
public class CompareArrays
{
    public static void main(String[] args) {
        int [] numbers1 = {1, 2, 3, 4};
        int [] numbers2 = {1, 2, 3, 4};

        //This is wrong way to compare the arrays
        /*if(numbers1 == numbers2) // correct if(Arrays.equals(numbers1, numbers2){}
        {
            System.out.println("They are the same!");
        }
        else{
            System.out.println("They are not the same!");
        }*/

        //This is correct way to compare the arrays
        boolean arrayEqual = true;
        int i = 0;
        if(numbers1.length != numbers2.length){
            arrayEqual = false;
        }
        while(arrayEqual && i < numbers1.length){
            if(numbers1[i] != numbers2[i]){
                arrayEqual = false;
            }
            i++;
        }
        if(arrayEqual){
            System.out.println("They are the same!");
        }
        else{
            System.out.println("They are not the same!");
        }
    }
}
