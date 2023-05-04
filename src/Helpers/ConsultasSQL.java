
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

    public static String TraerTodosLosRoles() {
        return "SELECT rolname, idRoles FROM roles ORDER BY idRoles";
    }

    public static String TraerTiposVehiculos() {
        return "SELECT idVehicleType,nameVehicle FROM vehiclestype ORDER BY idVehicleType";
    }

    // #region Consultas para el UsuarioController

    public static String CrearUsuario() {
        return "INSERT INTO users (name,surname,username,password,rol_id) VALUES (?,?,?,?,?)";
    }

    public static String ActualizarUsuario(int id) {
        return "update users set name=?,surname=?,username=?,password=?,rol_id=? where idUser ='" + id + "'";
    }

    public static String EliminarUsuario(int id) {
        return "delete FROM users WHERE idUser = '" + id + "'";
    }

    public static String ListarUsuario(int id) {

        return "SELECT idUser,name,surname,username,rol_id FROM users WHERE idUser = '" + id + "'";
    }

    public static String TraerTodosLosUsuarios() {
        return "SELECT name,surname,username,rol_id FROM users ORDER BY idUser";
    }
    // #endregion

    // #region Consultas para VehiculosController

    public static String CrearVehiculo() {
        return "INSERT INTO vehicles (Plate,Status,Reason_Ingress,Owner_Id,VehicleType_Id,Delivery_Date,Service_cost,Duration,Service_Shift,Date_entry) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    }

    public static String ActualizarVehiculo(int id) {
        return "update vehicles set Status=?,Reason_Ingress=?,VehicleType_Id=?,Delivery_Date=?,Service_cost=?,Duration=?,Date_entry=? where idVehicle ='"
                + id + "'";
    }

    public static String EliminarVehiculo(int id) {
        return "Delete FROM vehicles WHERE idVehicle = '" + id + "'";
    }

    public static String ListarVehiculo(int id) {
        return "SELECT Plate,Status,Reason_Ingress,Owner_Id,VehicleType_Id,Delivery_Date,Service_cost,Duration,Service_Shift,Date_entry FROM vehicles WHERE idVehicle = '"
                + id + "'";
    }

    public static String TraerTodosLosVehiculos() {
        return "SELECT Plate,VehicleType_Id,Status,Owner_Id,Date_entry,Delivery_Date,Reason_Ingress,Service_Cost FROM vehicles";
    }

    public static String VerificarPropietario() {
        return "SELECT idOwner FROM owners WHERE Cedula = ?";
    }
    // #endregion
}
