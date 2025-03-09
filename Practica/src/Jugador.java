public class Jugador {
    private String nombre;
    private int vidas;

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public boolean restarVidas(){
        if(vidas != 0){
            vidas--;
            return false;
        }else{
            return true;
        }
    }


}
