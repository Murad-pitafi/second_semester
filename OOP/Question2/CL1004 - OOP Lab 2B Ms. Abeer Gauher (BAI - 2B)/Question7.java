/* K213064 Murad
OOP lab 1 Q7
 */
/* K213064 Murad
OOP lab 1 Q7
 */
package com.company;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        String name;
        int id, n;
        System.out.println("enter the name");
        name = data.nextLine();
        System.out.println("enter the id");
        id = data.nextInt();
        System.out.println("enter the no of courses");
        n = data.nextInt();
        String[] courses; // using array because we have to display certain registered courses
        courses = new String[n]; // assigning the no of courses for user input
        for ( int i = 0; i < courses.length; i++)
        {
            courses[i] = data.nextLine();
        }
        System.out.println(" Name " + name);
        System.out.println("Id " + id);
        System.out.println("courses " );
        for (String course : courses) // using for each loop
        {
            System.out.println(course);
        }
    }

}
