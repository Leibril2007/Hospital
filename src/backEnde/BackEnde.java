package backEnde;

import java.util.HashMap;

public class BackEnde {

    public static String validarDatos(String user, String pass){

        HashMap<String, String> mensajeValidacion = new HashMap<>();
        mensajeValidacion.put("Error", "Mensaje");

        if (user.equalsIgnoreCase(user)){
            if (pass.equalsIgnoreCase(pass)){
                System.out.print(mensajeValidacion.get("Mensaje"));
            }
        } else {
            System.out.print(mensajeValidacion.get("Error"));
        }

        return user;
    }

}