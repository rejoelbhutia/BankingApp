package backend;

import CreateAccountScreen;

import java.awt.event.*;
import java.util.Random;

class CustomerDetails {  
    String accountNo;
    String customerID;
}

public class Account {
    public static void main(String[] args) {
      
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
        Random rand = new Random(); 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digit = rand.nextInt(10); 
            sb.append(digit);
        }

        CustomerDetails c1 = new CustomerDetails();
        c1.accountNo = sb.toString();
        c1.customerID = "xyz" + c1.accountNo;

        System.out.println("Your Account has Successfully created !");
        System.out.println("Your Account Number: " + c1.accountNo);
        System.out.println("Your Customer ID: " + c1.customerID);
            }
        })
    }
}
