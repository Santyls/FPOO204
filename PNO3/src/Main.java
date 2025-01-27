import javax.swing.*;
public class Main {
//    public static String capitalize(String inputString){
//        char firstLetter = inputString.charAt(0);
//        char capitalFirstLetter = Character.toUpperCase(firstLetter);
//        return inputString.replace(inputString.charAt(0),capitalFirstLetter);
//    }
    public static void main(String[] args) {
        //1
//        double horas, costo, res;
//        horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
//        costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo por horas"));
//        res = horas*costo ;
//        JOptionPane.showMessageDialog(null,"Su salario es de: "+res+"$");

        //2
//        String nombre;
//        String apellidoPa;
//        String apellidoMa;
//
//        nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");
//        apellidoPa = JOptionPane.showInputDialog(null,"Ingrese su apellido paterno");
//        apellidoMa = JOptionPane.showInputDialog(null,"Ingrese su apellido materno");
//
//        JOptionPane.showMessageDialog(null,nombre.toLowerCase()+" "+apellidoPa.toLowerCase()+" "+apellidoMa.toLowerCase()+"\n "
//                +nombre.toUpperCase()+" "+apellidoPa.toUpperCase()+" "+apellidoMa.toUpperCase()+"\n "
//                +capitalize(nombre.toLowerCase())+" "+capitalize(apellidoPa.toLowerCase())+" "+capitalize(apellidoMa.toLowerCase()));
          //3
        int x,suma = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        for (int i=0;i<=x;i++){
            suma = suma+i;
        }
        JOptionPane.showMessageDialog(null,"La suma de todos los enteros del 0 al "+x+" es: "+suma);

        }
    }
