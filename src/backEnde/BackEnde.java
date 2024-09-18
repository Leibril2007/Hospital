package backEnde;

import hospital.mode.DoctorGeneral;
import hospital.services.bdDoctores;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {

   public static String validarDatos(String user, String password){

       ArrayList<DoctorGeneral> doctores = bdDoctores.listaDoctores();

       for (DoctorGeneral infoDoc : doctores){

           if (infoDoc.getEmail().equalsIgnoreCase(user)){
               if (infoDoc.getPasswordD().equalsIgnoreCase(password)){

                   HashMap<String, String> datosDoctor = new HashMap<>();
                   datosDoctor.put(user, infoDoc.getPasswordD());
                   System.out.println("DOCTOR "+datosDoctor);
               }
           } else {
//               HashMap<String, String> datosDoctor = new HashMap<>();
//               datosDoctor.put("Error", "Mensaje");
//               System.out.println(datosDoctor+"Revise password o email");
           }

       }
        return user;
    }

}