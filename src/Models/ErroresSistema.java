/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Configuration.ConexionLocal;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deyson Vente
 */
//Esta es una clase para capturar los errores que se manejen en el sistema
public class ErroresSistema {   
    private String CodigoMensaje,ClaseProveedora;
    private String DescripcionMensaje;

    
    public ErroresSistema() {
    }

    public ErroresSistema(String CodigoMensaje, String ClaseProveedora, String DescripcionMensaje) {
        this.CodigoMensaje = CodigoMensaje;
        this.ClaseProveedora = ClaseProveedora;
        this.DescripcionMensaje = DescripcionMensaje;
    }

    public String getCodigoMensaje() {
        return CodigoMensaje;
    }

    public void setCodigoMensaje(String CodigoMensaje) {
        this.CodigoMensaje = CodigoMensaje;
    }

    public String getClaseProveedora() {
        return ClaseProveedora;
    }

    public void setClaseProveedora(String ClaseProveedora) {
        this.ClaseProveedora = ClaseProveedora;
    }

    public String getDescripcionMensaje() {
        return DescripcionMensaje;
    }

    public void setDescripcionMensaje(String DescripcionMensaje) {
        this.DescripcionMensaje = DescripcionMensaje;
    }
    
    public void insertarError(ErroresSistema error) {
    try {
        // Establecer la conexión a la base de datos
        ConexionLocal cnLocal = new ConexionLocal();
        cnLocal.conectar();
        // Preparar la consulta SQL para insertar el error
        PreparedStatement ps = cnLocal.getConexion().prepareStatement("INSERT INTO systemerrors (messageCode,ClassProvider,messageDescription) VALUES (?, ?, ?)");

        // Establecer los parámetros de la consulta con los valores del objeto ErrorSistema
        ps.setString(1, error.getCodigoMensaje());
        ps.setString(2, error.getClaseProveedora());
        ps.setString(3, error.getDescripcionMensaje());
       
        // Ejecutar la consulta
        ps.executeUpdate();

        // Cerrar la conexión y la consulta
        ps.close();
        cnLocal.desconectar();
    } catch (SQLException ex) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
    }
}
    
}
