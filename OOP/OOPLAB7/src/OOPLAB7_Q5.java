import java.util.Scanner;

class Adder
{
   static Scanner sc = new Scanner(System.in);
    static int sum,sum1;
    public static void add(int a, int b)
    {
        sum1 = a+b;
    }
    public static void add( int n)
    {
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("num ", i+1);
            a[i] = sc.nextInt();
            sum += a[i];
        }
    }
    public void display()
    {
        System.out.println(" sum of two integers " + sum1);
        System.out.println(" sum of arrays " + sum);
    }
}
public class OOPLAB7_Q5 {
    public static void main(String[] args) {
        Adder obj = new Adder();
        Adder.add(3,5);
        Adder.add(3);
        obj.display();
    }
}
