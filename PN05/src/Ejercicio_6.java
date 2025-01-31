import javax.swing.*;
public class Ejercicio_6{
    public static void main(String[] args) {

        double monto_total = 0, monto_entrada;
        String[] op = { "Depositar", "Retirar","terminar" };
        int opcion;
        String entrada;

        do{
            entrada = JOptionPane.showInputDialog(null,"Ingrese el monto de entrada");

            monto_entrada = Double.parseDouble(entrada);
            opcion = JOptionPane.showOptionDialog(null,"seleccione la operación a realizar","",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,op,op[0]);
            switch (opcion){
                case 0:
                    monto_total += monto_entrada;
                    System.out.println("D "+monto_entrada);
                    break;
                case 1:
                    monto_total -= monto_entrada;
                    if (monto_total < 0){
                        JOptionPane.showMessageDialog(null,"Saldo en negativo");
                    }else{
                        System.out.println("R "+monto_entrada);
                    }
                    break;
                default:
                    System.out.println(monto_total);
                    break;
            }
        }while(opcion == 0 || opcion == 1 );

    }
}