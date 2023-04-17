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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    public void actualizacion(UsuariosDTO actualizar, int id) {
        ErroresSistema errorCrear = new ErroresSistema();
        try {
            connNewAdmin.conectar();
            String sql = "update users set name=?,surname=?,username=?,password=?,rol_id=? where idUser ='" + id + "'";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, actualizar.getNombre());
            st.setString(2, actualizar.getApellido());
            st.setString(3, actualizar.getNombreUsuario());
            st.setString(4, actualizar.getClave());
            st.setInt(5, actualizar.getRol_Id());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualziados");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar");
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            errorCrear.insertarError(errorCrear);
        }
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

    public List<UsuariosDTO> traerTodosLosUsuarios() {
        List<UsuariosDTO> listadoUsuarios = new ArrayList<>();
        ErroresSistema errorListar = new ErroresSistema();

        String sql = "SELECT Name,Surname,username,rol_id FROM users";

        try {
            connNewAdmin.conectar();
            PreparedStatement pt = connNewAdmin.getConexion().prepareStatement(sql);
            ResultSet rs = pt.executeQuery();

            while (rs.next()) {
                UsuariosDTO usuarios = new UsuariosDTO();
                usuarios.setNombre(rs.getString("name"));
                usuarios.setApellido(rs.getString("surname"));
                usuarios.setNombreUsuario(rs.getString("username"));
                usuarios.setRol_Id(rs.getInt("rol_id"));

                listadoUsuarios.add(usuarios);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            errorListar.setClaseProveedora(this.getClass().getName());
            errorListar.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorListar.setDescripcionMensaje(e.getMessage());
            errorListar.insertarError(errorListar);

            return Collections.emptyList();
        }
        return listadoUsuarios;
    }

    public List<UsuariosDTO> listaCompleta() {
        return traerTodosLosUsuarios();
    }

}
