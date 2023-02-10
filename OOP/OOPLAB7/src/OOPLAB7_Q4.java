class Account
{
    public static float balance = 0;

        public void credit(float amount)
        {
            balance += amount;
        }
    public void debit(float amount)
    {
        balance -= amount;
    }
    public float getBalance() {
        return balance;
    }
}
class SavingAccount extends Account
{
    int timeSpan = 2;
    float interestRate = 2F;
    float interest;
    public void CalculateInterest()
    {
        interest = getBalance()*interestRate*timeSpan;
    }

    @Override
    public void credit(float amount) {
        balance += interest;
    }
}
class CheckingAccount extends Account
{

}
public class OOPLAB7_Q4 {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        Account obj2 = new Account();
        obj2.credit(1000);
        obj2.debit(990);
        obj.CalculateInterest();
        obj.credit(1000);
        System.out.println(" current balance " + obj.getBalance());
    }
}
