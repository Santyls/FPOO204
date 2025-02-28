import javax.swing.*;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.conductor = null;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
            JOptionPane.showMessageDialog(null,"Conductor asignado correctamente");

        } else {
            JOptionPane.showMessageDialog(null,"Error: Ya hay un conductor asignado a este vehículo.");
        }
    }

}
