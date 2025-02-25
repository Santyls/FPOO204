import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String password;
        int longitud;
        boolean mayusculas = false;
        boolean caracteresE = false;

        String opcion;
        Object[] ver = { "Si","No" };
        int op;

        opcion = JOptionPane.showInputDialog(null, "Ingresa la longitud de la contraseña:");
        if (opcion.equals("")){
            longitud = 8;
        }else{
            longitud = Integer.parseInt(opcion);
        }
        op = JOptionPane.showOptionDialog(null,"¿Agregar mayúsculas?","Generar password",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,ver,ver[1]);
        if(op == 0){
            mayusculas = true;
        }
        op = JOptionPane.showOptionDialog(null,"¿Agregar caracteres especiales?","Generar password",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,ver,ver[1]);
        if(op == 0){
            caracteresE = true;
        }

        Password pass = new Password(longitud,mayusculas,caracteresE);
        JOptionPane.showMessageDialog(null,"Contraseña: "+pass.generarPassword());
        JOptionPane.showMessageDialog(null, "la contraseña es: "+pass.comprobarFortaleza());

    }
}//main