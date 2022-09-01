package Lessons;

import java.util.Scanner;

public class Java5_ScannerClass
{
    public static void main(String[] args)
    {
        /* SCANNER CLASS
        scanner class is being used to get input from the user.
        but we need to impor java.util.Scanner

        DECLERATION
        Scanner scanner = new Scanner(System.in);
        when you are asking user input use appropriate data type
        string name = scanner.nextLine();
        int age = scanner.nextInt();
        double price = scanner.nextDouble();
        boolean trueOrFalse = scanner.nextBoolean();

        String lastName = scanner.next();


         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = scanner.nextLine();
        System.out.println("nice to meet you "+name);
        System.out.println("what is your name");
        String name2 = scanner.nextLine();
        System.out.println("your name is "+name2);

        System.out.println("your name is "+name2);




//        System.out.println("what is your age ");
//        int age = scanner.nextInt();
//        System.out.println("your age is "+age+ " nice I am 15 years old.");
//        double price = scanner.nextDouble();
//        boolean trueOrFalse = scanner.nextBoolean();


        // TASK
        /*
        ask the following questions to the user and print everything at once
        name last name age student id number school nme
         */

//        Scanner scanner = name Scanner(System.in);
//        System.out.println("what is your name");
//        String name - scanner.nextLine();
//        System.out.println("what is your age");



    }
}
