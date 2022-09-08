package apcsaProjects2223;

import java.util.Scanner;

public class projectGrade09062022
{
    public static void main(String[] args)
    {
//        System.out.println("tell me your grade");
//        Scanner scanner = new Scanner(System.in);
//        int grade = scanner.nextInt();
//
//        if (grade<60)
//        {
//            System.out.println("Fail");
//        }
//        if (grade >=60&&grade<90)
//        {
//            System.out.println("Pass");
//        }
//        if (grade>=90)
//        {
//            System.out.println("Passed with Distinction");
//        }



//        System.out.println("Give me 3 grades ");
//        Scanner scanner = new Scanner(System.in);
//        int grade1 = scanner.nextInt();
//        int grade2 = scanner.nextInt();
//        int grade3 = scanner.nextInt();
//
//        if ((grade1+grade2+grade3)/3 >=90)
//        {
//            System.out.println("your grade is an A"+(grade1+grade2+grade3)/3);
//        }
//        if (grade1+grade2+grade3/3 >=80 && grade1+grade2+grade3/3 <=89)
//        {
//            System.out.println("Your grade is an B"+(grade1+grade2+grade3)/3);
//        }
//        if (grade1+grade2+grade3/3 >=70 && grade1+grade2+grade3/3 <=79)
//        {
//            System.out.println("Your grade is an C"+(grade1+grade2+grade3)/3);
//        }
//        if (grade1+grade2+grade3/3 >=60 && grade1+grade2+grade3/3 <=69)
//        {
//            System.out.println("Your grade is an D"+(grade1+grade2+grade3)/3);
//        }
//        if (grade1+grade2+grade3/3 >=0 && grade1+grade2+grade3/3 <=59)
//        {
//            System.out.println("Your grade is an F "+(grade1+grade2+grade3/3));
//        }

        // THIS CODE DOES NOT WORK ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


        System.out.println("enter your 3 grades");
        Scanner scanner = new Scanner(System.in);
        double g1 = scanner.nextDouble();
        double g2 = scanner.nextDouble();
        double g3 = scanner.nextDouble();

        double avarage = (g1+g2+g3)/3;

        if (avarage >= 90 && avarage < 100)
        {
            System.out.println("A");
        }
        if (avarage >= 80 && avarage < 90)
        {
            System.out.println("B");
        }
        if (avarage >= 70 && avarage < 80)
        {
            System.out.println("C");
        }
        if (avarage >= 60 && avarage < 70)
        {
            System.out.println("D");
        }
        if (avarage < 60)
        {
            System.out.println("F");
        }












    }
}
