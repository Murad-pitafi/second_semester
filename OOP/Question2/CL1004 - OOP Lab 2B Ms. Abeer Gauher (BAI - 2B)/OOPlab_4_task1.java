package com.company;

import java.util.Scanner;

class Box
{
    float height, width;
    Scanner data = new Scanner(System.in);

    Box(float height, float width)
    {
        System.out.println(" A) Parameterized Constructor called");
        this.height = height;
        this.width = width;
    }
    Box (float height)
    {
        System.out.println(" B) Constructor with one parameter and one user input called");
        this.height = height;
        System.out.println("enter width ");
        float width = data.nextFloat();

    }
    Box()
    {
        System.out.println("C) a constructor with no parameters and two input values called ");
        System.out.println("enter height ");
        float height = data.nextFloat();
        System.out.println("enter width");
        float width = data.nextFloat();

    }
}
public class OOPlab_4_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter height ");
        float height = sc.nextFloat();
        System.out.println("enter width");
        float width = sc.nextFloat();
        if (width > 0 && height > 0 )
        {
            Box obj2 = new Box(height, width);
        }
        else
        {
            System.out.println("height and width are less than zero\n obj is not created");
        }
        Box obj1 = new Box(height);
        Box obj = new Box();
    }
}
