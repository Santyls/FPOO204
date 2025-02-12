
public class Main {
    public static void main(String[] args) {

        //creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        //asignamos los atributos del objeto
        jefeMaestro.nombre= "John 117";
        jefeMaestro.salud= 100;
        jefeMaestro.escudo= 90;
        jefeMaestro.armaPrincipal= "Rifle de asalto";

        //Usar sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);


        //Segundo objeto reach
        reach.nombre= "Emile";
        reach.salud= 0;
        reach.escudo= 0;
        reach.armaPrincipal= "Aguijoneador";

        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(0);
        reach.correr(false);
    }
}//llave de la clase main