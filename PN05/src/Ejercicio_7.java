import javax.swing.*;
public class Ejercicio_7{
    public static void main(String[] args) {

        int altura;
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del árbol:"));
        System.out.println("Altura de: "+altura);
        int i = 0;
        while (i < altura) {
            int espacios = altura - i - 1;
            int asteriscos = 2 * i + 1;

            int j = 0;
            while (j < espacios) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while (k < asteriscos) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}