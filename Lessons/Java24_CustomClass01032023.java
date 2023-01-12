package Lessons;

public class Java24_CustomClass01032023
{
    // CUSTOM CLASS
    // you can create your own custom class in java with your own instance variabels and methods as well

    // INSTANCE VARIABLE
    // created outside of the methods but within of the class.
    // we mainly use staring datas into objects it beongs to the objects, proporities of the objects.
    // it is also called fieleds
    // locally created within the methods. not visible to the other methods. can be only used wthin the method.

    String studentName="Muammer"; // this is an instance variable
    int studentIDNumber =123456; // this is another instance variable
    String StudentTitle;
    long SSN;
    String Gender;
    double salary;

    // INSTANCE METHOD
    // methods that does not have static specifier but do have return type

    public void WhatDoesItDo()
    {
        System.out.println(studentName+ " learning apcsa"); // this is the example of instance method
    }
    public void GetInfo()
    {
        System.out.println("student Name is "+studentName+ " ID number is "+studentIDNumber);
    }

    // you can create a class within a class

    
}
