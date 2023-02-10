/* K213064 Murad
OOP lab 1 Q4
 */
package com.company;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args)
    {
        double a, b, c, disc;
        double x1,x2;
        Scanner getdata = new Scanner(System.in);
        System.out.println("enter the a ");
        a = getdata.nextDouble();
        System.out.println("enter the b ");
        b = getdata.nextDouble();
        System.out.println("enter the c ");
        c = getdata.nextDouble();
        disc = Math.pow(b, 2) - 4 * a * c;
        if ( disc > 0)
        {
                x1 = (-b + Math.sqrt(disc))/(2 * a);
                x2 = (-b - Math.sqrt(disc))/ (2 * a);
                System.out.println(" x1 = " + x1);
                System.out.println("x2 = " + x2);
        }
        else
        {
            System.out.println("Equation has not any real solution");
        }

    }

    }
