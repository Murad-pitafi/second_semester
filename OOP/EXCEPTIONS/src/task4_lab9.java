import java.util.Scanner;

public class task4_lab9 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 7, 4, 6};
            System.out.println(" " + arr[7]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("rest of the code ");
        }

    }
}
