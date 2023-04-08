/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Configuration.ConexionLocal;
import Interfaces.IEncriptarClave;
import Models.ErroresSistema;
import Models.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class LoginController{

    private Connection cnn;
    private ConexionLocal connConsultar = new ConexionLocal();

    public boolean consultarUsuario(Login consultaUsuario) {
        ErroresSistema errorCrear = new ErroresSistema();
        String sql = "SELECT u.username, u.password, u.rol_id FROM users u WHERE u.username = ? AND u.password = ? UNION SELECT ua.username, ua.password, ua.rol_id FROM usersadmin ua WHERE ua.username = ? AND ua.password = ?";

        try {
            connConsultar.conectar();
            PreparedStatement stmt = connConsultar.getConexion().prepareStatement(sql);

            System.out.println("V: "+stmt);
            stmt.setString(1, consultaUsuario.getUsuario());
            stmt.setString(2, consultaUsuario.getClave());
            stmt.setString(3, consultaUsuario.getUsuario());
            stmt.setString(4, consultaUsuario.getClave());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // El usuario y la contraseña son válidos en ambas tablas
                // Puede acceder a los campos de la fila de resultados utilizando el método getXXX() apropiado
                String usernameResult = rs.getString("username");
                String passwordResult = rs.getString("password");
                int rol_idResult = rs.getInt("rol_id");
                String adminUsernameResult = rs.getString("userName");
                String adminPasswordResult = rs.getString("password");
                return true;
                // Haga lo que necesite con los resultados aquí
            } else {
                // El usuario y la contraseña no son válidos
                JOptionPane.showMessageDialog(null, "No hay datos para el usuario ingresado.");
                return false;
            }

        } catch (SQLException e) {
            System.err.println("Error al loguearse el usuario: " + this.getClass().getName());
            JOptionPane.showMessageDialog(null, "Error al guardar");
            errorCrear.setClaseProveedora(this.getClass().getName());
            errorCrear.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorCrear.setDescripcionMensaje(e.getMessage());
            errorCrear.insertarError(errorCrear);
            
            return false;
        }

    }

    
}
