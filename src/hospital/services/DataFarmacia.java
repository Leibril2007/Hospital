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
        medicamento.add(new Medicamento("Paracetamol", "Tableta", "500 mg", "Paracetamol", LocalDate.of(2025, 12, 31), "12345", 1.50, "Alivio de fiebre y dolor", "Ninguna"));
        medicamento.add(new Medicamento("Ibuprofeno", "Tableta", "400 mg", "Ibuprofeno", LocalDate.of(2024, 11, 30), "12346", 2.00, "Alivio del dolor y la inflamación", "Ulceras"));
        medicamento.add(new Medicamento("Amoxicilina", "Cápsula", "500 mg", "Amoxicilina", LocalDate.of(2026, 1, 15), "12347", 3.00, "Tratamiento de infecciones bacterianas", "Alergia a penicilinas"));
        medicamento.add(new Medicamento("Loratadina", "Tableta", "10 mg", "Loratadina", LocalDate.of(2025, 5, 20), "12348", 1.80, "Alivio de alergias", "Embarazo"));
        medicamento.add(new Medicamento("Omeprazol", "Cápsula", "20 mg", "Omeprazol", LocalDate.of(2026, 7, 25), "12349", 2.50, "Tratamiento de úlceras gástricas", "Ninguna"));
        medicamento.add(new Medicamento("Cetirizina", "Tableta", "10 mg", "Cetirizina", LocalDate.of(2025, 3, 15), "12350", 1.90, "Alivio de síntomas alérgicos", "Embarazo"));
        medicamento.add(new Medicamento("Clorfenamina", "Tableta", "4 mg", "Clorfenamina", LocalDate.of(2024, 9, 30), "12351", 1.70, "Alivio de alergias", "Ninguna"));
        medicamento.add(new Medicamento("Metformina", "Tableta", "500 mg", "Metformina", LocalDate.of(2026, 12, 10), "12352", 2.20, "Control de la diabetes tipo 2", "Ninguna"));
        medicamento.add(new Medicamento("Atenolol", "Tableta", "50 mg", "Atenolol", LocalDate.of(2025, 6, 1), "12353", 2.80, "Tratamiento de hipertensión", "Asma"));
        medicamento.add(new Medicamento("Simvastatina", "Tableta", "20 mg", "Simvastatina", LocalDate.of(2026, 2, 28), "12354", 3.10, "Reducción de colesterol", "Ninguna"));
        medicamento.add(new Medicamento("Losartán", "Tableta", "50 mg", "Losartán", LocalDate.of(2024, 8, 31), "12355", 3.30, "Tratamiento de hipertensión", "Ninguna"));
        medicamento.add(new Medicamento("Ranitidina", "Tableta", "150 mg", "Ranitidina", LocalDate.of(2025, 4, 15), "12356", 2.00, "Tratamiento de úlceras gástricas", "Ninguna"));
        medicamento.add(new Medicamento("Ciprofloxacino", "Tableta", "500 mg", "Ciprofloxacino", LocalDate.of(2026, 11, 1), "12357", 4.00, "Tratamiento de infecciones", "Alergia a quinolonas"));
        medicamento.add(new Medicamento("Fluoxetina", "Cápsula", "20 mg", "Fluoxetina", LocalDate.of(2025, 12, 15), "12358", 3.50, "Tratamiento de depresión", "Ninguna"));
        medicamento.add(new Medicamento("Salbutamol", "Inhalador", "100 mcg", "Salbutamol", LocalDate.of(2026, 5, 20), "12359", 3.70, "Alivio de asma", "Ninguna"));
        medicamento.add(new Medicamento("Dexametasona", "Tableta", "1 mg", "Dexametasona", LocalDate.of(2025, 1, 10), "12360", 2.40, "Antiinflamatorio", "Ninguna"));
        medicamento.add(new Medicamento("Bupropión", "Tableta", "150 mg", "Bupropión", LocalDate.of(2026, 8, 15), "12361", 3.20, "Tratamiento de depresión", "Ninguna"));
        medicamento.add(new Medicamento("Carvedilol", "Tableta", "12.5 mg", "Carvedilol", LocalDate.of(2025, 2, 28), "12362", 3.00, "Tratamiento de insuficiencia cardíaca", "Ninguna"));
        medicamento.add(new Medicamento("Alprazolam", "Tableta", "0.5 mg", "Alprazolam", LocalDate.of(2024, 7, 30), "12363", 2.70, "Tratamiento de ansiedad", "Ninguna"));
        medicamento.add(new Medicamento("Tamsulosina", "Cápsula", "0.4 mg", "Tamsulosina", LocalDate.of(2025, 10, 5), "12364", 2.50, "Tratamiento de hiperplasia prostática benigna", "Ninguna"));
        medicamento.add(new Medicamento("Escitalopram", "Tableta", "10 mg", "Escitalopram", LocalDate.of(2026, 3, 1), "12365", 3.40, "Tratamiento de depresión", "Ninguna"));
        medicamento.add(new Medicamento("Venlafaxina", "Tableta", "75 mg", "Venlafaxina", LocalDate.of(2025, 9, 30), "12366", 3.80, "Tratamiento de depresión y ansiedad", "Ninguna"));
        medicamento.add(new Medicamento("Lisinopril", "Tableta", "20 mg", "Lisinopril", LocalDate.of(2026, 4, 30), "12367", 2.90, "Tratamiento de hipertensión", "Ninguna"));
        medicamento.add(new Medicamento("Montelukast", "Tableta", "10 mg", "Montelukast", LocalDate.of(2025, 7, 15), "12368", 3.00, "Prevención de asma", "Ninguna"));
        medicamento.add(new Medicamento("Omeprazol", "Cápsula", "40 mg", "Omeprazol", LocalDate.of(2026, 11, 30), "12369", 2.60, "Tratamiento de reflujo gástrico", "Ninguna"));
        medicamento.add(new Medicamento("Metoprolol", "Tableta", "100 mg", "Metoprolol", LocalDate.of(2025, 1, 5), "12370", 2.50, "Tratamiento de hipertensión", "Ninguna"));
        medicamento.add(new Medicamento("Rifampicina", "Cápsula", "300 mg", "Rifampicina", LocalDate.of(2026, 10, 10), "12371", 3.90, "Tratamiento de infecciones bacterianas", "Ninguna"));
        medicamento.add(new Medicamento("Clopidogrel", "Tableta", "75 mg", "Clopidogrel", LocalDate.of(2025, 8, 20), "12372", 3.00, "Prevención de trombosis", "Ninguna"));
        medicamento.add(new Medicamento("Duloxetina", "Cápsula", "30 mg", "Duloxetina", LocalDate.of(2026, 6, 15), "12373", 3.30, "Tratamiento de depresión y ansiedad", "Ninguna"));
        medicamento.add(new Medicamento("Sitagliptina", "Tableta", "100 mg", "Sitagliptina", LocalDate.of(2025, 5, 25), "12374", 3.70, "Control de diabetes tipo 2", "Ninguna"));
        medicamento.add(new Medicamento("Acarbosa", "Tableta", "50 mg", "Acarbosa", LocalDate.of(2026, 9, 20), "12375", 2.90, "Control de diabetes tipo 2", "Ninguna"));
        medicamento.add(new Medicamento("Citalopram", "Tableta", "20 mg", "Citalopram", LocalDate.of(2024, 12, 15), "12376", 3.10, "Tratamiento de depresión", "Ninguna"));


        return medicamento;

    }
}
