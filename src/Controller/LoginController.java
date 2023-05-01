/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class LoginController{

    ConexionLocal connConsultar = ConexionLocal.getInstancia();
    ErroresSistema errorHaciaSistema = ErroresSistema.getInstanciaErrores();
    public boolean consultarUsuario(Login consultaUsuario) {
        ErroresSistemaController errorSistema = new ErroresSistemaController();
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
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
            errorHaciaSistema.setClaseProveedora(this.getClass().getName());
            errorHaciaSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorHaciaSistema.setDescripcionMensaje(e.getMessage());
            
            errorSistema.NuevoError(errorHaciaSistema);
            connConsultar.desconectar();
            return false;
            
        }

    }
 
}
