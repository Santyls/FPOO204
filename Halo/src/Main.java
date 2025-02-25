
public class Main {
    public static void main(String[] args) {

        //creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan("John 117",100,90,"Rifle de asalto");
        Spartan reach = new Spartan("Emilie", 0, 0, "Aguijoneador");

        //Usar sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);


        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(0);
        reach.correr(false);

        jefeMaestro.setNombre("Ivan Isay");
        jefeMaestro.mostrarInfo();
        System.out.println(jefeMaestro.getNombre());

        jefeMaestro.consultaCortana();
    }
}//llave de la clase main