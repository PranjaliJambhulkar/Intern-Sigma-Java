package com.example.decision;

import javax.swing.*;
import java.util.Scanner;

public class TheSwitchStatement
{
    public static void main(String[] args)
    {
        int number;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 1, 2, or 3: ");
        number = sc.nextInt();*/
        String input = JOptionPane.showInputDialog("Please enter 1, 2 or 3: ");
        number = Integer.parseInt(input);

        switch (number){
            case 1: JOptionPane.showMessageDialog(null,"You entered 1");
                break;

            case 2: JOptionPane.showMessageDialog(null,"You entered 2");
                break;

            case 3: JOptionPane.showMessageDialog(null,"You entered 3");
                break;

            default: JOptionPane.showMessageDialog(null,"You did not enter 1, 2 or 3!");
        }

        char letter;
        input = JOptionPane.showInputDialog("Please enter a, b or c");
        letter = input.charAt(0);
        switch(letter){
            case 'A':
            case 'a': JOptionPane.showMessageDialog(null,"You entered a!");
                break;

            case 'B':
            case 'b': JOptionPane.showMessageDialog(null,"You entered b!");
                break;

            case 'C':
            case 'c': JOptionPane.showMessageDialog(null,"You entered c!");
                break;

            default: JOptionPane.showMessageDialog(null,"You did not enter a correct value!");
        }
       /*if(number == 1){
           JOptionPane.showMessageDialog(null,"You entered 1");
       }
       else if(number == 2){
           JOptionPane.showMessageDialog(null,"You entered 2");
       }
       else if(number == 3){
           JOptionPane.showMessageDialog(null,"You entered 3");
       }
       else{
           JOptionPane.showMessageDialog(null,"You did not enter 1, 2 or 3!");
       }*/
        System.exit(0);
    }
}
