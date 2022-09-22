package apcsaProjects2223;

import java.util.Scanner;

public class ScannerPractice09202022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("are you employed yes/no");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equalsIgnoreCase("yes"))
        {
            System.out.println("what is your salary");
            double salary = scanner.nextDouble();

        }
        else if(yesOrNo.equalsIgnoreCase("no"))
        {
            System.out.println("full name "+name+""+lastName);
            System.out.println("employed status unemployed");
        }
        else
        {
            System.out.println("not a valid choice");
        }


    }
}
