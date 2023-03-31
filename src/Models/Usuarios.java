package Models;

//Clase para la tabla Users
public class Usuarios {
   private int idUsuario;
   private String Nombre,Apellido,NombreUsuario,Clave,Rol_Id;

    public Usuarios(int idUsuario, String Nombre, String Apellido, String NombreUsuario, String Clave, String Rol_Id) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NombreUsuario = NombreUsuario;
        this.Clave = Clave;
        this.Rol_Id = Rol_Id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getRol_Id() {
        return Rol_Id;
    }

    public void setRol_Id(String Rol_Id) {
        this.Rol_Id = Rol_Id;
    }

    
   
   
}
