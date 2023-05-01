package Controller;

import Configuration.ConexionLocal;
import Models.ErroresSistema;
import Models.Roles;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class RolesController {

    private final ConexionLocal connConsultar = ConexionLocal.getInstancia();
    ErroresSistema errorCrear = ErroresSistema.getInstanciaErrores();
    ErroresSistemaController errorHaciaControlador = new ErroresSistemaController();
    private final Roles mostrarRoles = new Roles();

    public List<Roles> traerRoles() {
        List<Roles> roles = new ArrayList<>();
        String sql = "SELECT rolname, idRoles FROM roles ORDER BY idRoles";

        try {
            connConsultar.conectar();
            PreparedStatement stmt = connConsultar.getConexion().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Roles rol = new Roles();
                rol.setIdRol(rs.getInt("idRoles"));
                rol.setNombreRol(rs.getString("rolname"));
                roles.add(rol);
            }
            return roles;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar roles: " + this.getClass().getName());
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            
            errorHaciaControlador.NuevoError(errorCrear);

            return Collections.emptyList();
        }
    }

    public List<Roles> obtenerRoles() {
        return traerRoles(); // devuelve la lista de roles recuperados
    }

}
