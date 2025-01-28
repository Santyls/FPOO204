import javax.swing.*;
public class Ejercicio_2 {
    public static void main(String[] args) {

        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));

        if((num%2) == 0){
            JOptionPane.showMessageDialog(null,num+" es un número par");
        }else{
            JOptionPane.showMessageDialog(null,num+" es un número impar");
        }
    }
}
