import java.awt.*;
import java.awt.event.*;

import javax.swing.ActionMap;
import javax.swing.JOptionPane;
public class AWT extends Frame implements ActionListener{
    TextField name,email;
    Button add1;
    AWT(){
       this.setLayout(new GridLayout(4,2)); 
       this.setSize(300,250);
       this.setVisible(true);

       this.add(new Label("Name"));
       name = new TextField("");
       this.add(name);

       this.add(new Label("email"));
       email = new TextField("");
       this.add(email);
       add1 = new Button("Check");
       this.add(add1);
       add1.addActionListener(this);
       this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            dispose();
        }
       });
    }
    public void actionPerformed(ActionEvent e){
        String n = name.getText();
        String em = email.getText();
        if(!n.isEmpty() && !em.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"you have entered your details");
        }
        else{
            JOptionPane.showMessageDialog(null, "please enter all Fields");
        }
    }
    public static void main(String[] args) {
        AWT x = new AWT();
    }
}
