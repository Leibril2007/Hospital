package hospital.services;

import hospital.mode.Enfermeras;
import hospital.mode.Paciente;

import java.util.ArrayList;

public class DataPaciente {

    public static ArrayList listaPacientes(){

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Juan Pérez", "juan@example.com", "555-1234", "Calle 1, Ciudad", "01/01/1990", "10:00 AM", "Consulta general", "3", "Dr. López"));
        pacientes.add(new Paciente("María Gómez", "maria@example.com", "555-5678", "Calle 2, Ciudad", "02/02/1985", "11:00 AM", "Control de rutina", "5", "Dr. Sánchez"));
        pacientes.add(new Paciente("Luis Martínez", "luis@example.com", "555-9876", "Calle 3, Ciudad", "03/03/1980", "01:00 PM", "Chequeo anual", "2", "Dr. Fernández"));
        pacientes.add(new Paciente("Ana Ruiz", "ana@example.com", "555-2468", "Calle 4, Ciudad", "04/04/1995", "02:00 PM", "Consulta dermatológica", "1", "Dr. Pérez"));
        pacientes.add(new Paciente("Carlos Sánchez", "carlos@example.com", "555-1357", "Calle 5, Ciudad", "05/05/1975", "03:00 PM", "Consulta cardiológica", "4", "Dr. Gómez"));
        pacientes.add(new Paciente("Elena Torres", "elena@example.com", "555-2460", "Calle 6, Ciudad", "06/06/1992", "04:00 PM", "Consulta nutricional", "3", "Dr. López"));
        pacientes.add(new Paciente("Fernando Díaz", "fernando@example.com", "555-3698", "Calle 7, Ciudad", "07/07/1983", "05:00 PM", "Chequeo anual", "2", "Dr. Sánchez"));
        pacientes.add(new Paciente("Laura Castro", "laura@example.com", "555-8524", "Calle 8, Ciudad", "08/08/1991", "09:00 AM", "Consulta general", "1", "Dr. Fernández"));
        pacientes.add(new Paciente("Miguel Álvarez", "miguel@example.com", "555-7531", "Calle 9, Ciudad", "09/09/1988", "10:30 AM", "Control de rutina", "6", "Dr. Pérez"));
        pacientes.add(new Paciente("Sofía Mendoza", "sofia@example.com", "555-1597", "Calle 10, Ciudad", "10/10/1994", "11:15 AM", "Consulta dermatológica", "2", "Dr. Gómez"));
        pacientes.add(new Paciente("Ricardo Morales", "ricardo@example.com", "555-2584", "Calle 11, Ciudad", "11/11/1982", "12:00 PM", "Consulta cardiológica", "5", "Dr. López"));
        pacientes.add(new Paciente("Patricia Romero", "patricia@example.com", "555-6543", "Calle 12, Ciudad", "12/12/1990", "01:30 PM", "Consulta nutricional", "3", "Dr. Sánchez"));
        pacientes.add(new Paciente("Javier Ortega", "javier@example.com", "555-9870", "Calle 13, Ciudad", "13/01/1985", "02:45 PM", "Chequeo anual", "4", "Dr. Fernández"));
        pacientes.add(new Paciente("Carmen Silva", "carmen@example.com", "555-3210", "Calle 14, Ciudad", "14/02/1987", "03:30 PM", "Consulta general", "1", "Dr. López"));
        pacientes.add(new Paciente("Esteban Núñez", "esteban@example.com", "555-4567", "Calle 15, Ciudad", "15/03/1989", "04:15 PM", "Control de rutina", "2", "Dr. Sánchez"));
        pacientes.add(new Paciente("Valeria Jiménez", "valeria@example.com", "555-7891", "Calle 16, Ciudad", "16/04/1993", "05:00 PM", "Consulta dermatológica", "5", "Dr. Fernández"));
        pacientes.add(new Paciente("Rafael Herrera", "rafael@example.com", "555-1357", "Calle 17, Ciudad", "17/05/1977", "06:00 PM", "Consulta cardiológica", "3", "Dr. Pérez"));
        pacientes.add(new Paciente("Lucía Castro", "lucia@example.com", "555-9513", "Calle 18, Ciudad", "18/06/1992", "07:30 PM", "Consulta nutricional", "1", "Dr. Gómez"));
        pacientes.add(new Paciente("Gonzalo Paredes", "gonzalo@example.com", "555-7531", "Calle 19, Ciudad", "19/07/1984", "08:45 AM", "Chequeo anual", "2", "Dr. López"));
        pacientes.add(new Paciente("Isabel Peña", "isabel@example.com", "555-9630", "Calle 20, Ciudad", "20/08/1991", "09:15 AM", "Consulta general", "4", "Dr. Sánchez"));
        return pacientes;

    }
}
