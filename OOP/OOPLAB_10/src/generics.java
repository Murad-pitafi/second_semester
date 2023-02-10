import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class generics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
a = sc.nextInt();
        File f = new File("this.txt");
        try {
           // File f = new File("newfile.txt");
            //f.createNewFile();
           FileWriter fw = new FileWriter("newfile.txt");


                fw.write(a);
              //fw.write( 6);

            fw.close();
            Scanner scan = new Scanner(f);
            while (scan.hasNext())
            {
                String l = scan.nextLine();
                System.out.println(l);
            }
        scan.close();
        } catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
