package com.compare.strings;

import javax.swing.*;

public class CompareStrings
{
    public static void main(String[] args)
    {
        String name1 = JOptionPane.showInputDialog("Please enter the first name: ");
        String name2 = JOptionPane.showInputDialog("Please enter the second name: ");

        if(name1.compareTo(name2)==0) //if(name1.equals(name2))
        {
            System.out.println("name1 is equal to name2");
        }
        if(name1.compareTo(name2)<0){
            System.out.println("name1 is first and name2 is second");
        }
        if(name1.compareTo(name2)>0){
            System.out.println("name2 is first and name1 is second");
        }
        /*else{
            System.out.println("Not the Same");
        }*/
        System.exit(0);
    }
}
