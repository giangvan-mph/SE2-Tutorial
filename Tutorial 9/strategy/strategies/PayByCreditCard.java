package tuts.tut9.todo.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Concrete strategy. Implements credit card payment method.
 */
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
    	//TO-DO: Add 'try-catch' block to catch the IO error
    	try (READER) {
            //TO-DO: Ask for card number, expiration date, CVV code then save them to suitable variables
            System.out.println("Input card number: ");
            String cardNumber = READER.readLine();

            System.out.println("Input expiration date: ");
            String expirationDate = READER.readLine();

            System.out.println("Input CVV code: ");
            String cvv = READER.readLine();

            //TO-DO: Create new CreditCard instance with given information
            CreditCard creditCard = new CreditCard(cardNumber, expirationDate, cvv);

            //TO-DO: Validate credit card number...

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //TO-DO: Implement the pay() method
    /**
     * After card validation we can charge customer's credit card.
     */
    @Override
    public boolean pay(int paymentAmount) {
    	/*if 'cardIsPresent' => display a message 
    	to show that customer is paying with Credit Card with money amount
    	then reduce the card amount with that number
    	finally return true else return false */
        if(cardIsPresent()) {
            System.out.println("You are paying with Credit Card with " + paymentAmount);
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
