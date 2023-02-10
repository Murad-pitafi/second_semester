abstract class Animal
{
    abstract void cats();
    abstract void dog();
}
class Cats extends Animal
{
    @Override
    void cats() {
        System.out.println("meo meo");
    }

    @Override
    void dog() {

    }
}
class Dog extends Animal
{
    @Override
    void dog() {
        System.out.println("bhow bhow");
    }

    @Override
    void cats() {

    }
}
public class OOPLAB8_Q5 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Cats obj1 = new Cats();
        obj.dog();
        obj1.cats();

    }
}
