import javax.swing.*;
import java.util.Random;

public class Password {
    private int longitud;
    private boolean mayusculas = false;
    private Boolean caracteresE = false;
    private Boolean fortaleza;

    public Password(int longitud, boolean mayusculas, Boolean caracteresE) {
        this.longitud = longitud;
        this.mayusculas = mayusculas;
        this.caracteresE = caracteresE;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(boolean mayusculas) {
        this.mayusculas = mayusculas;
    }

    public Boolean getCaracteresE() {
        return caracteresE;
    }

    public void setCaracteresE(Boolean caracteresE) {
        this.caracteresE = caracteresE;
    }

    public Boolean getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(Boolean fortaleza) {
        this.fortaleza = fortaleza;
    }


    public String generarPassword(){
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

    public String comprobarFortaleza() {
        if (longitud < 8) {
            return "Débil";
        } else if (longitud >= 8 && mayusculas == false && caracteresE == false) {
            return "Normal";
        } else if (longitud >= 8 && (mayusculas == false || caracteresE == false)) {
            return "Fuerte";
        } else if (longitud >= 8 && mayusculas == true && caracteresE == true) {
            return "Muy segura";
        }

        return "Desconocida";
    }

}
