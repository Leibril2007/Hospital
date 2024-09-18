package hospital.services;

import hospital.mode.DoctorGeneral;

import java.util.ArrayList;

public class bdDoctores {


    public static ArrayList listaDoctores(){

        // La clase arrayList crea un objeto de la clase alumno.
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Dr. Aaron", "ALmendro", "pediatra", 123, "patitas123", "aAlmendro@gmail.com", "almendro"));
        doctores.add(new DoctorGeneral("Dra. Abigail", "Asturias", "ginecologa", 456, "doki234", "abiDoc@gmail.com", "almendro1" ));
        doctores.add(new DoctorGeneral("Dr. Mario", "Angeles", "pediatra", 789, "dinos853", "docAngel@gmail.com", "almendro2"));
        doctores.add(new DoctorGeneral("Dra. Camila", "Paredes", "ginecologa", 1011, "patitos24", "camiParedes@gmail.com", "almendro3"));
        doctores.add(new DoctorGeneral("Dr. Esteban", "Ramirez", "endocrinologo", 1213, "conejitos888", "docRami@gmail.com", "almendro4"));
        doctores.add(new DoctorGeneral("Dr. Angel", "Hollywood", "cancerologo", 1415, "perritos203", "Holly.angel@gmail.com", "almendro5"));
        doctores.add(new DoctorGeneral("Dra. Sarai", "Cuc", "endocrinologa", 1617, "caballos1555", "dra.sara@gmail.com", "almendro6"));
        doctores.add(new DoctorGeneral("Dr. Thomas", "Xot", "cancerologo", 1819, "camello156", "thomyDoc@gmail.com", "almendro7"));
        doctores.add(new DoctorGeneral("Dr. Humberto", "Garcia", "pediatra", 2021, "canario696", "humbertGarcia@gmail.com", "almendro8"));
        doctores.add(new DoctorGeneral("Dra. Sharon", "Castillo", "pediatra", 2223, "loritosCantan205", "docCastillo@gmail.com", "almendro9"));


        return doctores;
    }


}
