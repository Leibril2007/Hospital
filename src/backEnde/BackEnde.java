package backEnde;

import hospital.mode.DoctorGeneral;
import hospital.services.bdDoctores;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {

   public static HashMap<String, String> validarDatos(String user, String password){

       ArrayList<DoctorGeneral> doctores = bdDoctores.listaDoctores();

       for (DoctorGeneral infoDoc : doctores){

           if (infoDoc.getEmail().equalsIgnoreCase(user)){
               if (infoDoc.getPasswordD().equalsIgnoreCase(password)){

                   HashMap<String, String> datosDoctor = new HashMap<>();
//                   datosDoctor.put(user, infoDoc.getPasswordD());
                   datosDoctor.put("user", "Aaron Almendro");
                   System.out.println(datosDoctor.get("user"));
                   return datosDoctor;
               }
           }
       }

       HashMap<String, String> datosDoctor = new HashMap<>();
       datosDoctor.put("Error", "Mensaje");
       System.out.println(datosDoctor.get("Error"));

       return datosDoctor;
    }


}