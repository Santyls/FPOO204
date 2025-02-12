public class Spartan {

    public String nombre;
    int salud;
    int escudo;
    String armaPrincipal;

    public void mostrarInfo(){
        System.out.println("---------Información del Spartan---------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Salud: "+salud);
        System.out.println("Escudo: "+escudo);
        System.out.println("Arma Principal: "+armaPrincipal);
        System.out.println("-----------------------------------------");
    }

    public void atacar(String enemigo){
        System.out.println(nombre+" ataca a "+enemigo+" con "+armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma "+armaPrincipal+" tiene "+total+" balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El Spartan "+nombre+" esta corriendo");
        }else{
            System.out.println("El Spartan "+nombre+" se detuvo");
        }
    }

}//llave de la clase
