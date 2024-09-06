import javax.swing.SwingUtilities;
import vic.cadastro.login.LoginScreen;
import vic.cadastro.Cadastro;

public class App {
    public static void main(String[] args) {

            // Valores cadastrados (exemplo)
            String registeredUsername = "usuario"; // Usuário cadastrado
            String registeredPassword = "senha123"; // Senha cadastrada
    
            SwingUtilities.invokeLater(() -> {
                // Garante que a criação da interface gráfica ocorra na Thread de Despacho de Eventos do Swing
                LoginScreen loginScreen = new LoginScreen(registeredUsername, registeredPassword);
                // Cria uma instância da tela de login com os dados cadastrados
                loginScreen.setVisible(true); // Torna a janela visível
            });
        

    //   SwingUtilities.invokeLater (() ->  {
    //     Cadastro cadastro = new Cadastro();
    //     cadastro.setVisible(true);
    //   });

  }
}
