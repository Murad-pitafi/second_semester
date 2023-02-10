import java.util.Scanner;

public  class task4<usr, ps> {
    private usr username;
    private ps password;
    task4(usr username , ps password)
    {
        this.username = username;
        this.password = password;
    }

    public usr getUsername() {
        return username;
    }

    public void setUsername(usr username) {
        this.username = username;
    }

    public ps getPassword() {
        return password;
    }

    public void setPassword(ps password) {
        this.password = password;
    }
    task4(){}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        task4<String, Integer> t = new task4<String , Integer>("murad", 1234);
        task4<String, Integer> t1 = new task4<String , Integer>();
        System.out.println("enter username");
        t1.setUsername(sc.next());
        System.out.println("enter password");
        t1.setPassword(sc.nextInt());
        if (t.getPassword().equals(t1.getPassword()) && t.getUsername().equals(t1.getUsername()))
        {
            System.out.println("logon");
        }
        else
        {
            System.out.println("not logged");
        }
    }
}
