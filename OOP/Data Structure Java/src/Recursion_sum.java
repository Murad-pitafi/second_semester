class rec {
   int sum = 0;
    public int sum(int n)
    {
       sum = n % 10;
        if (n == 0)
        {
            return 0;
        }
        else
        {

            return sum + sum(n/10);
        }
    }
    public int mult(int a, int b)
    {
        if ( b == 0 )
        {
            return 0;
        }
        else
        {
            return a + mult(a, b-1);
        }
    }
}
public class Recursion_sum
{
        public static int sum(int a )
        {
            if (a > 0)
            {
                return a + sum(a -1);
            }
            else
            {
                return 0;
            }
        }
        static int n1=0, n2=1, n3=0;
        public static void fib(int count)
        {
            if (count > 0)
            {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.println(" " + n3);
                fib(count-1);
            }
        }
        static int sum = 0;
        public static int fict(int count)
        {

            if (count <= 1)
            {
                return 1;
            }
            else
            {
                return count * fict(count - 1);
            }
        }
        public static String reverse(String a)
        {
            if (a == null || a.isEmpty())
            {
                return null;
            }
            else
            {
                String rev = "";
                for (int i = a.length() - 1; i >= 0; i--)
                {
                    rev = rev + a.charAt(i);
                }
                return rev;
            }
        }
        public static void count(int c)
        {
            if ( c >= 0)
            {
                System.out.println(c);
                count(c-1);

            }

        }
    public static void main(String[] args) {

        rec s = new rec();
        int addition = s.sum(107);
        System.out.println(addition);
        int multt = s.mult(4, 5);
        System.out.println(multt);

            int c = sum(10);
        // System.out.println(c);
      //  fib(10);
       // String data = reverse("hello my name is this");
        //System.out.println(data);
        count(10);
        }
        
}
