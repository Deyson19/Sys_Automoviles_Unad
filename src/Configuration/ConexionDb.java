/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

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
import java.sql.*;

public class ConexionDb {
    private Connection cnn;
    private String cadenaConexion,usuarioDb,claveDb;

    
    public ConexionDb(String cadenaConexion,String usuarioDb,String claveDb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cadenaConexion = cadenaConexion;
            this.cadenaConexion = cadenaConexion;
            this.usuarioDb = usuarioDb;
            this.claveDb = claveDb;
            cnn = DriverManager.getConnection(this.cadenaConexion, this.usuarioDb, this.claveDb);
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean testearConexion() {
        try {
            return !cnn.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void abrirConexion() {
        try {
            cnn = DriverManager.getConnection(cadenaConexion, "root", "");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarConexion() {
        try {
            cnn.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

