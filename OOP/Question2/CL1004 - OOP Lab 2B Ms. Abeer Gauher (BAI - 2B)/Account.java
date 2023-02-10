package com.company;

import java.util.Scanner;

public class Account {
    String Account_title;
    int balance;
    int acc_number;
    public int withdraw(int w)
    {
        balance -= w;
        return balance;
    }
    public int deposite(int d)
    {
        balance += d;
        return  balance;
    }

    public static void main(String[] args) {
        Scanner getdata = new Scanner(System.in);
        Account obj = new Account();
        int opt;
        int m;
        do {


            System.out.println("1. Withdraw");
            System.out.println("2. Deposite");
            System.out.println("3. Account ");
            System.out.println("4. exit");
            opt = getdata.nextInt();
            switch (opt)

            {
                case 1:
                 if ( obj.balance <= 0)
                 {
                     System.out.println("sorry you can't withdraw");

                 }
                 else {
                     System.out.println("enter amount to withdraw");
                     m = getdata.nextInt();
                     obj.balance = obj.withdraw(m);
                 }
                 break;
                case 2:
                    System.out.println("enter the money you want to deposite");
                    m = getdata.nextInt();
                    obj.balance = obj.deposite(m);
                    break;
                case 3:
                    obj.Account_title = "xyz";
                    obj.acc_number = 345423;
                    System.out.println("ACCOUNT");
                    System.out.println(" account title " + obj.Account_title);
                    System.out.println(" account number " + obj.acc_number);
                    System.out.println("balance " + obj.balance);
            }
        }while(opt != 4);

    }

}
