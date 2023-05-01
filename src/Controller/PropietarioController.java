
package Controller;

import Configuration.ConexionLocal;
import DTOs.PropietarioDTO;
import Interfaces.IGestorDatos;
import Models.ErroresSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class PropietarioController implements IGestorDatos<PropietarioDTO> {

    private Connection cnn;
    private final ConexionLocal connNewAdmin = ConexionLocal.getInstancia();
    ErroresSistema errorCrear = ErroresSistema.getInstanciaErrores();
    ErroresSistemaController guardarError = new ErroresSistemaController();

    @Override
    public void creacion(PropietarioDTO objeto) {
        try {
            connNewAdmin.conectar();
            String sql = "INSERT INTO owners (Cedula,Name,Surname,Ownership_letter,Address,PhoneNumber,Email,Document_type) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, objeto.getCedula());
            st.setString(2, objeto.getNombre());
            st.setString(3, objeto.getApellido());
            st.setString(4, objeto.getCarta_Propiedad());
            st.setString(5, objeto.getDireccion());
            st.setString(6, objeto.getNumeroCelular());
            st.setString(7, objeto.getCorreo());
            st.setString(8, objeto.getTipoDocumento());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado un nuevo registro.", "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            if (e.getErrorCode() == 1452) {
                // La excepción es una violación de la restricción de clave foránea
                JOptionPane.showMessageDialog(null, "Por favor comprueba que los datos sean coherentes con un propietario", "Error de clave foránea", JOptionPane.ERROR_MESSAGE);
                errorCrear.setClaseProveedora(this.getClass().getName());
                errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
                errorCrear.setDescripcionMensaje(e.getMessage());
                guardarError.NuevoError(errorCrear);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor comprueba los datos.", "Error al crear", JOptionPane.ERROR_MESSAGE);
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
    public PropietarioDTO lectura(int id) {
        
        String sql = "SELECT Cedula,Name,Surname,Ownership_letter,Address,PhoneNumber,Email,Document_Type FROM owners WHERE idOwner = '" + id + "'";
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
                propietarioEncontrado = new PropietarioDTO(); // inicializar el objeto en caso de que no se encuentre el usuario
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
    public void actualizacion(PropietarioDTO objeto, int id) {
       
        try {
            connNewAdmin.conectar();
            String sql = "update owners set Name=?,Surname=?,Address=?,PhoneNumber=? where idOwner='" + id + "'";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, objeto.getNombre());
            st.setString(2, objeto.getApellido());
            st.setString(3, objeto.getDireccion());
            st.setString(4, objeto.getNumeroCelular());
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
    public void eliminacion(int id) {
        String sql = "Delete FROM owners WHERE idOwner = '" + id + "'";
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
