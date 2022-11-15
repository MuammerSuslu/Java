package Warmups;

import java.util.Scanner;

public class apcsaWarmUp09302022
{
    public static void main(String[] args)
    {
        // Ask user to enter two words. Print first word without its first character then print the second

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first word");
        String wrd1 = scanner.nextLine();
        System.out.println("Enter your second word");
        String wrd2 = scanner.nextLine();
        int wrd1Length = wrd1.length();
        int wrd2length = wrd2.length();
        System.out.println(wrd1.substring(1,wrd1Length)+wrd2.substring(1,wrd2length));























    }
}
