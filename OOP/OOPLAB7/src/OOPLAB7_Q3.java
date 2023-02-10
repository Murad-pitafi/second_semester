import java.util.Scanner;

class Robot {
    public static float x, y;
    public static String direction;
        Scanner sc = new Scanner(System.in);
    Robot(float x, float y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void disInitialPos() {
        System.out.println("Robot -------- \n currently is in ");
        System.out.println(" x " + x + " y " + y);
        System.out.println("in " + direction + " direction");
    }
    Robot(){}
}
class MovingRobot extends Robot
{

    MovingRobot()
    {
        super();

    }
    public void UpdatePosition()
    {
        System.out.println("To move robot enter the data");
        System.out.print(" x ");
        x += sc.nextFloat();
        System.out.print(" y ");
        y += sc.nextFloat();
        System.out.print(" Direction ");
        direction = sc.next();
    }
    public void updatedPosition()
    {
        System.out.println(" new positions ");
        System.out.println(" x " + x + " y " + y);
        System.out.println("in " + direction + " direction");
    }

}
public class OOPLAB7_Q3 {
    public static void main(String[] args) {
        MovingRobot obj = new MovingRobot();
        Robot obj2 = new Robot(2, 5, "N");
        obj2.disInitialPos();
        obj.UpdatePosition();
        obj.updatedPosition();
    }
}
