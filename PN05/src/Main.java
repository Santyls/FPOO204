import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número entero "));

        for (int i = 0;i<=num;i++){
            if ((i%2)!=0){
                System.out.print(i+",");
            }
        }
        System.out.print(num);
    }
}