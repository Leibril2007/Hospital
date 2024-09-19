package hospital.controller;

import backEnde.BackEnde;
import hospital.view.LoginView;

import java.util.HashMap;

public class LoginController {

    //CREA UN OBJETO
    private LoginView loginView;

    //Recibe como parametro una interfaz grafica
    public LoginController(LoginView loginView){
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> controlDeLogin());
    }

    public void controlDeLogin(){

        HashMap validar = BackEnde.validarDatos(loginView.getEmail(), loginView.getPassword());

    }

}
