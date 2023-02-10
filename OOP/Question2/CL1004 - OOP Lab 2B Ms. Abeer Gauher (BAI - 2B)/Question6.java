package com.company;

import java.util.Scanner;

public class Question6 {
    static int amount;
    static void deposite()
    {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the amount you want to deposite");
        int amount1 = data.nextInt();
        amount += amount1;
    }
    static void withdraw()
    {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the amount you want to withdraw ");
        int balanceout = data.nextInt();
        if (balanceout > amount)
        {
            System.out.println("sorry you don't have enough balance");
        }
        else {
            amount -= balanceout;
        }
    }
    static void account(String name)

    {
        System.out.println("name " + name);
        System.out.println("Account balance " + amount);

    }

    public static void main(String[] args) {
        Scanner getdata = new Scanner(System.in);
        System.out.println("enter name ");
        String name = getdata.nextLine();
        System.out.println("enter pin");
        int pin = getdata.nextInt();
        if (pin == 1234) {

            int opt;
            do {


                System.out.println("t/** WELCOME TO BANK OF PAKISTAN **");
                System.out.println("t/1. Deposite ");
                System.out.println("t/2. Withdraw ");
                System.out.println("t/3. Account Status ");
                System.out.println("4 exit");
                System.out.println("choose the option");
                opt = getdata.nextInt();
                switch (opt) {
                    case 1:
                        deposite();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        account(name);
                        break;
                    default:
                        System.out.println("wrong option selected");
                }
            } while (opt != 4);
        }
        else
                {
                    System.out.println("pin not correct");
                }



    }
}
