package com.example.arrays;

import java.util.ArrayList;

public class TheArrayList
{
    public static void main(String[] args)
    {
        //Standard Java arrays are of a fixed length. After arrays are created
        //they cannot grow or shrink, which means that yiu must know in advance
        //how many elements an array will hold

        //Array lists are created with an initial size, when this size is exceeded,
        //the collection is automatically enlarged. when object are removed,
        //the array may be shrunk

        ArrayList<String> names = new ArrayList<>();
        names.add("John");// same as names[0] = "John";
        names.add("Peter");//1
        names.add("Paul");//2
        names.add("Simon");//4

        names.add(3,"Chuck");//3

        names.set(1,"Peters"); //replace item using index

        names.remove(0); //remove the particular item
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));//similar as names[i]
        }
    }
}
