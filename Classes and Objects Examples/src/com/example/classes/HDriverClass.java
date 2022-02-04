package com.example.classes;

public class HDriverClass
{
   public static void main(String[] args)
   {
       /*House house = new House();
        house.setNrOfDoors(10);
        System.out.println(house.getNrOfDoors());
        */
       House house = new House(10, 2, "Tiles", "Brick"); //This house variable hold the memory location of this House() object
       house.setNrOfDoors(3); // actual 2
       house.setTypeOfWall("Plaster"); // actual Brick

       System.out.println("House:");
       System.out.println("Nr of Windows: " + house.getNrOfWindows());
       System.out.println("Nr of Doors: " + house.getNrOfDoors());
       System.out.println("Type of roof: " + house.getTypeOfRoof());
       System.out.println("Type of wall: " + house.getTypeOfWall());
   }
}
