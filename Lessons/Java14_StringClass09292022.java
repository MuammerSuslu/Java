package Lessons;

public class Java14_StringClass09292022
{
    public static void main(String[] args)
    {
        // Declaration if a string
        // there are two ways to create a sting 1 with double quote 2nd with new keyword.
        String str1 = "Hello World";
        String str2 = new String("Hello World 2");

        // STRINGS ARE IMMUTABLE
        // when you create a string it means unmodifiable or unchangeable.

        // STRING POOL
        // String pool in jav corresponds to an allocation of memory in Java heap memory
        // it is collection of String objects,

        // Strings are represented with sequence of characters, (With index numbers)

        String str = "Muammer";
        System.out.println(str.indexOf("M"));
        System.out.println(str.indexOf("u"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("m"));
        System.out.println(str.lastIndexOf("m"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("r"));

        // STRING MANIPULATION METHODS
        // CHARAT str.charAt(indexNumber);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));

        // LENGTH this helps us to get the length of a string

        System.out.println(str.length());
        System.out.println("Muammer".length());

        // CONCATINATION this is going to merge two given strings
        System.out.println(str.concat(str2));
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // EQUALS cheecks if two string are the same or not returns boolean

        System.out.println("ali".equals("ali"));
        System.out.println("ali".equals("ali2"));
        System.out.println("ali".equals("AlI"));
        System.out.println("ali".equalsIgnoreCase("ALI"));

        // CONTAINS check if string contains the string

        System.out.println("Alexander".contains("Alex"));
        System.out.println("Alexander".contains("alex")); // it is case sensitive so it returns false

        // STARTS WITH it checks if the string starts with a string

        System.out.println("Alex".startsWith("A")); // return true
        System.out.println("Alex".startsWith("Al")); // return true
        System.out.println("Alex".startsWith("Ale")); // return true

        // ENDS WITH it checks if the string ends with a string

        System.out.println("Christian".endsWith("n")); // true
        System.out.println("Christian".endsWith("an")); // true
        System.out.println("Christian".endsWith("ian")); // true
        System.out.println("Christian".endsWith("christian")); // true

        System.out.println("Mustafa".compareTo("Muammer"));














    }
}
