package apcsaProjects2223;

import java.util.Scanner;

public class projectShippingInfo09202022
{
    public static void main(String[] args)
    {
//        write a program for the shipping info that, the program should ask:
//    building number
//        Street address (Assume it has more than one word)
//        city name
//        state name
//        zip code
//        full name of the person:
//
//    and prints the ship to info in the following format:
//        ex output:
//        Ship To:  Jimmy joe
//        7925 Jones Branch Dr
//        MCLean, VA 22102
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();
        System.out.println("Enter your street address");
        String address = scanner.nextLine();
        System.out.println("Enter your city name");
        String city = scanner.nextLine();
        System.out.println("Enter your state abbreviation");
        String state = scanner.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = scanner.nextInt();
        System.out.println("Ship to:   "+fullName);
        System.out.println("                  "+address);
        System.out.println("                  "+city+", "+state+" "+zipCode);
    }
}
