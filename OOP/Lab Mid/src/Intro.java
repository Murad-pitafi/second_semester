import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Scanner;

class abc
{
    String name;
    float marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
public class Intro {
    public static void main(String[] args) {
        /*
        ArrayList<String> sc = new ArrayList<String>();

        sc.add("hello");
        sc.add("hello3");
        sc.add( "helloe");
        sc.remove("hello");
        System.out.println(sc);
    */
        Scanner s = new Scanner(System.in);
        abc[] sc = new abc[3];
        for (int i = 0; i < sc.length; i++)
        {
            sc[i] = new abc();
            System.out.println("name ");
            sc[i].setName(s.next());
            System.out.println("marks");
            sc[i].setMarks(s.nextFloat());
        }
        for (int i = 0; i < sc.length; i++)
        {
            System.out.println("name " + sc[i].getName());

            System.out.println("marks" + sc[i].getMarks());

        }
    }

}
