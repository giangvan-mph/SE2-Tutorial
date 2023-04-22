package tuts.tut9.todo.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static tuts.tut9.todo.strategy.Demo.reader;

/**
 * Concrete strategy. Implements PayPal payment method.
 */
public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
//    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
    	//TO-DO: 'put' some test data (password & email) to DATA_BASE

      DATA_BASE.put("12345", "mph.gvan1@gmail.com");
      DATA_BASE.put("1234", "mph.gvan@gmail.com");
    }

    //TO-DO: Implement the collectPaymentDetails() method
    /**
     * Collect customer's data.
     */
    @Override
    public void collectPaymentDetails() {
       //TO-DO: Add 'try-catch' block to catch the IO error
        try (reader) {
            System.out.println("Input email: ");
            email = reader.readLine();

            System.out.println("Input password: ");
            password = reader.readLine();
            verify();
            while (!signedIn) {
                //TO-DO: Ask for email & password then save them to suitable variables
                System.out.println("Input email: ");
                email = reader.readLine();

                System.out.println("Input password: ");
                password = reader.readLine();

                //TO-DO: Verify the input values then display suitable message
                verify();
                System.out.println("Try again");

            }

            System.out.println("Succesfull");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private boolean verify() {
        System.out.println(DATA_BASE.get(password));
        if (DATA_BASE.get(password).equals(email)) {
            setSignedIn(!signedIn);
        }
        return signedIn;
    }

    //TO-DO: Implement the pay() method
    /**
     * Save customer data for future shopping attempts.
     */
    @Override
    public boolean pay(int paymentAmount) {
    	/*if customer already 'signedIn' => display a message 
    	to show that customer is paying with PayPal with money amount
    	then return true else return false */
        if(signedIn) {
            System.out.println("You are paying with PayPal " + paymentAmount);
            return true;
        }
    	return false;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}