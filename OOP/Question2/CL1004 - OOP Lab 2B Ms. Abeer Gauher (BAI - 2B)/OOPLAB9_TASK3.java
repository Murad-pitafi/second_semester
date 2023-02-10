class Car {
    String carName, carType;

     Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    private String getCarName()
    {
        return carName;
    }
    class Engine {
         String engineType;
         public void setEngine( )
         {
             if (carType == "4t")
             {
                 if (carName == "Mehran")
                 {
                     this.engineType = "small";
                 }
                 else
                 {
                     this.engineType = "large";
                 }
             }
             else
             {
                 this.engineType = "bigger";
             }
         }
         public String getEngineType()
         {
             return engineType;
         }
    }
}
public class OOPLAB9_TASK3 {
    public static void main(String[] args) {
        Car obj = new Car("Mehran", "4t");
        Car.Engine obj1 = new Car("Mehran", "4t").new Engine();
        obj1.setEngine();
        System.out.println(" engine type " + obj1.getEngineType());
    }
}
