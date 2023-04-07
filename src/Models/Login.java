/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Configuration.EncriptadorPassword;
import Controller.LoginController;
import Interfaces.IEncriptarClave;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deyson Vente
 */
public class Login implements IEncriptarClave<Login>{
    private String usuario,clave;

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void encriptaPassword(Login nU) {
        String hashedPassword;
        try {
            hashedPassword = EncriptadorPassword.encrypt(this.clave);
            this.setClave(hashedPassword);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioAdmin.class.getName()).log(Level.SEVERE, null, ex);
            ErroresSistema errorSistema = new ErroresSistema();
            errorSistema.setCodigoMensaje("Error en la encriptación de la contraseña");
            errorSistema.setClaseProveedora(this.getClass().getName());
            errorSistema.setDescripcionMensaje(ex.getMessage());
        }        
        LoginController usuarioAdC = new LoginController();
        usuarioAdC.consultarUsuario(nU);

    }

    /**
     *
     * @param obj
     */
    @Override
    public void update(Login obj) {
        String hashedPassword;
        try {
            hashedPassword = EncriptadorPassword.encrypt(this.clave);
            this.setClave(hashedPassword);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
}
