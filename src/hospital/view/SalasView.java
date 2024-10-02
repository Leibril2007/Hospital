package hospital.view;


import hospital.mode.salas.Sala;
import hospital.services.DataSalas;
import javax.swing.*;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class SalasView {

    public String Nombre;
    public String estado;

    private List<String> estados = Arrays.asList("En uso", "Fuera de servicio", "Disponible");


    public static JPanel panelSala(String Nombre, String estados){

        JPanel basePanel = new JPanel();
        basePanel.setLayout(new GridBagLayout());
        basePanel.setBackground(Color.WHITE);
        GridBagConstraints restricciones = new GridBagConstraints();

        JPanel salaPanel = new JPanel();
        salaPanel.setLayout(new GridBagLayout());
        salaPanel.setBackground(Color.WHITE);
        salaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel tituloPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tituloPanel.setBackground(Color.WHITE);

        JLabel titulo = new JLabel("Salas");
        titulo.setFont(new Font("Nimbus Sans", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createEmptyBorder(5, 18, 5, 0));

        tituloPanel.add(titulo);

        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.weightx = 1.0;
        restricciones.weighty = 0.1;
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        basePanel.add(tituloPanel, restricciones);

        ArrayList<Sala> listaSala = DataSalas.listaSalas();

        for (int valorSala = 0; valorSala < 12; valorSala++) {

            if (valorSala < listaSala.size()) {

                JPanel panel = new JPanel();
                panel.setPreferredSize(new Dimension(50, 50));
                panel.setLayout(new GridLayout(1, 1));


                Sala infoSala = listaSala.get(valorSala);
                panel.add(new JLabel(infoSala.toString(), SwingConstants.CENTER));

                switch (infoSala.getEstado()) {
                    case "En uso":
                        panel.setBackground(Color.YELLOW);
                        break;
                    case "Disponible":
                        panel.setBackground(Color.GREEN);
                        break;
                    case "Fuera de servicio":
                        panel.setBackground(Color.RED);
                        break;
                }

                restricciones.gridx = valorSala % 4;
                restricciones.gridy = 1 + (valorSala / 4);
                restricciones.weightx = 1.0;
                restricciones.weighty = 1.0;
                restricciones.insets = new Insets(8,8,8,8);
                restricciones.fill = GridBagConstraints.BOTH;
                salaPanel.add(panel, restricciones);
            }
        }

        restricciones.gridx = 0;
        restricciones.gridy = 1;
        basePanel.add(salaPanel, restricciones);

        return basePanel;
    }


}
