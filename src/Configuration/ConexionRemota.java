/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import Interfaces.IGestorConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Deyson Vente
 */
public class ConexionRemota implements IGestorConexion {
    private String url;
    private String usuario;
    private String clave;
    private Connection conexion;

    public ConexionRemota(String url, String usuario, String clave) {
        this.url = url;
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conectado a la base de datos remota");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionRemota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void desconectar() {
        try {
            conexion.close();
            System.out.println("Desconectado de la base de datos remota");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionRemota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean testearConexion() {
        try {
            return !conexion.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
