import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JPanel implements ActionListener{
    JLabel bigTitle;

    JTextField user;
    JLabel userTitle;

    JPasswordField password;
    JLabel passwordTitle;

    JButton login;


    public GUI(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
        setLayout(null);

        bigTitle = new JLabel("LOGIN");
        bigTitle.setBounds(200,0,50,40);

        userTitle = new JLabel("username");
        userTitle.setBounds(30,50,75,40);
        user = new JTextField();
        user.setBounds(120,50,200,40);
        user.addActionListener(this);

        passwordTitle = new JLabel("password");
        passwordTitle.setBounds(30,100,75,40);
        password = new JPasswordField();
        password.setBounds(120,100,200,40);
        password.addActionListener(this);

        login = new JButton("login");
        login.setBounds(170,150,100,40);
        login.addActionListener(this);

        add(bigTitle);
        add(userTitle);
        add(user);
        add(passwordTitle);
        add(password);
        add(login);
}
@Override
public void actionPerformed(ActionEvent e){
//coding the login button
    if(e.getSource()==login){
        String userText;
        String passText;
        userText = user.getText();
        passText = password.getText();
        if(userText.equalsIgnoreCase("nathan")&& passText.equalsIgnoreCase("333")){
            JOptionPane.showMessageDialog(this,"Successful!!");
        }else{
            JOptionPane.showMessageDialog(this,"Unsuccessful!!");
        }
    }
}
}
