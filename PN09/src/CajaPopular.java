import javax.swing.*;

public class CajaPopular {
    private int noCuenta;
    private String titular;
    private int edad;
    private double saldo;

    //getters and setters
    public CajaPopular(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


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
