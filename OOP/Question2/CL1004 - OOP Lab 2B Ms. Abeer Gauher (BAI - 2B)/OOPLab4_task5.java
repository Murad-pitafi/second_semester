package com.company;
class unintializedString
{
    String  name;
}
class intializedString
{
    String name;
    intializedString(String name)
    {
        this.name= name;
    }

}

public class OOPLab4_task5 {
    public static void main(String[] args) {
        unintializedString obj = new unintializedString();
        System.out.println("unintialized string " + obj.name);
        intializedString obj1 = new intializedString("murad");
        System.out.println("initialized string " + obj1.name);
    }

}
