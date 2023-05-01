/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Configuration.ConexionLocal;
import DTOs.VehiculosDTO;
import Interfaces.IGestorDatos;
import Models.ErroresSistema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
public class VehiculosController implements IGestorDatos<VehiculosDTO> {

    private final ConexionLocal connNewAdmin = ConexionLocal.getInstancia();
    ErroresSistema erroresSistema = ErroresSistema.getInstanciaErrores();
    ErroresSistemaController guardarError = new ErroresSistemaController();

    private final VehiculosDTO recuperarTodo = new VehiculosDTO();

    public List<VehiculosDTO> traerTodosLosVehiculos() {
        List<VehiculosDTO> listadoVehiculos = new ArrayList<>();

        String sql = "SELECT Plate,VehicleType_Id,Status,Owner_Id,Date_entry,Delivery_Date,Reason_Ingress,Service_Cost FROM vehicles";

        try {
            connNewAdmin.conectar();
            PreparedStatement pt = connNewAdmin.getConexion().prepareStatement(sql);
            ResultSet rs = pt.executeQuery();

            while (rs.next()) {
                VehiculosDTO vehiculos = new VehiculosDTO();
                vehiculos.setPlaca(rs.getString("Plate"));
                vehiculos.setTipoVehiculo_Id(rs.getString("VehicleType_Id"));
                vehiculos.setEstado(rs.getString("Status"));
                vehiculos.setPropietario_Id(rs.getString("Owner_Id"));

                vehiculos.setFechaEntrada(rs.getDate("Date_entry"));
                vehiculos.setFechaSalida(rs.getDate("Delivery_Date"));
                vehiculos.setRazonIngreso(rs.getString("Reason_Ingress"));
                vehiculos.setCostoServicio(rs.getString("Service_Cost"));
                listadoVehiculos.add(vehiculos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            erroresSistema.setClaseProveedora(this.getClass().getName());
            erroresSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            erroresSistema.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(erroresSistema);

            return Collections.emptyList();
        }
        return listadoVehiculos;
    }

    public List<VehiculosDTO> listaCompleta() {
        return traerTodosLosVehiculos();
    }

    @Override
    public void creacion(VehiculosDTO objeto) {
        try {
            connNewAdmin.conectar();
            int idOwner = 0; // Inicializar a un valor por defecto
            String query = "SELECT idOwner FROM owners WHERE Cedula = ?";
            try (PreparedStatement stmt = connNewAdmin.getConexion().prepareStatement(query)) {
                stmt.setString(1, objeto.getPropietario_Id());
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        idOwner = rs.getInt("idOwner");
                    } else {
                        throw new SQLException("Propietario no encontrado: " + objeto.getPropietario_Id());
                    }
                }
            }
            String sql = "INSERT INTO vehicles (Plate,Status,Reason_Ingress,Owner_Id,VehicleType_Id,Delivery_Date,Service_cost,Duration,Service_Shift,Date_entry) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, objeto.getPlaca());
            st.setString(2, objeto.getEstado());
            st.setString(3, objeto.getRazonIngreso());
            st.setString(4, String.valueOf(idOwner));
            st.setString(5, objeto.getTipoVehiculo_Id());
            //Castear fechas
            java.sql.Date fecha_salida = new java.sql.Date(objeto.getFechaSalida().getTime());
            java.sql.Date fecha_entrada = new java.sql.Date(objeto.getFechaEntrada().getTime());

            st.setDate(6, fecha_salida);
            st.setString(7, objeto.getCostoServicio());
            st.setString(8, objeto.getDuracion());
            st.setString(9, objeto.getTurno());
            st.setDate(10, fecha_entrada);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado un nuevo registro.", "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Por favor comprueba los datos.", "Error al crear", JOptionPane.ERROR_MESSAGE);
            erroresSistema.setClaseProveedora(this.getClass().getName());
            erroresSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            erroresSistema.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(erroresSistema);
            if (e.getErrorCode() == 1452) {
                // La excepción es una violación de la restricción de clave foránea
                JOptionPane.showMessageDialog(null, "Por favor comprueba que los datos sean coherentes con un propietario", "Error de clave foránea", JOptionPane.ERROR_MESSAGE);
                erroresSistema.setClaseProveedora(this.getClass().getName());
                erroresSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
                erroresSistema.setDescripcionMensaje(e.getMessage());
                guardarError.NuevoError(erroresSistema);
            }

        } finally {
            connNewAdmin.desconectar();
        }
    }

