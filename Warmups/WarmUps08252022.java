package Warmups;

public interface WarmUps08252022
{
    public static void main(String[] args)
    {
        int a = 65;
        //System.out.println(a + " minutes ");
        //System.out.println(a/60 + " hour "+ (a%60) + " minutes");
        int hours = a/60;
        int minutes = a%60;

        System.out.println(" a minutes equals "+ hours + " hours" + "and "+minutes + "minutes" );

    }
}
