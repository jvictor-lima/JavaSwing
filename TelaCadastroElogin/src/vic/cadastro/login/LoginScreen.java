package vic.cadastro.login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    // Componentes da tela de login
    private JTextField usernameField; // Campo de texto para o nome de usuário
    private JPasswordField passwordField; // Campo de senha para a senha do usuário
    private JButton loginButton; // Botão para realizar o login

    // Variáveis que armazenam o nome de usuário e senha cadastrados
    private String registeredUsername;
    private String registeredPassword;

    // Construtor que recebe o nome de usuário e senha cadastrados
    public LoginScreen(String registeredUsername, String registeredPassword) {
        this.registeredUsername = registeredUsername;
        this.registeredPassword = registeredPassword;

        // Configuração da janela principal
        setTitle("Tela de Login"); // Define o título da janela
        setSize(300, 150); // Define o tamanho da janela (largura, altura)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o aplicativo quando a janela é fechada
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setResizable(false); // Impede o redimensionamento da janela

        // Configuração do layout
        setLayout(new GridLayout(3, 2, 10, 10));
        // Define o layout da janela como uma grade (3 linhas, 2 colunas, 10px de espaçamento horizontal e vertical)

        // Inicializando componentes
        usernameField = new JTextField(); // Cria o campo de texto para o nome de usuário
        passwordField = new JPasswordField(); // Cria o campo de senha
        loginButton = new JButton("Login"); // Cria o botão de login

        // Adicionando componentes ao layout
        add(new JLabel("Usuário:")); // Adiciona o rótulo "Usuário:" à primeira célula do layout
        add(usernameField); // Adiciona o campo de texto do nome de usuário à segunda célula
        add(new JLabel("Senha:")); // Adiciona o rótulo "Senha:" à terceira célula
        add(passwordField); // Adiciona o campo de senha à quarta célula
        add(new JLabel()); // Adiciona um espaço vazio na quinta célula (para alinhar o botão)
        add(loginButton); // Adiciona o botão de login na sexta célula

        // Ação do botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin(); // Chama o método handleLogin() quando o botão é clicado
            }
        });
    }

    // Método que trata a ação de login
    private void handleLogin() {
        String username = usernameField.getText(); // Obtém o texto inserido no campo de nome de usuário
        String password = new String(passwordField.getPassword()); 
        // Obtém o texto inserido no campo de senha (convertido para String)

        // Valida o login comparando com os dados cadastrados
        if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
            // Se o nome de usuário e senha são iguais aos cadastrados
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            // Exibe uma mensagem de sucesso
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.");
            // Exibe uma mensagem de erro se as credenciais forem inválidas
        }
    }

    // Método principal para executar a tela de login
    
}
