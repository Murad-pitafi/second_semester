import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Bank {
    private String AccountTitle;
    private String AccountType;
    private String CurrentBalance;

    public String getAccountTitle() {
        return AccountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        AccountTitle = accountTitle;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getCurrentBalance() {
        return CurrentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        CurrentBalance = currentBalance;
    }
    public void UserINput(File file)
    {



            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account title");
             setAccountTitle(sc.nextLine());
            System.out.println("Enter AccountType Saving or Current");
            setAccountType(sc.next());
            System.out.println("Enter current balance");
            setCurrentBalance(sc.next());

    }
    public void ShowDetail(File file)
    {
        try {
            FileWriter fw = new FileWriter(file, true);
        //System.out.println("Account " + getAccountTitle());
        //System.out.println(" Account Type " + getAccountType());
        //System.out.println("Current balance " + getCurrentBalance());
        fw.append(" Account title " +  getAccountTitle());
        fw.append("\n");
        if(getAccountType().equals("saving"))
        {
            fw.append(" Account type " +getAccountType() + " " + " You get 5% interest each month");
            fw.append("\n");
        }
        else if ( getAccountType().equals("current") )
        {
            fw.append(" Account type " +getAccountType() + " " + " You get no interest each month");
            fw.append("\n");
        }
        else
        {

        }

        fw.append(" Current balance " +getCurrentBalance());
        fw.append("\n");
        fw.close();

        Scanner sc = new Scanner(file);
        while(sc.hasNext())
        {
            String d = sc.nextLine();
            System.out.println(d);
        }
    }catch (IOException e)
    {

    }
    }
}
public class K213064_Q2 {
    public static void main(String[] args) {
        File f = new File("bank.txt");
        Bank b = new Bank();
        b.UserINput(f);
        b.ShowDetail(f);

    }
}
