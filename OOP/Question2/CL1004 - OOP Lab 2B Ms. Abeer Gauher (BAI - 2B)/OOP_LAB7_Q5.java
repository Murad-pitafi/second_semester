import java.util.Scanner;

class Adder
{
    static int sum, sum1;
    public static void add(int a, int b)
    {
        sum = a+ b;;
    }
    public static void add(int[] a)
    {
        for (int i: a)
        {
            sum1 += i;
        }
    }
    public void display()
    {
        System.out.println(" sum of two integer " + sum);
        System.out.println(" sum of integer array " + sum1);
    }
}
public class OOP_LAB7_Q5 {
    public static void main(String[] args) {
        int n;
        int[] num;
        System.out.println(" enter how many no you want to add");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = new int[n];
        for (int i = 0; i < num.length; i++)
        {
            System.out.printf("num%d ", i+1);
            num[i] = sc.nextInt();
        }
        Adder obj = new Adder();
        Adder.add(5,5);
        Adder.add(num);
        obj.display();

    }
}
