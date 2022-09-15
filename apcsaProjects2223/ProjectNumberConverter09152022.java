package apcsaProjects2223;

import java.util.Scanner;

public class ProjectNumberConverter09152022
{
    public static void main(String[] args)
    {
        // Write a java program that can convert number between 0 - 9 to words,
        // if the number is grater than 9 or less than zero, out put should be "invalid"

        System.out.println("out of 1 to 9 give me a number ");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();

        if (Number==1)
        {
            System.out.println("Look outside looks good today");
        }
        if (Number==2)
        {
            System.out.println("Clouds");
        }
        if (Number==3)
        {
            System.out.println("number 3 is soo simple why pick this?");
        }
        if (Number==4)
        {
            System.out.println("Blank");
        }
        if (Number==5)
        {
            System.out.println("At least u didn't pick six");
        }
        if (Number==6)
        {
            System.out.println("Why pick six?");
        }
        if (Number==7)
        {
            System.out.println("You word is U a badddy");
        }
        if (Number==8)
        {
            System.out.println("Your word is Shawdy");
        }
        if (Number==9)
        {
            System.out.println("Your word is Bruh");
        }
        if (Number>9||Number<1)
        {
            System.out.println("ERROR");
        }











    }
}
