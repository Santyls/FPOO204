import java.util.Random;
import javax.swing.*;
public class arma {
    private int balas;
    private int[] cartucho = {0,0,0,0,0,0};
    private int b = 0;
    public arma(int balas) {
        this.balas = balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    public boolean disparar(){
        if(cartucho[b] != 1){
            JOptionPane.showMessageDialog(null,"Cartucho vacio");
            b++;
            return false;
        }else{
            JOptionPane.showMessageDialog(null,"PIUUUUUM!!!");
            b = 0;
            return true;
        }
    }

    public void recargarCartucho(){
        Random R = new Random();
        int i = R.nextInt((5));
        cartucho[i]= 1;
    }

}
