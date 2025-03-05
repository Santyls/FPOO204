
public class Main {
    public static void main(String[] args) {

        SpartanII jefeMaestro = new SpartanII("John", 100, "Rifle de asalto",0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();

        System.out.println("------------------------------------------------------------------------------");

        SpartanIII spartan3 = new SpartanIII("Dennys",200,"Desarmador de cruz",0);
        spartan3.mostrarInfo();
        spartan3.camuflajeActivo();

        System.out.println("------------------------------------------------------------------------------");

        SpartanIV spartan4 = new SpartanIV("Salinas",300,"Switch de capa 3",0);
        spartan4.mostrarInfo();
        spartan4.usaPropulsores();
    }
}