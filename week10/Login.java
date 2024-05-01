import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class Login extends Frame implements ActionListener {
    TextField usernameField, passwordField;
    Button loginButton;

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        add(new Label("Username:"));
        usernameField = new TextField("");
        add(usernameField);

        add(new Label("Password:"));
        passwordField = new TextField("");
        passwordField.setEchoChar('*'); // Display asterisks for password
        add(passwordField);

        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        // Listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "YOU have entered correct credentials");
        } else {
            JOptionPane.showMessageDialog(null, "YOU have entered incorrect credentials");
        }
    }

    public static void main(String[] args) {
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
}
