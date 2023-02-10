package com.company;
import java.util.Scanner;
public class Question2 {
    static void opt(int a, int b, int c)
    {
        switch (c) {
            case 1 -> System.out.println("addition is " + a + b);
            case 2 -> System.out.println("substraction is " + (a - b));
            case 3 -> System.out.println("multiplication is " + a * b);
            case 4 -> System.out.println("divide  is " + a / b);
            default -> System.out.println("invalid input");
        }
    }
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);

        System.out.println("enter two numbers");
        int a = data.nextInt();
        int b = data.nextInt();
        System.out.println("1 addition ");
        System.out.println("2 substraction ");
        System.out.println("3 multiplication ");
        System.out.println("4 division ");
        int c = data.nextInt();
        opt(a, b, c);
    }
}
