import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Log extends JFrame {

public static void main(String[] args) {
Log frameTabel = new Log();
}

JButton blogin = new JButton("Login");
JPanel panel = new JPanel();
JTextField txuser = new JTextField(15);
JPasswordField pass = new JPasswordField(15);

Log(){
super("Login Autentification");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 


txuser.setBounds(70,30,150,20);
pass.setBounds(70,65,150,20);
blogin.setBounds(110,100,80,20);

panel.add(blogin);
panel.add(txuser);
panel.add(pass);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
}

public void actionlogin(){
blogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String Name = txuser.getText();
String password = pass.getText();
if(Name.equals("test") && password.equals("12345")) {
newframe regFace =new newframe();
regFace.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Wrong Password / Username");
txuser.setText("");
pass.setText("");
txuser.requestFocus();
}

}
});
}
}

and you must save this source below with name "newframe.java"


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class newframe extends JFrame {

public static void main(String[] args) {
newframe frameTabel = new newframe();
}

JLabel welcome = new JLabel("Welcome to a New Frame");
JPanel panel = new JPanel();

newframe(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}

