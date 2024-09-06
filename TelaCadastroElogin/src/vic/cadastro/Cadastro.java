package vic.cadastro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Cadastro extends JFrame {
  
  private JTextField usernamField;
  private JPasswordField passwordField;
  private JPasswordField confirmPasswordField;
  private JButton registerButton;
  
  public Cadastro (){
    setTitle("Tela de Cadastro: ");
    setSize(350, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    setLayout(new GridLayout(4,2,10,10));

    usernamField = new JTextField();
    passwordField = new JPasswordField();
    confirmPasswordField = new JPasswordField();
    registerButton = new JButton("Cadastrar");

    add(new JLabel("Usuario: "));
    add(usernamField);
    add(new JLabel("Senha: "));
    add(passwordField);
    add(new JLabel("Confirmar Senha: "));
    add(confirmPasswordField);
    add(new JLabel(""));
    add(registerButton);

    registerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            acaoCadastro();
        }

    });
    
  }

  private void acaoCadastro(){
    String username = usernamField.getText();
    String password = new String(passwordField.getPassword());
    String confirmPassword = new String(confirmPasswordField.getPassword());
    if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        return;
    }

    if(password.equals(confirmPassword)){
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso");

        usernamField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");

    }else{
        JOptionPane.showMessageDialog(this, "As senhas devem ser iguais");
    }

  }


}
