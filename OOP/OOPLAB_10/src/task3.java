public class task3 {
     static <T> void gen(T t1, T t2)
    {
        ;
        T temp = t1;
        t1 = t2;
        t2 = temp;
        System.out.println(" exchanged \n var 1 : " + t1 + " Var 2 :" + t2 );
    }

    public static void main(String[] args) {
        task3.gen(4, "hello");
    }
}
