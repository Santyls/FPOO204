import javax.swing.*;

public class Ejercicio_4 {
    public static String reverseInputString(String myString) {

        if (myString == null)
            return myString;

        String reverseString = "";

        for (int i = myString.length() - 1; i >= 0; i--) {

            reverseString = reverseString + myString.charAt(i);
        }
        return reverseString;
    }
    public static void main(String[] args) {

        String word,drow;

        word = JOptionPane.showInputDialog(null,"Ingrese una palabra o frase");
        drow = reverseInputString(word);

        if (word.equals(drow)){
            JOptionPane.showMessageDialog(null,"La palabra/frase es un palíndromo");
        }else{
            JOptionPane.showMessageDialog(null,"La palabra/frase no es un palíndromo");
        }
    }
}