package hospital.controller;

import hospital.view.LoginView;

public class LoginController {

    //CREA UN OBJETO
    private LoginView loginView;

    //Recibe como parametro una interfaz grafica
    public LoginController(LoginView loginView){
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> controlDeLogin());
    }

    public void controlDeLogin(){
        System.out.println("Hola login");
    }

}
