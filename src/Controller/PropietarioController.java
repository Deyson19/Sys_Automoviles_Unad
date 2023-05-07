
package Controller;

import Configuration.ConexionLocal;
import DTOs.PropietarioDTO;
import Helpers.ConsultasSQL;
import Interfaces.IGestorDatos;
import Models.ErroresSistema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class PropietarioController implements IGestorDatos<PropietarioDTO> {

    private final ConexionLocal connNewAdmin = ConexionLocal.getInstancia();
    ErroresSistema errorCrear = ErroresSistema.getInstanciaErrores();
    ErroresSistemaController guardarError = new ErroresSistemaController();

    @Override
    public void creacion(PropietarioDTO crearPropietario) {
        try {
            connNewAdmin.conectar();
            String sql = ConsultasSQL.CrearPropietario();
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, crearPropietario.getCedula());
            st.setString(2, crearPropietario.getNombre());
            st.setString(3, crearPropietario.getApellido());
            st.setString(4, crearPropietario.getCarta_Propiedad());
            st.setString(5, crearPropietario.getDireccion());
            st.setString(6, crearPropietario.getNumeroCelular());
            st.setString(7, crearPropietario.getCorreo());
            st.setString(8, crearPropietario.getTipoDocumento());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado un nuevo registro.", "Datos Guardados",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            if (e.getErrorCode() == 1452) {
                // La excepción es una violación de la restricción de clave foránea
                JOptionPane.showMessageDialog(null,
                        "Por favor comprueba que los datos correspondan a un propietario correcto.",
                        "Error al asociar propietario.", JOptionPane.ERROR_MESSAGE);
                errorCrear.setClaseProveedora(this.getClass().getName());
                errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
                errorCrear.setDescripcionMensaje(e.getMessage());
                guardarError.NuevoError(errorCrear);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor comprueba los datos.", "Error al crear",
                        JOptionPane.ERROR_MESSAGE);
                errorCrear.setClaseProveedora(this.getClass().getName());
                errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
                errorCrear.setDescripcionMensaje(e.getMessage());
                guardarError.NuevoError(errorCrear);
            }

        } finally {
            connNewAdmin.desconectar();
        }
    }

    @Override
    public PropietarioDTO lectura(int idLeePropietario) {

        String sql = ConsultasSQL.ListarPropietario(idLeePropietario);
        PropietarioDTO propietarioEncontrado = null;

        try {
            connNewAdmin.conectar();
            PreparedStatement stmt = connNewAdmin.getConexion().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                propietarioEncontrado = new PropietarioDTO();
                propietarioEncontrado.setCedula(rs.getString("Cedula"));
                propietarioEncontrado.setNombre(rs.getString("Name"));
                propietarioEncontrado.setApellido(rs.getString("Surname"));
                propietarioEncontrado.setCarta_Propiedad(rs.getString("Ownership_letter"));
                propietarioEncontrado.setDireccion(rs.getString("Address"));
                propietarioEncontrado.setNumeroCelular(rs.getString("PhoneNumber"));
                propietarioEncontrado.setCorreo(rs.getString("Email"));
                propietarioEncontrado.setTipoDocumento(rs.getString("Document_type"));

            } else {
                // inicializar el objeto en caso de que no se encuentre el usuario
                propietarioEncontrado = new PropietarioDTO();
                JOptionPane.showMessageDialog(null, "No se encontraron datos.");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(errorCrear);
        } finally {
            connNewAdmin.desconectar();
        }

        return propietarioEncontrado;
    }

    @Override
    public void actualizacion(PropietarioDTO actualizarPropietario, int idPropietario) {

        try {
            connNewAdmin.conectar();
            String sql = ConsultasSQL.ActualizarPropietario(idPropietario);
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, actualizarPropietario.getNombre());
            st.setString(2, actualizarPropietario.getApellido());
            st.setString(3, actualizarPropietario.getDireccion());
            st.setString(4, actualizarPropietario.getNumeroCelular());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualziados");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar");
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(errorCrear);
        } finally {
            connNewAdmin.desconectar();
        }
    }

    @Override
    public void eliminacion(int idEliminaPropietario) {
        String sql = ConsultasSQL.EliminarPropietario(idEliminaPropietario);
        try {
            connNewAdmin.conectar();
            PreparedStatement stmt = connNewAdmin.getConexion().prepareStatement(sql);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos Eliminados");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos a eliminar");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + this.getClass().getName());
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(errorCrear);
        } finally {
            connNewAdmin.desconectar();
        }
    }

}
