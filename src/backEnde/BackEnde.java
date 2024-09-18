package backEnde;

import hospital.mode.DoctorGeneral;
import hospital.services.bdDoctores;
import hospital.view.LoginView;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {

   public static String validarDatos(String user, String password){

//       System.out.println("XX"+user);
//       System.out.println("ZXX"+password);


       ArrayList<DoctorGeneral> doctores = bdDoctores.listaDoctores();

       for (DoctorGeneral infoDoc : doctores){

           if (infoDoc.getEmail().equalsIgnoreCase(user)){

//               System.out.println("HOLA");

               HashMap<String, String> datosDoctor = new HashMap<>();
               datosDoctor.put(user, infoDoc.getPasswordD());
               System.out.println("DOCTOR "+datosDoctor);
           } else {
//               System.out.println("Usuario no existe");
           }

       }

        return user;
    }

}