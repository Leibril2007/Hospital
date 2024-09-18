import hospital.controller.LoginController;
import hospital.view.LoginView;

public class Main{
    public static void main(String[] args) {

        LoginView login = new LoginView();
        LoginController controlLogin = new LoginController(login); // Recibe como parametro un objeto tipo loginView

    }
}