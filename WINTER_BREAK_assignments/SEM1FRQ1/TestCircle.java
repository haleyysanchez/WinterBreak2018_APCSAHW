
/**
 * Circle class simulates a circle, with a radius and color.
 * gives methods to change color and radius and get it.
 *
 * @author Haley Sanchez
 * @12/28/18
 */
public class TestCircle
{
    public static void main (String [] args)
    {
        /*Circle c1 = new Circle();
        System.out.println("the circle has a radius of " + 
        c1.getRadius() + " and an area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("the circle has a radius of " + 
        c2.getRadius() + " and an area of " + c2.getArea());*/
        Circle c3 = new Circle(2.0, "blue");
        c3.setColor("Green");
        c3.setRadius(9);
        System.out.println("the circle has a radius of " + 
        c3.getRadius() + " and an area of " + c3.getArea() + " and the color of "+ c3.getColor());
        System.out.println(c3.toString());
        //ERRORSSSS
        //radius has private access in Circle
        //you cannot access the instance variables directly or assign a new value
        //c3.radius=5.0;
        //System.out.println(c3.radius);
    }
}
