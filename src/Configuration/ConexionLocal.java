package Configuration;

import Interfaces.IGestorConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deyson Vente
 */
public class ConexionLocal implements IGestorConexion {

    private final String url = "jdbc:mysql://localhost/db_sys_vehiclesjava";
    private final String usuario = "root";
    private final String clave = "";
    private Connection conexion;

    private static ConexionLocal instancia;

    private ConexionLocal() {

    }

    public static ConexionLocal getInstancia() {
        if (instancia == null) {
            instancia = new ConexionLocal();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

    @Override
    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(this.url, this.usuario, this.clave);
            System.out.println("Conectado a la base de datos local");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void desconectar() {
        conectar();
        try {
            conexion.close();
            System.out.println("Desconectado de la base de datos local");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean testearConexion() {
        try {
            return conexion != null && !conexion.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);           
            return false;
        }
    }

}
