package com.company;
class Member
{
   private String name;
   private int age, salary, phoneNumber;
    String address;
    public void printSalary(int salary)
    {
             this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
 class Employee extends Member
{
        String specialization;
        String department;
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }
}
class Manager extends Member
{
    String specialization;
    String department;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }
}
public class Practice_Inheritence2 {
    public static void main(String[] args) {
        Member obj = new Member();
        Employee E = new Employee();
        Manager m = new Manager();
        m.printSalary(6454);
        System.out.println(m.getSalary());

    }
}
