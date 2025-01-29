import javax.swing.*;
public class Ejercicio_3{
    public static void main(String[] args) {

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número entero del 1 al 10"));
        if (num>=1 && num<=10){
            System.out.println("Tabla del "+num);
            for (int i = 1;i<=10;i++){
                System.out.println(num+"x"+i+" = "+(i*num));
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese un número dentro del rango","Error",JOptionPane.ERROR_MESSAGE);
        }


    }
}