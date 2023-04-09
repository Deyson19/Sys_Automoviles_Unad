/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Configuration.EncriptadorPassword;
import Controller.UsuarioAdminController;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Deyson Vente
 */
public class UsuarioAdmin implements Interfaces.IEncriptarClave<UsuarioAdmin> {

    private String usuario, password;

    public UsuarioAdmin() {
    }

    public UsuarioAdmin(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void encriptaPassword(UsuarioAdmin nU) {
       
        String hashedPassword;
        try {
            hashedPassword = EncriptadorPassword.encrypt(this.password);
            this.setPassword(hashedPassword);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioAdmin.class.getName()).log(Level.SEVERE, null, ex);
            ErroresSistema errorSistema = new ErroresSistema();
            errorSistema.setCodigoMensaje("Error en la encriptación de la contraseña");
            errorSistema.setClaseProveedora(this.getClass().getName());
            errorSistema.setDescripcionMensaje(ex.getMessage());
        }        
        UsuarioAdminController usuarioAdC = new UsuarioAdminController();
        usuarioAdC.creacion(nU);

    }

    @Override
    public void update(UsuarioAdmin obj,int id) {
        String hashedPassword;
        try {
            hashedPassword = EncriptadorPassword.encrypt(this.password);
            this.setPassword(hashedPassword);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
