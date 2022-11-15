package apcsaProjects2223;

import java.util.Scanner;

public class ProjectCheckWords09302022
{
    public static void main(String[] args)
    {
//        1. Write a program CheckWords:
//        Program accepts 3 words and :
//        - if they are same length:      print "All words are same length"
//            - if some same length and others not:    print "Not Same nor Different lengths"
//            - if all different length :  print "All different length"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 3 word");
        String wrd1 = scanner.nextLine();
        String wrd2 = scanner.nextLine();
        String wrd3 = scanner.nextLine();

        int a = wrd1.length();
        int b = wrd2.length();
        int c = wrd3.length();



        if (wrd1.length() == wrd2.length() && wrd2.length() == wrd3.length())
        {
            System.out.println("they have the same length");
        }
        else if (wrd1.length() != wrd2.length() && wrd2.length() != wrd3.length()&&wrd1.length() != wrd3.length())
        {
            System.out.println("they are all different ");
        }
        else
        {
            System.out.println("2 of them same");
        }














    }
}
