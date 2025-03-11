import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno");
        String apellidoP = JOptionPane.showInputDialog(null,"Ingrese el apellido paterno del alumno");
        String apellidoM = JOptionPane.showInputDialog(null,"Ingrese el apellido materno del alumno");
        String aNacimiento = JOptionPane.showInputDialog(null,"Ingrese el año de nacimiento del alumno");
        String carrera = JOptionPane.showInputDialog(null,"Ingrese la carrera del alumno");
        String aCursoActual = JOptionPane.showInputDialog(null,"Ingrese el año de curso actual");
        Alumno alumno1 = new Alumno(nombre, apellidoP, apellidoM, aNacimiento, carrera, aCursoActual );

        JOptionPane.showMessageDialog(null, "Matricula del alumno: "+alumno1.generarMatricula());
    }
}