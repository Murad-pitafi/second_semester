class Accounts
{
    static float balance;

    public void Credit(float balance)
    {
        Accounts.balance += balance;
    }
    public void Debit(float balance)
    {
        Accounts.balance -= balance;
    }

    public static float getBalance() {
        return balance;
    }
}
class SavingAccount extends Accounts
{
    int timeSpan = 1;
    int Tinterest = 0;
    int interest = 2;
    public void CalInterest()
    {
        Tinterest = (int) (getBalance()* interest * timeSpan);
    }
    @Override
    public void Credit(float interest) {
        balance += Tinterest;
    }

}
class CheckAccount extends Accounts
{

}
public class OOP_LAB7_Q4 {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        Accounts obj1 = new Accounts();
        obj1.Credit(1000);
        obj1.Debit(990);
        obj.CalInterest();
        obj.Credit(6);
        System.out.println(" current balance " + Accounts.getBalance());
    }
}
