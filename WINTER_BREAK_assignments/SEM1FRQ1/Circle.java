
/**
 * Circle class simulates a circle, with a radius and color.
 * gives methods to change color and radius and get it.
 *
 * @author Haley Sanchez
 * @12/28/18
 */
public class Circle
{
    private double radius;
    private String color;
    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        return Math.pow(this.radius, 2)*Math.PI;
    }
    //added
    public String getColor()
    {
        return this.color;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String toString()
    {
        String str = "" + getRadius() + "\n" + getArea() + "\n" + getColor();
        return str;
    }
    /*public Circle()
    {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r)
    {
        radius = r;
        color = "red";
    }
    public Circle(double r, String c)
    {
        radius = r;
        color = c;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.pow(radius, 2)*Math.PI;
    }
    //added
    public String getColor()
    {
        return color;
    }
    public void setRadius(double rad)
    {
        radius = rad;
    }
    public void setColor(String col)
    {
        color = col;
    }*/
    
}
