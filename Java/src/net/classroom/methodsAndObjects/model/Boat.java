package net.classroom.methodsAndObjects.model;

/**
 * Generic boat class used for the classroom
 * @author Peter Geertsema
 */
public class Boat {
    //this allows easy folding of the variables
    //region Variables
    /**
     * Constant for number of miles in a kilometer
     */
    private static final double MILES_IN_KILOMETER = 0.621371;
    //the final keyword prevents this from being changed
    //convention for finals is all caps, with underscores to separate spaces
    private static final double KILOMETERS_IN_MILE = 1.60934;

    //note that these variables are private. This means they are only accessible in the Boat class
    //This is considered good practice as you can hide the logic of how this works
    /**
     * Name of the boat
     */
    private String name;
    /**
     * Age of the boat, in years
     */
    private double age;
    /**
     * Max speed, stored in KPH but configurable via changeMeasurement
     */
    private double maxSpeed;
    /**
     * True if measured in MPH
     */
    private boolean isMPH = true;
    //endregion

    //the methods that make the object
    //region Constructors
    /**
     * Constructor for Boat
     * @param name Name of the boat
     * @param age Age of the boat in years
     * @param maxSpeed in KPH or MPH, depending on <code>isMPH</code>
     * @param isMPH true if MPH, false otherwise
     */
    public Boat(String name, double age, double maxSpeed, boolean isMPH) {
        //the 'this' keyword refers to the object being created
        //this objects name property is being set to the name parameter passed into this constructor
        this.name = name;
        this.age = age;
        if(isMPH) {
            this.maxSpeed = mphToKPH(maxSpeed);
        }
        else {
            this.maxSpeed = maxSpeed;
        }
    }

    /**
     * Defaults to KPH
     * @param name Name of the boat
     * @param age Age of the boat in years
     * @param maxSpeed in KPH
     */
    public Boat(String name, double age, double maxSpeed) {
        //call the constructor up top as KPH
        this(name, age, maxSpeed, false);
    }

    /**
     * No arg constructor.
     * <br/>
     * You don't want this boat, trust me
     */
    public Boat() {
        //call the above constructor
        this("Boaty Mc. Boatface", 15, 10);
    }

    //endregion

    //the methods that get and set the instance variables
    //region Getters and Setters
    /**
     * Changes from MPH to KPH and vice versa
     */
    public void changeMeasurement() {
        //! is the not operator, it turns true into false and false into true
        isMPH = !isMPH;
    }

    /**
     * @return Speed of the boat in MPH or KPH depending on the state
     */
    public double getMaxSpeed() {
        if(isMPH) {
            //need to convert if mph
            return kphToMPH(maxSpeed);
        }
        else {
            return maxSpeed;
        }
    }

    //Try making a setMaxSpeed method below. Remember to take MPH and KPH into account!


    /**
     * @return <code>true</code> if MPH, <code>false</code> if KPH
     */
    public boolean isMPH() {
        return isMPH;
    }
    /**
     * @return <code>true</code> if KPH, <code>false</code> if MPH
     */
    public boolean isKPH() {
        return !isMPH;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    //endregion

    //static methods used for conversions only.
    //region Static Methods
    /**
     * Converts KPH to MPH
     */
    private static double kphToMPH(double kph) {
        return kph * MILES_IN_KILOMETER;
    }

    /**
     * Converts MPH to KPH
     */
    private static double mphToKPH(double mph) {
        return mph * KILOMETERS_IN_MILE;
    }
    //endregion
}