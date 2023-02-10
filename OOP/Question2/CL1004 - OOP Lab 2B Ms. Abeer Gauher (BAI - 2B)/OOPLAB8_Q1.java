abstract class Parent
{
    abstract void message();
}
class SubClass extends Parent
{
    @Override
    void message() {
        System.out.println("this is the first sub class");
    }
}
class SubClass2 extends Parent
{
    @Override
    void message() {
        System.out.println("this is the second sub class");
    }
}
public class OOPLAB8_Q1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        SubClass2 obj2 = new SubClass2();
        obj.message();
        obj2.message();
    }
}
