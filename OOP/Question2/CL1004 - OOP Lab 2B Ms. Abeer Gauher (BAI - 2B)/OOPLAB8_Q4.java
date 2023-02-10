abstract class abs
{
    abs(){
        System.out.println("this is constructor of abstract class");
    }
    abstract void a_method();
    void n_method(){
        System.out.println("this is normal method from abstract class");
    }
}
class Subclass extends abs{
    @Override
    void a_method() {
        System.out.println("this is abstract method");
    }
}
public class OOPLAB8_Q4 {
    public static void main(String[] args) {
       Subclass obj = new Subclass();
       obj.a_method();
       obj.n_method();
    }
}
