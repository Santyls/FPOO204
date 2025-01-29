import javax.swing.*;
public class Ejercicio_2{
    public static void main(String[] args) {

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número entero "));

        for (int i = num;i>0;i--){
            System.out.print(i+",");
        }
        System.out.println("0");
    }
}
