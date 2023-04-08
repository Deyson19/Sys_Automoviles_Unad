/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Configuration.ConexionLocal;
import DTOs.UsuariosDTO;
import Interfaces.IGestorDatos;
import java.sql.Connection;
import Models.ErroresSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class UsuarioController implements IGestorDatos<UsuariosDTO> {

    private Connection cnn;
    private ConexionLocal connNewAdmin = new ConexionLocal();

    @Override
    public void creacion(UsuariosDTO u) {
        ErroresSistema errorCrear = new ErroresSistema();
        try {
            connNewAdmin.conectar();
            String sql = "INSERT INTO users (name,surname,username,password,rol_id) VALUES (?,?,?,?,?)";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, u.getNombre());
            st.setString(2, u.getApellido());
            st.setString(3, u.getNombreUsuario());
            st.setString(4, u.getClave());
            st.setInt(5, u.getRol_Id());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException e) {
            System.err.println("Error al guardar nuevo usuario: " + this.getClass().getName());
            JOptionPane.showMessageDialog(null, "Error al guardar");
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            errorCrear.insertarError(errorCrear);
        }
    }

    @Override
    public UsuariosDTO lectura(int id) {
        ErroresSistema errorCrear = new ErroresSistema();
        String sql = "SELECT idUser,name,surname,username,rol_id FROM users WHERE idUser = '" + id + "'";
        UsuariosDTO usuarioEncontrado = null;

        try {
            connNewAdmin.conectar();
            PreparedStatement stmt = connNewAdmin.getConexion().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioEncontrado = new UsuariosDTO();
                usuarioEncontrado.setNombre(rs.getString("name"));
                usuarioEncontrado.setApellido(rs.getString("surname"));
                usuarioEncontrado.setNombreUsuario(rs.getString("username"));
                usuarioEncontrado.setRol_Id(rs.getInt("rol_id"));
            } else {
                usuarioEncontrado = new UsuariosDTO(); // inicializar el objeto en caso de que no se encuentre el usuario
                JOptionPane.showMessageDialog(null, "No se encontraron datos.");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            errorCrear.insertarError(errorCrear);
        } finally {
            connNewAdmin.desconectar();
        }

        return usuarioEncontrado;
    }

    @Override
    public void actualizacion(UsuariosDTO actualizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminacion(int id) {
        ErroresSistema errorCrear = new ErroresSistema();
        String sql = "Delete FROM users WHERE idUser = '" + id + "'";

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
            errorCrear.insertarError(errorCrear);
        } finally {
            connNewAdmin.desconectar();
        }

    }

}
