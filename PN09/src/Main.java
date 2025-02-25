import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        boolean menu = true;
        int op;
        double efectivo;
        int noCuenta;

        CajaPopular cuentaJorge = new CajaPopular(11237789,"Jorge Armando Lopéz Morales",19,100);

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion" +
                    "\n1.-Ver cuenta"+"\n2.-Consultar Saldo"+"\n3.-Ingresar efectivo"+"\n4.-Retirar efectivo"+"\n5.-Depositar a otra cuenta"
                    +"\n6.-Salir"));
            switch(op){
                case 1:
                    cuentaJorge.verCuenta();
                    break;
                case 2:
                    cuentaJorge.consultarSaldo();
                    break;
                case 3:
                    efectivo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de efectivo a ingresar"));
                    cuentaJorge.ingresarEfectivo(efectivo);
                    break;
                case 4:
                    efectivo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de efectivo a retirar"));
                    if (efectivo < cuentaJorge.getSaldo()){
                        cuentaJorge.retirarEfectivo(efectivo);
                    }else{
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente para retiro","Saldo insuficiente", JOptionPane.WARNING_MESSAGE);
                    }

                    break;
                case 5:
                    noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta a depositar"));
                    efectivo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de efectivo a depositar"));
                    if (efectivo < cuentaJorge.getSaldo()){
                        cuentaJorge.depositarOtraCuenta(noCuenta,efectivo);
                    }else{
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente para deposito","Saldo insuficiente", JOptionPane.WARNING_MESSAGE);
                    }

                    break;
                default:
                    menu = false;
                    break;
            }

        }while(menu == true);

    }
}//llave main