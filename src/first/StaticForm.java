package first;

import javax.swing.*;

public class StaticForm extends JFrame 
{
    private JTextField txtName, txtEmail, txtUsername;
    private JPasswordField txtPassword;
    private JButton btnRegister;

    public StaticForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setLayout(null); 

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 20, 80, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120, 20, 200, 25);
        add(txtName);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 60, 80, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(120, 60, 200, 25);
        add(txtEmail);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(20, 100, 80, 25);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(120, 100, 200, 25);
        add(txtUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(20, 140, 80, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 140, 200, 25);
        add(txtPassword);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(150, 180, 100, 30);
        add(btnRegister);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new StaticForm();
    }
}

