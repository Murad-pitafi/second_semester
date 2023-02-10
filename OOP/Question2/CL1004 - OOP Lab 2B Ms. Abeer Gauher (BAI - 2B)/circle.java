package com.company;

import java.util.Scanner;

public class circle {
    double radius;
    public circle(double r)
    {
        this.radius = r;
    }
    public double area(double r)
    {
        return (3.14 * (Math.pow(r, 2)));
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter radius ");
        double r = data.nextDouble();
        circle obj = new circle(r);
        double area = obj.area(r);
        System.out.println("area is " + area);
    }

}
