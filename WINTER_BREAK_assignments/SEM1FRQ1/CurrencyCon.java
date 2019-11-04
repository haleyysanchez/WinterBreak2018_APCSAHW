import java.util.*;
/**
 * Converts a US dollar into a euro value and displays it.
 *
 * @author Haley Sanchez
 * @version 12/28/18
 */
public class CurrencyCon
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price of one U.S. dollar in euros");
        Double con = in.nextDouble();
        
        boolean done = false;
        while(!done)
        {
            System.out.println("Enter U.S. dollar value to convert to euros, type 'Q' to quit");
            String input = in.next();
            if(input.equalsIgnoreCase("Q"))
            {done = true;}
            else
            {double us = Double.parseDouble(input);
             System.out.println("That would be "+us*con+" euros");}
        }
        
    }
}