    @Override
    public VehiculosDTO lectura(int id) {
        String sql = "SELECT Plate,Status,Reason_Ingress,Owner_Id,VehicleType_Id,Delivery_Date,Service_cost,Duration,Service_Shift,Date_entry FROM vehicles WHERE idVehicle = '" + id + "'";
        VehiculosDTO vehiculoEncontrado = null;

        try {
            connNewAdmin.conectar();
            PreparedStatement stmt = connNewAdmin.getConexion().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                vehiculoEncontrado = new VehiculosDTO();
                vehiculoEncontrado.setPlaca(rs.getString("Plate"));
                vehiculoEncontrado.setEstado(rs.getString("Status"));
                vehiculoEncontrado.setRazonIngreso(rs.getString("Reason_Ingress"));
                vehiculoEncontrado.setPropietario_Id(rs.getString("Owner_Id"));
                vehiculoEncontrado.setTipoVehiculo_Id(rs.getString("VehicleType_Id"));
                vehiculoEncontrado.setFechaSalida(rs.getDate("Delivery_Date"));
                vehiculoEncontrado.setCostoServicio(rs.getString("Service_cost"));
                vehiculoEncontrado.setDuracion(rs.getString("Duration"));
                vehiculoEncontrado.setTurno(rs.getString("Service_Shift"));
                vehiculoEncontrado.setFechaEntrada(rs.getDate("Date_entry"));

            } else {
                vehiculoEncontrado = new VehiculosDTO(); // inicializar el objeto en caso de que no se encuentre el usuario
                JOptionPane.showMessageDialog(null, "No se encontraron datos.");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            erroresSistema.setClaseProveedora(this.getClass().getName());
            erroresSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            erroresSistema.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(erroresSistema);
        } finally {
            connNewAdmin.desconectar();
        }
        return vehiculoEncontrado;
    }

    @Override
    public void actualizacion(VehiculosDTO objeto, int id) {
        try {
            connNewAdmin.conectar();
            String sql = "update vehicles set Status=?,Reason_Ingress=?,VehicleType_Id=?,Delivery_Date=?,Service_cost=?,Duration=?,Date_entry=? where idVehicle ='" + id + "'";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, objeto.getEstado());
            st.setString(2, objeto.getRazonIngreso());
            st.setString(3, objeto.getTipoVehiculo_Id());
            //Castear fechas
            java.sql.Date fecha_salida = new java.sql.Date(objeto.getFechaSalida().getTime());
            java.sql.Date fecha_entrada = new java.sql.Date(objeto.getFechaEntrada().getTime());

            st.setDate(4, fecha_salida);
            st.setString(5, objeto.getCostoServicio());
            st.setString(6, objeto.getDuracion());
            st.setDate(7, fecha_entrada);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualziados");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar");
            erroresSistema.setClaseProveedora(this.getClass().getName());
            erroresSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            erroresSistema.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(erroresSistema);
        } finally {
            connNewAdmin.desconectar();
        }
    }

    @Override
    public void eliminacion(int id) {
        String sql = "Delete FROM vehicles WHERE idVehicle = '" + id + "'";

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
            erroresSistema.setClaseProveedora(this.getClass().getName());
            erroresSistema.setCodigoMensaje(String.valueOf(e.getErrorCode()));
            erroresSistema.setDescripcionMensaje(e.getMessage());
            guardarError.NuevoError(erroresSistema);
        } finally {
            connNewAdmin.desconectar();
        }
    }

}
