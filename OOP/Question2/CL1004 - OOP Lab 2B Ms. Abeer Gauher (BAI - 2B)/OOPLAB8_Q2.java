abstract class Bank
{
    abstract int getBalance();
}
class BankA extends Bank
{
    int a = 100;

    @Override
    int getBalance() {
        return a;
    }
}
class BankB extends Bank
{
    int a = 150;

    @Override
    int getBalance() {
        return a;
    }
}
class BankC extends Bank
{
     int a = 200;

    @Override
    int getBalance() {
        return a;
    }
}
public class OOPLAB8_Q2 {
    public static void main(String[] args) {
        BankA obj = new BankA();
        BankB obj1 = new BankB();
        BankC obj2 = new BankC();
        System.out.println("bank A " + obj.getBalance());
        System.out.println("bank B " + obj1.getBalance());
        System.out.println("bank C " + obj2.getBalance());
    }
}
