/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Configuration.ConexionLocal;
import Models.ErroresSistema;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class ErroresSistemaController {
    private final ConexionLocal cnn = new ConexionLocal();
    private Connection connection;
    private final ErroresSistema errores = new ErroresSistema();
    public boolean NuevoError(){
        String sql = "INSERT INTO systemerrors VALUES ('"+errores.getCodigoMensaje()+"','"+errores.getClaseProveedora()+"','"+errores.getDescripcionMensaje()+"')";
        try {
            cnn.conectar();
            Statement st = cnn.getConexion().createStatement();
            st.executeUpdate(sql);
            System.out.println("Mensaje Guardado");
            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo guardar el mensaje de error.");
            return false;
        }
    }
}
