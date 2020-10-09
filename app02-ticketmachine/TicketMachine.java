/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Mohammed Ahmed - 21915819
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class TicketMachine extends Ticket
{
    
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    
    {
        
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice(Destination dest)
    {
        int price = 0;
        if (dest == Destination.AYLESBURY)price = 220;
        if (dest == Destination.AMERSHAM)price = 300;
        if (dest == Destination.HIGHWYCOMBE)price = 330;
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertCoin(Coin c)
    {
        
        
            balance = balance + c.getValue();
            System.out.println("# " + balance + " pence.");
        
         
       
        
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket(Destination dest)
    {
        int price = getPrice(dest);
        Date today = new Date();
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to "+ dest);
            System.out.println("# " + price + " pence.");
            System.out.println("# on "+ today);
            System.out.println("##################");
            System.out.println();
            

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
