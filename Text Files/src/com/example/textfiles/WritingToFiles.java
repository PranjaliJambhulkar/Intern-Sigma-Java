package com.example.textfiles;

import java.io.PrintWriter;
import java.io.IOException;
public class WritingToFiles
{
    public static void main(String[] args) throws IOException
    {
        //create the file and open the file
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");
        PrintWriter outputFil = new PrintWriter("OutputFile1.txt");
        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        outputFile.close();
    }
}
