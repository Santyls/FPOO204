import javax.swing.*;
public class Ejercicio_5 {
    public static void main(String[] args) {

        double num1,num2,res;
        String op;
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo número"));

        op = JOptionPane.showInputDialog(null,"Ingrese un operador (+, -, *, /)");

        switch (op){
            case "+":
                res = num1 + num2;
                JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+res);
                break;
            case "-":
                res = num1 - num2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+res);
                break;
            case "*":
                res = num1 * num2;
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: "+res);
                break;
            case "/":
                res = num1/num2;
                JOptionPane.showMessageDialog(null,"El resultado de la división es: "+res);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error, los sandwiches eran de jamon con queso manchego","Error", JOptionPane.ERROR_MESSAGE);

                break;
        }
    }
}
