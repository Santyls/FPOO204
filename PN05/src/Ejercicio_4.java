import javax.swing.*;
public class Ejercicio_4{
    public static void main(String[] args) {

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura del triángulo (entero positivo)"));

        if (num>=1 && num<=10){
            System.out.println("Entero positivo: "+num);

            for (int i = 1;i<=num;i++){
                if ((i%2)!=0){
                    for (int j =i ;j>0;j--){
                        if ((j%2) != 0){
                            System.out.print(j+" ");
                        }
                    }
                    System.out.println();
                }
            }

        }else{
            JOptionPane.showMessageDialog(null,"Ingrese un número entero positivo","Error",JOptionPane.ERROR_MESSAGE);
        }


    }
}
