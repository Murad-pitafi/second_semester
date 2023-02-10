class gen <T>
{
    T[] a;

    public void setA(T[] a) {
        this.a = a;
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}

public class practice6 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[6];
        for (int i = 0; i < 6; i++)
        {
            arr[i] = i;
        }
        gen<Integer> obj = new gen<Integer>();

        obj.setA(arr);
    }
}
