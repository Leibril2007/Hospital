package hospital.view;

import hospital.mode.Paciente;
import hospital.services.DataPaciente;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView {

    private ArrayList<Paciente> paciente;

    public PacienteView(ArrayList<Paciente> paciente){
        this.paciente = paciente;
    }

    public static JPanel panelPaciente(ArrayList<Paciente> paciente){

        JPanel pacientesPanel = new JPanel();
        pacientesPanel.setLayout(new GridLayout(25, 3));
        pacientesPanel.setBorder(new EmptyBorder(10,30,0,10));
        pacientesPanel.setBackground(Color.WHITE);

        JLabel [] campos = {new JLabel("Listado de pacientes"), new JLabel(), new JLabel(), new JLabel()};
        campos[0].setFont(new Font("Nimbus Sans", Font.BOLD, 22));

        for (JLabel campo : campos) {
            pacientesPanel.add(campo);
        }

        String [] campos2 = {"NOMBRE","FECHA_NACIMIENTO","HORARIO_CITA","VISITA"};

        for (String campo2 : campos2) {
            pacientesPanel.add(new JLabel(campo2));
        }

        ArrayList<Paciente> listaPacientes = DataPaciente.listaPacientes();

        for (Paciente infoPaciente : listaPacientes) {
            pacientesPanel.add(new JLabel(infoPaciente.getNombre()));
            pacientesPanel.add(new JLabel(infoPaciente.getFechaNacimiento()));
            pacientesPanel.add(new JLabel(infoPaciente.getHorarioCita()));
            pacientesPanel.add(new JLabel(infoPaciente.getMotivoVisita()));
            System.out.println(infoPaciente.getNombre());
        }

        return pacientesPanel;
    }


}
