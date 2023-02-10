import java.util.Scanner;

class Vehicle
{
    privete int speed, noOfwheels;
    private String color;
    Scanner sc = new Scanner(System.in);
    Vehicle()
    {

    }
    Vehicle(int speed, String color)
    {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNoOfwheels() {
        return noOfwheels;
    }

    public void setNoOfwheels(int noOfwheels) {
        this.noOfwheels = noOfwheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void input()
    {
        System.out.println(" no of wheels ");
        setNoOfwheels(sc.nextInt());
        System.out.println(" speed ");
        setSpeed(sc.nextInt());
        System.out.println("color");
        setColor(sc.nextLine());
    }
    public void displayv()
    {
        System.out.println(" Vehicle detail \n speed " + getSpeed() );
        System.out.println(" color " + getColor());
        System.out.println(" no of wheels " + getNoOfwheels());
    }
}
class MotorVehicle extends Vehicle
{
    private String licienceplate;
    MotorVehicle(){}

    public String getLicienceplate() {
        return licienceplate;
    }

    public void setLicienceplate(String licienceplate) {
        this.licienceplate = licienceplate;
    }
    public void inputm()
    {
        System.out.println(" enter plate ");
        setLicienceplate(sc.nextLine());
    }
    public void displaym()
    {
        System.out.println(" motyor details \n licienceplate " + getLicienceplate() );
    }
}
class Cars extends MotorVehicle
{
    private int noOfdoors;

    public int getNoOfdoors() {
        return noOfdoors;
    }

    public void setNoOfdoors(int noOfdoors) {
        this.noOfdoors = noOfdoors;
    }

    Cars() {

    }
    public void inputM()
    {
        setNoOfdoors(sc.nextInt());
    }
public void displayc()
{
    System.out.println(" car detail\n no of doors " + getNoOfdoors() );
}
}
public class OOPLAB6_Q5 {
    public static void main(String[] args) {
        System.out.println("enter details");


    }
}
