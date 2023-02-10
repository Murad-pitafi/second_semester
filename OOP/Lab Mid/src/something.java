class outer
{
    int data = 65;

        class inner
        {
            void display(){
                System.out.println(data);
            }
        }
//        inner obj = new inner();
//        obj.display();

}
public class something {
    public static void main(String[] args) {
        outer.inner obj = new outer().new inner();
        obj.display();
    }
}
