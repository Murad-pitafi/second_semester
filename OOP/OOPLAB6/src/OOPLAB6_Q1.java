import java.util.*;
class course
{
    protected String courseName, classVanue, courseCode;
    protected int creditHours;
    course(String courseName,String classVanue,String courseCode, int creditHours)
    {
        this.classVanue = classVanue;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }
     course(){}
}
class JavaCourse extends course
{
    public String teacherName;
    JavaCourse()
    {
        super("OOP","Lab10","CS1004", 3);
        //super();
        teacherName = "Abeer Gauher";
    }
    public void display()
    {
        System.out.println("course name " + courseName);
        System.out.println("class vanue " + classVanue);
        System.out.println("course code " + courseCode);
        System.out.println("credit hours" + creditHours);
        System.out.println("Teacher name " + teacherName);
    }
}
public class OOPLAB6_Q1 {
    public static void main(String[] args) {
        course obj = new course();
        JavaCourse obj1 = new JavaCourse();
        obj1.display();

    }
}

