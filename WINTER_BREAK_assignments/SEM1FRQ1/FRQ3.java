import java.util.*;
/**
 * Asks user to enter temperature for 12 months and compares them
 * to find the highest temperature and what month it is from.
 *
 * @author Haley Sanchez
 * @12/28/18
 */
public class FRQ3
{
    public static void main (String [] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Type in temperature for month 1:");
       double highestValue= in.nextDouble();
       int highestMonth = 1;
        for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
        //for loop to get number of months
        {
        System.out.println("Type in temperature for month " + currentMonth + ": ");
        //asks user to type in temperature 
        double nextValue = in.nextDouble();
        if (nextValue > highestValue)
        {
           highestValue = nextValue;
           highestMonth = currentMonth;
        }
       }
       System.out.println("the month with the highest temperature is month " + highestMonth);
    }
}
