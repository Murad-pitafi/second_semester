package com.company;

public class cars {
    public int yearModel;
    public String make;
    public int speed;
    public cars(int y, String m, int s)
    {
        yearModel= y;
        make = m;
        speed = s;
    }
    public void accelerator()
    {
        speed += 5;
    }
    public void brake()
    {
        speed -= 5;
    }

    public static void main(String[] args) {
        cars obj = new cars(1990, "toyota", 0);
        for (int i = 0; i < 5; i++)
        {
            obj.accelerator();
        }
        System.out.println("year model   " + obj.yearModel);
        System.out.println("make " + obj.make);
        System.out.println(" speed " + obj.speed);

        System.out.println("current speed after accelerator " + obj.speed);
        for (int i = 0; i < 5; i++)
        {
            obj.brake();
        }
        System.out.println("current speed after brake " + obj.speed);
    }
}
