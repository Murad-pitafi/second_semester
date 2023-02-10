package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

class Student
{
    int studentId;
    String name;
    float cgpa;
    String department;
        Scanner sc = new Scanner(System.in);
        Student(int studentId, String name, float cgpa, String department)
        {
            System.out.println("A) parameterized constructor called for intial values");
            this.cgpa = cgpa;
            this.department = department;
            this.studentId = studentId;
            this.name = name;
        }
        Student(int studentId)
        {
            System.out.println("B) constructor with only studentid parameter and other input called");
            this.studentId = studentId;
            System.out.println("enter cgpa");
            this.cgpa = sc.nextFloat();
            System.out.println("enter name");
            this.name = sc.nextLine();
            System.out.println("enter department");
            this.department = sc.nextLine();
        }
        Student(float cgpa)
        {
            System.out.println("C) a constructor with only parameter(cgpa) called");
            this.cgpa = cgpa;
        }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void display()
    {
        System.out.println(" name " + name);
        System.out.println("studentId " + studentId);
        System.out.println("cgpa " + cgpa);
        System.out.println("department " + department);
    }
    Student( Student obj2 )
    {
        System.out.println("task 3  Copy constructor called ");
        this.studentId = obj2.studentId;
        this.department = obj2.department;
        this.name = obj2.name;
        this.cgpa = obj2.cgpa;

    }

}


public class OOPLab4_task2 {
    public static void main(String[] args) {
        Student obj = new Student(3064, "murad", 3.33f, "Artificial intelligence" );
        Student obj2 = new Student(3064);
        Student obj1 = new Student(3.3f);
        Student obj3 = new Student(obj2);
        obj.display();
    }

}
