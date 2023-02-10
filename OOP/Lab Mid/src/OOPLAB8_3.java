import java.util.Scanner;

abstract class MARKS
{
    abstract float getPercent();
    abstract float getmarks(float[] marks);
}
class studentA extends MARKS
{
    float total = 0;

    float getPercent()
    {
        float per = (total / 300) * 100;
        return per;
    }

    @Override
    float getmarks(float[] marks) {
        for (int i = 0; i < marks.length; i++)
        {
            total += marks[i];
        }
        return total;
    }
}
class studentB extends MARKS
{
    float total = 0;

    float getPercent()
    {
        float per1 = (total / 400) * 100;
        return per1;
    }

    @Override
    float getmarks(float[] marks) {
        for (int i = 0; i < marks.length; i++)
        {
            total += marks[i];
        }
        return total;
    }
}
public class OOPLAB8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student A enter marks for three subject");
        float[] marks = new float[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextFloat();
        }
        studentA obj = new studentA();
        studentB obj1 = new studentB();
        obj.getmarks(marks);
        System.out.println(" Student A per " + obj.getPercent());
        System.out.println("Student B enter marks for four subject");
        float[] mark = new float[4];
        for (int i = 0; i < 4; i++) {
            mark[i] = sc.nextFloat();
        }
        obj1.getmarks(marks);
        System.out.println(" Student B per " + obj1.getPercent());
    }
}
