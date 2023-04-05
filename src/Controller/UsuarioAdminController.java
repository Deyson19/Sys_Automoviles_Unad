/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Configuration.ConexionLocal;
import Interfaces.IGestorDatos;
import Models.ErroresSistema;
import Models.UsuarioAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class UsuarioAdminController {

    private Connection cnn;
    private ConexionLocal connNewAdmin = new ConexionLocal();

    public static void main(String[] args) {

        ConexionLocal connNewAdmin = new ConexionLocal();

        connNewAdmin.testearConexion();
        
        //JOptionPane.showMessageDialog(null, "Datos ingresados."+nAdmin.getUsuario()+ "- Password"+nAdmin.getPassword());
    }

    public UsuarioAdminController() {

    }

    public void creacion(UsuarioAdmin u) {
        
        ErroresSistema errorCrear = new ErroresSistema();
        try {
            connNewAdmin.conectar();
            String sql = "INSERT INTO usersadmin (userName,password,rol_id) VALUES (?,?,?)";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1,u.getUsuario());
            st.setString(2, u.getPassword());
            st.setInt(3, 1);
            st.executeUpdate();
            System.out.println("Registro creado");
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException e) {
            System.err.println("Error al guardar nuevo usuario: "+this.getClass().getName());
            JOptionPane.showMessageDialog(null, "Error al guardar");
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            errorCrear.insertarError(errorCrear);
        }
    }

        
}
