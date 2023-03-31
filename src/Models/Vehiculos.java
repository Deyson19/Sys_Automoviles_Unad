/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Deyson Vente
 */
public class Vehiculos {
    private int idVehiculos;
    private String Placa,Estado,RazonIngreso,Propietario_Id,TipoVehiculo_Id;
    private Date FechaEntrada,FechaSalida;
    private String CostoServicio;
    private char Duracion;
    private int Turno;

    public Vehiculos() {
    }

    public Vehiculos(int idVehiculos, String Placa, String Estado, String RazonIngreso, String Propietario_Id, String TipoVehiculo_Id,Date FechaEntrada, Date FechaSalida, String CostoServicio, char Duracion, int Turno) {
        this.idVehiculos = idVehiculos;
        this.Placa = Placa;
        this.Estado = Estado;
        this.RazonIngreso = RazonIngreso;
        this.Propietario_Id = Propietario_Id;
        this.TipoVehiculo_Id = TipoVehiculo_Id;
        this.FechaSalida = FechaSalida;
        this.CostoServicio = CostoServicio;
        this.Duracion = Duracion;
        this.Turno = Turno;
    }

    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRazonIngreso() {
        return RazonIngreso;
    }

    public void setRazonIngreso(String RazonIngreso) {
        this.RazonIngreso = RazonIngreso;
    }

    public String getPropietario_Id() {
        return Propietario_Id;
    }

    public void setPropietario_Id(String Propietario_Id) {
        this.Propietario_Id = Propietario_Id;
    }

    public String getTipoVehiculo_Id() {
        return TipoVehiculo_Id;
    }

    public void setTipoVehiculo_Id(String TipoVehiculo_Id) {
        this.TipoVehiculo_Id = TipoVehiculo_Id;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getCostoServicio() {
        return CostoServicio;
    }

    public void setCostoServicio(String CostoServicio) {
        this.CostoServicio = CostoServicio;
    }

    public char getDuracion() {
        return Duracion;
    }

    public void setDuracion(char Duracion) {
        this.Duracion = Duracion;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int Turno) {
        this.Turno = Turno;
    }
    
    public Date getFechaEntrada(){
        return FechaEntrada;
    }
    public void setFechaEntrada(Date FechaEntrada){
        this.FechaEntrada = FechaEntrada;
    }
}
