package Controller;

import Configuration.ConexionLocal;
import Helpers.ConsultasSQL;
import Models.ErroresSistema;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Deyson Vente
 */
public class ErroresSistemaController {

    ConexionLocal miConexion = ConexionLocal.getInstancia();

    public boolean NuevoError(ErroresSistema errores) {
        //Cambiar tipo de consulta y pasarla por (?)
        String sql = ConsultasSQL.GuardarError(errores);

        try{
            // Preparar la consulta SQL para insertar el error
            PreparedStatement ps = miConexion.getConexion().prepareStatement(sql);
            // Ejecutar la consulta
            ps.executeUpdate();
            // Cerrar la conexión y la consulta
            System.out.println("Mensaje guardado desde:" + this.getClass().getName());
            miConexion.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo guardar el mensaje de error.");
            return false;
        }
    }
}
