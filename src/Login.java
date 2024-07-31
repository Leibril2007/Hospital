import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    //El constructor está creando una ventana
    public Login(){

        // MI VENTANA
        this.setLayout(null);

//        this.setBounds(0,0,800,500);
        this.setSize(1800,1000);


        //CREDENCIALES

        // Logo
        ImageIcon logo = new ImageIcon("C://Users//ariab//IdeaProjects//Hospital//src//logoHospital.png");
        JLabel imagenLogo = new JLabel();
        imagenLogo.setBounds(0,0,920,1000);
        imagenLogo.setIcon(new ImageIcon(logo.getImage() .getScaledInstance(950, 1000, Image.SCALE_SMOOTH)));


        JLabel titUser= new JLabel();
        titUser.setFont(null);
        titUser.setFont(new Font("arial", Font.BOLD,20));
        titUser.setText("Usuario:");
        titUser.setBounds(1020,300,200,30);

        this.add(titUser);

        // CAJONES PARA ESCRIBIR
        JTextField user = new JTextField();
        user.setBounds(1020,350,450,50);
        user.setFont(null);
        user.setFont(new Font("arial", Font.PLAIN, 20));

        JLabel titPassw= new JLabel();
        titPassw.setFont(null);
        titPassw.setFont(new Font("arial", Font.BOLD,20));
        titPassw.setText("Contraseña:");
        titPassw.setBounds(1020,450,200,30);

        this.add(titPassw);

        JTextField password = new JTextField();
        password.setBounds(1020,500,450,50);
        password.setFont(null);
        password.setFont(new Font("arial", Font.PLAIN, 20));

        // BOTON

        JButton botonLogin = new JButton();
        botonLogin.setBounds(1350,600,115,40);
        botonLogin.setText("Entrar");
        botonLogin.setFont(null);
        botonLogin.setFont(new Font("arial", Font.BOLD, 16));



        this.add(imagenLogo);
        this.add(user);
        this.add(password);
        this.add(botonLogin);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
