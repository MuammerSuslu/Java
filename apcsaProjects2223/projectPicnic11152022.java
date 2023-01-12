package apcsaProjects2223;

public class projectPicnic11152022
{
    public static boolean goToPicnic(boolean weekend, boolean weather)
    {
        if((weekend == true) && (weather == true))
            return true;
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(goToPicnic(true,true));
    }
}
