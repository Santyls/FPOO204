import javax.swing.*;
public class Ejercicio_2 {
    public static void main(String[] args) {
        //ejercicio 2
        String palabra;

        palabra = JOptionPane.showInputDialog(null,"Ingresa una palabra");

        System.out.println("Palabra: "+palabra+" Resultado: ");
        for (int i=0;i<palabra.length();i++){
            System.out.print("Letra "+(i+1)+": "+palabra.substring(i,(i+1))+" ");
        }
    }
}