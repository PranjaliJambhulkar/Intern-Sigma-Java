package com.example.classes;

public class Subject
{
    private String subjectCode;
    private String subjectName;

    public Subject(String subjectCode, String subjectName)
    {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public Subject(Subject subject)//copy constructor
    {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    public boolean equals(Subject object)
    {
        /*
        if(this.subjectName.equals(object.subjectName) && this.subjectCode.equals(object.subjectCode))
        {
            return true;
        }
        else
        {
            return false;
        }*/
        //..or
        return (this.subjectName.equals(object.subjectName) && this.subjectCode.equals(object.subjectCode));
    }

    public String getSubjectCode()
    {
        return subjectCode;
    }
    public void setSubjectCode(String subjectCode)
    {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName()
    {
        return subjectName;
    }
    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    //...output mai "com.example.classes.Subject@6d03e736" ye line ati hai to niche ka code likhna pdega
    @Override
    public String toString()
    {
        return "Subject information:\n" + "Subject code: " + subjectCode + "\n" + "Subject name: " +subjectName;
    }
}
