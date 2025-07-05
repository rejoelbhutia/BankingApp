import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.*;
public class Home {
    public static void main(String[] args) {
        Frame frame = new Frame("Home Page");// frame

        // buttons
        Button button1 = new Button("Create Account");
        Button button2 = new Button("Deposit Money");
        Button button3 = new Button("Withdraw Money");
        Button button4 = new Button("Account Detail");
        Button button5 = new Button("Exit");

        // setting button properties and place
        int buttonWidth = 180;
        int buttonHeight = 150;
        int margin = 20;

        button1.setBounds(10, 100, buttonWidth, buttonHeight);
        button2.setBounds(10 + (buttonWidth + margin) * 1, 100, buttonWidth, buttonHeight);
        button3.setBounds(10 + (buttonWidth + margin) * 2, 100, buttonWidth, buttonHeight);
        button4.setBounds(10 + (buttonWidth + margin) * 3, 100, buttonWidth, buttonHeight);
        button5.setBounds(10 + (buttonWidth + margin) * 4 - 10, 100, buttonWidth, buttonHeight);


        // button designing
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setFont(new Font("Arial", Font.BOLD, 14));
       


        // add buttons to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        //button event
        //when button 5 is clicked it exits
        button5.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent e){
                System.exit(0);
            }
        });

        //button 1 clicks:
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new CreateAccountScreen();
            }
        });

        frame.setSize(1200, 600);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
