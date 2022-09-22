package apcsaProjects2223;

import java.util.Scanner;

public class ProjectBrowser09202022
{
    public static void main(String[] args)
    {

//        write a program that can display the selected browser
//
//        1. declear a String variable called browserName
//
//        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
//
//        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name

        Scanner scanner = new Scanner(System.in);
        System.out.println("What browser are you using?");
        String browser = scanner.nextLine();

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("it is a valid browser");
        }
        else if(browser.equalsIgnoreCase("safari"))
        {
            System.out.println("it is a valid browser");
        }
        else if(browser.equalsIgnoreCase("fireFox"))
        {
            System.out.println("it is a valid browser");
        }
        else if(browser.equalsIgnoreCase("Opera"))
        {
            System.out.println("it is a valid browser");
        }
        else
        {
            System.out.println("not a valid browser");
        }





    }
}
