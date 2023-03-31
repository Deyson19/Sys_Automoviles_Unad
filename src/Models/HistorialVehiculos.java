/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Deyson Vente
 */
//Clase para consultar el historial total de los vehiculos
public class HistorialVehiculos {
    private int idHistorialVehiculo;
    private String MantenimientoRealizado;
    private int ReparacionesRealizadas,Vehiculo_id;

    public HistorialVehiculos() {
    }

    public HistorialVehiculos(int idHistorialVehiculo, String MantenimientoRealizado, int ReparacionesRealizadas, int Vehiculo_id) {
        this.idHistorialVehiculo = idHistorialVehiculo;
        this.MantenimientoRealizado = MantenimientoRealizado;
        this.ReparacionesRealizadas = ReparacionesRealizadas;
        this.Vehiculo_id = Vehiculo_id;
    }

    public int getIdHistorialVehiculo() {
        return idHistorialVehiculo;
    }

    public void setIdHistorialVehiculo(int idHistorialVehiculo) {
        this.idHistorialVehiculo = idHistorialVehiculo;
    }

    public String getMantenimientoRealizado() {
        return MantenimientoRealizado;
    }

    public void setMantenimientoRealizado(String MantenimientoRealizado) {
        this.MantenimientoRealizado = MantenimientoRealizado;
    }

    public int getReparacionesRealizadas() {
        return ReparacionesRealizadas;
    }

    public void setReparacionesRealizadas(int ReparacionesRealizadas) {
        this.ReparacionesRealizadas = ReparacionesRealizadas;
    }

    public int getVehiculo_id() {
        return Vehiculo_id;
    }

    public void setVehiculo_id(int Vehiculo_id) {
        this.Vehiculo_id = Vehiculo_id;
    }
    
    
}
