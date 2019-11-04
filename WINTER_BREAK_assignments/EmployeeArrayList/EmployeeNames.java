import java.util.*;
/**
 * Uses methods to find the accepted names for the company's boss.
 * Uses arrays to store the last names and then the formatted name.
 * The first initial must be the last letter in the persons last name.
 * the middle initial is the second to last letter in the last name.
 *
 * @author Haley Sanchez
 * @version 12/31/18
 */
public class EmployeeNames
{
    private List<String> fNames = new ArrayList<String>();
    //a constructor for the EmployeeNames class
    public EmployeeNames()
    {
       List<String> lNames = new ArrayList<String>(); 
       List<String> formatted = new ArrayList<String>();
    }
    //gets the formatted name from the last name
    public static List<String> convertName(List<String> lNames)
    {
        List<String> fNames = new ArrayList<String>();
        for(int i = 0; i <= lNames.size()-1; i++)
        {
            String name = lNames.get(i);
            String first = name.substring(name.length()-1);
            String mid = name.substring(name.length()-2,name.length()-1);
            String newName = first.toUpperCase()+". "+ mid.toUpperCase()
            +". "+lNames.get(i);
            fNames.add(newName);
            
        } 
        return fNames;
    }
    
}