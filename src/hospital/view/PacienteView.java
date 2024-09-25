package hospital.view;

import hospital.mode.Paciente;
import hospital.services.DataPaciente;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView {

    private ArrayList<Paciente> paciente;

    public PacienteView(ArrayList<Paciente> paciente){
        this.paciente = paciente;
    }

    public static JPanel panelPaciente(ArrayList<Paciente> paciente){

        JPanel pacientesPanel = new JPanel();
        pacientesPanel.setLayout(new GridLayout(21, 4));

        JLabel titPaciente = new JLabel("Listado de pacientes");
        titPaciente.setFont(new Font("Liberation Sans", Font.BOLD, 20));

        pacientesPanel.add(titPaciente);

        String [] campos = {"NOMBRE","FECHA_NACIMIENTO","HORARIO_CITA","VISITA",};


        for (String campo : campos) {
            pacientesPanel.add(new JLabel(campo));
        }

        ArrayList<Paciente> listaPacientes = DataPaciente.listaPacientes();

        for (Paciente infoPaciente : listaPacientes) {
            pacientesPanel.add(new JLabel(infoPaciente.getNombre()));
            pacientesPanel.add(new JLabel(infoPaciente.getFechaNacimiento()));
            pacientesPanel.add(new JLabel(infoPaciente.getHorarioCita()));
            pacientesPanel.add(new JLabel(infoPaciente.getMotivoVisita()));
        }


        return pacientesPanel;
    }



}
