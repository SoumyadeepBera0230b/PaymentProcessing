package com.acc.handson.paymentProcessingSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Payments credit1 = new CreditCardPayments();
        credit1.processPayment();
        
        Payments credit2 = new PaypalPayments();
        credit2.processPayment();
    }
}
