package com.company;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = data.nextInt();
        if ( n > 0 && n < 10)
        {
            for ( int i = 0; i <= 10; i++)
            {
                System.out.println(i);
            }
        }
        else if ( n >= 10 && n < 20)
        {
            for ( int i = 10; i <= 20; i++)
            {
                System.out.println(i);
            }

        }
        else if ( n >= 20 && n < 30) {
            for (int i = 20; i <= 30; i++) {
                System.out.println(i);
            }
        }
            else {
            System.out.println("none of categories");
        }
        }
    }

