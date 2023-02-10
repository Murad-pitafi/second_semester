import java.util.Scanner;

class Employee
{
    public String Name;
    public String Position;
    public int no_years;
    public int salary = 30000;
    Employee()
    {
        System.out.println(" i am employee");
    }

    Scanner sc = new Scanner(System.in);

    public void UserInput()
    {
        System.out.println(" enter name ");
        this.Name = sc.next();
        System.out.println("enter position ");
        this.Position = sc.next();
        System.out.println("enter salary ");
        this.salary = sc.nextInt();
        System.out.println(" enter no of years ");
        this.no_years = sc.nextInt();
    }
    public void DisplayDetail()
    {
        System.out.println(" name " + Name );
        System.out.println(" position " + Position);
        System.out.println(" salary " +  salary);
        System.out.println(" no of years " + no_years);
    }
}
class FullTimeEmployee extends Employee
{
    int increment = 20;
    float incremented_salary;
    FullTimeEmployee()
    {

        System.out.println(" i am full time employee");
    }

    public void incrementedSalary()
    {
        incremented_salary = (salary/100)*increment;
    }
    public void displayIncrSalary()
    {
        System.out.println(" incremented salary " + incremented_salary);
    }
}
class PartTimeEmployee extends Employee
{
    int increment = 5;
    float incremented_salary;
    PartTimeEmployee()
    {

        System.out.println(" i am part time employee");
    }

    public void incrementedSalary()
    {
        incremented_salary = (salary/100)*increment;
    }
    public void displayIncrSalary()
    {
        System.out.println(" incremented salary " + incremented_salary);
    }
}


public class OOP_LAB7_Q1 {
    public static void main(String[] args) {
        PartTimeEmployee obj = new PartTimeEmployee();
        FullTimeEmployee obj2 = new FullTimeEmployee();
        Employee obj1 = new Employee( );
        obj2.UserInput();
        obj2.DisplayDetail();
        System.out.println(" part time employee");
        obj.incrementedSalary();
        obj.displayIncrSalary();
        System.out.println(" full time employee");
        obj2.incrementedSalary();
        obj2.displayIncrSalary();
    }
}
