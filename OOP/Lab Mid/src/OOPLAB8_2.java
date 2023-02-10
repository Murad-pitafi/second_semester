abstract class BANK {
    abstract int getBalance(int balance);
}
class BANK_A extends BANK {
    int a = 100;
    @Override
    int getBalance(int balance) {
        this.a = balance;
        return a;
    }
}
class BANK_B extends BANK {
    int b = 150;
    @Override
    int getBalance(int balance) {
        this.b = balance;
        return b;
    }
}
class BANK_C extends BANK {
    int c = 200;
    @Override
    int getBalance(int balance) {
        this.c = balance;
        return c;
    }
}
public class OOPLAB8_2 {
    public static void main(String[] args) {
        BANK_A obj = new BANK_A();
        BANK_B obj1 = new BANK_B();
        BANK_C obj2 = new BANK_C();
        System.out.println("BANK A deposit " + obj.getBalance(1));
        System.out.println("BANK B deposit " + obj1.getBalance(2));
        System.out.println("BANK C deposit " + obj2.getBalance(3));
    }
}
