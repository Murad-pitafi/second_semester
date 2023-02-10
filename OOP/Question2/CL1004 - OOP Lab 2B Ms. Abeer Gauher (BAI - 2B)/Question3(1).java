/* K213064 Murad
OOP lab 1 Q3
 */
/* K213064 Murad
OOP lab 1 Q3
 */
package com.company;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args)
    {
        int x, y;
        int opt;
        Scanner getdata = new Scanner(System.in);
        System.out.println("enter x ");
        x = getdata.nextInt();
        System.out.println("enter y ");
        y = getdata.nextInt();
        System.out.println("enter the operator you want");
        System.out.println("1 add\n 2 sub\n 3 div\n 4 mul");
        opt = getdata.nextInt();
        switch (opt) {
            case 1 -> System.out.println("addition is " + (x + y));
            case 2 -> System.out.println("subtraction is " + (x - y));
            case 3 -> System.out.println("division is " + (x/y));
            case 4 -> System.out.println("multiplication is "  + (x * y) );
            default -> System.out.println("invalid input");
        }
    }
}
