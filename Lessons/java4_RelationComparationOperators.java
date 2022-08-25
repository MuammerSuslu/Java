package Lessons;

public class java4_RelationComparationOperators
{
    public static void main(String[] args)
    {
        //RELATION/COMPARISION DPERATORS
        /*
            Description               Operator

             >                        Greater than
             >=                       Greater than or equal
             <                        Less than
             <=                       Less than or equal
             ==                       Equal
             !=                       Not Equal
       */
        System.out.println(6>3);// TRUE
        System.out.println(128>=128);// TRUE because they are equal
        System.out.println(400<476);// TRUE
        System.out.println(469<=469);// TRUE because they are equal
        System.out.println(30==60);// FALSE because they are not equal
        System.out.println(50!=60);// TRUE because they are not equal

        /*
        Task
Declare and initialize 2 numbers.
Program should display if the first nmber is greater than second number.
Output should be in the following format:
"First number number is greater than Second number - True/False"
         */

        int b; // declatrion
        b=5; // assigning a valuse, initialize
        int a = 3; // declaring and initializing


        System.out.println("First number is greater than second number  " + (b>=a));


        /*
             LOGICAL OPERATORS

             Operator      Description

             &&            Bitwise logical AND
             //            Bitwise logical inclusive OR
             ^             Bitwise logical Exclusive OR
        */

        //
        System.out.println(true&&true); // true
        System.out.println(true&&false); // false
        System.out.println(false&&true); // false
        System.out.println(false&&false); // false

        // || returns true if at least one of the condition is true
        System.out.println(true||true); // true
        System.out.println(true||false); // true
        System.out.println(false||true); // true
        System.out.println(false||false); // false

        // ^ if both conditions are the same it returns false
        System.out.println(true^true); // false
        System.out.println(true^false); // true
        System.out.println(false^true); // true
        System.out.println(false^false); // true

        System.out.println(!true); // false exclamation mark turns return to false vv.

        /*



        */
        System.out.println(!true); // false because the false exclamation mark
        int aa = 3, bb= 3, cc=7;
        int n1 = 4;
        int n2 = 8;
        int n3 = 9;
        boolean b1 = true, b2=false, b3=false;

        /*
        TASK
1. Create a double variable with the value 20
2. Create a second variable of type double with the value 80
3. Add both numbers uo and multiply by 25
4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
5. Print remaining total ($4) is equal to 20 or less : true/false
        */

    }
}
