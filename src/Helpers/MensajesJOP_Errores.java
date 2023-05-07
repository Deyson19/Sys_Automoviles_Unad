/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author Deyson Vente
 */
public class MensajesJOP_Errores {
    public static String PasswordInseguro(){
        return "Esta contraseña no es segura, ingresa una nueva.\nDebe incluir signos, letras mayúsculas y minúsculas y números.";
    }
    public static String PasswordNoCoincide(){
        return "Las contraseñas ingresadas no coinciden.\nDeben ser iguales para continuar.";
    }
    public static String PasswordCorto(){
        return "Debes ingresar una contraseña más larga.";
    }
    
    public static String CamposSinLlenar(){
        return "Debes ingresar información en cada campo.\nComplete todos los campos.";
    }
    
    public static String CampoIdVacio(){
        return "Debes ingresar información en el campo ID";
    }
    
    public static String Login_UsuarioNoIngresado(){
        return "Debes ingresar un Usuario válido para iniciar sesión.";
    }
    
    public static String Login_CamposInvalidos(){
        return "El Usuario ingresado y/o la Contraseña son incorrectos.";
    }
    
    public static String Login_PasswordVacio(){
        return "Debes ingresar una contraseña válida.\nComprueba los datos.";
    }
}
