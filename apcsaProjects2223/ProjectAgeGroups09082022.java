package apcsaProjects2223;

import java.util.Scanner;

public class ProjectAgeGroups09082022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = scanner.nextInt();

        if (age<1)
        {
            System.out.println("You are an Infant");
        }
        else if (3<=age&&age<=5)
        {
            System.out.println("You are a Toddler");
        }
        else if (6<=age&&age<=9)
        {
            System.out.println("You are a Kid");
        }
        else if (10<=age&&age<=12)
        {
            System.out.println("You are a Pre-Teen");
        }
        else if (13<=age&&age<=17)
        {
            System.out.println("You are a Teenager");
        }
        else if (18<=age&&age<=20)
        {
            System.out.println("You are a Young Adult");
        }
        else if (21<=age&&age<=39)
        {
            System.out.println("You are a Adult");
        }
        else if (40<=age&&age<=49)
        {
            System.out.println("You are a Young Middle-Aged Adult");
        }
        else if (50<=age&&age<=54)
        {
            System.out.println("You are a Middle-Aged Adult ");
        }
        else if (55<=age&&age<=64)
        {
            System.out.println("You are a Very Young Senior Citizen");
        }
        else if (65<=age&&age<=74)
        {
            System.out.println("You are a Young Senior Citizen");
        }
        else if (75<=age&&age<=84)
        {
            System.out.println("You are a Senior Citizen");
        }
        else if (85<=age&&age<=120)
        {
            System.out.println("You are a Old Senior Citizen ");
        }
        else
        {
            System.out.println("invalid enter");
        }





















    }
}
