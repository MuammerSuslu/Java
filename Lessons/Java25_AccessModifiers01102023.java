package Lessons;

public class Java25_AccessModifiers01102023
{
    /* ACCESS MODIFIERS     SAME CLASS     SAME PACKAE    SUB-CLASSES    EVERYWHERE ELSE
    public                      y               Y               Y                Y
    protected                   Y               Y               Y                N
    default                     Y               Y               N                N
    private                     Y               N               N                N

     */

    public String myPublicVariable="my Public Variable";
    protected String myProtectedVariable = "my Protected Variable";
    String myDefaultVariable = "my Default Variable";
    private String myPrivateVariable = "my Private Variable";
}



