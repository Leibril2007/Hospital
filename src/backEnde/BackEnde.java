package backEnde;

import hospital.mode.DoctorGeneral;
import hospital.services.bdDoctores;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {

    public static HashMap<String, String> validarDatos(String user, String password){

        ArrayList<DoctorGeneral> doctores = bdDoctores.listaDoctores();

        for (DoctorGeneral infoDoc : doctores){

            if (infoDoc.getEmail().equalsIgnoreCase(user) || infoDoc.getUsuario().equalsIgnoreCase(user)){
                if (infoDoc.getPasswordD().equalsIgnoreCase(password)){

                    HashMap<String, String> datosDoctor = new HashMap<>();
                    datosDoctor.put("nombre doctor", infoDoc.getNombre());
                    datosDoctor.put("apellido doctor", infoDoc.getApellido());
                    datosDoctor.put("especialidad", infoDoc.getEspecialidad());
                    datosDoctor.put("password", infoDoc.getPasswordD());
                    datosDoctor.put("email", infoDoc.getEmail());
                    datosDoctor.put("usuario", infoDoc.getUsuario());

                    System.out.println(datosDoctor.entrySet());
                    return datosDoctor;
                }
            }else {
                HashMap<String, String> datosDoctor = new HashMap<>();
                datosDoctor.put("Error", "¡¡ERROR!! Verifique usuario o contraseña");
                return null;
            }
        }

        HashMap<String, String> datosDoctor = new HashMap<>();
        datosDoctor.put("Error", "¡¡ERROR!! Verifique usuario o contraseña");
        System.out.println(datosDoctor.get("Error"));

        return datosDoctor;
    }

}