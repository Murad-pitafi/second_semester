import org.w3c.dom.ls.LSOutput;

class CPU
{
    double price;
    class Processor{
        double cores; String manufacturer;
        public double getCache()
        {
            return 4.2;
        }
    }
    protected class Ram {
        double memory; String manufacturer;
        public double getClockspeed()
        {
            return 5.3;
        }
    }
}
public class OOPLAB9_TASK2 {
    public static void main(String[] args) {


        CPU obj = new CPU();
        CPU.Processor obj1 = new CPU().new Processor();
        CPU.Ram obj2 = new CPU().new Ram();
        System.out.println(obj1.getCache());
        System.out.println(obj2.getClockspeed());
    }
}