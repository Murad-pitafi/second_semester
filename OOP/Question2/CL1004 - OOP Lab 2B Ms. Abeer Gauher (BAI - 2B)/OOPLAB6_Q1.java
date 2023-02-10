import java.util.jar.JarFile;

class course
{
    protected String courseName,classVanue,CourseCode;
    protected int creditHours;

     course(String courseName, String classVanue, String courseCode, int creditHours) {
        this.courseName = courseName;
        this.classVanue = classVanue;
        CourseCode = courseCode;
        this.creditHours = creditHours;
    }
    course(){};
}
class JavaCourse extends course
{
    String teacherName;
    JavaCourse()
    {
        super("OOP", "Lab9", "CS1004", 3);
        teacherName = "Ms Abeer Gauher";
    }
    public void display()
    {
        System.out.println("Course name " + courseName);
        System.out.println("class vanue " + classVanue);
        System.out.println("course code " + CourseCode);
        System.out.println("credit hours " + creditHours);
        System.out.println("teacher name " + teacherName);
    }
}
public class OOPLAB6_Q1 {
    public static void main(String[] args) {
        course obj = new course();
        JavaCourse obj1 = new JavaCourse();
        obj1.display();
    }
}
