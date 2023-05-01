
package Helpers;

import Models.ErroresSistema;

/**
 * @author Deyson Vente
 */
public class ConsultasSQL {
    
    public static String Login(){
            return "SELECT u.username, u.password, u.rol_id FROM users u WHERE u.username = ? AND u.password = ? UNION SELECT ua.username, ua.password, ua.rol_id FROM usersadmin ua WHERE ua.username = ? AND ua.password = ?";
        }
    public static String GuardarError(ErroresSistema errores){
        return "INSERT INTO systemerrors VALUES ('"+errores.getCodigoMensaje()+"','"+errores.getClaseProveedora()+"','"+errores.getDescripcionMensaje()+"')";
    }
   
}


