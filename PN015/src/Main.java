import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        boolean salir = false;
        Object[] menuP = { "Agregar empleado", "Listar empleado","Mostrar empleados","Salir" };
        int op;
        Object[] listar = { "Conductor", "Administrativo","Salir" };

        Empleado e1 = null;
        Conductor c1 = null;
        Administrativo a1 = null;
        int id = 1;
        String nombre;
        double salario;

        do {
            op = JOptionPane.showOptionDialog(null,"Menú","Empleados",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,menuP,menuP[0]);
            switch (op){
                case 0:
                    nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado: ");
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el salario del empleado"));
                     e1 = new Empleado(id,nombre,salario);
                     id ++;
                    break;
                case 1:
                    op = JOptionPane.showOptionDialog(null,"Seleccione el rol del empleado","Listar empledos",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,listar,listar[0]);
                    switch (op){
                        case 0:
                            String licencia = JOptionPane.showInputDialog(null,"Ingrese el tipo de licencia del conductor");
                            c1 = new Conductor(e1.getId(), e1.getNombre(), e1.getSalario(), licencia);
                            break;
                        case 1:
                            String departamento = JOptionPane.showInputDialog(null,"Ingrese el departamento del administrativo");
                            a1 = new Administrativo(e1.getId(), e1.getNombre(), e1.getSalario(), departamento );
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    c1.mostrarInfo();
                    a1.mostrarInfo();
                    break;
                default:
                    salir = true;
                    break;
            }
        }while(salir == false);
    }
}