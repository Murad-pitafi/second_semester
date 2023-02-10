import java.util.ArrayList;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("how many words you want to enter ");
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println(list);
        System.out.println("enter number of length");
        int l = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= l)
            {
                list.remove(i);
            }

        }

        System.out.println(list);
    }
}
