import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String nombre;
        boolean gameOver = false;
        Object[] opciones = {"Disparar","Disparar al otro jugador"};
        int op;
        int dc;
        arma r = new arma(1);
        boolean accion;

        String palabra = "hola";
        String cuenta = palabra.substring(0, 2);
        int cuentas = palabra.length();

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del jugador 1");
        Jugador jugador1 = new Jugador(nombre,3);

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del jugador 1");
        Jugador jugador2 = new Jugador(nombre,3);

        Object[] seleccionLugares= {jugador1.getNombre(),jugador2.getNombre(),"Aleatorio"};
        op =  JOptionPane.showOptionDialog(null,"seleccionen el primer jugador","Ruleta R",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,seleccionLugares,seleccionLugares[2]);
        r.recargarCartucho();
        do {
            if (op == 0){
                JOptionPane.showMessageDialog(null,"Turno de: "+jugador1.getNombre()+"\nVidas: "+jugador1.getVidas());
                dc = JOptionPane.showOptionDialog(null,"Toma una decisión","Ruleta R",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
                accion = r.disparar();
                if(dc == 0 && accion == true){
                    gameOver = jugador1.restarVidas();
                    r.recargarCartucho();
                }if(dc == 1 && accion == true){
                    gameOver = jugador2.restarVidas();
                    r.recargarCartucho();
                }
                op = 1;
            }else{
                JOptionPane.showMessageDialog(null,"Turno de: "+jugador2.getNombre()+"\nVidas: "+jugador2.getVidas());
                dc = JOptionPane.showOptionDialog(null,"Toma una decisión","Ruleta R",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
                accion = r.disparar();
                if(dc == 0 && accion == true){
                    gameOver = jugador1.restarVidas();
                    r.recargarCartucho();
                }if(dc == 1 && accion == true){
                    gameOver = jugador2.restarVidas();
                    r.recargarCartucho();
                }
                op = 0;
            }
        }while(gameOver == false);
        if (jugador1.getVidas()==0){
            JOptionPane.showMessageDialog(null,"Jugador: "+jugador1.getNombre()+" Exterminado");
        }else{
            JOptionPane.showMessageDialog(null,"Jugador: "+jugador2.getNombre()+" Exterminado");
        }
    }
}