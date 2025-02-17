import javax.swing.*;

public class CajaPopular {
    public int noCuenta;
    public String titular;
    public int edad;
    public double saldo;

    public void verCuenta(){
        JOptionPane.showMessageDialog(null,"No.Cuenta: "+noCuenta
        +"\nTitutalr: "+titular+"\nEdad: "+edad);
    }
    public void consultarSaldo(){
        JOptionPane.showMessageDialog(null, saldo+"$");
    }
    public void ingresarEfectivo(double efectivo){
        saldo += efectivo;
        JOptionPane.showMessageDialog(null,"Deposito exitoso");
    }
    public void retirarEfectivo(double efectivo){
        saldo -= efectivo;
        JOptionPane.showMessageDialog(null,"Retiro exitoso");
    }
    public void depositarOtraCuenta (int nocuenta, double efectivo){
        JOptionPane.showMessageDialog(null, "Deposito con exito"+"\n Cuenta: "+nocuenta
        +"\nefectivo: "+efectivo);
        saldo -= efectivo;
    }
}
