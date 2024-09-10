package DATA;

import personalMedico.DoctorGeneral;

import java.util.ArrayList;

public class bdDoctores {


    public static ArrayList listaDoctores(){

        // La clase arrayList crea un objeto de la clase alumno.
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Dr. Aaron", "ALmendro", "pediatra", 123, "patitas123", "aAlmendro@gmail.com"));
        doctores.add(new DoctorGeneral("Dra. Abigail", "Asturias", "ginecologa", 456, "doki234", "abiDoc@gmail.com"));
        doctores.add(new DoctorGeneral("Dr. Mario", "Angeles", "pediatra", 789, "dinos853", "docAngel@gmail.com"));
        doctores.add(new DoctorGeneral("Dra. Camila", "Paredes", "ginecologa", 1011, "patitos24", "camiParedes@gmail.com"));
        doctores.add(new DoctorGeneral("Dr. Esteban", "Ramirez", "endocrinologo", 1213, "conejitos888", "docRami@gmail.com"));
        doctores.add(new DoctorGeneral("Dr. Angel", "Hollywood", "cancerologo", 1415, "perritos203", "Holly.angel@gmail.com"));
        doctores.add(new DoctorGeneral("Dra. Sarai", "Cuc", "endocrinologa", 1617, "caballos1555", "dra.sara@gmail.com"));
        doctores.add(new DoctorGeneral("Dr. Thomas", "Xot", "cancerologo", 1819, "camello156", "thomyDoc@gmail.com"));
        doctores.add(new DoctorGeneral("Dr. Humberto", "Garcia", "pediatra", 2021, "canario696", "humbertGarcia@gmail.com"));
        doctores.add(new DoctorGeneral("Dra. Sharon", "Castillo", "pediatra", 2223, "loritosCantan205", "docCastillo@gmail.com"));


        return doctores;
    }


}
