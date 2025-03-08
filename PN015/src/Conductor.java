import javax.swing.*;

public class Conductor extends Empleado {
    protected String licencia;

    public Conductor(int id, String nombre, double salario, String licencia) {
        super(id,nombre,salario);
        this.licencia = licencia;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null,
                "Tipo de licencia: "+licencia
                        );
    }
}
