
package DTOs;

import Controller.ErroresSistemaController;
import Helpers.EncriptadorPassword;
import Controller.UsuarioController;
import Interfaces.IEncriptarClave;
import Models.ErroresSistema;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Deyson Vente
 */
public class UsuariosDTO implements IEncriptarClave<UsuariosDTO>{

    private String Nombre, Apellido, NombreUsuario, Clave;
    private int Rol_Id;
    
    ErroresSistema errorSistema = ErroresSistema.getInstanciaErrores();
    ErroresSistemaController guardarError = new ErroresSistemaController();

    public UsuariosDTO() {
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

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getRol_Id() {
        return Rol_Id;
    }

    public void setRol_Id(int Rol_Id) {
        this.Rol_Id = Rol_Id;
    }

    public UsuariosDTO(String Nombre, String Apellido, String NombreUsuario, String Clave, int Rol_Id) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NombreUsuario = NombreUsuario;
        this.Clave = Clave;
        this.Rol_Id = Rol_Id;
    }


    @Override
    public void encriptaPassword(UsuariosDTO nU) {
        String hashedPassword;
        try {
            hashedPassword = EncriptadorPassword.encrypt(this.Clave);
            this.setClave(hashedPassword);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuariosDTO.class.getName()).log(Level.SEVERE, null, ex);
            errorSistema.setCodigoMensaje("Error en la encriptación de la contraseña");
            errorSistema.setClaseProveedora(this.getClass().getName());
            errorSistema.setDescripcionMensaje(ex.getMessage());
            guardarError.NuevoError(errorSistema);
        }        
        UsuarioController usuarioAdC = new UsuarioController();
        usuarioAdC.creacion(nU);
    }

    @Override
    public void update(UsuariosDTO obj,int id) {
        String hashedPassword;
        try {
            hashedPassword = EncriptadorPassword.encrypt(this.Clave);
            this.setClave(hashedPassword);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuariosDTO.class.getName()).log(Level.SEVERE, null, ex);
            errorSistema.setCodigoMensaje("Error en la encriptación de la contraseña");
            errorSistema.setClaseProveedora(this.getClass().getName());
            errorSistema.setDescripcionMensaje(ex.getMessage());
            guardarError.NuevoError(errorSistema);
        }
        UsuarioController usuarioAdC = new UsuarioController();
        usuarioAdC.actualizacion(obj,id);
    }
    
}
