/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Deyson Vente
 */
//Esta es una clase para capturar los errores que se manejen en el sistema
public class ErroresSistema {
    private int idErroresSistema;
    private String CodigoMensaje,ClaseProveedora;
    private int Usuario_id;
    private String DescripcionMensaje;

    public ErroresSistema() {
    }

    public ErroresSistema(int idErroresSistema, String CodigoMensaje, String ClaseProveedora, int Usuario_id, String DescripcionMensaje) {
        this.idErroresSistema = idErroresSistema;
        this.CodigoMensaje = CodigoMensaje;
        this.ClaseProveedora = ClaseProveedora;
        this.Usuario_id = Usuario_id;
        this.DescripcionMensaje = DescripcionMensaje;
    }

    public int getIdErroresSistema() {
        return idErroresSistema;
    }

    public void setIdErroresSistema(int idErroresSistema) {
        this.idErroresSistema = idErroresSistema;
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

    public int getUsuario_id() {
        return Usuario_id;
    }

    public void setUsuario_id(int Usuario_id) {
        this.Usuario_id = Usuario_id;
    }

    public String getDescripcionMensaje() {
        return DescripcionMensaje;
    }

    public void setDescripcionMensaje(String DescripcionMensaje) {
        this.DescripcionMensaje = DescripcionMensaje;
    }
    
    
}
