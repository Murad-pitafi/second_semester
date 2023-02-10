import java.util.ArrayList;
import java.util.Iterator;

class Queue <T> {
    T rear;
    T front;
    T capacity;
    ArrayList<T> list = new ArrayList<>();
    Queue(T capacity)
    {
        this.capacity = capacity;
    }


    public  void add(T a) {

         if(rear == capacity)
        {
            System.out.println("Queue is full");
        }
         else
         {
              list.add(a);
         }

    }
    public void display()
    {
        System.out.println(list);
    }
}
public class K213064_Q1 {
    public static void main(String[] args) {
        Queue<Integer> i = new Queue<>(4);
         i.add(5); i.add(4); i.add(7); i.add(5);
        i.display();

    }
}
