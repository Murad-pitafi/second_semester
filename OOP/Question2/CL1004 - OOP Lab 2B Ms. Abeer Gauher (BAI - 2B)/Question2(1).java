/* K213064 Murad
OOP lab 1 Q2
 */
/* K213064 Murad
OOP lab 1 Q2
 */
package com.company;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args)
    {
    // A part
        double a, b, product;
        Scanner getdata = new Scanner(System.in);
        System.out.println("enter value of a  ");
        a = getdata.nextDouble();
        System.out.println("enter value of b");
        b = getdata.nextDouble();
        product = a * b;
        System.out.println("product of two inputs is " + product);
    // B part
        double base, height, areaOftraingle;
        System.out.println("enter the base ");
        base = getdata.nextDouble();
        System.out.println("enter the height");
        height = getdata.nextDouble();
        areaOftraingle = (height * base )/2;
        System.out.println("area of traingle is  " + areaOftraingle);
    }
}
