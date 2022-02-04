package com.example.classes;

import java.security.spec.ECField;

public class StudExamDriver
{
    public static void main(String[] args)
    {
        Subject subject1 = new Subject("TPG10AB", "Technical Programming 1");
        Student student1 = new Student("John Norris",20190392);
        ExamPaper paper = new ExamPaper(student1, subject1, 100);

        // System.out.println(paper);
        //output:
        //Exam paper information:
        //Student information:
        //Student name: John Norris
        //Student number: 20190392
        //Subject information:
        //Subject code: TPG10AB
        //Subject name: Technical Programming 1
        //Marks: 100
        //...or

        System.out.println("Subject code: " + paper.getSubject().getSubjectCode());
        System.out.println("Student number: " + paper.getStudent().getStudentNumber());

    }
}
