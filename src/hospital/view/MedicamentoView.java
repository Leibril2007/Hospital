package hospital.view;

import hospital.mode.Medicamento;
import hospital.services.DataFarmacia;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class MedicamentoView {

    private ArrayList<Medicamento> medicamentos;

    public MedicamentoView(ArrayList<Medicamento> medicamentos){
        this.medicamentos = medicamentos;
    }

    public static JPanel panelMedicamento(ArrayList<Medicamento> medicamentos){

        JPanel medicinaPanel = new JPanel();
        medicinaPanel.setLayout(new GridLayout(43, 9));
        medicinaPanel.setBorder(new EmptyBorder(0,30,0,10));

        JLabel [] campos = {new JLabel("Farmacia"), new JLabel(), new JLabel(), new JLabel()};
        campos[0].setFont(new Font("Nimbus Sans", Font.BOLD, 22));


        for (JLabel campo : campos) {
            medicinaPanel.add(campo);
        }

        String [] campos2 = {"NOMBRE","FORMA FARMACEUTICA","DOSIS","PRINCIPIO ACTIVO"};

        for (String campo2 : campos2) {
            medicinaPanel.add(new JLabel(campo2));
        }

        ArrayList<Medicamento> listaMedicamento = DataFarmacia.listaFarmacia();

        for (Medicamento infoMedicina : listaMedicamento) {
            medicinaPanel.add(new JLabel(infoMedicina.getNombre()));
            medicinaPanel.add(new JLabel(infoMedicina.getFormaFarmaceutica()));
            medicinaPanel.add(new JLabel(infoMedicina.getDosis()));
            medicinaPanel.add(new JLabel(infoMedicina.getPrincipioActivo()));

            System.out.println(infoMedicina.getNombre());
        }

        return medicinaPanel;
    }


}
