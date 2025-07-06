package backend;

import CreateAccountScreen;
import java.awt.event.*;

class TransactionsFacilities{
    int deposit;
    int Withdraw;
    int balance = 2000;
}

// for Deposit
class Deposit extends TransactionsFacilities {
   public void Deposit(){
    int input = initialDeposit.getText();
    int depositValue = Integer.parseInt(input);
     
    depositButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            balance = balance + depositValue;
       }
   })
 }
}

// for withdraw
class Withdraw extends TransactionsFacilities{
    public void Withdraw(){
        int Withdraw = initialWithdraw.getText();
        int withdrawValue = Integer.parseInt(Withdraw);
        withdrawButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                if (withdrawValue <= balance) {
            balance = balance - withdrawValue;
            System.out.println("Withdrawn: " + withdrawValue);
        } else {
            System.out.println("Insufficient balance.");
        }
            }
        })
    }
}

// to show balance
class DisplayBalance extends TransactionsFacilities{
    public void DisplayBalance(){
        displayBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
        System.out.println(balance);
            }
        })
    }
} 

public class Transactions {
        public static void main(String[] args) {

        Deposit d1 = new Deposit();
        d1.Deposit();

        Withdraw w1 = new Withdraw();
        w1.Withdraw();

        DisplayBalance db1 = new DisplayBalance();
        db1.DisplayBalance();

        System.out.println("hello Hierarchical inheritance");
    }
}
