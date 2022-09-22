package Warmups;

import java.util.Scanner;

public class apcsaWarmUp09202022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your yearly salary");
        double yearlySalary = scanner.nextInt();

        double weeklyPay = yearlySalary/52;
        double dailyRate = weeklyPay/5;
        double hourlyRate = dailyRate/8;

        System.out.println("your hourly rate is $"+hourlyRate);

    }
}
