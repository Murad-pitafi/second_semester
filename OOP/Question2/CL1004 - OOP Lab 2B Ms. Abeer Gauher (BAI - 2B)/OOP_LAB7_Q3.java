import java.util.Scanner;

class Robot
{
    int x, y;
    String direction;

     Robot(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public void displayInitial()
    {
        System.out.println(" intial position ");
        System.out.println(" x " + x + " " + "y" + y + " direction " + direction);
    }
    Scanner sc = new Scanner(System.in);
}
class MovingRobot extends Robot
{
    MovingRobot()
    {
        super(4,5,"N");
    }
    int step;
    public void MoveRob()
    {
        System.out.println(" enter the steps ");
        step = sc.nextInt();
        y += step;
        x += step;
    }
    public void currentPosition()
    {
        System.out.println(" current position of robot is ");
        System.out.println(" x " + x + " " + "y" + y + " direction " + direction);
    }
}

public class OOP_LAB7_Q3 {
    public static void main(String[] args) {
        MovingRobot obj = new MovingRobot();
        obj.displayInitial();
        obj.MoveRob();
        obj.currentPosition();
    }
}
