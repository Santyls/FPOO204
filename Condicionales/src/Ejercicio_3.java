import javax.swing.*;
public class Ejercicio_3 {
    public static void main(String[] args) {

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad"));

        if (edad<4){
            JOptionPane.showMessageDialog(null,"¡La entrada es gratis!");
        }else if (edad >= 4 && edad <= 18) {
            JOptionPane.showMessageDialog(null,"La entrada es de 110$ ");
        }else{
            JOptionPane.showMessageDialog(null,"La entrada es de 190$ ");
        }
    }
}