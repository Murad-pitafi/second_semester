import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> t = new ArrayList<String>();
        System.out.println("enter names");
        for (int i = 0; i < 5; i++)
        {
            t.add(i, sc.next());
        }
        Iterator <String> itr = t.iterator();
        try
        {
            //File f = new File("newfile.txt");
            //f.createNewFile();
            //if(f.createNewFile())

                FileWriter fw = new FileWriter("newfile.txt");
                while(itr.hasNext())
                {
                    fw.write("\n");
                    fw.write(itr.next());
                }
            fw.close();


        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
