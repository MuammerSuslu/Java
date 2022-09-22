package Lessons;

public class Java11_Loops09222022
{
    public static void main(String[] args)
    {
        // LOOP
        // loops allow you to execute commands as many time as you need.
        // there are three types of loops. for, while and do while.


        // FOR LOO{
        // start     condition \/increment
        for (int i =0 ; i<10 ; i++) // this is going to increase number 1 by 1 form 0 to 10
        {
//            System.out.println(i);
        }

        for (int i = 2 ; i<8 ; i+=3) // it increases 3 by 3 starts from 2 ends up at 8
        {
//            System.out.println(i);
        }

        for (int i = 0 ; i<=100 ; i++) // this will print 100 times hello world
        {
//            System.out.println("Hello World");
        }

        for (int i = 10 ; i>=0 ; i--) // this will count from 10 to 0 one by one
        {
//            System.out.println(i);
        }

        // task 1 print odd numbers until 1000
        // task 2 print even number from 10 to 40
        // task 3 print the number can be divided by 5 and/or 3. from 0 - to 100 use i++ in loop

        for (int i = 1 ; i <1000 ; i+=2)
        {
//            System.out.println(i);
        }

        for (int i = 10 ; i <= 40 ; i+=2)
        {
//            System.out.println(i);
        }

        for (int i = 0 ; i<100 ; i++)
        {
            if (i%3==0||i%5==0)
            {
//                System.out.println(i);
            }
        }

        // NESTED LOOP
        // is a loop within another loop

        for (int i = 0 ; i<10 ; i++)
        {
            for (int j = 0 ; j<10 ; j++)
            {
                System.out.println("when i="+i+" j="+j);
            }
        }

        for (int i = 0, j=6 ; i<100 && j<100 ; i++,j++)
        {
            System.out.println("i= "+i+", j="+j);
        }

        // infinitive loop
        // if you want something to run until forever
        for (int i = 0 ; 3<5 ; i++)
        {
            System.out.println("blue world"+ " iteration number "+i);
        }

















    }
}
