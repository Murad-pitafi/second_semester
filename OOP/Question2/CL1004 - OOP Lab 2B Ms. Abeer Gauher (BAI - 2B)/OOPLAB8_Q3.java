abstract class Marks
{
    abstract float getPercentage();
}
class student_A extends Marks
{
    float sum;
    student_A(int sub, int sub1, int sub2)
    {
        sum = sub + sub1 + sub2;
    }

    @Override
    float getPercentage() {
        return (sum/300)*100;
    }
}
class student_B extends Marks
{
    float sum;
    student_B(int sub, int sub1, int sub2, int sub3)
    {
        sum = sub + sub1 + sub2 + sub3;
    }

    @Override
    float getPercentage() {
        return (sum/400)*100;
    }
}
public class OOPLAB8_Q3 {
    public static void main(String[] args) {
        student_A obj = new student_A(78, 89, 91);
        student_B obj1 = new student_B(78, 89, 91, 94);
        System.out.println("Student A Percentage " + obj.getPercentage());
        System.out.println("Student A Percentage " + obj1.getPercentage());
    }
}
