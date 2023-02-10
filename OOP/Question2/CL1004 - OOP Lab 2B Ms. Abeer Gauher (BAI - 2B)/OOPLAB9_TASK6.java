import java.util.Scanner;

public class OOPLAB9_TASK6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a, b;

            a = sc.nextInt();
            b = sc.nextInt();
            int d = a / b;
            System.out.println(d);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
          finally {
            System.out.println("this part of code always executed");
        }
    }
}