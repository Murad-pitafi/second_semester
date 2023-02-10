import java.util.Scanner;

class person
{
    String name, nationality, address, cnic;
    int age;
    person()
    {
        System.out.println(" i am person ");
    }
    Scanner sc = new Scanner(System.in);
    public void inputDetailsP()
    {
        System.out.println("enter the details ");
        System.out.println("enter the cnic that must contain 13 digits");
        cnic = sc.nextLine();
        while ( cnic.length() != 13)
        {
            if (cnic.length() != 13)
            {
                System.out.println("you have entered invalid cnic please enter valid");
                cnic = sc.nextLine();
            }
        }
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("nationality: ");
        nationality = sc.nextLine();
        System.out.println("address: ");
        address = sc.nextLine();
        System.out.println("enter age ");
        age = sc.nextInt();
    }
    public void displayP() {
        System.out.println(" name : " + name);
        System.out.println("nationality: " + nationality);
        System.out.println("cnic " + cnic);
        System.out.println("address " + address);
        System.out.println("age " + age);
    }
}
class Employees extends person {
    String EmployeeName, CompanyName, CompanyLocation;
    int yearsWorked;

    Employees() {
        super();
        System.out.println("i am employee");
    }

    public void DetailsEmployee() {


        System.out.println("name: ");
        EmployeeName = sc.next();
        System.out.println("company name: ");
        CompanyName = sc.next();
        System.out.println("Company location: ");
        CompanyLocation = sc.next();
        System.out.println("years worked ");
        yearsWorked = sc.nextInt();
    }


    public void displayInfoE() {
        System.out.println("name " + EmployeeName);
        System.out.println("company name " + CompanyName);
        System.out.println("company location " + CompanyLocation);
        System.out.println("years worked " + yearsWorked);
    }
}
class Manager extends Employees
{
    String[] EmployeeNames = new String[5];
    Manager()
    {
        super();
        System.out.println(" I am manager");
    }
    public void MangerDetails()
    {
        for (int i = 0; i < 5; i++)
        {
           // EmployeeNames[i] = new String();
            System.out.printf(" employee %d ", i+1);
            EmployeeNames[i] = sc.next();
        }
    }
    public void EmployeeInfo()
    {
        System.out.println(" Employees under manager supervisions are ");
        for (String n : EmployeeNames)
        {
            System.out.println(n);
        }
    }
}
public class OOPLAB6_Q2 {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.inputDetailsP();
        obj.displayP();
        obj.DetailsEmployee();
        obj.displayInfoE();
        obj.MangerDetails();
        obj.EmployeeInfo();
    }
}
