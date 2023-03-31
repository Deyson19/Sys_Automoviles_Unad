/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Deyson Vente
 */
public class Propietarios {
    private int idPropietario;
    private String Cedula,Nombre,Apellido,Carta_Propiedad,Direccion,NumeroCelular,Correo;

    public Propietarios() {
    }

    public Propietarios(int idPropietario, String Cedula, String Nombre, String Apellido, String Carta_Propiedad, String Direccion, String NumeroCelular, String Correo) {
        this.idPropietario = idPropietario;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Carta_Propiedad = Carta_Propiedad;
        this.Direccion = Direccion;
        this.NumeroCelular = NumeroCelular;
        this.Correo = Correo;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCarta_Propiedad() {
        return Carta_Propiedad;
    }

    public void setCarta_Propiedad(String Carta_Propiedad) {
        this.Carta_Propiedad = Carta_Propiedad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(String NumeroCelular) {
        this.NumeroCelular = NumeroCelular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
