package hospital.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.Border;



public class LoginView extends JFrame {

    // OBJETOS GLOBALES
    private JTextField emailInput;
    private JPasswordField passwordInput;
    private JButton botonLogin;

    public LoginView(){

        //VENTANA
        this.setSize(700, 900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Login");

        //PANEL PRINCIPAL
        JPanel panelMain = new JPanel(new GridBagLayout());
        panelMain.setBackground(Color.WHITE);

        // PASSWORD Y CORREO

        //------- EMAIL ----------
        JLabel emailText = new JLabel("Correo:");
        emailText.setFont(new Font("Liberation Sans", Font.CENTER_BASELINE, 21));
        emailText.setForeground(Color.gray);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets = new Insets(0,10,30,0);
        panelMain.add(emailText, restricciones);

        emailInput = new JTextField();
        emailInput.setPreferredSize(new Dimension(300, 30));
        emailInput.setFont(null);
        emailInput.setFont(new Font("Liberation Sans",Font.PLAIN,20));

        //CONFIGURACION DEL BORDE
        Border bordeEmailInp = BorderFactory.createMatteBorder(0,0,2,0, Color.lightGray);
        emailInput.setBorder(bordeEmailInp);

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(0,50,30,0);
        panelMain.add(emailInput, restricciones);

        //------- PASSWORD ----------
        JLabel passwordText = new JLabel("Contraseña:");
        passwordText.setFont(new Font("Liberation Sans", Font.CENTER_BASELINE, 21));
        passwordText.setForeground(Color.gray);

        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets = new Insets(0,10,30,50);
        panelMain.add(passwordText, restricciones);

        passwordInput = new JPasswordField();
        passwordInput.setPreferredSize(new Dimension(300, 30));
        passwordInput.setFont(null);
        passwordInput.setFont(new Font("arial",Font.PLAIN,20));

        //CONFIGURACION DEL BORDE
        Border bordePasswInp = BorderFactory.createMatteBorder(0,0,2,0, Color.lightGray);
        passwordInput.setBorder(bordePasswInp);

        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(0,50,30,0);
        panelMain.add(passwordInput, restricciones);

        //BOTON
        botonLogin = new JButton("Iniciar sesión");
        botonLogin.setPreferredSize(new Dimension(300, 40));
        botonLogin.setFont(new Font("Liberation Sans", Font.CENTER_BASELINE, 21));
        botonLogin.setBackground(Color.lightGray);
        botonLogin.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(0,50,0,0);
        panelMain.add(botonLogin, restricciones);

        this.add(panelMain);
        this.setVisible(true);

    }

    public String getEmail(){
        return emailInput.getText();
    }
    public String getPassword(){
        return new String(passwordInput.getPassword());
    }

    public void addLoginListener(ActionListener listener){

        botonLogin.addActionListener(listener);

    }

}

