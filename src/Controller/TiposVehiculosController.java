package Controller;

import Configuration.ConexionLocal;
import Models.TiposVehiculos;
import Models.*;
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
public class TiposVehiculosController {

    private final ConexionLocal connConsultar = ConexionLocal.getInstancia();

    private final TiposVehiculos recuperarTipos = new TiposVehiculos();
    ErroresSistema errorRecuperar = ErroresSistema.getInstanciaErrores();
    ErroresSistemaController guardarError = new ErroresSistemaController();

    public List<TiposVehiculos> traerTiposVehiculos() {
        List<TiposVehiculos> tiposVehiculos = new ArrayList<>();
        String sql = "SELECT idVehicleType,nameVehicle FROM vehiclestype ORDER BY idVehicleType";
        try {
            connConsultar.conectar();
            PreparedStatement pt = connConsultar.getConexion().prepareStatement(sql);
            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                TiposVehiculos vehiculos = new TiposVehiculos();
                vehiculos.setIdTipoVehiculo(rs.getInt("idVehicleType"));
                vehiculos.setNombre(rs.getString("nameVehicle"));
                tiposVehiculos.add(vehiculos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            errorRecuperar.setClaseProveedora(this.getClass().getName());
            errorRecuperar.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            errorRecuperar.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(errorRecuperar);

            return Collections.emptyList();
        }
        return tiposVehiculos;
    }

    public List<TiposVehiculos> listadoTiposVehiculos() {
        return traerTiposVehiculos();
    }
}
