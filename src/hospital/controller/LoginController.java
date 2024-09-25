package hospital.controller;

import backEnde.BackEnde;
import hospital.view.DoctorView;
import hospital.view.LoginView;

import java.util.HashMap;

public class LoginController {

    //CREA UN OBJETO
    private LoginView loginView;

    //Recibe como parametro una interfaz grafica
    public LoginController(LoginView loginView){
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion(){

        HashMap validar = BackEnde.validarDatos(loginView.getEmail(), loginView.getPassword());

        DoctorView doctorView = new DoctorView(validar);
    }

}
