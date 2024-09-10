import personalMedico.DoctorGeneral;
import DATA.bdDoctores;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Login extends JFrame {

    public Login(){

        // CONFIGURACIONES DE LA VENTANA
        this.setTitle("Login");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1800,1000);//1000 800
        this.setLocationRelativeTo(null);

        // PANEL PRINCIPAL
        JPanel mainPanel =new JPanel(new GridLayout(1,2));

        // PANEL DEL LOGO
        JPanel panelLogo = new JPanel(new GridBagLayout());
        panelLogo.setBackground(Color.white);

        /*

        //IMAGEN DEL LOGO

        ImageIcon logo = new ImageIcon("C://Users//ariab//IdeaProjects//Hospital//src//img//logoHospital.png");
//      ImageIcon logo = new ImageIcon("/home/ariabi/Datos Ariel/IdeaProjects/Hospital/src/img");
        JLabel imagenLogo = new JLabel();
        imagenLogo.setBounds(0,0,880,1000);
        imagenLogo.setIcon(new ImageIcon(logo.getImage() .getScaledInstance(880, 1000, Image.SCALE_SMOOTH)));

        */

        //IMAGEN DEL LOGO

        JLabel imagenLogo = new JLabel();
        int width = 900;
        int height = getHeight();

        // Redimensionar la imagen
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("img/logoHospital.png"));
        Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Actualizar el ImageIcon y el JLabel
        imagenLogo.setIcon(new ImageIcon(scaledImage));

        //VINCULACION DEL LOGO
        panelLogo.add(imagenLogo);

        // SECCION DEL USUARIO
        JPanel panelCred = new JPanel(new GridBagLayout());
        panelCred.setBackground(Color.white);

        //RESTRICCIONES

        JLabel titUser= new JLabel("Usuario:");
        titUser.setFont(new Font("Arial", Font.BOLD,20));
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets=new Insets(0,0,20,0);
        panelCred.add(titUser, restricciones);

        JTextField userInput = new JTextField();
        userInput.setPreferredSize(new Dimension(300, 40));
        userInput.setFont(null);
        userInput.setFont(new Font("arial",Font.PLAIN,20));
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets=new Insets(0,0,20,0);

        panelCred.add(userInput, restricciones);

        //SECCION DEL PASSWORD
        JLabel titPassw= new JLabel("Contraseña:");
        titPassw.setFont(null);
        titPassw.setFont(new Font("arial", Font.BOLD,20));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets=new Insets(20,0,0,15);

        panelCred.add(titPassw, restricciones);

        JTextField passwordInput = new JTextField();
        passwordInput.setFont(null);
        passwordInput.setFont(new Font("arial", Font.PLAIN, 20));
        passwordInput.setPreferredSize(new Dimension(300, 40));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(20,0,10,0);

        panelCred.add(passwordInput, restricciones);

        //SECCION DEL BOTON
        JButton botonLogin = new JButton("Entrar");
        botonLogin.setFont(null);
        botonLogin.setFont(new Font("arial", Font.BOLD, 16));
        botonLogin.setPreferredSize(new Dimension(180, 40));
        botonLogin.setBackground(Color.darkGray);
        botonLogin.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets=new Insets(40,0,0,0);
        panelCred.add(botonLogin, restricciones);


        // ACCION DEL BOTON
        botonLogin.addActionListener(e -> {

            ArrayList<DoctorGeneral> dataDoctores = bdDoctores.listaDoctores();

            for (DoctorGeneral cadaDoctor : dataDoctores){
                if (cadaDoctor.getEmail().equalsIgnoreCase(userInput.getText())){
                    if (cadaDoctor.getPasswordD().equals(passwordInput.getText())){
                        DoctorGeneral.ventanaDoctor();
                    }
                }else {
                    JLabel msError = new JLabel("Error en correo");
                    msError.setForeground(Color.red);
                    msError.setFont(new Font("Arial", Font.BOLD, 20));
                    panelCred.add(msError);
                }
            }
            panelCred.revalidate();
            panelCred.repaint();

        });


        // VINCULACION A LA VENTANA
        mainPanel.add(panelLogo);
        mainPanel.add(panelCred);
        this.add(mainPanel);
        this.setVisible(true);

    }


}
