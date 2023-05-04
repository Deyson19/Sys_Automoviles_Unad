package Helpers;

import java.util.regex.Pattern;

public class ValidarPassword {
    // special character with no whitespaces
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_.])(?=\\S+$).{10,100}$";

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    private static ValidarPassword instanciaValidar;

    private ValidarPassword() {

    }

    public static ValidarPassword getInstanciaValidarPassword() {
        if (instanciaValidar == null) {
            instanciaValidar = new ValidarPassword();
        }
        return instanciaValidar;
    }

    // hay que probarlo
    public static boolean Comprueba(String password) {
        // Validate a password
        if (PASSWORD_PATTERN.matcher(password).matches()) {
            System.out.print("Esta contraseña es válida: " + password + " el usuario puede ser creado.\n");
            return true;
        } else {
            System.out.print("Lo siento, esta contraseña: " + password + " no cumple los requisitos.\n");
            return false;
        }
    }
}
