package net.classroom.methodsAndObjects;

//import the Boat class from the model package
import net.classroom.methodsAndObjects.model.Boat;

public class ObjectIntroduction {
    public static void main(String[] args) {
        //create a new boat
        Boat myBoat = new Boat("Old Betsy", 27.5, 35, true);
        //print out the boat
        System.out.println(boatToString(myBoat));


        //see how that works? probably not...
        //Take a look at the boat class in the model package as you read the wiki page

        //now try making a setMaxSpeed method where it tells you too in Boat.java!

        //once you've done that, make a method in this class (below boatToString()) that prints the boatToString in KPH
        //HINT: YOU DON'T NEED TO DO ANYTHING WITH STRINGS, THE METHOD BODY CAN BE TWO LINES!!!
    }

    private static String boatToString(Boat boat) {
        String out = "Name: " + boat.getName();
        out += ", Age: " + boat.getAge() + " years";
        //                                           If boat.isMPH() is true, it is MPH, otherwise KPH
        out += ", Max Speed: " + Math.round(boat.getMaxSpeed()) + (boat.isMPH() ? " MPH" : " KPH");
        return out;
    }

    //make your method below!


}
