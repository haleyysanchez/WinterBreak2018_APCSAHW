
/**
 * Write a description of class CRtester here.
 *
 * @author Haley Sanchez
 * @version (a version number or a date)
 */
public class CashRegisterTester 
{   
    public static void main(String[] args)   
    { CashRegister register = new CashRegister();
      register.recordPurchase(29.50);
      register.recordPurchase(9.25);      
      register.enterPayment(50);
      double change = register.giveChange();
      System.out.println(change);      
      System.out.println("Expected: 11.25");
    }
    }