/* K213064 Murad
OOP lab 1 Q5
 */
package com.company;
import java.util.Scanner;
public class Question5 {
    // created methods for sum , average and product to make the code simple
    static int sum(int x, int y, int z)
    {
        return x + y + z;
    }
    static int product( int x , int y, int z)
    {
        return x * y * z;
    }
    static int average(int total, int n)
    {
        return (total/n);
    }
    public static void main(String[] args)
    {
        Scanner getdata = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter three numbers");
        System.out.print("enter a ");
        a = getdata.nextInt();
        System.out.print("enter b ");
        b = getdata.nextInt();
        System.out.print("enter c ");
        c = getdata.nextInt();
        int total = sum(a, b, c);
        int product = product(a, b,c);
        float average = average(total,3);
        System.out.println(" Sum is " + total);
        System.out.println("product is " + product);
        System.out.println("average " + average);
    }
}
