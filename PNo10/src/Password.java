import javax.swing.*;
import java.util.Random;

public class Password {
    public Boolean fortaleza;

    public String generarPassword(int longitud,boolean mayusculas, boolean caracteresE){
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (mayusculas) {
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (caracteresE) {
            caracteres += "!@#$%^&*()_+-=[]{}|;:,.<>?";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }

    public String comprobarFortaleza(String pass) {
        boolean tieneMayusculas = false;
        boolean tieneCaracteresEspeciales = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayusculas = true;
                break;
            }
        }

        String caracteresEspeciales = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        for (char c : pass.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                tieneCaracteresEspeciales = true;
                break;
            }
        }

        if (pass.length() < 8) {
            return "Débil";
        } else if (pass.length() >= 8 && !tieneMayusculas && !tieneCaracteresEspeciales) {
            return "Normal";
        } else if (pass.length() >= 8 && (tieneMayusculas || tieneCaracteresEspeciales)) {
            return "Fuerte";
        } else if (pass.length() > 7 && tieneMayusculas && tieneCaracteresEspeciales) {
            return "Muy segura";
        }

        return "Desconocida";
    }

}
