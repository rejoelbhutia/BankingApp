package backend;
import CreateAccountScreen;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane; 

public class CreateAccount {
    public static void main(String[] args) {
        //Event Listener
    createButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String userName = userName.getText();
        String gender = gender.getText();
        String email = emailField.getText();
    }
  })
    try {
        FileWriter writer = new FileWriter("CustomersDetails.txt");
        writer.write("userName: "+ userName +", gender: "+ gender +", email: "+ email +"\n");
        writer.close();
        JOptionPane.showMessageDialog(frame,"Account saved!"); // display a pop-up dialog box
    } catch (IOException error) {
        error.printStackTrace();
    }
 }
}
