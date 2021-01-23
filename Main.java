package com.company;

public class Main {

    public static void main(String[] args) {
//        1. what is a class? what is it good for?
//          Class is a template for objects
//          When the individual objects are created, they inherit all the variables
//          and methods from the class.
//===================================================
//        2. what is an instance?
//          An instance of a class is an object - it's a concrete 'thing'
//          that you made using a specific class.
//          So, 'object' and 'instance' are the same thing,
//          but the word 'instance' indicates the relationship of an object to its class.
//===================================================
//        3. how do we create a new instance?
//        To create an instance of 'MyClass', specify the class name,
//        followed by the object name, and use the keyword new:
//        MyClass myInstance = new MyClass();
//===================================================
//        4. create a class called Circle
//        properties: double radius
//        function: void printSize
//   * etgar: print the actual size
//        now create 2 circles: one with radius of 5.4 and a second circle with radius 8.7
//        call printSize for each circle you created
        Circle smaller = new Circle();
        smaller.radius = 5.4;
        smaller.printSize();

        Circle bigger = new Circle();
        bigger.radius = 8.7;
        bigger.printSize();
//===================================================
//        5. create a class called Person
//                peoperties:
//        string id
//        int yearOfBirth
//        string address
//                function:
//        void sayHello
//        void printHowOldAmI()
//        void printAddress()
//                * etgar: print the actual data ...
//        now create a person for yourself and set the correct data, then call the functions
        Person mrsPavlova = new Person();
        mrsPavlova.id = "Marishka";
        mrsPavlova.yearOfBirth = 1989;
        mrsPavlova.address = "This City";

        mrsPavlova.sayHello();
        mrsPavlova.printHowOldAmI();
        mrsPavlova.printAddress();
    }
}
