class annoy
{
    public void show(){
        System.out.println("i am in show ");
    };
}
public class anonymous {
    public static void main(String[] args) {
        annoy a = new annoy(){
            public void show()

                {
                    System.out.println("i am okay");
                }

        };
        a.show();
    }
}
