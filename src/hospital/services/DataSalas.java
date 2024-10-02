package hospital.services;

import hospital.mode.salas.Sala;

import java.util.ArrayList;

public class DataSalas {

    public static ArrayList listaSalas(){

        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(new Sala("Sala de Emergencias", "En uso"));
        salas.add(new Sala("Sala de Cirugía 1", "Fuera de servicio"));
        salas.add(new Sala("Sala de Cirugía 2", "Disponible"));
        salas.add(new Sala("Sala de Maternidad", "Disponible"));
        salas.add(new Sala("Sala de Terapia Intensiva", "En uso"));
        salas.add(new Sala("Sala de Radiología", "Disponible"));
        salas.add(new Sala("Sala de Consulta Externa", "En uso"));
        salas.add(new Sala("Sala de Oncología", "Fuera de servicio"));
        salas.add(new Sala("Sala de Pediatría", "Disponible"));
        salas.add(new Sala("Sala de Rehabilitación", "En uso"));
        salas.add(new Sala("Sala de Ginecología", "Disponible"));
        salas.add(new Sala("Sala de Urología", "Fuera de servicio"));

        return salas;
    }

}
