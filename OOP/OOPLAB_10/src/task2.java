import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        File f1 = new File("murad");
        try
        {
            Scanner sc = new Scanner(f1);
            while(sc.hasNext())
            {
                String s = sc.nextLine();
                System.out.println(s);
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }


}
