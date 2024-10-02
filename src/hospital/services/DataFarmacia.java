package hospital.services;

import hospital.mode.Medicamento;
import hospital.mode.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataFarmacia {

    public static ArrayList listaFarmacia(){

        ArrayList<Medicamento> medicamento = new ArrayList<>();
        medicamento.add(new Medicamento("Paracetamol", "Tableta", "500 mg", "Paracetamol", LocalDate.of(2025, 12, 31), "12345", 1.50, "Alivio de fiebre y dolor", "Ninguna"));
        medicamento.add(new Medicamento("Ibuprofeno", "Tableta", "400 mg", "Ibuprofeno", LocalDate.of(2024, 11, 30), "12346", 2.00, "Alivio del dolor y la inflamación", "Ulceras"));
        medicamento.add(new Medicamento("Amoxicilina", "Cápsula", "500 mg", "Amoxicilina", LocalDate.of(2026, 1, 15), "12347", 3.00, "Tratamiento de infecciones bacterianas", "Alergia a penicilinas"));
        medicamento.add(new Medicamento("Loratadina", "Tableta", "10 mg", "Loratadina", LocalDate.of(2025, 5, 20), "12348", 1.80, "Alivio de alergias", "Embarazo"));
        medicamento.add(new Medicamento("Omeprazol", "Cápsula", "20 mg", "Omeprazol", LocalDate.of(2026, 7, 25), "12349", 2.50, "Tratamiento de úlceras gástricas", "Ninguna"));

        // Ejemplo de 35 más para completar
        for (int i = 1; i <= 35; i++) {
            medicamento.add(new Medicamento("Medicamento " + (i + 4), "Forma " + (i + 4),
                    (i + 4) * 100 + " mg", "Principio Activo " + (i + 4),
                    LocalDate.of(2027, 12, 31), "Lote " + (i + 4), (i + 4) * 2.0,
                    "Indicaciones " + (i + 4), "Contraindicaciones " + (i + 4)));
        }



        return medicamento;

    }
}
