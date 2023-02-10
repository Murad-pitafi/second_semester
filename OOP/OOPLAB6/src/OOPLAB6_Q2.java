import java.util.Scanner;

class person
{
    String name, naionality, Address, CNIC;
    int age ;
    person()
    {
        System.out.println("i am person");
    }
    Scanner sc = new Scanner(System.in);
    public void inputDetails()
    {
        System.out.println("enter CNIC");
        CNIC = sc.nextLine();
        while(CNIC.length() != 13)
        {
            if (CNIC.length() != 13)
            {
                System.out.println("you have entered invalid cnic\n please write valid");
                CNIC = sc.nextLine();
            }

        }
    }

}
public class OOPLAB6_Q2 {
    public static void main(String[] args) {
        person obj = new person();
        obj.inputDetails();
    }
}
