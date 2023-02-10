import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class showroom
{
    Scanner sc = new Scanner(System.in);
    public void add(ArrayList e )
    {
        System.out.println("enter car name");
        e.add(sc.nextLine());
    }
    public void remove(ArrayList e)
    {
        System.out.println("these cars are added, enter index to remove");
        System.out.println(e);
        int opt;
        opt = sc.nextInt();
        e.remove(opt);
    }
    public void search(ArrayList e)
    {
        int index =0;
        System.out.println("enter a car name to search");
        String car = sc.next();

        Iterator a = e.iterator();

        while (a.hasNext())
        {
            index++;
            String data = sc.next();
            if ( car == data)
            {
                System.out.println("True");
            }
        }
        System.out.println(" " + e.get(index));
    }
}
public class CarShowroom {

    public static void main(String[] args) {
        ArrayList <String> e = new ArrayList<String>();
        showroom s = new showroom();

        s.add(e);
        System.out.println("added");

        s.search(e);
        System.out.println("now removing");
        s.remove(e);
    }
}
