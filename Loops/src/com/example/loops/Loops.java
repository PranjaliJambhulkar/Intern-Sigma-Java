package com.example.loops;

public class Loops
{
    public static void main(String[] args)
    {
        //the while loop
        int x = 0;//loop control variable
        while(x < 5)//pre-test loop
        {
            System.out.println("Hello world!");
            x++;
        }
        System.out.println(" ");

        //the do-while loop
        int y = 0;//loop control variable
        do{
            System.out.println("Hello world!");
            y++;
        }while(y < 5);//post-test loop
        System.out.println(" ");

        //the for loop
        int z;
        for(z = 0; z < 5; z++)//pre-test loop
        {
            System.out.println("Hello World!");
        }
    }
}
