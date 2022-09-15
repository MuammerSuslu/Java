package Warmups;

import java.util.Scanner;

public class WarmUp09152022
{
    public static void main(String[] args)
    {
        //  write a program that can display the days based on the numbers 1 ~ 7
        //                       MUST USE NESTED IF
        //

        System.out.println("What in 1-7 days is it?");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day==1)
        {
            System.out.println("Today is Monday");
        }
        if (day==2)
        {
            System.out.println("Today is Tuesday");
        }
        if (day==3)
        {
            System.out.println("Today is Wednesday");
        }
        if (day==4)
        {
            System.out.println("Today is Thursday");
        }
        if (day==5)
        {
            System.out.println("Today is Friday");
        }
        if (day==6)
        {
            System.out.println("Today is Saturday");
        }
        if (day==7)
        {
            System.out.println("Today is Sunday");
        }
        if (day>7||day<1)
        {
            System.out.println("ERROR");
        }
















    }
}
