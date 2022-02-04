package com.example.arrays;

public class CopyArrays
{
    /* public static void main(String[] args) {
     int [] array1 = {2, 4, 6, 8, 10};// size 5

        int [] array2 = array1; //copy the array1 to array2
        // esh mai array value change ki to array1 ki value change hogi sath mai array2 ki bhi value change hogi
        array1[1] = 5; // change position 1 item 4 to 5
        printArray(array1);
        System.out.println();
        printArray(array2);

    }
    public static void printArray(int [] array){
        for(int value : array){
            System.out.println(value);
        }
    }
    */
    //another way
    public static void main(String[] args) {
        int [] array1 = {2, 4, 6, 8, 10}; //size 5
        int [] array2 = new int[array1.length];

        for(int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }

        // esh mai array value change ki to array1 ki hi value change hogi array2 ki nhi hogi
        //array1[1] = 5;
        printArray(array1);
        System.out.println();
        printArray(array2);
    }
    public static void printArray(int [] array){
        for (int value : array){
            System.out.println(value);
        }
    }
}
