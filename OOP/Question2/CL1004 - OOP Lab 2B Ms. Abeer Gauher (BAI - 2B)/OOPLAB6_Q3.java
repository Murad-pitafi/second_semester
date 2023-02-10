class circle {
    private double radius = 1.0;
    private String color = "red";

    circle() {
    }

    circle(double radius) {
        this.radius = radius;
    }

    circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea()
    {
        return (3.14*(Math.pow(getRadius(), 2)));
    }

}
class cylinder extends circle
{
    private double height = 1.0;

    cylinder() {
    }
    cylinder(double Radius)
    {

    }
    cylinder(double Radius, String Color)
    {

    }
    cylinder(double Radius, String Color, double height){}

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume()
    {
        return getArea()*height;
    }
}
public class OOPLAB6_Q3 {
    public static void main(String[] args) {
        circle obj = new circle( );
        cylinder obj2 = new cylinder();
        int area = (int) obj2.getArea();
        int volume = (int) obj2.getVolume();
        System.out.println("area " + area);
        System.out.println("volume " + volume);
    }
}
