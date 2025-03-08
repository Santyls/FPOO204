import javax.swing.*;

public class Administrativo extends Empleado{

    protected String departamento;

    public Administrativo(int id, String nombre, double salario, String departamento) {
        super(id,nombre,salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null,
                "Departamento: "+departamento
        );
    }
}
