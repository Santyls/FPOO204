import javax.swing.*;

public class Envio {

    private int codigoEnvio;
    private String destino;
    private double peso;

    public Envio(int codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0;
    }

    public Envio(int codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public int getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(int codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static Envio crearEnvio(){
        String codigoEnvio = JOptionPane.showInputDialog(null, "Ingrese el codigo de envio");
        String destino= JOptionPane.showInputDialog(null,"Ingrese el destino del envio");
        String peso = JOptionPane.showInputDialog(null,"Ingrese el peso del envio");

        if (peso == null || peso.isEmpty()){
            return new Envio(Integer.parseInt(codigoEnvio), destino);
        }else{
            return new Envio(Integer.parseInt(codigoEnvio), destino, Double.parseDouble(peso));
        }
    }

}
