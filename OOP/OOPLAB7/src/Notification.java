import java.util.Scanner;
public class Notification {
    static int n;

    public static void notification() {
        n++;
    }

    public static void main(String[] args) {
        int opt;
        do {System.out.println(" Menu ");
        System.out.println("1 See institutions");
        System.out.printf("2 Notifications (%d)", Notification.n);
        Scanner sc = new Scanner(System.in);

        opt = sc.nextInt();

            switch (opt) {
                case 1 -> {

                    System.out.println(" FAST UNIVERSITY \n NED UNIVERSITY \n KARACHI UNIVERSITY");

                    notification();


                }
                case 2 -> {
                    System.out.println("you have read the notifications");
                    Notification.n = 0;
                }

            }
        }while (opt != 0);
    }
}
