import java.util.Scanner;

abstract class abd
{
    abstract void add(int a, int b);
    abstract void sub(int a ,int b);

}
class arthimetic extends abd
{
    @Override
    void add(int a, int b) {
        System.out.println("add " + (a+b));
    }

    @Override
    void sub(int a, int b) {
        System.out.println("sub " + (a - b));
    }
}
public class abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        arthimetic obj = new arthimetic();
        obj.add(a, b);
        obj.sub(a,b);
    }
}
