import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String password = "JavaClass",pass;

        pass = JOptionPane.showInputDialog(null,"Ingrese su contraseña");

        if (password.equalsIgnoreCase(pass)){
            JOptionPane.showMessageDialog(null,"Contraseña correcta");

        }else{
            JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
        }

    }
}