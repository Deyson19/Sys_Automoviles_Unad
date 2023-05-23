/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author Deyson Vente
 */

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class ValidarDireccion {
    
    private static ValidarDireccion instanciaUnica;
    
    private ValidarDireccion(){
        
    }

    public static ValidarDireccion getInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new ValidarDireccion();
        }
        return instanciaUnica;
    }
    
    
    
    public boolean isEsValido() {
        return esValido;
    }

    public boolean esValido;
    public boolean validarDireccion(String txtDireccion) {
        // Expresión regular para validar que solo se ingresen números
        String patron = "^\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){1,100}$";


        // Crear un objeto Pattern y un objeto Matcher para aplicar el patrón
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(txtDireccion);

        // Verificar si el número ingresado coincide con el patrón
        if (matcher.matches()) {
            System.out.println("Direccion es válido");
            this.esValido = true;
            return true;
        } else {
            System.out.println("Direccion inválido");
            this.esValido = false;
            return false;
        }
    }
}
