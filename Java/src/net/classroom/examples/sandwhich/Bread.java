package net.classroom.examples.sandwhich;

/**
 * Sample object for your benefit
 * @author Peter Geertsema
 */
public class Bread {
    //region Instance Variables
    /**
     * Type of bread
     */
    private String breadType;
    /**
     * Number of nutritional calories per slice
     */
    private int caloriesPerSlice;

    //endregion

    //region Constructor

    /**
     * Constructor for creating a brand new slice of bread
     * @param breadType Type of bread ex. Whole Wheat, White, Sourdough, etc
     * @param caloriesPerSlice Number of calories per slice
     */
    public Bread(String breadType, int caloriesPerSlice) {
        //the 'this' keyword refers to the BRAND NEW object being created
        //Setting the bread type defined in the Instance Variables region to the bread type parameter for this method
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;

        //oh yeah, and you can do anything else you want in here too
        System.out.println("Created a new slice of " + this.breadType + "bread!");
    }
    //endregion

    //region No-Arg Constructor
    public Bread() {
        //call the above constructor with the values below
        this("White", 20);
    }
    //endregion

    public static void main(String[] args) {
        //create a new bread object of type Rye and 50 calories per slice
        Bread ryeBread = new Bread("Rye", 50);

        //eat some delicous bread
        ryeBread.eat();
    }

    //note how there is no static keyword. This means it is associated with a Bread object
    /**
     * Delicous...
     */
    public void eat() {
        System.out.println("Yum, " + this.breadType + " bread");
    }

    //region Getters and Setters
    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public void setCaloriesPerSlice(int caloriesPerSlice) {
        this.caloriesPerSlice = caloriesPerSlice;
    }
    public String getBreadType() {
        return this.breadType;
    }
    //endregion
}
