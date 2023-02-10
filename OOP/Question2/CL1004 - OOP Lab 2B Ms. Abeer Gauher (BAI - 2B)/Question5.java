package com.company;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grade ");
        char grade = sc.next().charAt(0);
        System.out.println("enter the no of assignments failed");
        int no = sc.nextInt();
        switch (grade)
        {
            case 'A':
            case 'a':
                if ( no <= 3) {
                    System.out.println("you will get grace marks");
                }
                else {
                    System.out.println("you don't get grace marks");
                }
             break;
            case 'b':
            case 'B':
                if ( no <= 3)
                {
                    System.out.println("you will get grace marks");
                }
                else
                {
                    System.out.println("you don't get grace marks");
                }
                break;
            case 'c':
            case 'C':
                if ( no <= 3)
                {
                    System.out.println("you will get grace marks");
                }
                else
                {
                    System.out.println("you don't get grace marks");
                }
                break;

            default:
                System.out.println("does not exist");
        }
    }
}
