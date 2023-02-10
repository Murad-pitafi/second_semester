interface Tossable
{
    public void toss();
}
class Ball implements Tossable
{
    private String brandName;
    Ball(String brandName)
    {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void bounce() {
    }

    @Override
    public void toss() {

    }
}
class Rock implements Tossable
{
    @Override
    public void toss() {

    }
}
class Baseball extends Ball
{

    Baseball(String brandname)
    {
        super(brandname);
    }

    @Override
    public void toss() {
        super.toss();
    }

    @Override
    public void bounce() {
        super.bounce();
    }
}
class Football extends Ball
{

    Football(String brandname)
    {
        super(brandname);
    }

    @Override
    public void toss() {
        super.toss();
    }

    @Override
    public void bounce() {
        super.bounce();
    }
}
public class OOPLAB8_Q6 {
}
