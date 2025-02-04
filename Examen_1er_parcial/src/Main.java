import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        String palabra1,palabra2;
        int P1,P2;

        palabra1 = JOptionPane.showInputDialog(null,"Ingresa la primera palabra");
        palabra2 = JOptionPane.showInputDialog(null,"Ingresa la segunda palabra");

        P1 = palabra1.length();
        P2 = palabra2.length();

        if (P1>P2){
            JOptionPane.showMessageDialog(null,"La palabra: "+palabra1+" Letras: "+P1+"\n Es mas larga que: "
                    +palabra2+"Letras: "+P2+"\n Por "+(P1-P2)+"letras");
        }else{
            JOptionPane.showMessageDialog(null,"La palabra: "+palabra2+" Letras: "+P2+"\n Es mas larga que: "
                    +palabra1+" Letras: "+P1+"\n Por "+(P2-P1)+" letras");
        }

    }
}