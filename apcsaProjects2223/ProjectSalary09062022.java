package apcsaProjects2223;

import java.util.Scanner;

public class ProjectSalary09062022
{
    public static void main(String[] args)
    {
        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        int yearOnJob = scanner.nextInt();

        if (salary>=30000)
        {
            if (yearOnJob>=2)
            {
                System.out.println("You qualify");
            }
            else
            {
                System.out.println("You must have been on job at least 2 years");
            }
        }
        else
        {
            System.out.println("you must earn at least $30,000");
        }












    }
}
