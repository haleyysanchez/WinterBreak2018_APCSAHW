
/**
 * Die class simulates die rolling nad can display it and manipulate it.
 *
 * @author Haley Sanchez
 * 12/28/18
 */
public class DieTester
{
   public static void main (String [] args)
   {
    Die a = new Die();
    a.roll();
    System.out.println(""+ a.getFaceValue());
    System.out.println(""+ a.toString());
    a.setFaceValue(1);
    System.out.println(a);
    //System.out.println(""+ a.getFaceValue());
    //System.out.println(""+ a.toString());
   }
}
