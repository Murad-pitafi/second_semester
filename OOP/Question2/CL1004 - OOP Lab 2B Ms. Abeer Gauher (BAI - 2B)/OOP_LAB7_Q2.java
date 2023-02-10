class Vehicle
{
    String vehicleName;
    int vehicleNo, wheels;
    Vehicle()
    {
        System.out.println(" It's vehicle");
    }
    public void Accelerator(float speed)
    {
        System.out.printf("speed of vehicle is %.2f KM/h", speed);
    }
}
class FourWheeler extends Vehicle
{
    boolean PowerSteering;
    FourWheeler(String vehicleName, int vehicleNo, int wheels, boolean powerSteering)
    {
        super();
        super.vehicleName = vehicleName;
        super.wheels = wheels;
        super.vehicleNo = vehicleNo;
        this.PowerSteering = powerSteering;
    }
    public void display()
    {
        System.out.println(" vehicle Name " + vehicleName);
        System.out.println(" wheels " + wheels);
        System.out.println("vehicleNo " + vehicleNo);
        if (PowerSteering == true )
        {
            System.out.println(" it has power Steering");
        }
        else
        {

        }
        Accelerator(78);
    }
}
public class OOP_LAB7_Q2 {
    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler("toyata", 5343, 4, true);
        obj.display();
    }


}
