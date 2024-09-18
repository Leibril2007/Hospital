package hospital.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300,800};


    public DoctorView(){

        //----------- -----------VENTANA--------------------
        this.setSize(pantalla[0], pantalla[1]);
        this.setLayout(new BorderLayout());
        this.setTitle("Perfil del doctor");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //----------- -----------HEADER--------------------
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.darkGray);

        // NOMBRE DEL HOSPITAL
        JLabel nombreHospital = new JLabel("Hospital Santa Catalina");
        nombreHospital.setForeground(Color.white);
        nombreHospital.setFont(new Font("Liberation Sans", Font.BOLD, 16));
        nombreHospital.setBorder(new EmptyBorder(0, 30, 0, 0)); // establece un margen

        //------------------LOGO Y USUARIO DEL DOCTOR-------------------
        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setPreferredSize(new Dimension(270,60));
        userPanel.setBackground(Color.darkGray);

        // LOGO
        JPanel representacionLogo = new JPanel();
        representacionLogo.setPreferredSize(new Dimension(40,40));
        representacionLogo.setBackground(Color.orange);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        restricciones.insets = new Insets(0,14,0,0);

        userPanel.add(representacionLogo, restricciones);

        // NOMBRE DOCTOR

        JLabel nombreDoc = new JLabel("Aaron Almendro");
        nombreDoc.setFont(new Font("Liberation Sans", Font.BOLD, 15));
        nombreDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;

        userPanel.add(nombreDoc, restricciones);

        // ESPECIALIDAD

        JLabel especialidadDoc = new JLabel("Doctor General");
        especialidadDoc.setFont(new Font("Liberation Sans", Font.PLAIN, 13));
        especialidadDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 2;
        restricciones.anchor = GridBagConstraints.WEST;

        userPanel.add(especialidadDoc, restricciones);

        // AGREGACIONES
        headerPanel.add(userPanel, BorderLayout.EAST);
        headerPanel.add(nombreHospital, BorderLayout.WEST);
        this.add(headerPanel, BorderLayout.NORTH);
        this.setVisible(true);

    }
}
