import java.util.Scanner;

interface  Exam {
    public void Grade_cal();
}
abstract class Attendance{
    abstract void Att_cal();
}
class Student extends Attendance implements Exam
{
    private String rollNo;
    private String name;
    private String Class;
    float[] marks =new float[4];
    float sum=0, perc=0;
    String grade = null;
    int no_classes;
    float att_perc;
    public Student(String rollNo, String name, String aClass) {
        this.rollNo = rollNo;
        this.name = name;
        Class = aClass;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClass(String aClass) {
        Class = aClass;
    }

    public void Att_cal(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of classes");
        do {


            no_classes = sc.nextInt();
            att_perc = (no_classes / 45) * 100;
            if (att_perc < 70) {
                System.out.println("You are not eligble to set in exam");
            } else {
                System.out.println("You are eligible to set in exam");
            }
        }while (no_classes == 0 || no_classes < 0);
    }

    @Override
    public void Grade_cal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of 4 subjects ");
        for (int i = 0; i < marks.length; i++)
        {

            do {
                marks[i] = sc.nextFloat();
                sum += marks[i];
            }while (marks[i] < 101 && marks[i] <= 0);
        }
        perc = (sum/400)*100; // assuming every subject has 100 total marks
        if (perc >= 90 )
        {
            grade = "A+";
        }
        else if (perc >= 80 && perc < 90)
        {
            grade = "A";
        }
        else if (perc >= 70 && perc < 80)
        {
            grade = "B";
        }
        else if (perc >= 60 && perc < 70)
        {
            grade = "C";
        }
        else if (perc >= 50 && perc < 60)
        {
            grade = "D";
        }
        else
        {
            grade = "fail";
        }
    }
    public void details()
    {
        System.out.println("Name " + getName());
        System.out.println("Roll no " + getRollNo());
        System.out.println("Class " + getClass());
        System.out.println("Grade " + grade);
    }
}
public class K213064 {
    public static void main(String[] args) {
        Student s = new Student("21k3064","Murad", "AI"); // have intailly given the detail of student through constructor

        s.Grade_cal(); // implemented function to calculate the grading
        s.Att_cal(); // extended function from abstract class to calculate certain percentage
        s.details();
    }
}
