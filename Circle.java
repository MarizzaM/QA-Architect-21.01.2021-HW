package com.company;

public class Circle {
    public double radius;

    public void printSize(){
        System.out.println(String.format("\nDiameter of Circle (r = %.1f) \n 2r = %.2f", radius, 2*radius ));
        System.out.println(String.format("Circumference (Perimeter) of Circle (r = %.1f)\n 2rπ = %.2f", radius, 2*radius*Math.PI));
        System.out.println(String.format("Area of Circle (r = %.1f)\n r^2*π = %.2f", radius, Math.pow(radius,2)*Math.PI));
    }
}
