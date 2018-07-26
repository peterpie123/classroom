package net.classroom.javaBasics;

/**
 * Introduction to variables
 * <br/>
 * @author Peter Geertsema
 */
public class PrimitiveVariables {
    public static void main(String[] args) {
        //can be true or false
        boolean hey = true;
        //this line sets hey to false - pretty easy right!
        hey = false;

        //character, denoted by a single quote (')
        char c = '!';
        c = 'g';
        c = 'J';

        //number, ranges from -2,147,483,648 to 2,147,483,647 It is a 32 bit signed integer
        int integer = 17;
        //this increments integer by 1
        integer++;
        //this decrements it by 1
        integer--;
        //now integer is back at 17! (yeah, not factorial)

        //number, ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854 It is a 64 bit signed integer
        long longNumber = 8192;
        //oh yeah, you can do other stuff too
        longNumber = longNumber + (20 * 2) - (320 / 8);

        //number, ranges from -128 to 127 It is a 8 bit signed integer
        byte b = 2;
        //this adds the number after the operator to the variable
        b += 8;
        //now b is 10

        //number, ranges from -32,768 to 32,767 It is a 16 bit signed integer
        short s = 19;
        //this is the remainder of a mathematical division (better known as the mod operator)
        int remainder = s % 4;
        //remainder is 3

        //floating point number, it is a decimal for more precision
        //(actually it isn't very precise, so division may be a little wonky with high numbers)
        double precision = 3.14159;
        precision /= precision;
        //precision is now roughly 1, try printing it out!

        //print out longNumber
        System.out.println(longNumber);

        //now try fiddling with some of the mathematical operators and printing their results below
        //you can see the simple operators at

    }
}
