package Models;

//Clase para la tabla Users
public class Usuarios {
   private int idUsuario;
   private String Name,SurName,UserName,Password,Rol_Id;

    public Usuarios(int idUsuario, String Name, String SurName, String UserName, String Password, String Rol_Id) {
        this.idUsuario = idUsuario;
        this.Name = Name;
        this.SurName = SurName;
        this.UserName = UserName;
        this.Password = Password;
        this.Rol_Id = Rol_Id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRol_Id() {
        return Rol_Id;
    }

    public void setRol_Id(String Rol_Id) {
        this.Rol_Id = Rol_Id;
    }
   
   
}
