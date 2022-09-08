package Warmups;

import java.util.Scanner;

public class apcsaWarmUp09012022
{
    public static void main(String[] args)
    {
//        3. write a java program that accepts three numbers and return the minimum number
//        (assume that none of them are equal)
//
//        4. write a java program that accepts three numbers and rteurn the mediam number
//            (assume that none of them are equal)


        System.out.println("Enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("the minimum number of 3 entery is "+Math.min(Math.min(a,b),Math.min(b,c)));
        System.out.println("the maximum number of 3 entery is "+Math.max(Math.max(a,b),Math.max(b,c)));
        //
        if(Math.min(Math.min(a,b),Math.min(a,c))==a)
        {
            if (Math.max(Math.max(a,b),Math.max(a,c))==b)
            {
                System.out.println("mid nmber is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(a,c))==c)
        {
            if (Math.max(Math.max(a,b),Math.max(a,c))==a)
            {
                System.out.println("mid nmber is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(a,c))==b)
        {
            if (Math.max(Math.max(a,b),Math.max(a,c))==c)
            {
                System.out.println("mid nmber is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(a,c))==b)
        {
            if (Math.max(Math.max(a,b),Math.max(a,c))==a)
            {
                System.out.println("mid nmber is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(a,c))==c)
        {
            if (Math.max(Math.max(a,b),Math.max(a,c))==a)
            {
                System.out.println("mid nmber is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(a,c))==c)
        {
            if (Math.max(Math.max(a,b),Math.max(a,c))==b)
            {
                System.out.println("mid nmber is "+c);
            }
        }
    }
}
