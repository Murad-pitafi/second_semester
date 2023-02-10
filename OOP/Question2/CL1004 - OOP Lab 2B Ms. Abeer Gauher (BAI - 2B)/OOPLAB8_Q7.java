import java.util.Scanner;

interface queue
{
    public void add();
    public void remove();
    public int check();
}
class queues implements queue
{
    int front=0;

    @Override
    public void add() {
        front++;
    }

    @Override
    public void remove() {
        front--;
    }

    @Override
    public int check() {

        return front;
    }
}
public class OOPLAB8_Q7 {
    public static void main(String[] args) {

        queues obj = new queues();
        Scanner sc = new Scanner(System.in);
        int opt;
        do {

            System.out.println("1 Add in queue\n 2. remove in queue \n 3. check \n 4 exit ");

            opt = sc.nextInt();
            switch (opt) {
                case 1 -> obj.add();
                case 2 -> obj.remove();
                case 3 -> System.out.println("there are " + obj.check() + " items ");
            }
        }while (opt !=4);
    }
}
