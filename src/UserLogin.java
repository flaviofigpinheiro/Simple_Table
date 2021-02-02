import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserLogin extends JFrame {

private JTextField textField;
private JPasswordField passwordField;
private JPanel contentPane;
private JButton btnNewButton;



    public static void  main (String[] args) {

        System.out.println("This is user Login");

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserLogin frame = new UserLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
    public UserLogin(){

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds (450,190,1014,597);
            setResizable(false);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);


            //Login Label
       JLabel lblNewlabel = new JLabel ("Login");
       lblNewlabel.setForeground(Color.BLACK);
       lblNewlabel.setFont(new Font("Times New Roman",Font.PLAIN,46));
       lblNewlabel.setBounds(423,13,273,93);
       contentPane.add(lblNewlabel);

       //User Label
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma",Font.PLAIN,32) );
        lblUsername.add(lblUsername);


        //login Label

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setFont(new Font("Tahoma",Font.PLAIN,31) );
        lblPassword.setBounds(250,286,193,52);
        lblPassword.add(lblPassword);


        //password Field
       // passwordField


        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma",Font.PLAIN,26) );
        btnNewButton.setBounds(250,286,193,52);
        contentPane.add(btnNewButton);



    btnNewButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userName = textField.getText();
            String password = passwordField.getText();
            System.out.println("Button is Pressed"+ userName + " : " + password);
            }});






        }
    }




