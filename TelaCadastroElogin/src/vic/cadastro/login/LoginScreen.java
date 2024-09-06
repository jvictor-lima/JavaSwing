package vic.cadastro.login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
   
    private JTextField usernameField; 
    private JPasswordField passwordField; 
    private JButton loginButton; 

    
    private String registeredUsername;
    private String registeredPassword;

    
    public LoginScreen(String registeredUsername, String registeredPassword) {
        this.registeredUsername = registeredUsername;
        this.registeredPassword = registeredPassword;

        
        setTitle("Tela de Login"); 
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setResizable(false); 

        
        setLayout(new GridLayout(3, 2, 10, 10));
        

        
        usernameField = new JTextField(); 
        passwordField = new JPasswordField(); 
        loginButton = new JButton("Login"); 

        
        add(new JLabel("Usuário:")); 
        add(usernameField); 
        add(new JLabel("Senha:")); 
        add(passwordField); 
        add(new JLabel()); 
        add(loginButton); 

        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin(); 
            }
        });
    }

    
    private void handleLogin() {
        String username = usernameField.getText(); 
        String password = new String(passwordField.getPassword()); 
        

       
        if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
            
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.");
            
        }
    }

    
    
}
