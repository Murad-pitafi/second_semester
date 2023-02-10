import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        try {
            File file = new File("integer.txt");
            if (file.createNewFile()) {
                System.out.println("file created");
            }
            ArrayList<Integer> list = new ArrayList<Integer>();
            Scanner sc = new Scanner(file);
            //int i = 0;
            while (sc.hasNextLine())
            {
                String x = sc.next();

                if(x == " ")
                {
                    continue;
                }
                else {
                    list.add(Integer.parseInt(x));
                }
              //  i++;
                System.out.println(list);
            }

            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}
