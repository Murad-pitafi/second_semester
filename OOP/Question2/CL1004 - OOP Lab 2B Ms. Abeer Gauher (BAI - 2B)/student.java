package com.company;

import java.util.Scanner;

public class student {
    private String name;
    private int age;
    private int studentId;
    private String courseName;
    private String CourseTeacher;
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseName()
    {
        return courseName;

    }
    public String getCourseTeacher()
    {
        return CourseTeacher;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.CourseTeacher = courseTeacher;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        student obj = new student();
        String name, coursename, courseteacher;
        int age,  studentid;
        System.out.println("Enter the name");
        name = data.nextLine();
        obj.setName(name);
        System.out.println("enter the age");
        age = data.nextInt();
        obj.setAge(age);
        System.out.println("enter the course name ");
        coursename = data.nextLine();
        obj.setCourseName(coursename);
        System.out.println("enter the student id ");
        studentid = data.nextInt();
        obj.setStudentId(studentid);
        System.out.println("enter the course teacher name ");
        courseteacher = data.nextLine();
        obj.setCourseTeacher(courseteacher);
        System.out.println(" Name " + obj.getName());
        System.out.println("student id " + obj.getStudentId());
        System.out.println(" course name " + obj.getCourseName());
        System.out.println(" age " + obj.getAge());
        System.out.println( " course teacher " + obj.getCourseTeacher());





    }
}
