package net.classroom.javaBasics;

/**
 * Basic conditional and iterative structures
 * @author Peter Geertsema
 */
public class BasicStructures {
    public static void main(String[] args) {
        //this makes declaring variables even easier!
        int one = 1, two = 2;
        //this checks if two variables are equal
        if(one == two) {
            //this will never work in its current setup. Try to get this one to run instead
            System.out.println("if statement 1 just ran!");
        }
        //else runs when an if fails. They can be chained with if statements
        else if(one + 1 == two) {
            System.out.println("if statement 2 just ran!");
        }
        //if all else fails...
        else {
            System.out.println("Nothing is true :(");
        }

        //this will run while the statement inside the parentheses evaluates to true
        while(one < 10) {
            System.out.println("while loop: " + one);
            one++;
        }

        int start = 0, end = 10;
        String hello = "Hello, World";
        //the single greatest thing of all time - the for loop
        for(int i = start; i < end; i++) {
            //this loop will count from the start (0) up to, but not including the end (10) and print out below
            System.out.println(hello.charAt(i));
            //What do you think this will print?
        }

        //try fiddling with these structures to get a different output
    }
}
