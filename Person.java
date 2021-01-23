package com.company;

import java.util.Calendar;

public class Person {
    public String id;
    public int yearOfBirth;
    public String address;

    public void sayHello(){
        System.out.println(String.format("\nHi, Mrs. %s", id));
    }

    void printHowOldAmI(){
        System.out.println(String.format("I am %d years old", Calendar.getInstance().get(Calendar.YEAR)-yearOfBirth));
    }

    void printAddress(){
        System.out.println(String.format("My adress is: %s", address));
    }
}
