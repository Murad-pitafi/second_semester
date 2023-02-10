import java.util.Scanner;

public class OOPLAB9_TASK5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] marks = new int[4];
            int sum = 0;
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
                sum += marks[i];
            }
            int totalMarks;
            totalMarks = sc.nextInt();
            int total = sum / totalMarks;
        }catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest code here");

    }

}