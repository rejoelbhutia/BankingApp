import java.awt.*;
import java.awt.event.*;
public class CreateAccountScreen {
    public CreateAccountScreen(){
    Frame frame = new Frame("Create Account");
   frame.setSize(400, 300);
    frame.setLayout(null);
    frame.setVisible(true);

    //label and textBox
    Label labelName = new Label("Enter Full Name:");
    TextField userName = new TextField();
    labelName.setBounds(50,50,100,30);
    userName.setBounds(150,50,200,30);

    Label labelForAccountNo = new Label("Enter Account Number:");
    TextField accountNo = new TextField();
    labelForAccountNo.setBounds(50, 100, 100, 30);
    accountNo.setBounds(150, 100, 200, 30);


    Label labelForGender = new Label("Enter your gender(Male/Female):");
    TextField gender = new TextField();
    labelForGender.setBounds(50, 150, 100, 30);
    gender.setBounds(150, 200, 200, 30);

    Label labelForInitialDeposit = new Label("Enter Initial Deposit:");
    TextField initialDeposit = new TextField();
    labelForInitialDeposit.setBounds(50, 200, 100, 30);
    initialDeposit.setBounds(150, 200, 200, 30);

    

    //submit button

    Button createButton = new Button("Create Account");
    createButton.setBounds(150, 250, 100, 30);


        //exitButton
    Button exitButton = new Button("Exit");
    exitButton.setBounds(220, 250, 100, 30);

    exitButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    });



    

    frame.add(labelName);
    frame.add(userName);
    frame.add(labelForAccountNo);
    frame.add(accountNo);
    frame.add(labelForGender);
    frame.add(gender);
    frame.add(labelForInitialDeposit);
    frame.add(initialDeposit);
    frame.add(createButton);
    frame.add(exitButton);
    }
}
