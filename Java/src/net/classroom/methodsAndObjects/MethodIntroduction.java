package net.classroom.methodsAndObjects;

public class MethodIntroduction {
    public static void main(String[] args) {
        //this calls the printHello method defined below
        printHello();

        //get the result of the iAmTrue method and use it
        boolean isTrue = iAmTrue();
        String result = processResult(isTrue);
        //pass result into the method you made below


        //you should familiarize yourself with methods. You will be using them ALL THE TIME
    }

    /**
     * This is called Javadoc. It allows you to write documentation about a method, variable, class, etc
     */
    public static void printHello() {
        System.out.println("Hello");
    }

    /**
     * @return {@code true}
     */
    private static boolean iAmTrue() {
        return true;
    }

    /**
     * Returns a string based on the given boolean
     */
    private static String processResult(boolean b) {
        if(b) {
            //this will do nothing, as the b variable here is separate from that being called
            b = false;
            return "It's true!!!";
            //code after a return statement will NEVER be run
        }
        else {
            return "It's false :(";
        }
    }

    //make a method that takes a String and prints it out. It shouldn't return anything

}
