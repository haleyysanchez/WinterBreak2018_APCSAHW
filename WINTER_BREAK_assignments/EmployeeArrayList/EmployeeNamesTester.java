import java.util.*;
/**
 * Creates an object of EmployeeNames and uses an initializer list to give 
 * the last names that wil be formatted into an acceptable name by the boss.
 * then the formatted array is printed out to see the acceptable names.
 *
 * @author Haley Sanchez
 * @version 12/31/18
 */
public class EmployeeNamesTester
{
    public static void main (String[]args)
    {
        EmployeeNames a = new EmployeeNames();
        List<String> lNames = new ArrayList<String>();//{"Jones", "Smith", "Lopez", "Hello", "Winoker", "Haley",
        //"Sanchez", "Rodriguez", "Moore", "Photos"};
        lNames.add("Jones");
        lNames.add("Smith");
        lNames.add("Lopez");
        lNames.add("Hello");
        lNames.add("Winoker");
        lNames.add("Haley");
        lNames.add("Sanchez");
        lNames.add("Rodriguez");
        lNames.add("Moore");
        lNames.add("Photos");
        List<String> formatted = a.convertName(lNames);
        for(int i = 0; i<= formatted.size()-1; i++)
        {
            System.out.println(formatted.get(i));
        }
    }
}