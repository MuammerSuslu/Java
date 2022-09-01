package Warmups;

public class apcsaWarmUp08302022
{
    public static void main(String[] args)
    {
//         Task
//
//        1. Create a double variable with the value 20
//        2. Create a second variable of type double with the value 80
//        3. Add both numbers up and multiply by 25
//        4. Use the remainder operator to figure out the remainder from the sum of #3 divided
//        by 40
//        5. Print remaining total (#4) is equal to 20 or less : true/false

        double d = 20, e = 80;
        System.out.println(25*(20+80));
        System.out.println((25*(20+80))%40);
        System.out.println((25*(20+80))%40==20);
    }
}
