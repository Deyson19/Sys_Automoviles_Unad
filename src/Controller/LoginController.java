
package Controller;

import Configuration.ConexionLocal;
import Helpers.ConsultasSQL;
import Models.ErroresSistema;
import Models.Login;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class LoginController {

    // #region Objetos para trabajar en la clase. No es necesario crear más
    ConexionLocal connConsultar = ConexionLocal.getInstancia();
    ErroresSistema errorHaciaSistema = ErroresSistema.getInstanciaErrores();
    private String usernameResult, passwordResult, adminUsernameResult, adminPasswordResult;
    private int rol_idResult;

    ErroresSistemaController errorSistema = new ErroresSistemaController();

    // #endregion
    public boolean consultarUsuario(Login consultaUsuario) {

        String sql = ConsultasSQL.Login();
        try {
            connConsultar.conectar();
            PreparedStatement stmt = connConsultar.getConexion().prepareStatement(sql);

            stmt.setString(1, consultaUsuario.getUsuario());
            stmt.setString(2, consultaUsuario.getClave());
            stmt.setString(3, consultaUsuario.getUsuario());
            stmt.setString(4, consultaUsuario.getClave());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // El usuario y la contraseña son válidos en ambas tablas
                // Puede acceder a los campos de la fila de resultados utilizando el método
                usernameResult = rs.getString("username");
                passwordResult = rs.getString("password");
                rol_idResult = rs.getInt("rol_id");
                adminUsernameResult = rs.getString("userName");
                adminPasswordResult = rs.getString("password");
                return true;
            } else {
                // El usuario y la contraseña no son válidos
                JOptionPane.showMessageDialog(null, "No hay datos para el usuario ingresado.");
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
            errorHaciaSistema.setClaseProveedora(this.getClass().getName());
            errorHaciaSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorHaciaSistema.setDescripcionMensaje(e.getMessage());

            // Enviar mensaje al controlador de Errores
            errorSistema.NuevoError(errorHaciaSistema);
            connConsultar.desconectar();
            return false;

        }

    }

}
