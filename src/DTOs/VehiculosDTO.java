/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import java.util.Date;

/**
 *
 * @author Deyson Vente
 */
public class VehiculosDTO {
    private String Placa,Estado,RazonIngreso,Propietario_Id,TipoVehiculo_Id;
    private Date FechaEntrada,FechaSalida;
    private String CostoServicio;
    private String Duracion;
    private String Turno;

    public VehiculosDTO() {
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

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
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

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }
    
    
}
