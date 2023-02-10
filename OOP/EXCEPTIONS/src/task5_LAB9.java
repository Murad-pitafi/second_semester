import java.util.Scanner;

public class task5_LAB9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] marks = new int[5];
            int sum = 0;
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
                sum += marks[i];
            }

        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("first exception ");
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}