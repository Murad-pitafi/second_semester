import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class practice_2 {
    public static void main(String[] args) {
        double a = 0;
        File f = new File("test.txt");
        ArrayList<Double> list = new ArrayList<Double>();
        try {

            System.out.println("enter numbers 3");

            Scanner sc = new Scanner(f);
            int i = 0;

            while (sc.hasNext()) {
                String x = sc.next();
                if (x == " ") {
                    continue;
                } else {
                    list.add(Double.parseDouble(x));
                }
                a = (a + list.get(i)) / 3;

//
                i++;


            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        try {


            FileWriter fw = new FileWriter(f, true);
            PrintWriter w = new PrintWriter(fw);
            for (int i = 0; i < 6; i++) {

                w.println(Math.pow(list.get(i)-a,2));

            }
            w.close();
        }catch (IOException e)
        {

        }
    }
}
