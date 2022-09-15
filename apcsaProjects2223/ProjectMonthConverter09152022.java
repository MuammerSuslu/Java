package apcsaProjects2223;

import java.util.Scanner;

public class ProjectMonthConverter09152022
{
    public static void main(String[] args)
    {
        System.out.println("enter the number of the month from 1 to 12");
        Scanner scanner = new Scanner(System.in);
        while (true)
        int month = scanner.nextInt();

        if (month==1||month==3||month==5||month==7||month==9||month==10||month==12)
        {
            System.out.println("there is 31 days this month");
        }
        else if (month==4||month==6||month==9||month==11)
        {
            System.out.println("There is 30 days this month");
        }
        else if (month==2)
        {
            System.out.println("only month with 29 days");
        }
        if (month<1||month>12)
        {
            System.out.println("ERROR");
        }



    }
}
