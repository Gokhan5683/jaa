import java.awt.*;
import java.awt.event.*;

class LoginScreenAWT extends Frame implements ActionListener {
    Label labelUser, labelPass, labelMessage;
    TextField textUser, textPass;
    Button btnLogin, btnClear;
    int attempts = 3;

    public LoginScreenAWT() {
        setLayout(new FlowLayout());

        labelUser = new Label("Username:");
        textUser = new TextField(20);

        labelPass = new Label("Password:");
        textPass = new TextField(20);
        textPass.setEchoChar('*');

        labelMessage = new Label();

        btnLogin = new Button("Login");
        btnClear = new Button("Clear");

        add(labelUser);
        add(textUser);
        add(labelPass);
        add(textPass);
        add(btnLogin);
        add(btnClear);
        add(labelMessage);

        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);

        setTitle("Login Screen");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (command.equals("Clear")) {
            textUser.setText("");
            textPass.setText("");
            labelMessage.setText("");
        } else if (command.equals("Login")) {
            String username = textUser.getText();
            String password = textPass.getText();

            if (attempts <= 0) {
                labelMessage.setText("No more attempts!");
                btnLogin.setEnabled(false);
                return;
            }

            if (username.equals(password)) {
                labelMessage.setText("Login successful!");
            } else {
                attempts--;
                labelMessage.setText("Invalid login! Attempts left: " + attempts);
            }
        }
    }

    public static void main(String[] args) {
        new LoginScreenAWT();
    }
}
