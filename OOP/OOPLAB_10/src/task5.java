import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        String user;
        Scanner sc = new Scanner(System.in);

            File file = new File("confidential.txt");
            //file.createNewFile();

            System.out.println("enter designation");
            user = sc.nextLine();


            if (user.equals("Faculty")) {
                file.setWritable(true);
                file.setReadable(true);
                file.setExecutable(true);
                System.out.println( " can write " + file.canWrite());
                System.out.println( " can read " + file.canRead());
                System.out.println( " can execute " + file.canExecute());
            } else if (user.equals("student")) {
                file.setWritable(false);
                file.setReadable(true);
                System.out.println("can read" + file.canRead());
            }


    }
}
