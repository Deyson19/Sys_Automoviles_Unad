
package Helpers;

import Models.ErroresSistema;

/**
 * @author Deyson Vente
 */
public class ConsultasSQL {

    public static String Login() {
        return "SELECT u.username, u.password, u.rol_id FROM users u WHERE u.username = ? AND u.password = ? UNION SELECT ua.username, ua.password, ua.rol_id FROM usersadmin ua WHERE ua.username = ? AND ua.password = ?";
    }

    public static String GuardarError(ErroresSistema errores) {
        return "INSERT INTO systemerrors VALUES ('" + errores.getCodigoMensaje() + "','" + errores.getClaseProveedora()
                + "','" + errores.getDescripcionMensaje() + "')";
    }

    // #region Consultas de PropietarioController

    public static String CrearPropietario() {
        return "INSERT INTO owners (Cedula,Name,Surname,Ownership_letter,Address,PhoneNumber,Email,Document_type) "
                + "VALUES (?,?,?,?,?,?,?,?)";
    }

    public static String ActualizarPropietario(int id) {
        return "update owners set Name=?,Surname=?,Address=?,PhoneNumber=? where idOwner='" + id + "'";
    }

    public static String EliminarPropietario(int id) {
        return "Delete FROM owners WHERE idOwner = '" + id + "'";
    }

    public static String ListarPropietario(int id) {
        return "SELECT Cedula,Name,Surname,Ownership_letter,Address,PhoneNumber,Email,Document_Type FROM owners WHERE idOwner = '"
                + id + "'";
    }

    // #endregion
}
