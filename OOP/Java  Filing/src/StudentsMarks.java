import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class markSheet
{
    String name;
    float marks;
    markSheet()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
public class StudentsMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        markSheet[] obj = new markSheet[3];
        System.out.println("enter name of students and their marks");
        for (int i = 0; i < obj.length; i++)
        {
            obj[i] = new markSheet();
            System.out.printf("student%d: ", i);
            obj[i].setName(sc.next());
            System.out.printf("marks: ");
            obj[i].setMarks(sc.nextFloat());
        }
        try {
/*            File mark = new File("marksheet.txt");
            if (mark.createNewFile()) {
                System.out.println("file has been created");
            }
            else
            {
                System.out.println(" file not created ");
            } */
            FileWriter mywrite = new FileWriter("marksheet.txt");
            for (int i = 0; i < obj.length; i++) {
                mywrite.write(obj[i].getName() + obj[i].getMarks() + "\n");
            }
            mywrite.close();
        } catch (IOException e)
        {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
}
