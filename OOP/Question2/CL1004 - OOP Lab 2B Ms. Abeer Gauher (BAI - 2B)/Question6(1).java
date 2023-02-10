/* K213064 Murad
OOP lab 1 Q6
 */

package com.company;
import java.util.Scanner;
public class Question6 {
    // declared and defined three methods for finding diameter, circumference and area of circle
    static float diameter(float r)
    {
        return 2*r;
    }
    static float circumference(float r, float pi)
    {
        return 2 * pi * r;
    }
    static float area(float r, float pi)

    {
        return pi * (r * r);
    }

    public static void main(String[] args)
    {
        float pi = 3.14159f; // const value for pi
        float r; // r variable for getting users value
        Scanner getdata = new Scanner(System.in);
        System.out.println("Finding area, circumference and diameter of circle");
        System.out.println("enter the value of radius");
        r = getdata.nextFloat();
        // calling all the methods for results
        float area = area(r, pi);
        float diameter = diameter(r);
        float circumference = circumference(r, pi);
        System.out.println(" Area = " + area);
        System.out.println(" diameter = " + diameter);
        System.out.println(" circumference = " + circumference);
    }
}
