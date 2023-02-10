package com.company;
class parent
{
    protected void display()
    {
        System.out.println("this is parent class");
    }
}
class child extends parent
{
    public void displayChild() {
        System.out.println("this child class ");
    }
}
public class Practice_Inheritence {
    public static void main(String[] args) {
        parent obj = new parent();
        child objChild = new child();
        obj.display();
        objChild.displayChild();
        objChild.display();
        // point to ponder
        // parent obj1 = new child();
        //   obj1.display();
    }
}
