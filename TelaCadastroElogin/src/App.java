import javax.swing.SwingUtilities;
import vic.cadastro.login.LoginScreen;
import vic.cadastro.Cadastro;

public class App {
    public static void main(String[] args) {


            String registeredUsername = "usuario"; 
            String registeredPassword = "senha123"; 
    
            SwingUtilities.invokeLater(() -> {
               
                LoginScreen loginScreen = new LoginScreen(registeredUsername, registeredPassword);
                
                loginScreen.setVisible(true); 
            });
        

    //   SwingUtilities.invokeLater (() ->  {
    //     Cadastro cadastro = new Cadastro();
    //     cadastro.setVisible(true);
    //   });

  }
}
