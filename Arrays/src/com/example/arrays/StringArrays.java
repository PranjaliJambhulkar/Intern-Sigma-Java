package com.example.arrays;

public class StringArrays
{
    public static void main(String[] args)
    {
        String [] names = getNames();
        for(int i = 0; i < names.length; i++)
        {
            //System.out.println(names[i]); // display the all names
            if(names[i] != null) {
                System.out.println(names[i].charAt(0));//display the character at position zero
            }
        }
    }
    public static String [] getNames()
    {
        String [] names = new String[6];
        names[0] = "John";
        names[1] = "Peter";
        names[2] = "Paul";
        names[3] = "Simon";
        names[4] = "Chuck";
        names[5] = null;
        return names;
    }
}
