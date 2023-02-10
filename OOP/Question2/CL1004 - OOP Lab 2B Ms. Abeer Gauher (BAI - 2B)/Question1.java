package com.company;
import java.util.Scanner;
public class Question1 {
    static double bmi(double a, double b)
    {
        double bmi =  (a / Math.pow(b,2));
        if (bmi < 18.5)
        {
            System.out.println("UNDERWEIGHT");

        }
        else if (bmi >= 18.5 || bmi < 24.9 )
        {
            System.out.println("NORMAL");

        }

        else if (bmi >= 25 || bmi < 29.9 )
        {
            System.out.println("OVERWEIGHT");

        }
        else if (bmi > 30 )
        {
            System.out.println("OBESE");

        }
        return bmi;
    }
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("****** BMI CALCULATOR******");
        System.out.println(" ENTER THE HEIGHT ");
        double height = data.nextDouble();
        System.out.println("enter the weight in kg");
        double weight = data.nextDouble();
        double bmi = bmi(height, weight);
        System.out.println(bmi);

    }
}
