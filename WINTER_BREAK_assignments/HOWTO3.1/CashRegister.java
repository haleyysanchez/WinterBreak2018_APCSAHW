
/**
 * Write a description of class H here.
 *
 * @author Haley Sanchez
 * @version (a version number or a date)
 */
    
//A cash register totals up sales and computes change due.

public class CashRegister
{
   private double purchase;   
   private double payment;
    /*Constructs a cash register with no money in it.   */  
   public CashRegister()
   {
       purchase = 0;
       payment = 0;
   }
   public void recordPurchase(double amount)
   {
       purchase = purchase + amount;
   }
   public void enterPayment(double amount)
   {
       payment = payment + amount;
   }
   public double giveChange()
   {
        double change = payment - purchase;   
        purchase = 0;   
        payment = 0;   
        return change;
   }
}
