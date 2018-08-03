package net.classroom.javaBasics;

//importing the library that allows console input. IntelliJ will do this for you

import java.util.Scanner;

/**
 * Introduction to getting input from the console
 *
 * @author Peter Geertsema
 */
public class ConsoleInput {
    public static void main(String[] args) {
        //create a new Scanner called reader that reads from the console
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name?");
        //wait for the user to type into the console and grab that line
        String name = reader.nextLine();

        System.out.println("Hello, " + name);

        //get the next integer the user types in
        int in = reader.nextInt();

        //do something with the int you just retrieved, and use it with the reader.nextBoolean()
    }
}
