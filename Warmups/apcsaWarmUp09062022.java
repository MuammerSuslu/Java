package Warmups;

import java.util.Scanner;

public class apcsaWarmUp09062022
{
    public static void main(String[] args)
    {
        /*
        2. Write a Java Program for the following logic:
                § If marks < 60, then print “Fail”
                § If marks >= 60, but less than 90, then print “Pass”
                § If marks >= 90, then print “Passed with Distinction”
         */

        System.out.println("tell me your grade");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if (grade<60)
        {
            System.out.println("Fail");
        }
        if (grade >=60&&grade<90)
        {
            System.out.println("Pass");
        }
        if (grade>=90)
        {
            System.out.println("Passed with Distinction");
        }

















    }
}
