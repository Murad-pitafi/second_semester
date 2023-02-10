public class OOPLAB9_TASK4 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 4, 5};
            System.out.println(" " + arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest code here");
    }
}
