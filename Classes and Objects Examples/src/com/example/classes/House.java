package com.example.classes;

public class House
{
    private int nrOfWindows;
    private int nrOfDoors;
    private String typeOfRoof;
    private String typeOfWall;

    public House() //constructor
    {
        nrOfDoors =  0;
        nrOfWindows = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }

    public House(int nrOfWindows, int nrOfDoors, String typeOfRoof, String typeOfWall) // parameterized constructor or constructor overloading
    {
        this.nrOfDoors = nrOfDoors;
        this.nrOfWindows = nrOfWindows;
        this.typeOfWall = typeOfWall;
        this.typeOfRoof = typeOfRoof;
    }

    public int getNrOfWindows()
    {
        return nrOfWindows;
    }
    public int getNrOfDoors() //right click - generate - getter
    {
        return nrOfDoors;
    }
    public String getTypeOfRoof()
    {
        return typeOfRoof;
    }
    public String getTypeOfWall()
    {
        return typeOfWall;
    }


    public void setNrOfWindows(int nrOfWindows) //right click - generate - setter
    {
        this.nrOfWindows = nrOfWindows;
    }
    public void setNrOfDoors(int nrOfDoors)
    {

        this.nrOfDoors = nrOfDoors;
    }
    public void setTypeOfRoof(String typeOfRoof)
    {
        this.typeOfRoof = typeOfRoof;
    }
    public void setTypeOfWall(String typeOfWall)
    {

        this.typeOfWall = typeOfWall;
    }
}
