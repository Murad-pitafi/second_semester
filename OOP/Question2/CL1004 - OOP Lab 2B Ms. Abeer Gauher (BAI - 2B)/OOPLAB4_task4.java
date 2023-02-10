package com.company;

class Tank
{
    int capacity = -100;
    Tank()
    {
    }


    protected void finalize() {
        System.out.println("in finalize method\nobject is cleared");
    }
}

public class OOPLAB4_task4 {
    public static void main(String[] args) {
        Tank obj = new Tank();

        if ( obj.capacity >= 0 )
        {
            System.out.println("tank is fulled ");
        }
        else
        {
            obj.finalize();
            obj = null;
            System.gc();
        }

        System.out.println("inside the main method");
    }
}
