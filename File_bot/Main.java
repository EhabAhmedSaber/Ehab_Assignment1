
package main;

/**
 *
 * @author Ehab Elsheikh
 */
public class Main {

    public static void main(String[] args) {
       account ac=new account(1122,20000);
       ac.setAnnualInterestRate(4.5);
       ac.withDraw(2500);
       ac.deposit(3000);
       System.out.println("balance is: " + ac.getBalance());
       System.out.println("Monthly interest is: " + ac.getMonthlyInterest());
       System.out.println("date created is: " + ac.getDateCreated());
    }
    
}
