package net.classroom.javaBasics;

public class Strings {
    public static void main(String[] args) {
        //This is a string - a sequence of characters like this comment!
        String string = "I am a";
        //Notice how the 'S' in String is capitalized. That is because it isn't a primitive type! It's an object!
        //We will learn more about this later...

        //You can add two strings together!
        String newString = string + " string!";
        //Now try printing out newString on the line below! (remember sout?)


        //Remember this string? Well it's back. I am going to use something fancy to split this up!
        String helloWorld = "Hello, World";
        //This takes the hello world string and creates a new string from splicing it.
        //It goes from string index 0 (inclusive) to index 5 (exclusive), including 5 letters total
        //It DOES NOT affect helloWorld whatsoever
        String hello = helloWorld.substring(0, 5);
        System.out.println(hello);

        //now try getting just "World" out of the string and printing it out


        //now experiment with using charAt and equals and printing the result to the console
    }
}
