/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Deyson Vente
 */
public class UsuarioAdmin {
    private String nombre_usuario,clave_usuario;
    private int idRol;

    public UsuarioAdmin() {
    }

    public UsuarioAdmin(String nombre_usuario, String clave_usuario, int idRol) {
        this.nombre_usuario = nombre_usuario;
        this.clave_usuario = clave_usuario;
        this.idRol = idRol;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
    
}
