import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class abc
{
    public void readfile(File file)
    {

    }
    public void write()
    {

    }
}
public class practice3 {
    public static void main(String[] args) {
        try {
            File f = new File("Test33.txt");
            f.createNewFile();
            abc j = new abc();
            j.readfile(f);
        }catch(IOException e)
        {

        }
        //catch(FileNotFoundException e)
        {

        }
    }
}
