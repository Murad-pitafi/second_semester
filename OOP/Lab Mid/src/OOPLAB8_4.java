abstract class abs
{
    abs()
    {
        System.out.println("this is constructor of abstract class");
    }
    abstract void a_method();
     void n_method(){
         System.out.println("this is normal method of a abstract class ");
     }
}
class SubClass extends abs
{
    @Override
    void a_method() {
        System.out.println(" this is abstract method");
    }
}
public class OOPLAB8_4 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.n_method();
    }
}
