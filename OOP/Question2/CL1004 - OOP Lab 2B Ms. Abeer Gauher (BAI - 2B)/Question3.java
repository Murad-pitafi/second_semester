package com.company;

import java.util.Scanner;

public class Question3 {
    static void max(int a, int b, int c)
    {
        if (a > b && a > c) {
            System.out.println(a + "is largest");
        }
         else if (b > a && b > c) {
                System.out.println(b + "is largest");
            } else if (c > b && c > a) {
                System.out.println(c + "is largest");
            } else {
                System.out.println("all are equal");
            }

        }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter three numbers to find largest");
        int a,b,c;
        a = data.nextInt();
        b = data.nextInt();
        c = data.nextInt();
        max(a,b,c);
    }
}
