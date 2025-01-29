import javax.swing.*;
public class Ejercicio_5{
    public static void main(String[] args) {

        String frase;
        char letra;
        int c = 0;

        frase = JOptionPane.showInputDialog(null,"Ingrese una frase");
        letra = JOptionPane.showInputDialog(null,"Ingrese una letra").charAt(0);

        for (int i=0;i<frase.length();i++){

            if (String.valueOf(letra).equalsIgnoreCase(frase.substring(i,i+1))){
                 c = c+1;
            }
        }
        JOptionPane.showMessageDialog(null,"El número de veces que la letra "+letra+" aparece en "+frase+" es de: "+c );

    }
}