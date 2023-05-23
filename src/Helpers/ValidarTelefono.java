/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Deyson Vente
 */
public class ValidarTelefono {

    public boolean isEsValido() {
        return esValido;
    }

    public boolean esValido;
    public boolean validarTelefono(String txtTelefono) {
        // Expresión regular para validar que solo se ingresen números
        String patron = "^[0-9]{7,15}$";

        // Crear un objeto Pattern y un objeto Matcher para aplicar el patrón
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(txtTelefono);

        // Verificar si el número ingresado coincide con el patrón
        if (matcher.matches()) {
            System.out.println("Teléfono válido");
            this.esValido = true;
            return true;
        } else {
            System.out.println("Teléfono inválido");
            this.esValido = false;
            return false;
        }
    }
}
