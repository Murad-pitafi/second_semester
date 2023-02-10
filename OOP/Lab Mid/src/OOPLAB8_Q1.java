abstract class parent {
    abstract void message();
}
class subclass extends parent {
    @Override
     void message() {
        System.out.println("subclass one ");
    }
}
class subclass2 extends parent {
    @Override
    void message() {
        System.out.println("subclass 2");
    }
}
public class OOPLAB8_Q1 {
    public static void main(String[] args) {
        subclass obj = new subclass();
        subclass2 obj2 = new subclass2();
        obj2.message();
        obj.message();
    }
}
